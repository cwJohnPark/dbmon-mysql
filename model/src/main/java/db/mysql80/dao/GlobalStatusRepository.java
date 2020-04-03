package db.mysql80.dao;

import com.dbmon.domain.db.common.KeyValueStatus;
import com.dbmon.domain.db.mysql80.GlobalStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class GlobalStatusRepository {
    private final EntityManager em;

    public GlobalStatus find() {
        return KeyValueStatus.parse(
                em.createNativeQuery(
                        "SELECT g FROM performance_schema.global_status", KeyValueStatus.class)
                        .getResultList(), GlobalStatus.class);
    }
}
