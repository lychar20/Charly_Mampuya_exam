package fr.charly.exam.repository.region;

import fr.charly.exam.entity.Region.City;
import fr.charly.exam.entity.Region.Region;
import fr.charly.exam.repository.AbstractRepository;

import java.sql.ResultSet;

public class CityRepository extends AbstractRepository<City> {
    protected CityRepository(String tableName) {
        super("city");
    }

    @Override
    protected City update(City object) {
        return null;
    }

    @Override
    protected City insert(City object) {
        return null;
    }

    @Override
    protected City getObject(ResultSet rs) {
        return null;
    }
}
