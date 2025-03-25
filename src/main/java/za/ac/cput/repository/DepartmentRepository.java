package za.ac.cput.repository;

import za.ac.cput.domain.Department;
import za.ac.cput.domain.Doctor;

import java.util.HashSet;
import java.util.Set;

public class DepartmentRepository implements IDepartmentRepository{
    private static DepartmentRepository repository = null;
    private Set<Department> departmentDB;

    private DepartmentRepository() {
        this.departmentDB = new HashSet<>();
    }

    public static DepartmentRepository getRepository() {
        if (repository == null) {
            repository = new DepartmentRepository();
        }
        return repository;
    }


    @Override
    public Department create(Department department) {
        this.departmentDB.add(department);
        return department;
    }

    @Override
    public Department read(String departmentIdentity) {
        return this.departmentDB.stream()
                .filter(d -> d.getDepartmentIdentity().equals(departmentIdentity))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Department update(Department department) {
        Department oldDepartment = read(department.getDepartmentIdentity());
        if (oldDepartment != null) {
            departmentDB.remove(oldDepartment);
            departmentDB.add(department);
            return department;
        }
        return null;
    }

    @Override
    public boolean delete(String departmentIdentity) {
        Department departmentToDelete = read(departmentIdentity);
        if (departmentToDelete != null) {
            departmentDB.remove(departmentToDelete);
            return true;
        }
        return false;
    }

    @Override
    public Set<Department> getAll() {
        return departmentDB;
    }
}
