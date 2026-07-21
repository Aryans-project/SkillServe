package com.skillserver.worker.entity;


import com.skillserver.user.entity.Users;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Worker {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    @JoinColumn(name="user_id")
    private Users user;
    private Double hourlyrate;
    @OneToMany(mappedBy = "work")
    private List<WorkerSkill> skills;
    private boolean availability;
    private Double rating;
    private Integer projectcompleted;

}
