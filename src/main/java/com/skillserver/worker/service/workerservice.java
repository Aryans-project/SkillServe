package com.skillserver.worker.service;

import com.skillserver.worker.entity.Worker;

import java.util.List;

public interface workerservice {

     List<Worker> allworker();

     Worker findworker(Integer id);

     Worker createworker(Worker worker);

     Worker updateworker(Integer id, Worker worker);

     void deleteById(Integer id);
}
