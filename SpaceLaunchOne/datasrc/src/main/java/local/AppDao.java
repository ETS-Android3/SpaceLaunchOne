package local;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Transaction;

import java.util.Date;
import java.util.List;

@Dao
public interface AppDao {

    @Query("SELECT id, name, image, launchDateUTC, locationName, status " +
            "FROM Launch JOIN details ON id = uid WHERE (launchDateUTC > :cutoff OR status = 5) " +
            "AND rocketId NOT IN (SELECT rfid FROM rocketFilter) " +
            "AND agencyId NOT IN (SELECT afid FROM agencyFilter) " +
            "AND locationId NOT IN (SELECT pfid FROM locationFilter) " +
            "AND id NOT IN (SELECT id FROM Launch JOIN details ON id = uid " +
            "WHERE status=1 AND launchDateUTC > :cutoff " +
            "AND rocketId NOT IN (SELECT rfid FROM rocketFilter) " +
            "AND agencyId NOT IN (SELECT afid FROM agencyFilter) " +
            "AND locationId NOT IN (SELECT pfid FROM locationFilter) " +
            "ORDER BY launchDateUTC ASC LIMIT 1) " +
            "ORDER BY launchDateUTC ASC LIMIT :limit OFFSET :offset")
    LiveData<List<Launch>> loadLaunches(long cutoff, int limit, int offset);

    @Query("SELECT id, name, image, launchDateUTC, locationName, status " +
            "FROM Launch JOIN details ON id = uid WHERE (launchDateUTC <= :cutoff AND status != 5) " +
            "AND rocketId NOT IN (SELECT rfid FROM rocketFilter) " +
            "AND agencyId NOT IN (SELECT afid FROM agencyFilter) " +
            "AND locationId NOT IN (SELECT pfid FROM locationFilter) " +
            "ORDER BY launchDateUTC DESC LIMIT :limit OFFSET :offset")
    LiveData<List<Launch>> pastLaunches(long cutoff, int limit, int offset);

    @Query("SELECT id, name, image, launchDateUTC, locationName, status " +
            "FROM Launch JOIN details ON id = uid WHERE status=1 AND launchDateUTC > :cutoff " +
            "AND rocketId NOT IN (SELECT rfid FROM rocketFilter) " +
            "AND agencyId NOT IN (SELECT afid FROM agencyFilter) " +
            "AND locationId NOT IN (SELECT pfid FROM locationFilter) " +
            "ORDER BY launchDateUTC ASC LIMIT 1")
    LiveData<Launch> getNext(long cutoff);

    @Query("SELECT id, name, image, launchDateUTC, locationName, status " +
            "FROM Launch JOIN details ON id = uid WHERE status=1 AND launchDateUTC > :cutoff " +
            "AND rocketId NOT IN (SELECT rfid FROM rocketFilter) " +
            "AND agencyId NOT IN (SELECT afid FROM agencyFilter) " +
            "AND locationId NOT IN (SELECT pfid FROM locationFilter) " +
            "ORDER BY launchDateUTC ASC LIMIT 1")
    Launch getNextLaunch(long cutoff);

    @Transaction
    @Query("SELECT * from launch JOIN details ON id = uid WHERE id = :id")
    LaunchDetails get(int id);

    @Transaction
    @Query("SELECT * from launch JOIN details ON id = uid WHERE (id = :id AND :id > 0) OR " +
            "(:id <=0 AND id = (SELECT id FROM Launch JOIN details ON id = uid " +
            "WHERE status=1 AND launchDateUTC > :cutoff " +
            "AND rocketId NOT IN (SELECT rfid FROM rocketFilter) " +
            "AND agencyId NOT IN (SELECT afid FROM agencyFilter) " +
            "AND locationId NOT IN (SELECT pfid FROM locationFilter) " +
            "ORDER BY launchDateUTC ASC LIMIT 1))")
    LiveData<LaunchDetails> get(int id, Long cutoff);

    @Query("SELECT lastModified from details WHERE uid = :id")
    Date getLastModified(int id);

    @Query("SELECT launchDateUTC from launch WHERE id = :id")
    Long getLaunchDateUTC(int id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(Launch... launches);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(Details... launches);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<Mission> missions);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertFullRecord(Launch launch, Details details, List<Mission> missions);

    @Query("SELECT DISTINCT rocketId, rocketName, rfid from details " +
            "LEFT JOIN rocketFilter ON rfid=rocketId WHERE rocketName IS NOT NULL ORDER BY rocketName")
    LiveData<List<RocketLookup>> getRocketLookup();

    @Query("SELECT DISTINCT agencyId, agencyName, afid from details " +
            "LEFT JOIN agencyFilter ON afid=agencyId WHERE agencyName IS NOT NULL ORDER BY agencyName")
    LiveData<List<AgencyLookup>> getAgencyLookup();

    @Query("SELECT DISTINCT locationId, locationName, pfid FROM Launch " +
            "JOIN details ON id = uid LEFT JOIN locationFilter ON pfid=locationId " +
            "WHERE locationName IS NOT NULL ORDER BY locationName")
    LiveData<List<LocationLookup>> getLocationLookup();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void addAFilters(RocketFilter... filter);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void addAFilters(AgencyFilter... filter);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void addAFilters(LocationFilter... filter);

    @Delete
    void deleteFilters(RocketFilter... filter);

    @Delete
    void deleteFilters(AgencyFilter... filter);

    @Delete
    void deleteFilters(LocationFilter... filter);
}

