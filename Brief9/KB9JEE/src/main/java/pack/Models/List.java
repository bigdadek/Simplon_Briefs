package pack.Models;

import java.sql.Date;

public class List {

	private int listId;
	private String listTitle;
	private String listDiscription;
	private Date listDate;
	private String listCateg;
	private String listSatuts;
	private int listUId;
	
	
	public int getListUId() {
		return listUId;
	}
	public void setListUId(int listUId) {
		this.listUId = listUId;
	}
	public String getListDiscription() {
		return listDiscription;
	}
	public void setListDiscription(String listDiscription) {
		this.listDiscription = listDiscription;
	}
	public int getListId() {
		return listId;
	}
	public void setListId(int listId) {
		this.listId = listId;
	}
	public String getListTitle() {
		return listTitle;
	}
	public void setListTitle(String listTitle) {
		this.listTitle = listTitle;
	}
	public Date getListDate() {
		return listDate;
	}
	public void setListDate(Date listDate) {
		this.listDate = listDate;
	}
	public String getListCateg() {
		return listCateg;
	}
	public void setListCateg(String listCateg) {
		this.listCateg = listCateg;
	}
	public String getListSatuts() {
		return listSatuts;
	}
	public void setListSatuts(String listSatuts) {
		this.listSatuts = listSatuts;
	}
	
	
	public List(int listId, String listTitle, String listDiscription, Date listDate, String listCateg,
			String listSatuts, int listUId) {
		super();
		this.listId = listId;
		this.listTitle = listTitle;
		this.listDiscription = listDiscription;
		this.listDate = listDate;
		this.listCateg = listCateg;
		this.listSatuts = listSatuts;
		this.listUId = listUId;
	}
	
	

}
	
	
	

