package com.projects.training.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projects.training.user.model.TechUser;

@Repository
public interface TechUserRepository extends JpaRepository<TechUser, Long>{

	public TechUser findTechUserById(Long id);
}
