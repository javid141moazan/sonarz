package attsd.exam.spring.project.model;

public class UserDTO {
	
	private String email;
	private String password;
	private String username;
	
	public UserDTO(String email, String password, String username) {
		this.email = email;
		this.password = password;
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}

}
