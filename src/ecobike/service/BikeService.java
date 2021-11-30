package ecobike.service;

import ecobike.model.Bike;

import java.sql.SQLException;
import java.util.List;

public interface BikeService {
    List<Bike> findAll() throws SQLException;

    Bike findById(short id) throws SQLException;

    Bike insert(Bike bike) throws SQLException;

    boolean update(Bike Bike) throws SQLException;

    boolean delete(short id) throws SQLException;
}
