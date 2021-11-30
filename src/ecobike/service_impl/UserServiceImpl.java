package ecobike.service_impl;

import ecobike.model.Bike;
import ecobike.model.Session;
import ecobike.model.User;
import ecobike.service.UserService;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

public class UserServiceImpl implements UserService {
    UserService userService = new UserServiceImpl();

    @Override
    public List<User> findAll() throws SQLException {
        return null;
    }

    @Override
    public User findById(short id) throws SQLException {
        return null;
    }

    @Override
    public User insert(Session session) throws SQLException {
        return null;
    }

    @Override
    public boolean update(User User) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(short id) throws SQLException {
        return false;
    }

    public double calculateCurentFee(Bike bike, Session session){
        return 0;
    }

    public LocalDateTime calculateTimeSpent(Session session){
        return null;
    }
}
