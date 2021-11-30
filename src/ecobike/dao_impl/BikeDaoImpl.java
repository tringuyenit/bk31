package ecobike.dao_impl;

import ecobike.dao.BikeDao;
import ecobike.model.Bike;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class BikeDaoImpl implements BikeDao {
    @Override
    public Bike getObject(ResultSet resultSet) throws SQLException {
        return null;
    }

    @Override
    public List<Bike> getList(ResultSet resultSet) throws SQLException {
        return null;
    }

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
    public boolean update(Bike category) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(short id) throws SQLException {
        return false;
    }
}
