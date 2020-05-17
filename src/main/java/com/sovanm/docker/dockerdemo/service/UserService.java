package com.sovanm.docker.dockerdemo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sovanm.docker.dockerdemo.domain.UserEntity;
import com.sovanm.docker.dockerdemo.dto.UserDto;
import com.sovanm.docker.dockerdemo.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;

	public UserDto getUserDetails(Integer id) {
		UserDto dto = new UserDto();
		Optional<UserEntity> userOptional = userRepo.findById(id);

		if (userOptional.isPresent()) {
			dto.setName(userOptional.get().getName());
			dto.setAge(userOptional.get().getAge());
			dto.setEmail(userOptional.get().getEmail());
		}

		return dto;

	}
}
