/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.web.repository;


import com.test.web.model.TaskSubmission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 *
 * @author Work
 */
@Component
public interface TaskSubmissionRepository extends JpaRepository<TaskSubmission, Long> {

}
