package domain;

public class DbBackend implements Backend{
	
	private String url = "jdbc:mysql://localhost:3306/addressBook";
	private String username ="root";
	private String password = "root";
	//AddBackend addBackend1;
	public DbBackend(int i, String string) {
		super();
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
