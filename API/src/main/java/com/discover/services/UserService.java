package com.discover.services;

import java.util.List;
import java.util.Optional;

import com.discover.entities.UserEntity;

public interface UserService {
	
	List<UserEntity> findUsers();
	Optional<UserEntity> findById(Long id);
	UserEntity saveUser(UserEntity userEntity);
	UserEntity updateUser(UserEntity userEntity);
	void deleteUser(Long id);
}
