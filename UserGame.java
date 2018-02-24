import java.util.ArrayList;

public class UserGame extends SystemGame{
	
	private int percentProgress;
	private int gameEntryType;	// Indicates whether imported as a SystemGame or Manually entered.
	private ArrayList<String> userAchievementList;
	

	public UserGame() {
		// TODO Auto-generated constructor stub
	}
	
	public UserGame(int pPercentProgress, int pGameEntryType, ArrayList<String> pUserAchievementList) {
		this.percentProgress = pPercentProgress;
		this.gameEntryType = pGameEntryType;	// Indicates whether imported as a SystemGame or Manually entered.
		this.userAchievementList = pUserAchievementList;
	}
	
	//--- percentProgress ---
	public int getPercentProgress() {
		return percentProgress;
	}

	public void setPercentProgress(int pPercentProgress) {
		this.percentProgress = pPercentProgress;
	}

	//--- gameEntryType ---
	public int getGameEntryType() {
		return gameEntryType;
	}

	public void setGameEntryType(int pGameEntryType) {
		this.gameEntryType = pGameEntryType;
	}
	
	//--- userAchievementList ---
	public ArrayList<String> getUserAchievementList() {
		return userAchievementList;
	}
	
	public void setUserAchievementList(ArrayList<String> pUserAchievementList) {
		this.userAchievementList = pUserAchievementList;
	}


}
