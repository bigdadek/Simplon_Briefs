package KB5;

public class Condidat {
	private int Id;
	private String firstName;
	private String lastName;
	private String adress;
	private String email;
	private String country;
	private String city;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public Condidat(int id, String firstName, String lastName, String adress, String email, String country,
			String city) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.adress = adress;
		this.email = email;
		this.country = country;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Condidat [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", adress=" + adress
				+ ", email=" + email + ", country=" + country + ", city=" + city + "]";
	}
	
	
}
