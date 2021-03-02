package activitytracker;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class ActivityTrackerMain {

    public static void main(String[] args) {
        MariaDbDataSource dataSource;
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");

        } catch (SQLException sqlException) {
            throw new IllegalArgumentException("Connection failed", sqlException);
        }
        Activity activity = new Activity(LocalDateTime.of(2021, 2, 23, 10, 10), "Biking in ize", ActivityType.BIKING);
        Activity activity2 = new Activity(LocalDateTime.of(2021, 2, 23, 10, 10), "Hiking in ize", ActivityType.HIKING);
        Activity activity3 = new Activity(LocalDateTime.of(2021, 2, 23, 10, 10), "Biking in ize", ActivityType.RUNNING);


    }
}
