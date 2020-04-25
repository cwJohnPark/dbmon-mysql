package dbmon.model.mysql80;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
public class Mysql80DataLocks {

    @Id @GeneratedValue
    private Long id;
    private LocalDateTime logtime = LocalDateTime.now();

    private String engine;
    private String engineLockId;

    private Long engineTransactionId;
    private Long threadId;
    private Long eventId;
    private String objectSchema;
    private String objectName;
    private String partitionName;
    private String subpartitionName;
    private String indexName;
    private Long objectInstanceBegin;
    private String lockType;
    private String lockMode;
    private String lockStatus;
    private String lockData;




}
