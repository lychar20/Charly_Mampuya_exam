package fr.charly.exam.repository.region;

import fr.charly.exam.entity.Region.City;
import fr.charly.exam.entity.Region.Department;
import fr.charly.exam.repository.AbstractRepository;

import java.sql.ResultSet;

public class DepartmentRepository extends AbstractRepository<Department> {
    protected DepartmentRepository() {
        super("department");
    }



    @Override
    protected Department update(Department object) {
        return null;
    }

    @Override
    protected Department insert(Department object) {
        return null;
    }

    @Override
    protected Department getObject(ResultSet rs) {
        return null;
    }
}
