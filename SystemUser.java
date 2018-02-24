

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;



public class SystemUser {			//implements Serializable  {
    private String 	userID;		
    private String 	emailAddress;	
    private String 	password;
    private String 	authorizationLevel;

    public static DBG dbg = new DBG("User",false);
//    public static final String PAYROLL_FILE_ID = "c:\\_temp\\payroll.txt";
	

    /// -------------------------------------------------------------------------------
    /**
     *
     *
     */

    public SystemUser(){						//System.out.println("==> SuperUser:  SuperUser (null constructor) -->");
    							dbg.enter("(null constructor)");
		
    }

    public SystemUser( String pUserID, String pEmailAddress){	//System.out.println("==> SuperUser: User (constructor) -->");
								dbg.enter("(full constr)");
		this.userID	= pUserID;
		this.emailAddress =	pEmailAddress;
    }
    
 //--- userID -----------------------------------------------------------------------------------------------------------
    public String getUserID(){				//System.out.println("==> SuperUser: getUserID -->");
    							dbg.enter("getUserID", ".. in & out ..");
    	return this.userID;
    }

    public void setUserID(String pUserID){ 		//System.out.println("==> SuperUser: setUserID -->");
								dbg.enter("setUserID", ".. in & out ..");
		this.userID = pUserID;
    }
    
    public int validateUserID(String pUserID){ 	//System.out.println("==> SuperUser: validateUserID -->");
								dbg.enter("validateUserID", ".. in & out ..");
		int res;
		
		// User validation business rules go here.
		res =  (Integer) null;
		
		return res;
    }
    
 //--- eMailAddress -----------------------------------------------------------------------------------------------------------
    public String getEmailAddress(){ 		//System.out.println("==> SuperUser: getEMailAddress -->");
								dbg.enter("getEmailAddress", ".. in & out ..");
		return this.emailAddress;
	}

    public void setEmailAddress(String pEmailAddress){ 	//System.out.println("==> SuperUser: setEMailAddress -->");
								dbg.enter("setEmailAddress", ".. in & out ..");
		this.emailAddress = pEmailAddress;
    }
    
    protected int validateEmailAddress(String pEmailAddress){ 	//System.out.println("==> SuperUser: validateEmailAddress -->");
								dbg.enter("validateEmailAddress", ".. in & out ..");
		int res = 0;
		boolean isValid = false;
		EmailRegex eMailRgx = new EmailRegex();
		
		// EMail validation business rules go here.
		isValid = eMailRgx.validateEmailAddress(pEmailAddress.trim());
		if (!isValid) {
			res = 10;	// Invalid email address
			return res;
		}		
		return res;
}    
    
    //--- encrPassword -----------------------------------------------------------------------------------------------------------
    public String getPassword(){ 	//System.out.println("==> SuperUser: getPassword -->");
								dbg.enter("getPassword", ".. in & out ..");
		return this.password;
	}

    public void setPassword(String pPassword){ 	//System.out.println("==> SuperUser: setPassword -->");
								dbg.enter("setPassword", ".. in & out ..");
		this.password = pPassword;
    }
    
    protected int validatePassword(String pPassword){ 	//System.out.println("==> SuperUser: validatePassword -->");
								dbg.enter("validatePassword", ".. in & out ..");
		int res;						
		// Password validation business rules go here.
		res =  (Integer) null;
		return res;
    }    
    
    //--- authorizationLevel -----------------------------------------------------------------------------------------------------------
    public String getAuthorizationLevel(){ 	//System.out.println("==> SuperUser: getAuthorizationLevel -->");
								dbg.enter("getAuthorizationLevel", ".. in & out ..");
		return authorizationLevel;
	}

    public void setAuthorizationLevel(String pAuthorizationLevel){ 	//System.out.println("==> SuperUser: setAuthorizationLevel -->");
								dbg.enter("setAuthorizationLevel", ".. in & out ..");
		this.authorizationLevel = pAuthorizationLevel;
    }
    
    
    //---- toString --------------------------------------------------------------------------------------------------------
    public String toString(){	//System.out.println("==> SuperUser: toString -->");
    							dbg.enter("toString");
     
    	//SimpleDateFormat dateFmt = new SimpleDateFormat("MM/dd/yyyy");
    	final String res;

    	res = "\nuserID=" + String.format("%0s",userID) +   //String.format( "\nTotal price = $%6.2f\n", totalPrice )
        		"/\teMailAddress="  + emailAddress +
        		"/\tencrPassword=" + password +
        		"/\tauthorizationLevel=" + authorizationLevel;

    	//System.out.print(res);
    							dbg.exit(" res=" + res);
    	return res;
    }
  //---- main --------------------------------------------------------------------------------------------------------
    public static  void main (String[] args) {
//    	FileOutputStream   fos;
//    	ObjectOutputStream oos;
//    	boolean fileDeleted;

//    	try{
//    						dbg.enter("Main","..enter Try: ");
	        /* Create the file and set up the output writer. */
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
//	        				dbg.exit();
//        }
//        catch(IOException e){  // catch all IOExceptions
//        					dbg.msg(".. catch entered.. ");
//        	System.out.println("General I/O exception: " + e.getMessage());
//            e.printStackTrace();
//            				dbg.exit();
//        }

    }
}
