package com.cicd.cicd_project.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/note")
public class NoteController {

    @GetMapping("/hello")
    public String helloMessage(){
        return "<h1> Hello </h1>";
    }
}
