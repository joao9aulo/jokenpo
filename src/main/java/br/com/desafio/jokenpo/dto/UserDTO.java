package br.com.desafio.jokenpo.dto;

public class UserDTO {
	private int id;
	
	private String name;

	UserDTO(){
		super();
	}
	public UserDTO(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
