package Mjuk19_package;

public class Employee {
    String firstName;
    String lastName;
    int age;
    double salary;
    int localCompanyID;
    static  int companyId=1200;
    public Employee(String firstName,String lastName,int age,double salary){
        this.firstName= firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.localCompanyID=companyId;
        companyId ++;
    }
    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }
    public void setLastName(String newLastName){
        this.lastName = newLastName;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
    public void setSalary(double newSalary){
        this.salary = newSalary;
    }
    public String toString(){
        return "CompanyId: "+companyId+" FirstName: "+firstName+" LastName: "+lastName+" Age: "+age+" Salary: "+salary;
    }
}
