package com.skillserver.worker.repository;


import com.skillserver.worker.entity.worker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface workerepo extends JpaRepository<worker, Integer> {



}
