package com.skillserver.worker.repository;


import com.skillserver.worker.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface workerepo extends JpaRepository<Worker, Integer> {



}
