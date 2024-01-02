package fr.charly.exam.repository.region;

import fr.charly.exam.entity.Region.Region;
import fr.charly.exam.repository.AbstractRepository;

import java.sql.ResultSet;

public class RegionRepository extends AbstractRepository<Region> {
    protected RegionRepository(String tableName) {
        super("region");
    }

    @Override
    protected Region update(Region object) {
        return null;
    }

    @Override
    protected Region insert(Region object) {
        return null;
    }

    @Override
    protected Region getObject(ResultSet rs) {
        return null;
    }
}
