package az.maqa.fp;

import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        // This functional interface takes String value and return Integer value
        Function<String, Integer> function = Integer::valueOf;
        Integer number = function.apply("12");
        System.out.println("Number: " + number + ", class of number: " + number.getClass());


        Employee employee = new Employee();
        employee.setId(1L);
        employee.setName("Samir");
        employee.setSurname("Samirov");
        employee.setAge(20);

        // Function
        Function<Employee, EmployeeDTO> mapper = new EmployeeMapper();
        EmployeeDTO employeeDTO = mapper.apply(employee);

        System.out.println(employee);
        System.out.println(employeeDTO);

        // Predicate
        Predicate<Employee> predicate = emp -> emp.getAge() < 18;
        boolean isYounger = predicate.test(employee);
        if (isYounger)
            System.out.println("Great!, You are younger");


        // UnaryOperator
        UnaryOperator<Employee> unaryOperator = employee1 -> {
            employee1.setName("Qasim");
            return employee1;
        };

        Employee updatedEmployee = unaryOperator.apply(employee);
        System.out.println("Updated Employee: " + updatedEmployee);

        // BinaryOperator
        BinaryOperator<Integer> binaryOperator = Integer::sum;
        Integer sumOfNumbers = binaryOperator.apply(20, 30);
        System.out.println("Sum: " + sumOfNumbers);


        // Supplier
        Supplier<Integer> supplier = () -> (int) (Math.random() * 1000D);
        Integer randomValue = supplier.get();
        System.out.println("Random Value: " + randomValue);


        // Consumer
        Consumer<Employee> consumer = employee12 -> System.out.println("Consumer Employee: " + employee12);
        consumer.accept(employee);
    }

}
