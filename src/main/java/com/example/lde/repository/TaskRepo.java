package com.example.lde.repository;

import com.example.lde.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepo  extends JpaRepository<Task, Integer>  {

}
