package com.skillserver.worker.entity;

import jakarta.persistence.*;

@Entity
public class workerskill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name="worker_id")
    private worker work;
    private skillname  skill;
    private int experience;

}
