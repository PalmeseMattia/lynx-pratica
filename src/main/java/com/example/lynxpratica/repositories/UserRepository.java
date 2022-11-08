package com.example.lynxpratica.repositories;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lynxpratica.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findById(Integer id);
	List<User> findByNameAndSurnameAndBirthDate(String name, String surname, Date birthDate);
}
