package com.projects.training.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projects.training.user.model.TechUser;
import com.projects.training.user.repository.TechUserRepository;

@Service
public class TechUserServiceImpl implements TechUserServiceInt {
	
	@Autowired
	TechUserRepository techUserRepository;

	@Override
	public List<TechUser> getAllUsers() {
		return techUserRepository.findAll();
	}

	@Override
	public TechUser getUserById(Long id) {
		return techUserRepository.findTechUserById(id);
	}

	@Override
	public void saveUser(TechUser techUser) {
		techUserRepository.save(techUser);
	}

	@Override
	public void deleteUserById(Long id) {
		techUserRepository.deleteById(id);
	}

	@Override
	public void updateUser(Long id, TechUser techUser) {
		TechUser updatedUser = techUserRepository.findTechUserById(id);
		updatedUser.setLanguages(techUser.getLanguages());
		updatedUser.setSelectedCategory(techUser.getSelectedLanguage());
		updatedUser.setSelectedLanguage(techUser.getSelectedLanguage());
		updatedUser.setUsername(techUser.getUsername());
		updatedUser.setExperienceLevel(techUser.getExperienceLevel());
		techUserRepository.save(updatedUser);
	}

}
