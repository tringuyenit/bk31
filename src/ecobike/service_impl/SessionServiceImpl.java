package ecobike.service_impl;

import ecobike.model.Session;
import ecobike.service.SessionService;

import java.sql.SQLException;
import java.util.List;

public class SessionServiceImpl implements SessionService {
    @Override
    public List<Session> findAll() throws SQLException {
        return null;
    }

    @Override
    public Session findById(short id) throws SQLException {
        return null;
    }

    @Override
    public Session findByUserId(short id) throws SQLException {
        return null;
    }

    @Override
    public Session insert(Session Session) throws SQLException {
        return null;
    }

    @Override
    public boolean update(Session Session) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(short id) throws SQLException {
        return false;
    }
}
