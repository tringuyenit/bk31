package ecobike.service;

import ecobike.model.Bike;
import ecobike.model.Session;
import ecobike.model.User;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

public interface UserService {
    List<User> findAll() throws SQLException;

    User findById(short id) throws SQLException;

    User insert(Session session) throws SQLException;

    boolean update(User User) throws SQLException;

    boolean delete(short id) throws SQLException;

    public double calculateCurentFee(Bike bike, Session session);

    public LocalDateTime calculateTimeSpent(Session session);
}
