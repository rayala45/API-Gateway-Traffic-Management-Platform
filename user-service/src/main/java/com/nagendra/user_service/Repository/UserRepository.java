package com.nagendra.user_service.Repository;

import com.nagendra.user_service.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
