package dbmon.gather.schedule.service.dao;

import org.springframework.stereotype.Component;

@Component
public interface TargetDBRepository<T> {

    T findAll();
}
