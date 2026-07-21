package com.skillserver.worker.service;

import com.skillserver.worker.entity.Worker;
import com.skillserver.exception.workernotfound;
import com.skillserver.worker.repository.workerepo;

import java.util.List;

public class workerserviceimp implements workerservice {

    private final workerepo Workrepo;


    public workerserviceimp(workerepo workrepo) {
        this.Workrepo = workrepo;
    }


    @Override
    public List<Worker> allworker() {
        return Workrepo.findAll();
    }

    @Override
    public Worker findworker(Integer id) {
        return Workrepo.findById(id).orElseThrow(()->new workernotfound("Worker witd id"+id+" not found"));
    }

    @Override
    public Worker createworker(Worker worker) {
        return Workrepo.save(worker);
    }

    @Override
    public Worker updateworker(Integer id, Worker worker) {

        Worker existingworker = Workrepo.findById(id).orElseThrow(()-> new RuntimeException("no Worker found"));

            existingworker.setHourlyrate(worker.getHourlyrate());
            existingworker.setRating(worker.getRating());
        return Workrepo.save(existingworker);
    }

    @Override
    public void deleteById(Integer id) {
        Workrepo.deleteById(id);
    }

}
