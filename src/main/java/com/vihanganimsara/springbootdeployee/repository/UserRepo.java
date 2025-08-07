package com.vihanganimsara.springbootdeployee.repository;

import com.vihanganimsara.springbootdeployee.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
