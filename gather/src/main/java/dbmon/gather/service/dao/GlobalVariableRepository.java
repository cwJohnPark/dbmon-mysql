package dbmon.gather.service.dao;

import dbmon.model.common.KeyValueStatus;
import dbmon.model.mysql80.Mysql80GlobalVariable;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class GlobalVariableRepository implements TargetDBRepository {
    private final EntityManager em;

    @Override
    public Mysql80GlobalVariable findAll() {
        return KeyValueStatus.parse(
                em.createNativeQuery(
                        "SELECT variable_name, variable_value FROM performance_schema.global_variables", KeyValueStatus.class)
                        .getResultList(), Mysql80GlobalVariable.class);
    }
}
