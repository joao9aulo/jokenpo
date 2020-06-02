package br.com.desafio.jokenpo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.jokenpo.dto.UserDTO;

@RestController
public class JokenpoController {

	@GetMapping("/user")
	public UserDTO getUser() {
		
		return new UserDTO(1,"João Paulo");
	}
}
