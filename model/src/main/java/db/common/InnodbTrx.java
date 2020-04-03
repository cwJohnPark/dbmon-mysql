package db.common;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
public class InnodbTrx {
    @Id
    private String trxId;
    private String trxState;
    private LocalDateTime trxStarted;
    private String trxRequestedLockId;
    private LocalDateTime trxWaitStarted;
    private Long trxWeight;
    private Long trxMysqlThreadId;
    private String trxQuery;
    private String trxOperationState;
    private Long trxTablesInUse;
    private Long trxTablesLocked;
    private Long trxLockStructs;
    private Long trxLockMemoryBytes;
    private Long trxRowsLocked;
    private Long trxRowsModified;
    private Long trxConcurrencyTickets;
    private String trxIsolationLevel;
    private Integer trxUniqueChecks;
    private Integer trxForeignKeyChecks;
    private String trxLastForeignKeyError;
    private Integer trxAdaptiveHashLatched;
    private Long trxAdaptiveHashTimeout;
    private Integer trxIsReadOnly;
    private Integer trxAutocommitNonLocking;


}
