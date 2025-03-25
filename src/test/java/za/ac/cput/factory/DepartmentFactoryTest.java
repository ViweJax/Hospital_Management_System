package za.ac.cput.factory;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Department;
import za.ac.cput.repository.DepartmentRepository;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DepartmentFactoryTest {

    private static DepartmentRepository repository = DepartmentRepository.getRepository();
    private static Department department = DepartmentFactory.createDepartment("D001", "Cardiology", "DR. Smith", 10, "1234567890", "Floor 2");

    @Test
    @Order(1)
    void create() {
        Department created = repository.create(department);
        assertNotNull(created);
        assertEquals(department.getDepartmentIdentity(), created.getDepartmentIdentity());
        System.out.println(created.toString());
    }

    @Test
    @Order(2)
    void read() {
        Department read = repository.read(department.getDepartmentIdentity());
        assertNotNull(read);
        assertEquals(department.getDepartmentIdentity(), read.getDepartmentIdentity());
        System.out.println(read.toString());
    }

    @Test
    @Order(3)
    void update() {
        Department updated = new Department.Builder()
                .setDepartmentIdentity(department.getDepartmentIdentity())
                .setDepartmentName("Updated Cardiology")
                .setHeadDoctor("Dr. Johnson")
                .setStaffCount(12)
                .setDepartmentPhoneNumber("0987654321")
                .setLocation("Floor 3")
                .build();

        Department result = repository.update(updated);
        assertNotNull(result);
        assertEquals("Updated Cardiology", result.getDepartmentName());
        System.out.println(result.toString());
    }

    @Test
    @Order(4)
    @Disabled
    void delete() {
        boolean deleted = repository.delete(department.getDepartmentIdentity());
        assertTrue(deleted);
        System.out.println("Deleted: " + department.getDepartmentIdentity());
    }

    @Test
    @Order(5)
    void getAll() {
        assertNotNull(repository.getAll());
        System.out.println("All Departments: " + repository.getAll());
    }


}