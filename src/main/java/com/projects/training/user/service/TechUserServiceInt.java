package com.projects.training.user.service;

import java.util.List;

import com.projects.training.user.model.TechUser;

public interface TechUserServiceInt {

	List<TechUser> getAllUsers();

	TechUser getUserById(Long id);

	void saveUser(TechUser techUser);

	void deleteUserById(Long id);

	void updateUser(Long id, TechUser techUser);

}
