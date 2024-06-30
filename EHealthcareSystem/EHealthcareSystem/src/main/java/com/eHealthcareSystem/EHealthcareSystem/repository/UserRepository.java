package com.eHealthcareSystem.EHealthcareSystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.eHealthcareSystem.EHealthcareSystem.entity.User;

@Repository
@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User,Integer> {
	
	Optional<User> findOneByEmailAndPassword(String email,String password);
	User findByEmail(String email);

}
