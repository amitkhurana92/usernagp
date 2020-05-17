package com.sovanm.docker.dockerdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sovanm.docker.dockerdemo.dto.UserDto;
import com.sovanm.docker.dockerdemo.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/user/1")
	public ResponseEntity<UserDto> getUserDetails() {
		UserDto dto = userService.getUserDetails(1);
		return new ResponseEntity<>(dto, HttpStatus.OK);

	}
}
