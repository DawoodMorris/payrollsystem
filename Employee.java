/*
 * This class will represent an Employee at a company, and it will serve as asuper class for other two classes
 */
package payrollsystem;

/**
 *
 * @author Dawood F.M Kaundama
 */
public abstract class Employee 
{
    //class variables
    private int empId;
    private String name;
    private Vehicle vehicle;
    
    //defualt constructor ( default => construct without parameters
    public Employee()
    {
        //System.out.println("... inside deafault constructor.");
        empId = 0;
        name = "";
    } //end constr
    
    //non default contructor ( non-default => construct with at least one parameter)
    public Employee(int pEmpId, String pName, Vehicle pV){
        //System.out.println("...inside non-default contructor.");
        this.empId = pEmpId;
        this.name = pName;
        this.vehicle = pV;
    } // end constr
    
    public Employee(int pEmpId, String pName, String pPlate, String pColor)
    {
        System.out.println("...inside non-default contructor.");
        this.empId = pEmpId;
        this.name = pName;
        this.vehicle = new Vehicle(pPlate, pColor);
        /*
         the compiler gave the following error after the statementthis.vehicle = new Vehicle(pPlate, pColor);: 
         "constructor Vehicle in class Vehicle cannot be applied to given types;
         required: no arguments 
         found: String,String
         reason: actual and formal argument lists differ in length"
        *//* it only worked when i defined a constructor in the class Vehicle */
        
    } // end constr
    public abstract double calculatePay();
    /**
     * @return the empId
     */
    public int getEmpId()
    {
        return empId;
    }

    /**
     * @param empId the empId to set
     */
    public void setEmpId(int empId)
    {
        this.empId = empId;
    }

    /**
     * @return the name
     */
    public String getName() 
    {
        return this.name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return the vehicle
     */
    public Vehicle getVhicle()
    {
        return this.vehicle;
    }

    /**
     * @param vehicle the vehicle to set
     */
    public void setVhicle(Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }
    
}
