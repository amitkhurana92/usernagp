package com.sovanm.docker.dockerdemo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="user")
public class UserEntity {
	@Id
	private Integer id;
	@Column
	private String name;
	@Column
	private Integer age;
	@Column
	private String email;

}
