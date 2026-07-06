package com.skillserver.worker.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UpdateWorkerRequest {

    private Boolean available;

    private Double  hourlyrate;

    private List<WorkerSkillRequest> skills;
}
