package az.maqa.fp.hoc;

import az.maqa.fp.Employee;

import java.util.*;

/**
 * Higher order functions
 */
public class MainClass {

    public static void main(String[] args) {
        // Collections
        List<Integer> numbers = new ArrayList<>();

        // addAll
        Collections.addAll(numbers, 1, 2, 3, 4, 21, 3, 565, 742, 1, 21, 4324, 5464, 12);
        numbers.forEach(System.out::println);

        // sort
        Collections.sort(numbers);
        numbers.forEach(num -> System.out.print(num + " "));

        // reverse
        System.out.print("\nReverse List: ");
        Collections.reverse(numbers);
        numbers.forEach(num -> System.out.print(num + " "));

        // replaceAll
        System.out.print("\nReplace All: ");
        boolean isReplace = Collections.replaceAll(numbers, 1, 99);
        if (isReplace)
            numbers.forEach(num -> System.out.print(num + " "));

        // max
        Integer maxValue = Collections.max(numbers);
        System.out.print("\nMax Value: " + maxValue);

        // min
        Integer minValue = Collections.min(numbers);
        System.out.print("\nMin Value: " + minValue);

        // emptyList
        List<String> names = Collections.emptyList();
        System.out.print("\n List of Names: " + names);

        // shuffle
        System.out.print("\nShuffle: ");
        Collections.shuffle(numbers, new Random(3));
        numbers.forEach(num -> System.out.print(num + " "));


        // sort with Comparator
        System.out.print("\nSort With Comparator: ");
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1L, "Samir", "Samirov", 29));
        employees.add(new Employee(2L, "Samire", "Samirova", 28));
        employees.sort(Comparator.comparingInt(Employee::getAge));
        employees.forEach(employee -> System.out.print(employee + " "));
    }

}
