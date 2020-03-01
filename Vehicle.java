/*
 * This is another class, most probably will be a sub class of the classes inclusively  PartTime or FullTime Employees
 */
package payrollsystem;

/**
 *
 * @author Dawood F.M Kaundama
 */
public class Vehicle {
    private String plate;
    private String colour;
    // this construct seemed to fix an error in super class Employee when
    // attempting to instantiate an object of type Vehicle before this non-default constr
    public Vehicle(String numPlate, String vColour){
        plate = numPlate;
        colour = vColour;
    }

    /**
     * @return the plate
     */
    public String getPlate() {
        return plate;
    }

    /**
     * @param plate the plate to set
     */
    public void setPlate(String plate) {
        this.plate = plate;
    }

    /**
     * @return the color
     */
    public String getColour() {
        return colour;
    }

    /**
     * @param colour the color to set
     */
    public void setColour(String colour) {
        this.colour = colour;
    }
    
}
