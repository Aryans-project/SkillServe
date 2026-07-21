package com.skillserver.worker.dto.responce;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class WorkerResponcedto {

    //working tabel should hold this
    private Integer workerId;

    //user tabel should hold it
    private Integer userId;

    //this to be taken from users tabels
    private String name;

    //thsi to be taken from users tabel
    private String email;

    private Double hourlyRate;

    private Boolean availability;

    //internally calculated by the computer based on customer review
    private Double rating;

    //this count would be updated by the computer
    private Integer projectsCompleted;

    //this are to be given by us
    private List<WorkerSkillResponce> skills;
}
