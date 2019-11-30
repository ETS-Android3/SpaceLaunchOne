package io.github.nkrusch.spacelaunchone.features.missions;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import io.github.nkrusch.spacelaunchone.R;
import io.github.nkrusch.spacelaunchone.app.OnItemClickListener;
import io.github.nkrusch.spacelaunchone.app.RecyclerViewFragment;
import local.AgencyDetails;
import local.Mission;
import viewmodels.AgencyDetailsViewModel;
import viewmodels.LocationDetailsViewModel;


public class MissionsRecyclerView extends RecyclerViewFragment {

    public static MissionsRecyclerView newInstance() {
        return new MissionsRecyclerView();
    }

    private LinearLayout mEmptyState;

    protected void setupViewModel() {
        if (getActivity() != null) {
            AgencyDetailsViewModel vm = ViewModelProviders.of(getActivity())
                    .get(AgencyDetailsViewModel.class);
            vm.get().observe(getActivity(), new Observer<AgencyDetails>() {
                @Override
                public void onChanged(AgencyDetails agencyDetails) {
                    if (agencyDetails != null && agencyDetails.getLaunches() != null)
                        handleDataChange(agencyDetails.getMissions());
                }
            });
        }
    }

    /**
     * When user clicks on recyclerview items launch details view
     */
    private OnItemClickListener onItemClick() {
        return new OnItemClickListener() {
            @Override
            public void onItemClick(int id, String name) {
                // do something on missions click
            }
        };
    }

    /**
     * When viewmodel state changes, update the adapter
     */
    private void handleDataChange(@Nullable List<Mission> entries) {
        if (mRecyclerView == null || entries == null) return;
        boolean hasEntries = entries.size() > 0;
        if (hasEntries) {
            mEmptyState.setVisibility(View.GONE);
            mRecyclerView.setVisibility(View.VISIBLE);
            MissionsAdapter adapter = (MissionsAdapter) mRecyclerView.getAdapter();
            adapter.updateData(entries);
            adapter.notifyDataSetChanged();
        } else {
            mRecyclerView.setVisibility(View.GONE);
            mEmptyState.setVisibility(View.VISIBLE);
        }
    }

    /**
     * initialize recyclerview and bind adapter; bind item click listener; restore previous recyclerview state (if any)
     */
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        int columns = getResources().getInteger(R.integer.list_column_count);

        List<Mission> data = new LinkedList<>();
        MissionsAdapter la = new MissionsAdapter(data);
        la.SetOnItemClickListener(this.onItemClick());
        GridLayoutManager glm = new GridLayoutManager(getContext(), columns);

        mRecyclerView = view.findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(glm);
        mRecyclerView.setAdapter(la);
        mEmptyState = view.findViewById(R.id.empty_state);
        TextView mEmptyStateText = view.findViewById(R.id.list_empty_state_text);
        mEmptyStateText.setText("No missions");
        restoreRecyclerViewState(savedInstanceState);
        return view;
    }
}
