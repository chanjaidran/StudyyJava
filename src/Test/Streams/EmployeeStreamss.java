package Test.Streams;



import java.util.*;
import java.util.stream.Collectors;

public class EmployeeStreamss {
    public static void main(String[] args) {


        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));



     // : How many male and female employees are there in the organization?

        employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()))
                .forEach((k,v)-> System.out.println(k+" "+v));


//Print the name of all departments in the organization?
        employeeList.stream().map(Employee::getDepartment).distinct().forEach(s -> System.out.println(s));


//What is the average age of male and female employees?
        employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)))
                .forEach((k,v)-> System.out.println(k+" "+v));


        //Get the details of highest paid employee in the organization?

        employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)))
                .ifPresent(s-> System.out.println(s));


        //Get the names of all employees who have joined after 2015?

        employeeList.stream().filter(e->e.getYearOfJoining()>2015).map(Employee::getName).forEach(s-> System.out.println(s));

       // Count the number of employees in each department?

        employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()))
                .forEach((k,v)-> System.out.println(k+" "+v));


        //What is the average salary of each department?
        employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)))
                .forEach((k,v)-> System.out.println(k+" "+v));

        // Get the details of youngest male employee in the product development department?

        employeeList.stream().filter(n->n.getDepartment().equals("Product Development"))
                .collect(Collectors.minBy(Comparator.comparingInt(Employee::getAge)))
                .ifPresent(s-> System.out.println(s));

        // Who has the most working experience in the organization?
        employeeList.stream().collect(Collectors.minBy(Comparator.comparingInt(Employee::getYearOfJoining)))
                .ifPresent(s-> System.out.println(s));

        //List down the names of all employees in each department?
      Map<String,List<String>> employ= employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getName,Collectors.toList())));

        System.out.println(employ);

        DoubleSummaryStatistics doubleSummaryStatistics=employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        doubleSummaryStatistics.getAverage();

        List<Integer> a=Arrays.asList(1,2,3,4,4);
       IntSummaryStatistics intSummaryStatistics= a.stream().collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(intSummaryStatistics.getMax());

        // Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.

        employeeList.stream().collect(Collectors.partitioningBy(n->n.getAge()<=25,Collectors.mapping(Employee::getName,Collectors.toList())));

        Map<String, List<String>> result = employeeList.stream()
                .collect(Collectors.groupingBy(
                        e -> e.getAge() < 25 ? "Below 25" : "25 and Above",
                        Collectors.mapping(Employee::getName, Collectors.toList())
                ));


    }
}
