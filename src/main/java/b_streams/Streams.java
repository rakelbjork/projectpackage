package b_streams;


import lombok.Value;

import java.util.Comparator;
import java.util.List;

enum Gender {
    MALE,
    FEMALE
}

@Value
class Employee {
    String name;
    int salary;
    Gender gender;
}

public class Streams {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Luna", 34000, Gender.FEMALE),
                new Employee("Maia", 49000, Gender.FEMALE),
                new Employee("Gunhild", 960000, Gender.FEMALE),
                new Employee("Bärt", 12000, Gender.MALE),
                new Employee("Bror", 4000, Gender.MALE),
                new Employee("Bob", 26000, Gender.MALE)
        );

        System.out.println("Genomsnittet för kvinnor: " +
                employees
                        .stream()
                        .filter(emp -> emp.getGender().equals(Gender.FEMALE))
                        .mapToInt(Employee::getSalary)
                        .average()
        );

        System.out.println("Genomsnittet för män: " +
                employees
                        .stream()
                        .filter(emp -> emp.getGender().equals(Gender.MALE))
                        .mapToInt(Employee::getSalary)
                        .average()
        );

        System.out.println("Högst lön bland kvinnor: " +
                employees
                        .stream()
                        .filter(emp -> emp.getGender().equals(Gender.FEMALE))
                        .sorted(Comparator.comparing(Employee::getSalary).reversed())
                        .skip(1)
                        .findFirst()
                        .orElseThrow()
        );
        System.out.println("Högst lön bland män: " +
                employees
                        .stream()
                        .filter(emp -> emp.getGender().equals(Gender.MALE))
                        .sorted(Comparator.comparing(Employee::getSalary).reversed())
                        .skip(1)
                        .findFirst()
                        .orElseThrow()
        );
    }
}
