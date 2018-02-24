import java.util.ArrayList;


public class PersonalizationOptions {
	private ArrayList<String> ownPlatformsList;
	private ArrayList<String> levelsOfDifficultyList;
	private ArrayList<String> prefGenreList;
	private ArrayList<String> prefPublishersList;
	private String prefVisualTheme;
	private boolean wantsGameSuggesions;
	

	public PersonalizationOptions() {
		
	}
	
	//-- ownPlatformsList[] --
	public ArrayList<String> getOwnPlatformsList() {
		return this.ownPlatformsList;
	}
	
	public void setOwnPlatformsList(ArrayList<String> pOwnPlatformsList) {
		this.ownPlatformsList = pOwnPlatformsList;
	}
		
	//-- levelsOfDifficultyList[] --
	public ArrayList<String> getlevelsOfDifficultyList() {
		return this.levelsOfDifficultyList;
	}
	
	public void setlevelsOfDifficultyList(ArrayList<String> pLevelsOfDifficultyList) {
		this.levelsOfDifficultyList = pLevelsOfDifficultyList;
	}
	
	//-- prefGenreList[] --
	public ArrayList<String> getPrefGenreList() {
		return this.prefGenreList;
	}
	
	public void setPrefGenreList(ArrayList<String> pPrefGenreList) {
		this.prefGenreList = pPrefGenreList;
	}
	
	//-- prefPublishersList[] --
	public ArrayList<String> getPrefPublishersList() {
		return this.prefPublishersList;
	}
	
	public void setPrefPublishersList(ArrayList<String> pPrefPublishersList) {
		this.prefPublishersList = pPrefPublishersList;
	}
	
	//-- prefVisualTheme --
	public String getPrefVisualTheme() {
		return this.prefVisualTheme;
	}
	
	public void setPrefVisualTheme(String pPrefVisualTheme) {
		this.prefVisualTheme = pPrefVisualTheme;
	}
	
	//-- wantsGameSuggesions --
	public boolean getWantsGameSuggesions() {
		return this.wantsGameSuggesions;
	}
	
	public void setWantsGameSuggesions(boolean pWantsGameSuggesions) {
		this.wantsGameSuggesions = pWantsGameSuggesions;
	}
	
	
	
	
	
	
}
