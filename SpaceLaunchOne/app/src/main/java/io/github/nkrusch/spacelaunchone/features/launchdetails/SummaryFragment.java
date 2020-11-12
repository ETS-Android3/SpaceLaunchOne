package io.github.nkrusch.spacelaunchone.features.launchdetails;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.cloudinary.utils.StringUtils;

import java.util.Date;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import api.ImageResolver;
import io.github.nkrusch.spacelaunchone.R;
import io.github.nkrusch.spacelaunchone.app.AppImage;
import io.github.nkrusch.spacelaunchone.app.Utilities;
import local.LaunchDetails;

import static android.view.View.VISIBLE;

@SuppressWarnings("SpellCheckingInspection")
public class SummaryFragment extends DetailsBaseFragment {

    private final String EXTRA_INIT = "countdown_initialized";
    private boolean countdownInitialized = false;
    private boolean animateCountdown = true;
    private FrameLayout mTimerContainer;
    private ImageView mRocketCardImage;
    private ImageView mRocketImage;
    private ImageView mStatusImage;
    private ImageView mCountryImage;
    private ImageView mAgencyImage;
    private TextView mStatus;
    private TextView mAgency;
    private TextView mRocket;
    private TextView mCountry;
    private SummaryItem mEventName;
    private SummaryItem mEventDate;
    private SummaryItem mRocketText;
    private SummaryItem mHashtag;
    private SummaryItem mLocation;
    private SummaryItem mAgencyName;
    private View mMissionDivider;
    private View mVideoDivider;

    public static Fragment newInstance() {
        return new SummaryFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        animateCountdown = (savedInstanceState == null || !savedInstanceState.containsKey(EXTRA_INIT));
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_details, container, false);
        mTimerContainer = view.findViewById(R.id.timerContainer);
        mMissionDivider = view.findViewById(R.id.mission_divider);
        mVideoDivider = view.findViewById(R.id.divider_videos);

        mStatus = view.findViewById(R.id.event_status_text2);
        mAgency = view.findViewById(R.id.event_agency_text2);
        mRocket = view.findViewById(R.id.event_rocket_text2);
        mCountry = view.findViewById(R.id.event_country_text2);

        mCountryImage = view.findViewById(R.id.event_country);
        mRocketImage = view.findViewById(R.id.event_rocket);
        mStatusImage = view.findViewById(R.id.event_status);
        mAgencyImage = view.findViewById(R.id.event_agency);
        mRocketCardImage = view.findViewById(R.id.details_rocket_image);

        mEventName = view.findViewById(R.id.event_name);
        mEventDate = view.findViewById(R.id.event_date);
        mRocketText = view.findViewById(R.id.event_rocket_summary_text);
        mHashtag = view.findViewById(R.id.event_hashtag);
        mLocation = view.findViewById(R.id.event_location);
        mAgencyName = view.findViewById(R.id.agency_name);
        return view;
    }

    private int statusImage(int status) {
        switch (status) {
            case 1:
                return R.drawable.ic_status_green;
            case 2:
                return R.drawable.ic_status_red;
            case 3:
                return R.drawable.ic_status_success;
            case 4:
                return R.drawable.ic_status_fail;
            case 5:
                return R.drawable.ic_status_on_hold;
            case 6:
                return R.drawable.ic_status_in_flight;
            case 7:
                return R.drawable.ic_status_partial_fail;
            default:
                return R.drawable.ic_status;
        }
    }

    private void initCountdown(Long utc) {
        if (countdownInitialized) return;
        countdownInitialized = true;
        if (utc >= new Date().getTime() && getActivity() != null) {
            final DetailsTimer f = (DetailsTimer) DetailsTimer.newInstance(utc);
            getActivity().getSupportFragmentManager().beginTransaction()
                    .replace(mTimerContainer.getId(), f).commit();
        }
    }

    private void adjustDividers(LaunchDetails launch) {
        if (launch.getVidURLs() != null && launch.getVidURLs().length > 0)
            mVideoDivider.setVisibility(VISIBLE);
        if (launch.getMissions() != null && launch.getMissions().size() > 0)
            mMissionDivider.setVisibility(VISIBLE);
    }

    @Override
    protected void PopulateViews(LaunchDetails launch) {
        if (launch == null) return;

        String agencyFullName = coalesce(launch.getAgencyName(), unknown);
        String agency = coalesce(launch.getAgencyAbbrev(), agencyFullName);
        String agencyNameValue = StringUtils.isEmpty(agency) ? agencyFullName :
                StringUtils.isEmpty(launch.getAgencyCountryCode()) ?
                        agencyFullName : String.format("%s (%s)", agencyFullName, launch.getAgencyCountryCode());
        String rocketFamily = coalesce(launch.getRocketFamilyName(), unknown);
        String country = coalesce(Utilities.countryName(launch.getLocationCountryCode()), unknown);
        String location = String.format("%s\n%s %s",
                launch.getPadName(),
                launch.getLocationName(),
                launch.getLocationCountryCode()).trim();
        initCountdown(launch.getLaunchDateUTC());
        adjustDividers(launch);

        mStatus.setText(launch.getStatusText());
        mRocket.setText(rocketFamily);
        // add overflow ellipsis to this field
        mAgency.setText(agency);
        mCountry.setText(country);

        mEventName.setText(R.string.event_name, launch.getName());
        mEventDate.setText(R.string.launch_date, launch.getNet());
        mLocation.setText(R.string.launch_site, coalesce(location, unknown));
        mHashtag.setText(R.string.hashtag, coalesce(launch.getHashtag(), none));
        mAgencyName.setText(R.string.launch_service_provider, agencyNameValue);
        mRocketText.setText(R.string.rocket_summary_label,
                coalesce(launch.getRocketName(), unknown) + " / " +
                        coalesce(launch.getRocketFamilyName(), unknown));

        mStatusImage.setImageResource(statusImage(launch.getStatus()));

        AppImage.LoadCircleImage(Utilities.countryIcon(launch.getLocationCountryCode()), mCountryImage);
        AppImage.LoadCircleImage(ImageResolver.resolveImage(launch.getAgencyId()), mAgencyImage);

        setImage(launch.getImage(), mRocketImage);
        setRocket(launch.getImage());
    }

    private void setImage(final String image, final ImageView target) {
        if (StringUtils.isEmpty(image) || models.Launch.isPlaceholderImage(image) || target == null)
            return;
        final String sizedImage = Utilities.roundImage(image, Utilities.dpToPixel(40, getResources()));
        AppImage.LoadCircleImage(sizedImage, target, R.drawable.ic_rocket);
    }

    private void setRocket(final String image) {
        if (StringUtils.isEmpty(image) || models.Launch.isPlaceholderImage(image) || mRocketCardImage == null || getActivity() == null)
            return;
        WindowManager wm = getActivity().getWindowManager();
        final String sizedImage = Utilities.sizedHeight(image, Utilities.display(wm).second);
        AppImage.LoadAndDisplay(sizedImage, mRocketCardImage, (View) mRocketCardImage.getParent());
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        if (!animateCountdown) outState.putInt(EXTRA_INIT, 1);
        super.onSaveInstanceState(outState);
    }
}
