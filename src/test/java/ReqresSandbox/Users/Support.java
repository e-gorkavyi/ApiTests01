package ReqresSandbox.Users;

public class Support{
	private String text;
	private String url;

	public Support() {
		super();
	}

	public Support(String text, String url) {
		this.text = text;
		this.url = url;
	}

	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return text;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}
}
