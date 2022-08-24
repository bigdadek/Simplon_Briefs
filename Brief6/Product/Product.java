package Product;


public class Product {
	
	private int prodId ;
	private String prodName ;
	private float prodPrice;
	private String prodDate;
	private int categId;
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public float getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(float prodPrice) {
		this.prodPrice = prodPrice;
	}
	public String getProdDate() {
		return prodDate;
	}
	public void setProdDate(String prodDate) {
		this.prodDate = prodDate;
	}
	public int getCategId() {
		return categId;
	}
	public void setCategId(int categId) {
		this.categId = categId;
	}
	public Product(int prodId, String prodName, float prodPrice, String prodDate, int categId) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodDate = prodDate;
		this.categId = categId;
	}
	
	
	
}