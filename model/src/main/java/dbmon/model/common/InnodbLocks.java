package db.common;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
public class InnodbLocks {
    @Id @GeneratedValue
    private Long id;
    private LocalDateTime logtime = LocalDateTime.now();

    private String lockId;
    private String lockTrxId;
    private String lockMode;
    private String lockType;
    private String lockTable;
    private String lockIndex;
    private Long lockSpace;
    private Long lockPage;
    private Long lockRec;
    private String lockData;
}
