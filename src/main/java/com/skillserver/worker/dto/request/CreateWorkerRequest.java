package com.skillserver.worker.dto.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateWorkerRequest {

    @NotNull
    private Integer userid;

    @Positive
    private Double hourlyrate;

    @NotNull
    private boolean availability;

    @NotEmpty
    private List<WorkerSkillRequest> skills;

}
