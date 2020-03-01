/*
 * This is program that serves as a Payroll System for a company.
 * It serves as a case-study in our edcucational journey to practice Object Oriented Progrramming
 */
package payrollsystem;

import java.util.ArrayList;
import java.util.Scanner; 

/**
 *
 * @author Dawood F.M Kaundama
 */
public class PayrollSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Employee> arrEmp = new ArrayList<Employee>();
        String varCount = "N";
        byte menuOption = 0;
        do{
            menuOption = showMenu();
            switch(menuOption){
                case 1:
                    FullTime ft;
                    ft = readNewFullTime();
                    addEmployee(arrEmp, ft); //add full time to ArrayList
                    break;
                case 2:
                    PartTime pt;
                    pt = readNewPartTime();
                    addEmployee(arrEmp, pt);
                    break;
                case 3:
                    calcPayroll(arrEmp);
                    break;
                default:
                    break;
            }
        }while(menuOption != 4);
    } // end main()
        
        //method to add newFullTime Employee
        /*********************************************************
         * This method CREATES and populates Employee objects 
         * Parameters: None
         * Return Values: new FullTime
         *********************************************************/
        
        public static FullTime readNewFullTime(){
            int id = 0;
            String name = null;
            double sal = 0.0;
            double hourAndHalf = 0.0; //over time
            Scanner kbd = new Scanner(System.in);
            System.out.print("Enter id: ");
            id = kbd.nextInt();
            System.out.print("\nEnter name: ");
            name = kbd.next();
            System.out.print("\nEnter Salary: ");
            sal = kbd.nextDouble();
            System.out.print("\nEnter Bonus: ");
            hourAndHalf = kbd.nextDouble();
        
            FullTime ft1;
            ft1 = new FullTime(id, name, sal, hourAndHalf, getVehicle());
            return ft1;  
        }// end readNewFullTime()
        
        //method to add newFullTime Employee
        /*********************************************************
         * This method CREATES and populates Employee objects 
         * Parameters: None
         * Return Values: new PartTime
         *********************************************************/
        public static PartTime readNewPartTime(){
            int id = 0;
            String name = null;
            double rate = 0.0;
            double hoursWorked = 0.0; // overtime
            
            Scanner kbd = new Scanner(System.in);
            System.out.print("Enter id: ");
            id = kbd.nextInt();
            System.out.print("\nEnter name: ");
            name = kbd.next();
            System.out.print("\nEnter Hourly rate: ");
            rate = kbd.nextDouble();
            System.out.print("\nEnter Number of Hours Worked: ");
            hoursWorked = kbd.nextDouble();
            
            Vehicle v1 = getVehicle();
            PartTime pt1 = null;
            pt1 = new PartTime(id, name, rate,hoursWorked, v1);
            return pt1;
            
        } // end readNewPartTime()
        
        //add newly created employee to ArrayList
        public static void addEmployee(ArrayList<Employee> pArrEmp, Employee pEmp){
            //this method adds one Employee e, to the ArrayList arrEmp;
            pArrEmp.add(pEmp);
        } //end addEmployee()
        
        //another method that displays the menu
        public static byte showMenu(){
            byte menuOption = 0;
            Scanner kbd = new Scanner(System.in);
            System.out.println(""
                    + "\n+------------------------------------------------------------------+"
                    + "\n|                Please Choose An Activity Below:                  |"
                    + "\n+------------------------------------------------------------------+"
                    + "\n|            1 Add Full Time.                                      |"
                    + "\n|            2 Add Part Time.                                      |"
                    + "\n|            3 Calculate Payroll.                                  |"
                    + "\n|            4 Exit.                                               |"
                    + "\n+------------------------------------------------------------------+");
            System.out.println("Input:");
            menuOption = kbd.nextByte();
            return menuOption;
        } // end showMenu()
        
        // method to show pay info
        public static void calcPayroll(ArrayList<Employee> pArrEmp){
            double totalCompanyPay = 0.0;
            double individualPay =0.0;
            
            //calculate salary, tempering with the array only
            for(int i=0; i<pArrEmp.size(); i++){
                System.out.println("\n********************************************************************\n");
                individualPay = (pArrEmp.get(i)).calculatePay(); //try with pArrEmp without ()
                Vehicle v = (pArrEmp.get(i)).getVhicle();
                String hasVehicle;
                
                //check if employee has vehicle or not
                if(v == null){
                    hasVehicle = "No";
                }else{
                    hasVehicle = "Yes";
                }
                
                System.out.println("\nEmployee Name:\t"+ pArrEmp.get(i).getName());
                System.out.println("\nHas Vehicle: \t"+hasVehicle);
                
                if(v != null){
                    System.out.println("Plate Number: \t"+v.getPlate());
                    System.out.println("Vehicle Colour:\t"+v.getColour());
                }
                
                System.out.println("Take Home Pay: \t$"+individualPay);
                totalCompanyPay = totalCompanyPay + individualPay;
                System.out.println("\n********************************************************************");
                System.out.println("  Total Payroll of the Company: \t$"+totalCompanyPay+"                 ");
                System.out.println("\n********************************************************************\n");
            } // end for loop(){} 
        } // calcPayroll()
        
        //method to collect employee vehicle info if applicable
        public static Vehicle getVehicle(){
            /*******
             * Creates and returns a Vehicle object if YES or returns null
             */
            Scanner kbd = new Scanner(System.in);
            String hasVehicle = "N";
            System.out.println("\nDoes this employee have a Vehicle? Y/N \nInput: ");
            hasVehicle = kbd.next();
            
            if(hasVehicle.equalsIgnoreCase("Y")){
                //create and populate Vehicle Object
                System.out.println("\nEnter Plate Number: ");
                String auxPlate = kbd.next();
                System.out.println("\nEnter Vehicle Colour: ");
                String auxColour = kbd.next();
                return (new Vehicle(auxPlate, auxColour));
            } else{
                return (null);
            }//end if
        } //end getVehicle()
        
} //end PayrollSystem{}
