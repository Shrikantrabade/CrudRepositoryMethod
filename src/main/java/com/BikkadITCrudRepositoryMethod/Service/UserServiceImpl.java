package com.BikkadITCrudRepositoryMethod.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadITCrudRepositoryMethod.Repository.UserRepository;
import com.BikkadIUICrudRepositoryMethod.Model.User;
@Service
public class UserServiceImpl implements UserServiceI{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		User user2 = userRepository.save(user);
		return user2;
	}

}
