package br.com.desafio.jokenpo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.jokenpo.dto.UserDTO;

@RestController
public class JokenpoController {

	@GetMapping("/user")
	public UserDTO getUser() {
		
		return new UserDTO(1,"João Paulo");
	}
	
	@PostMapping("/user")
	public ResponseEntity<UserDTO>  createUser(@RequestBody UserDTO userDTO) {
		
		return ResponseEntity.status(HttpStatus.CREATED).body(userDTO);
	}
}
