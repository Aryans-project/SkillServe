package com.skillserver.worker.repository;

import com.skillserver.worker.entity.workerskill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface workerskillrepo extends JpaRepository<workerskill, Integer> {
}
