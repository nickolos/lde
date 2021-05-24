package com.example.lde.service;

import com.example.lde.model.ResponseTask;

import java.util.List;

public interface UserTaskService {

    List<ResponseTask> findAllTaskByUserName(String userName);
}
