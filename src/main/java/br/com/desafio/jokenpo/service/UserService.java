package br.com.desafio.jokenpo.service;

import java.util.List;

import br.com.desafio.jokenpo.dto.UserDTO;

public interface UserService {
	public List<UserDTO> getUser(int id);
}
