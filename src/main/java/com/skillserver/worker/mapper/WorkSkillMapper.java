package com.skillserver.worker.mapper;

import com.skillserver.worker.dto.request.WorkerSkillRequest;
import com.skillserver.worker.dto.responce.WorkerSkillResponce;
import com.skillserver.worker.entity.WorkerSkill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor

public class WorkSkillMapper {

    public WorkerSkill toEntity(WorkerSkillRequest dto)
    {
        WorkerSkill Skill=new WorkerSkill();
        Skill.setSkill(dto.getSkill());
        Skill.setExperience(dto.getExperience());

        return Skill;
    }

    public WorkerSkillResponce toDto(WorkerSkill skill)
    {
        WorkerSkillResponce dto=new WorkerSkillResponce();
        dto.setSkills(skill.getSkill());
        dto.setExperience(skill.getExperience());

        return dto;
    }
}
