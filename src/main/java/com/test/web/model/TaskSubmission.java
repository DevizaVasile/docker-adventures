/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.web.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Work
 */
@Entity
@javax.persistence.Table(name="tasks")
public class TaskSubmission implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @javax.persistence.Id
    private Long id;

    private String task;
    
    private String email;
    
    
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private Date createdAt;


     public Long getId() {
        return id;
    }
     
    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
    
    public String getTimpeStamp(){
        return createdAt.toString();
    }
    
}

