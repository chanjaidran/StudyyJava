package Comparator;

import java.util.*;

public class ComparatorExample {

    public static void main(String[] args) {

        Employee e1=new Employee(1,"Jai",23);
        Employee e2=new Employee(2,"Chan",34);
        Employee e3=new Employee(3,"Siva",30);
        Employee e4=new Employee(3,"Riva",30);

        List<Employee> employeeList= Arrays.asList(e1,e2,e3,e4);

        System.out.println(employeeList);

        AgeComparator comparator=new AgeComparator();
        Collections.sort(employeeList, comparator);
        System.out.println(employeeList);

        NameComparator nameComparator=new NameComparator();
        Collections.sort(employeeList,nameComparator);
        System.out.println(employeeList);

        employeeList.stream().sorted(Comparator.comparingInt(Employee::getAge)).forEach(System.out::println);
        employeeList.stream().sorted(Comparator.comparing(Employee::getId).reversed().thenComparing(Employee::getName)).forEach(System.out::println);


    }
}


class AgeComparator implements Comparator<Employee>
{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.getAge()-o1.getAge();
    }
}

class NameComparator implements Comparator<Employee>
{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}



class Employee
{
    int id;
    String name;
    int age;


    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}