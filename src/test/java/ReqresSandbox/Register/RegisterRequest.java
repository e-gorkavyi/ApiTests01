package ReqresSandbox.Register;

public class RegisterRequest{
	private String email;
	private String password;

	public RegisterRequest() {
		super();
	}

	public RegisterRequest(String email, String password) {
		this.password = password;
		this.email = email;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}
}
