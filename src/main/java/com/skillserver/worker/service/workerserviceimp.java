package com.skillserver.worker.service;

import com.skillserver.worker.entity.worker;
import com.skillserver.exception.workernotfound;
import com.skillserver.worker.repository.workerepo;

import java.util.List;

public class workerserviceimp implements workerservice {

    private final workerepo Workrepo;


    public workerserviceimp(workerepo workrepo) {
        this.Workrepo = workrepo;
    }


    @Override
    public List<worker> allworker() {
        return Workrepo.findAll();
    }

    @Override
    public worker findworker( Integer id) {
        return Workrepo.findById(id).orElseThrow(()->new workernotfound("worker witd id"+id+" not found"));
    }

    @Override
    public worker createworker(worker worker) {
        return Workrepo.save(worker);
    }

    @Override
    public worker updateworker(Integer id, worker worker) {

        worker existingworker = Workrepo.findById(id).orElseThrow(()-> new RuntimeException("no worker found"));

            existingworker.setHourlyrate(worker.getHourlyrate());
            existingworker.setRating(worker.getRating());
        return Workrepo.save(existingworker);
    }

    @Override
    public void deleteById(Integer id) {
        Workrepo.deleteById(id);
    }

}
