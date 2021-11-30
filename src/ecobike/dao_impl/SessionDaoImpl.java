package ecobike.dao_impl;

import ecobike.dao.SessionDao;
import ecobike.model.Session;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SessionDaoImpl implements SessionDao {
    @Override
    public Session getObject(ResultSet resultSet) throws SQLException {
        return null;
    }

    @Override
    public List<Session> getList(ResultSet resultSet) throws SQLException {
        return null;
    }

    @Override
    public List<Session> findAll() throws SQLException {
        return null;
    }

    @Override
    public Session findById(short id) throws SQLException {
        return null;
    }

    public Session findByUserId(short userId) throws SQLException {
        return null;
    }

    @Override
    public Session insert(Session session) throws SQLException {
        return null;
    }

    @Override
    public boolean update(Session category) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(short id) throws SQLException {
        return false;
    }
}
