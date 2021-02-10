package org.abc.hazlecast.repo;

import java.util.List;
import java.util.Optional;

import org.abc.hazlecast.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	Optional<User> findById(Integer id);
	List<User> findAll();

}