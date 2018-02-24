

import java.util.Date;
import java.util.Scanner;
import java.util.*;
import java.text.*;
import java.text.NumberFormat;
import java.io.*;

//import pkgWeek4.Cart;

public class Employee implements Serializable  {
    private String 	fullName;		// includes spaces and punctuation
    private String 	userID;			// assignment called it a login
    private double 	base_salary ;
    private Date 	creationDate;
    private int 	employeeID;
    private static int 	nextEmpID = 0;			// The employee ID to be assigned to the next Employee
	public static final String PAYROLL_FILE_ID = "c:\\_temp\\payroll.txt";
	public static DBG dbg = new DBG("Employee",false);


    /// -------------------------------------------------------------------------------
    /**
     *
     *
     */

    public Employee(){
								//System.out.println("==> Employee: Employee (null constructor) -->");
    							dbg.enter("(null)");
    }

    public Employee( String pFullName, String pUserID, double pBase_salary){
    							//System.out.println("==> Employee: Employee (constructor) -->");
								dbg.enter("(full constr)");
        //System.out.println("Northwoods Sweets\nWelcome to our shop.\n");
    	fullName 	= pFullName.trim();
    	userID 		= pUserID.trim();
    	base_salary = pBase_salary;
    	employeeID 	= nextID();
    	creationDate = Calendar.getInstance().getTime();
    }

    public String getUserID(){ 	// getter method so the userID is accessible while scanning Employee arrayList for a match.
    							//System.out.println("==> Employee: getUserID -->");
    							dbg.enter("getUserID", ".. in & out ..");
    	return userID;
    }

    public int getEmployeeID(){ 	// getter method so the userID is accessible while scanning Employee arrayList for a match.
								//System.out.println("==> Employee: getEmployeeID -->");
								dbg.enter("getEmployeeID", ".. in & out ..");
		return employeeID;
	}

    public void setSalary(double pBase_salary){
    							//System.out.println("==> Employee: setSalary -->");
    							dbg.enter("setSalary", " salaryIn=" + String.valueOf(pBase_salary));
        //System.out.println("Northwoods Sweets\nWelcome to our shop.\n");
        base_salary = pBase_salary;
    }

    private int nextID(){
    							//System.out.println("-dbg - Employee.nextEmpID=" + Integer.toString(nextEmpID) + "  -dbg-");
    							dbg.enter("nextID","employeeID="+Integer.toString(employeeID));
    							//System.out.println("==> Employee: nextID = " + Integer.toString(nextEmpID) + " -->");
    							dbg.msg("nextEmpID="+Integer.toString(nextEmpID));
        // Return the value of this.nextID, then increment it in prep for next employeeID
    	int useThisEmployeeID;
    	useThisEmployeeID = nextEmpID;
    	nextEmpID++;
    							dbg.exit();
    	return useThisEmployeeID;
    }

    public String toString(){
    							//System.out.println("==> Employee: toString -->");
    							dbg.enter("toString");
        //System.out.println("Northwoods Sweets\nWelcome to our shop.\n");  //String formatted = String.format("%08d", number);
    	//SimpleDateFormat dateFmt = new SimpleDateFormat("MM/dd/yyyy");
    	final String res;
    	NumberFormat curFmt = NumberFormat.getCurrencyInstance();
    	DateFormat df = new SimpleDateFormat("MM/dd/yyyy");	// was "MM/dd/yyyy HH:mm:ss"

    	res = "\nID=" + String.format("%05d",employeeID) +   //String.format( "\nTotal price = $%6.2f\n", totalPrice )
        		"/\tlogin="  + userID +
        		"/\tsalary=" + curFmt.format(base_salary) +
        		"/\tdate created=" + df.format(creationDate) +
        		"/\tfull name=" + fullName;
    	//System.out.print(res);
    							dbg.exit(" res=" + res);
    	return res;
    }

    public static  void main (String[] args) {
    	FileOutputStream   fos;
    	ObjectOutputStream oos;
    	boolean fileDeleted;

    	try{
//    						dbg.enter("Main","..enter Try: ");
	        /* Create the file and set up the output writer. */
        	Employee e =  new Employee("Milton Clark","theBoss", 65000.0 );
        	System.out.println(e.toString());
	    	File f = new File(PAYROLL_FILE_ID);
	    	if (f.exists()) {			// If file exists, delete it.
	    		fileDeleted = f.delete();
	    	}
	    	f.createNewFile();
	    	fos = new FileOutputStream(f,true); // FileNotFoundException .. append if it already exists.
	        oos = new ObjectOutputStream(fos);          // IOException

	        /* Write alEmployeeList to the file. */
	        	oos.writeObject(e);
	        	fos.close();
//	        				dbg.exit();
        }
        catch(IOException e){  // catch all IOExceptions
//        					dbg.msg(".. catch entered.. ");
        	System.out.println("General I/O exception: " + e.getMessage());
            e.printStackTrace();
//            				dbg.exit();
        }






    }
}
