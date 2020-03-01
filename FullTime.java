/*
 * This class is the subclass of the class Employee
 */
package payrollsystem;

/**
 *
 * @author Dawood F.M Kaundama
 */
public class FullTime extends Employee {
    private double salary;
    private double overtime;
    
    //constr
    public FullTime(int id, String name, double sal, double halfHour, Vehicle vehicle){
        super(id, name, vehicle);
        this.overtime = halfHour;
        this.salary = sal;
    }
    
    //define this abstr method in super class
    public double calculatePay(){
        System.out.println("Full time Employee.");
        return (this.getSalary() + this.getOvertime());
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the overtime
     */
    public double getOvertime() {
        return overtime;
    }

    /**
     * @param overtime the overtime to set
     */
    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }
    
    
}
