package demo1.oops.excercise6;

public class EmployeeMain6 {
    public static void main(String[] args){
     Employee employee1 = new Employee("Frnziska Waltraud", "HR Manager", 40000);
     Employee employee2 = new Employee("Hubertus Andrea", "Software Engineer", 6000);
        System.out.println("Employee Details: ");
        employee1.printEmployeeDetail();
        employee2.printEmployeeDetail();

        employee1.raiseSalary(8);
        employee2.raiseSalary(12);

        System.out.println("After raising salary: ");

        System.out.println("8% for Franziska Waltraud: ");
        employee1.printEmployeeDetail();
        System.out.println("12% for Hubertus Andrea: ");
        employee2.printEmployeeDetail();
    }
}
