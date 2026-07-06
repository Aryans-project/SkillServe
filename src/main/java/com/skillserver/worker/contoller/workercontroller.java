package com.skillserver.worker.contoller;

import com.skillserver.worker.entity.worker;
import com.skillserver.worker.service.workerservice;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/worker")
public class workercontroller {
    private final workerservice workerservice;

    public workercontroller(workerservice workerservice)
    {
        this.workerservice=workerservice;
    }
    @GetMapping("/{id}")
    public worker getworker(@PathVariable Integer id)
    {
        return workerservice.findworker(id);
    }

    @DeleteMapping("/{id}")
    public void deleteworker(@PathVariable Integer id)
    {
        workerservice.deleteById(id);
    }
    @GetMapping
    public List<worker> getallworker()
    {
        return workerservice.allworker();
    }
    @PostMapping
    public worker createworker(@RequestBody worker worker)
    {
        return workerservice.createworker(worker);
    }
    @PutMapping("/{id}")
    public worker updateworker(@PathVariable Integer id,@RequestBody worker worker)
    {
        return workerservice.updateworker(id,worker);
    }
}
