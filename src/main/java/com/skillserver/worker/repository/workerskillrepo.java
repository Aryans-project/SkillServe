package com.skillserver.worker.repository;

import com.skillserver.worker.entity.WorkerSkill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface workerskillrepo extends JpaRepository<WorkerSkill, Integer> {
}
