package SolidPrinciples.SinglrResponsilbiltPrinciple;

public class SrPWithoutViolation {
    public static void main(String[] args) {

        Emp emp=new Emp("Jai",60000);
        CalculateSalary calculateSalary=new CalculateSalary();
        System.out.println(calculateSalary.calSalary(emp));
        GenerateReport generateReport=new GenerateReport();
        generateReport.generateReport(emp);
    }
}

class Emp
{
    String name;
    double salary;

    public Emp(String name, double salary) {
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
}

class CalculateSalary
{
    public  double calSalary(Emp e)
    {
        return e.getSalary()*1.2;
    }
}

class  GenerateReport
{
    public void generateReport(Emp emp)
    {
        System.out.println("Report Generated "+emp.getName());
    }
}