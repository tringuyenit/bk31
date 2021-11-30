package ecobike.service;

import ecobike.model.Session;

import java.sql.SQLException;
import java.util.List;

public interface SessionService {
    List<Session> findAll() throws SQLException;

    Session findById(short id) throws SQLException;

    Session findByUserId(short userId) throws SQLException;

    Session insert(Session Session) throws SQLException;

    boolean update(Session Session) throws SQLException;

    boolean delete(short id) throws SQLException;
}
