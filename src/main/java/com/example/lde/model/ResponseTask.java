package com.example.lde.model;

import com.example.lde.entities.Task;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTask implements Serializable {

    private Integer id;

    private String userName;

    private String task;

    private Date deadline;

    public ResponseTask (String userName, Task task){
        this.id = task.getId();
        this.userName = userName;
        this.task = task.getName();
        this.deadline = task.getDate();
    }

//    public ResponseTask (String userName, Integer id, String task, Date deadline ){
//        this.id = id;
//        this.userName = userName;
//        this.task = task;
//        this.deadline = deadline;
//    }

}
