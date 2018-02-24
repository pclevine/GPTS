

import java.util.*;
import java.text.*;
import java.text.NumberFormat;
import java.io.*;


public class User extends SystemUser  {
    private Date 	dateOfBirth;		
    private ArrayList<String> ownPlatformsList;			

    public static DBG dbg = new DBG("User",false);
//	public static final String PAYROLL_FILE_ID = "c:\\_temp\\payroll.txt";


    /// -------------------------------------------------------------------------------
    /**
     *
     *
     */

    public User(){				//System.out.println("==> User: User (null constructor) -->");
//    							dbg.enter("(null constructor)");
		super();
    }

    public User( String pUserID, String pEmailAddress, Date pDateOfBirth, ArrayList<String> pOwnPlatformsList){
    							//System.out.println("==> User: User (full constructor) -->");
//								dbg.enter("(full constr)");
		super(pUserID, pEmailAddress);
		this.dateOfBirth = pDateOfBirth;
		this.ownPlatformsList = pOwnPlatformsList;
    }
    
	//--- DateOfBirth -----------------------------------------------------------------------------------------------------------
	public Date getDateOfBirth(){ //System.out.println("==> User: getDateOfBirth -->");
    							dbg.enter("getDateOfBirth", ".. in & out ..");
    	return this.dateOfBirth;
    }

    public void setDateOfBirth(Date pDateOfBirth){ 	//System.out.println("==> User: setDateOfBirth -->");
								dbg.enter("setDateOfBirth", ".. in & out ..");
		this.dateOfBirth = pDateOfBirth;
    }
    
    private int validateAge(Date pDateOfBirth){ 	//System.out.println("==> User: validateAge -->");
								dbg.enter("validateAge", ".. in & out ..");
		int res;
		
		// User validation business rules go here.
		res =  (Integer) null;
		
		return res;
    }

 //--- ownPlatformsList -----------------------------------------------------------------------------------------------------------
    public ArrayList<String> getPlatforms(){ 	//System.out.println("==> User: getPlatforms -->");
								dbg.enter("getPlatforms", ".. in & out ..");
		return this.ownPlatformsList;
	}

    public void setPlatforms(ArrayList<String> pOwnPlatformsList){ 	//System.out.println("==> User: setPlatforms -->");
								dbg.enter("setPlatforms", ".. in & out ..");
		this.ownPlatformsList = pOwnPlatformsList;
    }
    
        
    //---- toString --------------------------------------------------------------------------------------------------------
    public String toString(){		//System.out.println("==> User: toString -->");
    							dbg.enter("toString");
      	final String res;

    	res = super.toString() +  
        		"/\tDateOfBirth="  + dateOfBirth +
        		"/\tPlatforms=" + ownPlatformsList;
  
    							dbg.exit(" res=" + res);
    	return res;
    }
  //---- main --------------------------------------------------------------------------------------------------------
    public static  void main (String[] args) {
//    	FileOutputStream   fos;
//    	ObjectOutputStream oos;
//    	boolean fileDeleted;
//
//    	try{
////    						dbg.enter("Main","..enter Try: ");
//	        /* Create the file and set up the output writer. */
//        	Employee e =  new Employee("Milton Clark","theBoss", 65000.0 );
//        	System.out.println(e.toString());
//	    	File f = new File(PAYROLL_FILE_ID);
//	    	if (f.exists()) {			// If file exists, delete it.
//	    		fileDeleted = f.delete();
//	    	}
//	    	f.createNewFile();
//	    	fos = new FileOutputStream(f,true); // FileNotFoundException .. append if it already exists.
//	        oos = new ObjectOutputStream(fos);          // IOException
//
//	        /* Write alEmployeeList to the file. */
//	        	oos.writeObject(e);
//	        	fos.close();
////	        				dbg.exit();
//        }
//        catch(IOException e){  // catch all IOExceptions
////        					dbg.msg(".. catch entered.. ");
//        	System.out.println("General I/O exception: " + e.getMessage());
//            e.printStackTrace();
////            				dbg.exit();
//        }
    }
    
}
