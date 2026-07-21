package com.skillserver.worker.dto.responce;

import com.skillserver.worker.entity.SkillName;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkerSkillResponce {

    @NotNull(message = "this should be never null")
    private SkillName skills;
    @NotNull(message = "this should be there")
    @PositiveOrZero(message = "this cant be negative ")
    private Integer experience;
}
