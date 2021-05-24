package com.example.lde.controller;

import com.example.lde.model.ResponseTask;
import com.example.lde.service.UserTaskService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "task")
public class UserTaskController {

    private static final Logger logger = LoggerFactory.getLogger(UserTaskController.class);

    @Autowired
    @Qualifier("localUserTaskService")
    UserTaskService usrTaskService;

    //GET http://localhost:9000/task?name
    @Operation(summary = "Find user tasks by name user")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation",content = @Content(schema = @Schema(implementation = ResponseTask.class))) })
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(method = RequestMethod.GET,params = "nameUser")
    public List<ResponseTask> findAllTaskByUserName (@RequestParam String nameUser) {
        logger.info("GET /task?userName=" + nameUser);
        return usrTaskService.findAllTaskByUserName(nameUser);
    }

}
