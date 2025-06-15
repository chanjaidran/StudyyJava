package SolidPrinciples.SinglrResponsilbiltPrinciple;


//WithViolation

public class SrpWithViolation {

    public static void main(String[] args) {

        Employee employee=new Employee("jai",50000);
        System.out.println(employee.calSalary());
        employee.generateReport();
    }
}


class Employee
{
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calSalary()
    {
        return  salary*1.2;
    }

    public void generateReport()
    {
        System.out.println("ReportGenerate");
    }
}