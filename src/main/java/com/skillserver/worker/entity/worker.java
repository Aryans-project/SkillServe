package com.skillserver.worker.entity;


import com.skillserver.user.entity.Users;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class worker {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    @JoinColumn(name="user_id")
    private Users user;
    private double hourlyrate;
    @OneToMany(mappedBy = "work")
    private List<workerskill> skills;
    @OneToMany
    private List<Review> review;
    private boolean availability;
    private double rating;
    private int projectcompleted;

}
