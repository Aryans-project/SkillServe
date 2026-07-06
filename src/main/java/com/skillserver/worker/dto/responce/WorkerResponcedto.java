package com.skillserver.worker.dto.responce;

import java.time.LocalDate;
import java.util.List;

public class WorkerResponcedto {
    private Integer workerId;

    private Integer userId;

    private String name;

    private String email;

    private Double hourlyRate;

    private Boolean availability;

    private Double rating;

    private Integer projectsCompleted;

    private String Bio;

    private String profilephotourl;

    private Boolean verified;

    private LocalDate joiningdate;

    private List<WorkerSkillResponce> skills;
}
