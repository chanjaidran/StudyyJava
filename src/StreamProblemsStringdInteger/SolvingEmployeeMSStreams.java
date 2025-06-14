package StreamProblemsStringdInteger;

import java.util.*;
import java.util.stream.Collectors;

public class SolvingEmployeeMSStreams {
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




        //Grouped by male and female employee list of name
       Map<String,List<String>> MF= employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.mapping(Employee::getName,Collectors.toList())));
        System.out.println(MF);

        employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.mapping(Employee::getName,Collectors.toList())));

        for (Map.Entry<String,List<String>> MFN:MF.entrySet())
        {
            System.out.println(MFN.getKey());
            System.out.println(MFN.getValue());
        }

        //Query 3.1 : How many male and female employees are there in the organization?

        Map<String, Long> noOfMaleAndFemaleEmployees=    employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(noOfMaleAndFemaleEmployees);

        // 3.2 : Print the name of all departments in the organization?

       Set<String> Departments= employeeList.stream().map(Employee::getDepartment).collect(Collectors.toSet());
        System.out.println(Departments);

        // What is the average age of male and female employees?

        Map<String, Double> AverageAgeofMAleandFemaleEMployees=  employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));
        System.out.println(AverageAgeofMAleandFemaleEMployees);

        employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));

    //    Query 3.4 : Get the details of highest paid employee in the organization?

        employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(1).forEach(s-> System.out.println(s));


        Optional<Employee> highestPaidEmployeeWrapper=
                employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));




//        /
        //Query 3.8 : Get the details of youngest male employee in the product development department?

     Optional<Employee> ypungMaleEmployee=   employeeList.stream().filter(n->n.getDepartment().equals("Product Development") && n.getGender().equals("Male") )
                .collect(Collectors.minBy(Comparator.comparingInt(Employee::getAge)));

        System.out.println(ypungMaleEmployee.get().name);


//Query 3.12 : List down the names of all employees in each department?

      Map<String,List<String>> emp=  employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getName,Collectors.toList())));

        System.out.println(emp);

    }
}
