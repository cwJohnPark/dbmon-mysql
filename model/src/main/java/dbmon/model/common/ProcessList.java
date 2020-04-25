package db.common;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
public class ProcessList {
    @Id
    private Long id;
    private String user;
    private String host;
    private String db;
    private String command;
    private Integer time;
    private String state;
    private String info;
}
