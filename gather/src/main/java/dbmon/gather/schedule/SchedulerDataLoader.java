package dbmon.gather.schedule;

import dbmon.gather.multitenant.Tenant;
import dbmon.gather.schedule.dto.JobRequest;
import dbmon.gather.schedule.job.GatherJob;
import dbmon.gather.schedule.job.SimpleJob;
import dbmon.gather.schedule.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Slf4j
@Component
@RequiredArgsConstructor
public class SchedulerDataLoader implements ApplicationListener<ContextRefreshedEvent> {

    private final ScheduleService scheduleService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        //simple job 생성
        JobRequest jobRequest = new JobRequest();
        jobRequest.setJobName("simpleJob");
        jobRequest.setStartDateAt(LocalDateTime.now());
        jobRequest.setRepeatCount(10);
        jobRequest.setRepeatIntervalInSeconds(30);
        scheduleService.addJob(jobRequest, SimpleJob.class);

        // TODO GV, GS, lock, sysmon.. 등 잡 생성
        // 동적으로 처리하는 방법?
        scheduleService.addJob(JobRequest.builder()
                .jobName("GatherJob")
                .startDateAt(LocalDateTime.now())
                .repeatCount(10)
                .repeatIntervalInSeconds(30)
                .tenant(new Tenant()).build(), GatherJob.class);

//        //cron job 생성
//        JobDataMap jobDataMap = new JobDataMap();
//        jobDataMap.put("jobId", "123456789");
//        jobRequest = new JobRequest();
//        jobRequest.setJobName("cronJob1");
//        jobRequest.setCronExpression("0 * * ? * *"); //every min
//        jobRequest.setJobDataMap(jobDataMap);
//        scheduleService.addJob(jobRequest, CronJob.class);
//
//        jobRequest = new JobRequest();
//        jobRequest.setJobName("cronJob2");
//        jobRequest.setCronExpression("0 */5 * ? * *"); //every 5 min
//        scheduleService.addJob(jobRequest, CronJob2.class);

    }
}