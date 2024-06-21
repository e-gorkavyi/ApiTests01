package ReqresSandbox.Users;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
	@JsonProperty("last_name")
	private String lastName;
	private Integer id;
	private String avatar;
	@JsonProperty("first_name")
	private String firstName;
	private String email;

	public User() {
		super();
	}

	public User(String lastName, Integer id, String avatar, String firstName, String email) {
		this.lastName = lastName;
		this.id = id;
		this.avatar = avatar;
		this.firstName = firstName;
		this.email = email;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return id;
	}

	public void setAvatar(String avatar){
		this.avatar = avatar;
	}

	public String getAvatar(){
		return avatar;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}
}
