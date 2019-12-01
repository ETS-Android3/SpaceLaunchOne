package local;

import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "locations")
public class Location {

    @NonNull
    @PrimaryKey()
    private int lid;
    private String name;
    private String countryCode;
    private String[] infoURLs;
    private Date lastModified;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String[] getInfoURLs() {
        return infoURLs;
    }

    public void setInfoURLs(String[] infoURLs) {
        this.infoURLs = infoURLs;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    @Ignore
    public static Location Map(models.Location loc) {
        Location a = new Location();

        a.setLid(loc.getId());
        a.setName(loc.getName());
        a.setCountryCode(loc.getCountryCode());
        if(a.getCountryCode() == null)
            a.setCountryCode(loc.getCountrycode());
        if (loc.getWikiURL() != null && !loc.getWikiURL().isEmpty()) {
            List<String> tmp = new LinkedList<>();
            tmp.add(loc.getWikiURL());
            tmp.addAll(Arrays.asList(loc.getInfoURLs()));
            a.setInfoURLs(tmp.toArray(new String[0]));
        } else a.setInfoURLs(loc.getInfoURLs());
        a.setInfoURLs(loc.getInfoURLs());
        a.setLastModified(new Date());
        return a;
    }

    @Ignore
    @Override
    public String toString() {
        return "lid: " + lid + "\n" +
                "name: " + name + "\n" +
                "countryCode: " + countryCode + "\n" +
                "infoURLs: " + Arrays.toString(infoURLs);
    }
}
