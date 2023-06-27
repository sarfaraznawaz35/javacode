package demo1.java8interview.question15;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test15 {
    public static void main(String[] args){

        List<Employee> employees = Stream.of(
                new Employee(1, "Basant", "DEV", 50000),
                new Employee(8, "Basant", "DEV", 80000),
                new Employee(3, "Basant", "QA", 60000),
                new Employee(9, "Basant", "QA", 90000),
                new Employee(4, "Basant", "DEVOPS", 40000))
                .collect(Collectors.toList());

        //approach 1:
        Comparator<Employee> compareBySalary = Comparator.comparing(Employee::getSalary);
        Map<String, Optional<Employee>> employeeMap = employees.stream().collect(Collectors
                .groupingBy(Employee::getDept, Collectors.reducing(BinaryOperator.maxBy(compareBySalary))));
        //System.out.println(employeeMap);

        //approach 2:
        Map<String, Employee> employeeMap1 = employees.stream().collect(Collectors.groupingBy(
                Employee::getDept, Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)), Optional::get)));
        System.out.println(employeeMap1);
    }
}
