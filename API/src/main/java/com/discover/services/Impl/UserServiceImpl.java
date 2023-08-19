package com.discover.services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.discover.entities.UserEntity;
import com.discover.repositories.UserRepository;
import com.discover.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private final UserRepository userRepository;

	
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public List<UserEntity> findUsers() {
		return userRepository.findAll();
	}

	@Override
	public Optional<UserEntity> findById(Long id) {
		return userRepository.findById(id);
	}

	@Override
	public UserEntity saveUser(UserEntity userEntity) {
		return userRepository.save(userEntity);
	}

	@Override
	public UserEntity updateUser(UserEntity userEntity) {
		return userRepository.save(userEntity);
	}

	@Override
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
		
	}

}
