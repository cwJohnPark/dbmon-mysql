package dbmon.gather.schedule;

import dbmon.gather.service.dao.GlobalStatusRepository;
import dbmon.gather.service.dao.GlobalVariableRepository;
import dbmon.model.mysql80.Mysql80GlobalStatus;
import dbmon.model.mysql80.Mysql80GlobalVariable;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class GatherSchedulerService {
    private final GlobalStatusRepository globalStatusRepository;
    private final GlobalVariableRepository globalVariableRepository;

    public void getGlobalStatus() throws InterruptedException {
        List<Mysql80GlobalStatus> list = new ArrayList<>();

    }

    public void getGlobalVariables() throws InterruptedException {
        List<Mysql80GlobalVariable> list = new ArrayList<>();

    }

    private void startSchedule() {

    }
}
