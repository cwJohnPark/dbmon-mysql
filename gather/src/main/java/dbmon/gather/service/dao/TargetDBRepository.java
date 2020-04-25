package dbmon.gather.service.dao;

import org.springframework.stereotype.Component;

@Component
public interface TargetDBRepository<T> {

    T findAll();
}
