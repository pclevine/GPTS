import java.util.ArrayList;

public class UserGameLibrary {
	
	private ArrayList<UserGame> userGameLibrary;
	
	
	public UserGameLibrary() {
		// TODO Auto-generated constructor stub
	}
	public UserGameLibrary(ArrayList<UserGame> pUserGameLibrary) {
		this.userGameLibrary = pUserGameLibrary;
	}

	//--- userGameLibrary ---
	public ArrayList<UserGame> getUserGameLibrary() {
		return userGameLibrary;
	}
	
	public void setUserGameLibrary(ArrayList<UserGame> userGameLibrary) {
		this.userGameLibrary = userGameLibrary;
	}

}
