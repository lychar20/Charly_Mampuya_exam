package fr.charly.exam.repository.region;

import fr.charly.exam.entity.Region.Region;
import fr.charly.exam.repository.AbstractRepository;


import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegionRepository extends AbstractRepository<Region> {
    public RegionRepository() {
        super("region");
    }


    public final Region findDepartmentsByRegion (String region, Object value) {
        Map<String, Object> regions = new HashMap<>();
        regions.put(region, value);
        List<Region> objects = findBy(regions, null, null);
        if (objects.isEmpty()) {
            return  null;
        }
        return objects.get(0);
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
