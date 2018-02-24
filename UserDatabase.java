import java.util.ArrayList;

public class UserDatabase {

	private ArrayList<User> userDB;
	
	public UserDatabase() {
		// TODO Auto-generated constructor stub
	}
	public UserDatabase(ArrayList<User> pUserDB) {
		this.userDB = pUserDB;
	}
	
	//--- userDB ---
	public ArrayList<User> getUserDB() {
		return userDB;
	}

	public void setUserDB(ArrayList<User> userDB) {
		this.userDB = userDB;
	}

	//--- other methods ---
	public boolean doesUserIDExist(String pUserID) {
		
		boolean res = false;	// set default return value
		
		for (User usr : this.userDB){
			if (usr.getUserID() == pUserID) {
				res = true;
				return res;
			}
		}
		return res;
	}
	
	public boolean doesEmailAddrExist(String pEmailAddr) {
		
		boolean res = false;	// set default return value
		
		for (User usr : this.userDB){
			if (usr.getEmailAddress() == pEmailAddr) {
				res = true;
				return res;
			}
		}
		return res;
	}
	
	public int addUser(User pUser) {	
		
		int res = 0;	// set default return value of success
		
		//--- Check that the UserID doesn't already exist in the database
		if (doesUserIDExist(pUser.getUserID())) {		
			res = 1;	// need error codes list.. 1 = userID already exists
			return res;
		}

		//--- Check that the emailAddress doesn't already exist in the database
		if (doesEmailAddrExist(pUser.getEmailAddress())) {		
			res = 2;	// need error codes list.. 2 = emailAddress already exists
			return res;
		}
		
		//--- Add the user the the UserDB
		boolean aRes = this.userDB.add(pUser);
		if (! aRes) {	
			res = 3; 	// System error adding user to userDB
			return res;
		}
		
		return res;		// If here, it was successful.
	}
	
}
