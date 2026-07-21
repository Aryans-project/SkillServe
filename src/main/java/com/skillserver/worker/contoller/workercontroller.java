package com.skillserver.worker.contoller;

import com.skillserver.worker.entity.Worker;
import com.skillserver.worker.service.workerservice;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Worker")
public class workercontroller {
    private final workerservice workerservice;

    public workercontroller(workerservice workerservice)
    {
        this.workerservice=workerservice;
    }
    @GetMapping("/{id}")
    public Worker getworker(@PathVariable Integer id)
    {
        return workerservice.findworker(id);
    }

    @DeleteMapping("/{id}")
    public void deleteworker(@PathVariable Integer id)
    {
        workerservice.deleteById(id);
    }
    @GetMapping
    public List<Worker> getallworker()
    {
        return workerservice.allworker();
    }
    @PostMapping
    public Worker createworker(@RequestBody Worker worker)
    {
        return workerservice.createworker(worker);
    }
    @PutMapping("/{id}")
    public Worker updateworker(@PathVariable Integer id, @RequestBody Worker worker)
    {
        return workerservice.updateworker(id,worker);
    }
}
