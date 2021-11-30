package ecobike.dao_impl;

import ecobike.dao.UserDao;
import ecobike.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public User getObject(ResultSet resultSet) throws SQLException {
        return null;
    }

    @Override
    public List<User> getList(ResultSet resultSet) throws SQLException {
        return null;
    }

    @Override
    public List<User> findAll() throws SQLException {
        return null;
    }

    @Override
    public User findById(short id) throws SQLException {
        return null;
    }

    @Override
    public User insert(User user) throws SQLException {
        return null;
    }

    @Override
    public boolean update(User category) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(short id) throws SQLException {
        return false;
    }
}
