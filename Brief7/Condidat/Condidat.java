package Condidat;

public class Condidat {

		private int Id;
		private String firstName;
		private String lastName;
		private String email;
		private String adress;
		private String city;
		private String country;
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAdress() {
			return adress;
		}
		public void setAdress(String adress) {
			this.adress = adress;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		
		
		public Condidat(int id, String firstName, String lastName, String email, String adress, String city,
				String country) {
			super();
			Id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.adress = adress;
			this.city = city;
			this.country = country;
		}
		
		
}
