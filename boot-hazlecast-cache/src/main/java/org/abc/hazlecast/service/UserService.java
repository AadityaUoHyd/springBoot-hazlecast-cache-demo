package org.abc.hazlecast.service;

import java.util.List;
import java.util.Optional;

import org.abc.hazlecast.entity.User;
import org.abc.hazlecast.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	@Cacheable(cacheNames = { "userCache" })
	public List<User> getUsers() {
		System.out.println("Hitting DB for 1st time, from getUsers() method");
		return repository.findAll();
	}

	@Cacheable(value = "userCache", key = "#id", unless = "#result==null")
	public Optional<User> getUser(int id) {
		System.out.println("Hit DB 1st time in getUser()");
		return repository.findById(id);
	}

	@CacheEvict(value = "userCache")
	public String delete(int id) {
		repository.deleteById(id);
		return "User deleted with id " + id;
	}

}