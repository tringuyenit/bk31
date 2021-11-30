package ecobike.service_impl;

import ecobike.model.Bike;
import ecobike.service.BikeService;

import java.sql.SQLException;
import java.util.List;

public class BikeServiceImpl implements BikeService {
    @Override
    public List<Bike> findAll() throws SQLException {
        return null;
    }

    @Override
    public Bike findById(short id) throws SQLException {
        return null;
    }

    @Override
    public Bike insert(Bike bike) throws SQLException {
        return null;
    }

    @Override
    public boolean update(Bike Bike) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(short id) throws SQLException {
        return false;
    }
}
