package Mjuk19_package;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeSystemTest {
    @BeforeAll
    static void beforeAll(){

        System.out.println("Testing starts ");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("Testing is done ");

    }

    @BeforeEach
    void beforeEach(TestInfo info){
        System.out.println("Current test :"+info.getDisplayName());
    }
    @AfterEach
    void AfterEach(TestInfo info){
        System.out.println("Current test finished :"+info.getDisplayName());
    }

    @Test
    @DisplayName("Testing EmployeeClass ")
    void EmployeeTest() {
        Employee employee = new Employee("Dhanya", "Babu", 31, 200000);
        assertEquals("CompanyId: 1201 FirstName: Dhanya LastName: Babu Age: 31 Salary: 200000.0",employee.toString());
        employee.setLastName("Rineesh");
        assertEquals("CompanyId: 1201 FirstName: Dhanya LastName: Rineesh Age: 31 Salary: 200000.0",employee.toString());
        employee.setFirstName("Ridhika");
        assertEquals("CompanyId: 1201 FirstName: Ridhika LastName: Rineesh Age: 31 Salary: 200000.0",employee.toString());
        employee.setAge(5);
        assertEquals("CompanyId: 1201 FirstName: Ridhika LastName: Rineesh Age: 5 Salary: 200000.0",employee.toString());
        employee.setSalary(5000);
        assertEquals("CompanyId: 1201 FirstName: Ridhika LastName: Rineesh Age: 5 Salary: 5000.0",employee.toString());
    }

    @Mock
    Employee emp1;
    Employee emp2;
    Employee emp3;


    @Test
    @DisplayName("Testing adding employee to  EmployeeSystem Class  by using mock")
    void AddEmployeeMockTest(){
        EmployeeSystem employeeSystem = new EmployeeSystem();
        int expected =2;
        employeeSystem.hireEmployee(emp1);
        employeeSystem.hireEmployee(emp2);
        assertEquals(expected,employeeSystem.employeeList.size());
    }

    @Test
    @DisplayName("Testing removing employee from EmployeeSystem Class  by using mock")
    void removeEmployeeMockTest(){
        EmployeeSystem employeeSystem = new EmployeeSystem();
        int expected =1;
        employeeSystem.hireEmployee(emp1);
        employeeSystem.hireEmployee(emp2);
        employeeSystem.hireEmployee(emp3);
        employeeSystem.removeMockemployee(emp1);
        employeeSystem.removeMockemployee(emp2);
        assertEquals(expected,employeeSystem.employeeList.size());
    }


    @Test
    @DisplayName("Testing adding EmployeeSystem Class ")
    void AddEmployeeSystemTest(){
        Employee employee= new Employee("Dhanya", "Babu", 31, 200000);
        Employee employee1 = new Employee("Maria", "Joseph", 27, 400000);
        Employee employee2 = new Employee("Adam", "Jhon", 34, 100000);
        EmployeeSystem employeeSystem = new EmployeeSystem();
        int expected =3;
        employeeSystem.hireEmployee(employee);
        employeeSystem.hireEmployee(employee1);
        employeeSystem.hireEmployee(employee2);
        assertEquals(expected,employeeSystem.employeeList.size());

        /*assertEquals("Dhanya",employeeSystem.employeeList.get(0).firstName);
        assertEquals("Babu",employeeSystem.employeeList.get(0).lastName);
        assertEquals(31,employeeSystem.employeeList.get(0).age);
        assertEquals(200000,employeeSystem.employeeList.get(0).salary);*/

    }
    @Test
    @DisplayName("Testing deleting employee from Employee System Class ")
    void DeleteEmployeeSystemTest(){
        EmployeeSystem employeeSystem = new EmployeeSystem();
        Employee employee1= new Employee("Dhanya", "Babu", 31, 200000);
        Employee employee2 = new Employee("Maria", "Joseph", 27, 400000);
        Employee employee3 = new Employee("Adam", "Jhon", 34, 100000);

        employeeSystem.hireEmployee(employee1);
        employeeSystem.hireEmployee(employee2);
        employeeSystem.hireEmployee(employee3);

        assertEquals(3,employeeSystem.employeeList.size());

        employeeSystem.deleteEmployee(employee1.localCompanyID);
        assertEquals(2,employeeSystem.employeeList.size());

        employeeSystem.deleteEmployee(employee2.localCompanyID);
        assertEquals(1,employeeSystem.employeeList.size());

        employeeSystem.deleteEmployee(employee3.localCompanyID);
        assertEquals(0,employeeSystem.employeeList.size());
    }

    @Test
    @DisplayName("Testing increasing salary of all employees in Employee System Class ")
    void IncreaseSalaryOfAll(){
        EmployeeSystem employeeSystem = new EmployeeSystem();
        Employee employee= new Employee("Dhanya", "Babu", 31, 200000);
        Employee employee1 = new Employee("Maria", "Joseph", 27, 400000);
        Employee employee2 = new Employee("Adam", "Jhon", 34, 100000);

        employeeSystem.hireEmployee(employee);
        employeeSystem.hireEmployee(employee1);
        employeeSystem.hireEmployee(employee2);

       employeeSystem.raiseEmployeeSalary(5);
        assertEquals(210000,employeeSystem.employeeList.get(0).salary);
        assertEquals(420000,employeeSystem.employeeList.get(1).salary);
        assertEquals(105000,employeeSystem.employeeList.get(2).salary);

        employeeSystem.raiseEmployeeSalary(101);
        assertEquals(210000,employeeSystem.employeeList.get(0).salary);
        assertEquals(420000,employeeSystem.employeeList.get(1).salary);
        assertEquals(105000,employeeSystem.employeeList.get(2).salary);

        employeeSystem.raiseEmployeeSalary(-1);
        assertEquals(210000,employeeSystem.employeeList.get(0).salary);
        assertEquals(420000,employeeSystem.employeeList.get(1).salary);
        assertEquals(105000,employeeSystem.employeeList.get(2).salary);


    }

    @Test
    @DisplayName("Testing increasing salary of an employees in Employee System Class ")
    void IncreaseSalaryOfAnEmployee(){
        EmployeeSystem employeeSystem = new EmployeeSystem();
        Employee employee1= new Employee("Dhanya", "Babu", 31, 200000);
        Employee employee2 = new Employee("Maria", "Joseph", 27, 400000);
        Employee employee3 = new Employee("Adam", "Jhon", 34, 100000);

        employeeSystem.hireEmployee(employee1);
        employeeSystem.hireEmployee(employee2);
        employeeSystem.hireEmployee(employee3);

        employeeSystem.raiseSalaryOfAnEmployee(employee1.localCompanyID,10);
        assertEquals(220000,employeeSystem.employeeList.get(0).salary);
        assertEquals(400000,employeeSystem.employeeList.get(1).salary);
        assertEquals(100000,employeeSystem.employeeList.get(2).salary);

        employeeSystem.raiseSalaryOfAnEmployee(employee2.localCompanyID,10);
        assertEquals(220000,employeeSystem.employeeList.get(0).salary);
        assertEquals(440000,employeeSystem.employeeList.get(1).salary);
        assertEquals(100000,employeeSystem.employeeList.get(2).salary);

        employeeSystem.raiseSalaryOfAnEmployee(employee3.localCompanyID,10);
        assertEquals(220000,employeeSystem.employeeList.get(0).salary);
        assertEquals(440000,employeeSystem.employeeList.get(1).salary);
        assertEquals(110000,employeeSystem.employeeList.get(2).salary);

        employeeSystem.raiseSalaryOfAnEmployee(employee1.localCompanyID,101);
        assertEquals(220000,employeeSystem.employeeList.get(0).salary);
        assertEquals(440000,employeeSystem.employeeList.get(1).salary);
        assertEquals(110000,employeeSystem.employeeList.get(2).salary);

    }
}