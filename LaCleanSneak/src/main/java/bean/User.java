package bean;

public class User {
	private int id;
	private String firstName;
	private String lastName;
	private String address;
	private String phone;
	private String mail;
	private String password;
	private String userPicPath;

	public User() {
	}
	
	public User(int id) {
		this.id = id;
	}

	public User(String firstName, String lastName, String mail) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.mail = mail;
	}

	public User(String firstName, String lastName, String address, String phone, String mail, String password,
			String userPicPath) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		this.mail = mail;
		this.password = password;
		this.userPicPath = userPicPath;
	}

	public User(int id, String firstName, String lastName, String address, String phone, String mail, String password,
			String userPicPath) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		this.mail = mail;
		this.password = password;
		this.userPicPath = userPicPath;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserPicPath() {
		return userPicPath;
	}

	public void setUserPicPath(String userPicPath) {
		this.userPicPath = userPicPath;
	}

	@Override
	public String toString() {
		return "User [prenom=" + firstName + ",nom=" + lastName + ",  adresse=" + address + ", telephone=" + phone
				+ ", email=" + mail + ", mdp=" + password + ", photo=" + userPicPath + "]";
	}
	
}
