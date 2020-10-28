package Mjuk19_package;

import java.util.ArrayList;

public class EmployeeSystem {
      ArrayList<Employee> employeeList=new ArrayList<Employee>();

      public void hireEmployee(Employee newEmp){
          employeeList.add(newEmp);
      }


    public void deleteEmployee(int deleteEmployeeId) {
          for(int i=0;i<employeeList.size();i++){
              if(employeeList.get(i).localCompanyID==deleteEmployeeId){
                  employeeList.remove(i);
              }
        }
    }

    public void raiseEmployeeSalary(int percent) {
          if(percent<100 && percent>0) {
              for (int i = 0; i < employeeList.size(); i++) {
                  double oldSalary = employeeList.get(i).salary;
                  double increaseSalary = (oldSalary * percent) / 100;
                  double updateSalary = oldSalary + increaseSalary;
                  employeeList.get(i).setSalary(updateSalary);
              }
          }
          else {
              System.out.println("Invalid percentage of increase");
          }



    }

    public void raiseSalaryOfAnEmployee(int raiseEmpID, int raisePercent) {
        if(raisePercent<100 && raisePercent>0) {
            for (int i = 0; i < employeeList.size(); i++) {
                if(employeeList.get(i).localCompanyID==raiseEmpID) {
                    double oldSalary = employeeList.get(i).salary;
                    double increaseSalary = (oldSalary * raisePercent) / 100;
                    double updateSalary = oldSalary + increaseSalary;
                    employeeList.get(i).setSalary(updateSalary);
                }

            }
        }
        else {
            System.out.println("Invalid percentage of increase");
        }
    }

    public void removeMockemployee(Employee emp1) {
        employeeList.remove(0);

    }
}
