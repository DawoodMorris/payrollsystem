/*
 * This class is a sublacss of the class Employee 
 */
package payrollsystem;

/**
 *
 * @author Dawood F.M Kaundama
 */
public class PartTime extends Employee {
    private double rate;
    private double hoursWorked;
    
    //constr
    public PartTime(int id, String name, double rate, double hoursWorked2, Vehicle v1){
        super(id, name, v1);
        this.rate= rate;
        this.hoursWorked = hoursWorked2;
    }
    
    //define this abstr method in super class
    public double calculatePay(){
        System.out.println("Part Time Employee.");
        return (this.getRate() * this.getHoursWorked());
    }

    /**
     * @return the rate
     */
    public double getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(double rate) {
        this.rate = rate;
    }

    /**
     * @return the hoursWorked
     */
    public double getHoursWorked() {
        return hoursWorked;
    }

    /**
     * @param hoursWorked the hoursWorked to set
     */
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    
}
