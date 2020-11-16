/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.web.service;

import com.test.web.model.TaskSubmission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.test.web.repository.TaskSubmissionRepository;
import java.util.Iterator;
import java.util.List;
import javax.transaction.Transactional;

/**
 *
 * @author Work
 */
@Service
public class TaskSubmissionService {
    
    @Autowired
    TaskSubmissionRepository taskSubmissionRepository;
    
    @Transactional
    public boolean addTask(String task, String email){
        TaskSubmission taskSubmission = new TaskSubmission();
        taskSubmission.setEmail(email);
        taskSubmission.setTask(task);
        taskSubmissionRepository.save(taskSubmission);
        return true;  
    }
    
    public List<TaskSubmission> getAllTaskSubmissions(){
        return taskSubmissionRepository.findAll();
    }
}
