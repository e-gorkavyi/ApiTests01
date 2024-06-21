package ReqresSandbox.Register;

public class RegisterResponse{
	private Integer id;
	private String token;

	public RegisterResponse() {
		super();
	}

	public RegisterResponse(Integer id, String token) {
		this.id = id;
		this.token = token;
	}

	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return id;
	}

	public void setToken(String token){
		this.token = token;
	}

	public String getToken(){
		return token;
	}
}
