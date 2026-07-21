package com.skillserver.worker.mapper;

import com.skillserver.worker.dto.request.CreateWorkerRequest;
import com.skillserver.worker.dto.request.WorkerSkillRequest;
import com.skillserver.worker.dto.responce.WorkerResponcedto;
import com.skillserver.worker.dto.responce.WorkerSkillResponce;
import com.skillserver.worker.entity.Worker;
import com.skillserver.worker.entity.WorkerSkill;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class WorkerMapper {

    private final WorkSkillMapper WorkerSkillMapper;

    public WorkerMapper(WorkSkillMapper WorkerSkillMapper) {
        this.WorkerSkillMapper = WorkerSkillMapper;
    }

    public Worker CreatEntity(CreateWorkerRequest request)
    {
       Worker person=new Worker();
       person.setHourlyrate(request.getHourlyrate());
       person.setAvailability(request.isAvailability());
       person.setSkills(mapskills(request.getSkills(),person));

       return person;
    }

    public WorkerResponcedto Createdto(Worker worker)
    {
      WorkerResponcedto responcedto=new WorkerResponcedto();
      responcedto.setHourlyRate(worker.getHourlyrate());
      responcedto.setAvailability(worker.isAvailability());
      responcedto.setSkills(mapskilldto(worker.getSkills()));
      return responcedto;
    }

     public List<WorkerSkill> mapskills(List<WorkerSkillRequest> skillrequestdto, Worker worker)
     {
        List<WorkerSkill> skilllist=new ArrayList<>();
        for(WorkerSkillRequest skillrequest:skillrequestdto)
        {
            WorkerSkill skill= WorkerSkillMapper.toEntity(skillrequest);
            skill.setWork(worker);
            skilllist.add(skill);

        }
        return skilllist;
     }

     public List<WorkerSkillResponce> mapskilldto(List<WorkerSkill> skillist)
     {
       List<WorkerSkillResponce> responcelist=new ArrayList<>();
       for( WorkerSkill skill:skillist)
       {
           WorkerSkillResponce responce=WorkerSkillMapper.toDto(skill);
           responcelist.add(responce);

       }

       return responcelist;
     }
}
