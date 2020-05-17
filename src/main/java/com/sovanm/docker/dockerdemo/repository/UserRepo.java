package com.sovanm.docker.dockerdemo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sovanm.docker.dockerdemo.domain.UserEntity;

@Repository
public interface UserRepo extends CrudRepository<UserEntity, Integer> {

	Optional<UserEntity> findById(Integer id); 
}
