package db.common;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity @Getter
public class Threads {
    @Id
    private Long threadId;

    private String name;
    private String type;

    private Long processlistId;
    private String processlistUser;
    private String processlistHost;
    private String processlistDB;
    private String processlistCommand;
    private Long processlistTime;
    private String processlistState;
    private String processlistInfo;
    private Long parentThreadId;
    private String role;

    //private String connectionType;
    //private Long   threadOsId;
    //private String resourceGroup;

    //INSTRUMENTED	enum('YES','NO')
    //HISTORY	enum('YES','NO')
}
