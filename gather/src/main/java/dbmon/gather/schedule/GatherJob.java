package dbmon.gather.schedule;

import dbmon.gather.service.dao.TargetDBRepository;
import lombok.RequiredArgsConstructor;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GatherJob implements Job {

    private final TargetDBRepository repository;

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        repository.findAll();
    }
}
