package com.BikkadITCrudRepositoryMethod.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIUICrudRepositoryMethod.Model.User;
@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

	
}
