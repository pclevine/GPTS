import java.util.ArrayList;

public class SystemGame {
//	private image icon;
	private String title;
	private String publisher;
	private String category;
	private String levelOfDifficulty;
	private ArrayList<String> achievementList;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String pPublisher) {
		this.publisher = pPublisher;
	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String pCategory) {
		this.category = pCategory;
	}
	
	public String getLevelOfDifficulty() {
		return levelOfDifficulty;
	}
	public void setLevelOfDifficulty(String pLevelOfDifficulty) {
		this.levelOfDifficulty = pLevelOfDifficulty;
	}
	
	public ArrayList<String> getAchievementList() {
		return achievementList;
	}
	public void setAchievementList(ArrayList<String> pAchievementList) {
		this.achievementList = pAchievementList;
	}
	

}
