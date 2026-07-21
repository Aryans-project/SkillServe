package com.skillserver.worker.dto.request;

import com.skillserver.worker.entity.SkillName;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkerSkillRequest
{
    @NotNull(message ="skill is required")
    private SkillName skill;

    @NotNull(message = "Experience is required")
    @PositiveOrZero(message = "Experience could not be negative")
    private Integer experience ;
}
