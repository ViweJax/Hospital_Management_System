package za.ac.cput.repository;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Department;
import za.ac.cput.factory.DepartmentFactory;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Set;




@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DepartmentRepositoryTest {

    private static DepartmentRepository repository = DepartmentRepository.getRepository();
    private static Department department1;
    private static Department department2;


    @BeforeAll
    static void setUp() {
        department1 = DepartmentFactory.createDepartment("D001", "Cardiology", "Dr. Smith", 10, "1234567890", "Floor 2");
        department2 = DepartmentFactory.createDepartment("D002", "Neurology", "Dr. Johnson", 15, "0987654321", "Floor 3");
    }

    @Test
    @Order(1)
    void testCreate() {
        Department created1 = repository.create(department1);
        Department created2 = repository.create(department2);

        assertNotNull(created1);
        assertNotNull(created2);
        assertEquals("D001", created1.getDepartmentIdentity());
        assertEquals("D002", created2.getDepartmentIdentity());

        System.out.println("Created:\n" + created1 + "\n");
    }

    @Test
    @Order(2)
    void testRead() {
        Department read = repository.read("D001");
        assertNotNull(read);
        assertEquals("D001", read.getDepartmentIdentity());
        assertEquals("Cardiology", read.getDepartmentName());

        System.out.println("Read: " + read);
    }

    @Test
    @Order(3)
    void testUpdate(){
        Department updated = new Department.Builder()
                .setDepartmentIdentity("D001")
                .setDepartmentName("Updated Cardiology")
                .setHeadDoctor("Dr. Brown")
                .setStaffCount(12)
                .setDepartmentPhoneNumber("1111111111")
                .setLocation("Floor 4")
                .build();

        Department result = repository.update(updated);
        assertNotNull(result);
        assertEquals("Updated Cardiology", result.getDepartmentName());
        assertEquals("Dr. Brown", result.getHeadDoctor());
        assertEquals(12, result.getStaffCount());
        assertEquals("1111111111", result.getDepartmentPhoneNumber());
        assertEquals("Floor 4", result.getLocation());

        System.out.println("Upadated: " + result);
    }

    @Test
    @Order(4)
    @Disabled
    void testDelete() {
        boolean deleted = repository.delete("D002");
        assertTrue(deleted);

        Department readAfterDelete = repository.read("D002");
        assertNull(readAfterDelete);

        System.out.println("Deleted department D002");
    }

    @Test
    @Order(5)
    void testGetAll() {
        Set<Department> departments = repository.getAll();
        assertNotNull(departments);
        assertFalse(departments.isEmpty());

        System.out.println("All Departments: " + departments);
    }




}