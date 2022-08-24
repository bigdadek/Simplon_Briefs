package pack.Models;

public class Categorie {
	
	private int cId;
	private String cName;
	
	
	
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	
	
	public Categorie(int cId, String cName) {
		super();
		this.cId = cId;
		this.cName = cName;
	}
	
	

}
