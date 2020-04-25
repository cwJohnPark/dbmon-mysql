package dbmon.gather.schedule.Controller;



import dbmon.gather.schedule.GatherSchedulerService;
import dbmon.gather.service.dao.GlobalStatusRepository;
import dbmon.model.mysql80.Mysql80GlobalStatus;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@Transactional(readOnly = true)
@EntityScan("dbmon.model")
@SpringBootApplication(scanBasePackages = "dbmon.gather")
public class GatherController {

    private final GlobalStatusRepository globalStatusRepository;
    private final GatherSchedulerService gatherSchedulerService;

    @GetMapping("/gather/v1/test")
    public Mysql80GlobalStatus gatherV1Test() {
        return globalStatusRepository.findAll();
    }

    @GetMapping("/gather/v1/gs")
    public void gatherV1GS() throws InterruptedException {
        gatherSchedulerService.getGlobalStatus();
    }
    @GetMapping("/gather/v1/gv")
    public void gatherV1GV() throws InterruptedException {
        gatherSchedulerService.getGlobalVariables();
    }

    public static void main(String[] args) {
        SpringApplication.run(GatherController.class, args);
    }
}
