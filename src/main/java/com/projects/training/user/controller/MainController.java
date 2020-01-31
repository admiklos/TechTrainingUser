package com.projects.training.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projects.training.user.model.TechUser;
import com.projects.training.user.service.TechUserServiceImpl;

@RestController
public class MainController {
	
	@Autowired
	TechUserServiceImpl techUserServiceImpl;
	
	@CrossOrigin
	@GetMapping("/")
	public String index() {
		return "Tech User Project";
	}
	
	@CrossOrigin
	@GetMapping("/users")
	public List<TechUser> getAllUsers() {
		return techUserServiceImpl.getAllUsers();
	}
	
	@CrossOrigin
	@GetMapping("/user/{id}")
	public TechUser getUserById(@PathVariable Long id) {
		return techUserServiceImpl.getUserById(id);
	}
	
	@CrossOrigin
	@PostMapping("/user")
	public void saveUser (@RequestBody TechUser techUser) {
		techUserServiceImpl.saveUser(techUser);
	}
	
	@CrossOrigin
	@DeleteMapping("/user/{id}")
	public void deleteUserById(@PathVariable Long id) {
		techUserServiceImpl.deleteUserById(id);
	}
	
	@CrossOrigin
	@PutMapping("/user/{id}")
	public void updateUser(@PathVariable Long id, @RequestBody TechUser techUser) {
		techUserServiceImpl.updateUser(id, techUser);
	}

}
