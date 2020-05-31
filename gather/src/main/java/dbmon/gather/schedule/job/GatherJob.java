package dbmon.gather.schedule.job;

import dbmon.gather.schedule.service.dao.TargetDBRepository;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobKey;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

@Slf4j
public abstract class GatherJob extends QuartzJobBean {
    private int MAX_SLEEP_IN_SECONDS = 5;

    private volatile Thread currThread;

    private TargetDBRepository targetDBRepository;

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        // TODO tenants ID 필요
        JobDataMap jobDataMap = context.getJobDetail().getJobDataMap();
        int jobId = jobDataMap.getInt("jobId");
        String tenantId = jobDataMap.getString("tenantId");
        if(tenantId == null) {
            throw new IllegalArgumentException("No tenants Id");
        }
        JobKey jobKey = context.getJobDetail().getKey();

        currThread = Thread.currentThread();
        log.info("============================================================================");
        log.info("GatherJob started :: sleep : {} jobId : {} jobKey : {} - {}", MAX_SLEEP_IN_SECONDS, jobId, jobKey, currThread.getName());

        // tenant id set
        // repository -> streaming websocket as a server

        log.info("GatherJob ended :: jobKey : {} - {}", jobKey, currThread.getName());
        log.info("============================================================================");
    }
}
