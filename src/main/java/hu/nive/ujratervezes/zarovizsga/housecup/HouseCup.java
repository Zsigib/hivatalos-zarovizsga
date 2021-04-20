package hu.nive.ujratervezes.zarovizsga.housecup;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HouseCup {

    private DataSource dataSource;

    public HouseCup(MariaDbDataSource dataSource) {
            this.dataSource = dataSource;
    }

    public int getPointsOfHouse(String house) {
        try (Connection connection = dataSource.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("");

        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect");
        }
        return 0;}

}
