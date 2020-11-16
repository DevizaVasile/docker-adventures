/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.web.service.TaskSubmissionService;
import com.test.web.model.TaskSubmission;
import java.util.ArrayList;

import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

/**
 *
 * @author Work
 */
@Controller
public class MainController {
    
    @Autowired
    TaskSubmissionService taskSubmissionService;
    
    @GetMapping(value = "/**")
    public RedirectView redirect(RedirectAttributes attributes) {
        return new RedirectView("/task");
    }
    
    @GetMapping(value = "/task")
     public ModelAndView greetingSubmit(@RequestParam(required = false) String view){
        var mav = new ModelAndView();
        mav.setViewName("tasks");
        List<TaskSubmission> taskSubmissions = new ArrayList();
        if(view != null && view.equals("on")){
            taskSubmissions = taskSubmissionService.getAllTaskSubmissions();
        }
        mav.addObject("taskSubmissions", taskSubmissions);
        return mav;
     }
     
     @PostMapping(value = "task")
     public RedirectView taskSubmit(String email, String task, @RequestParam(required = false) String view, RedirectAttributes redirectAttributes){
        taskSubmissionService.addTask(task, email);
        RedirectView redirect;
        if(view != null && view.equals("on")){
            redirect = new RedirectView("/task?view=on");
            redirect.setExposeModelAttributes(true);
        }
        else{
            redirect = new RedirectView("/task?view=on");
        }
        return redirect;
     }
}
