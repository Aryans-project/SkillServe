package com.skillserver.worker.service;

import com.skillserver.worker.entity.worker;

import java.util.List;

public interface workerservice {

     List<worker> allworker();

     worker findworker(Integer id);

     worker createworker(worker worker);

     worker updateworker(Integer id,worker worker);

     void deleteById(Integer id);
}
