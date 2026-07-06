package com.skillserver.user.reposioty;

import com.skillserver.user.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface repo extends JpaRepository<Users, Integer> {
    @Override
    Optional<Users> findById(Integer id);
}
