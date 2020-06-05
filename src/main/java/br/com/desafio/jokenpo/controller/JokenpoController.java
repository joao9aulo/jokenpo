package br.com.desafio.jokenpo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.jokenpo.dto.UserDTO;
import br.com.desafio.jokenpo.service.UserService;

@RestController
public class JokenpoController {
	
	@Autowired
	UserService userService;

	@GetMapping("/users")
	public ResponseEntity<List<UserDTO>> getUser() {
		
		return ResponseEntity.status(HttpStatus.OK).body(userService.getUsers());
	}
	
	@PostMapping("/user")
	public ResponseEntity<UserDTO>  createUser(@RequestBody UserDTO userDTO) {
		
		return ResponseEntity.status(HttpStatus.CREATED).body(userDTO);
	}
}
