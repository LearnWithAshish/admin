package com.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Entity.UserEntity;
@Repository
public interface userRepository extends JpaRepository<UserEntity, Long> {
	
	
	Optional<UserEntity> ffindByEmail(String email);

}
