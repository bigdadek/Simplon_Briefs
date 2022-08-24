package Categorie;

public class Categorie {

	private int categId ;
	private String categName ;
	
	public int getCategId() {
		return categId;
	}
	public void setCategId(int categId) {
		this.categId = categId;
	}
	public String getCategName() {
		return categName;
	}
	public void setCategName(String categName) {
		this.categName = categName;
	}
	
	
	public Categorie(int categId, String categName) {
		this.categId = categId;
		this.categName = categName;
	}
	
}
