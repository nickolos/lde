package com.example.lde.service;

import com.example.lde.entities.Task;
import com.example.lde.entities.User;
import com.example.lde.model.ResponseTask;
import com.example.lde.repository.UserRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service("localUserTaskService")
//@ConditionalOnProperty("product.micro.service")
public class UserTaskServiceImpl implements UserTaskService{


    private static final Logger logger = LoggerFactory.getLogger(UserTaskServiceImpl.class);

    @Autowired
    private UserRepo userRepository;

    /**
     * Find all task by userName. UserName not uniq
     * @param userName is user name
     * @return list all tasks
     */
    @Override
    @Transactional
    public List<ResponseTask> findAllTaskByUserName(String userName) {
        List<ResponseTask> responseTaskList = new ArrayList<>();
        List<User> listUsers = userRepository.findUsersByName(userName);
        for (int i = 0; i < listUsers.size(); i++) {
            responseTaskList.addAll(listUsers.get(i).getTask().stream().map(s-> new ResponseTask(userName,s)).collect(Collectors.toList()));
        }
        return responseTaskList;
    }
}
