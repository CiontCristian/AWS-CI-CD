package com.cicd.reminderapp.resource;

import com.cicd.reminderapp.model.Reminder;
import com.cicd.reminderapp.service.ReminderService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
public class ReminderController {
    private ReminderService reminderService;

    @GetMapping("/index")
    public String findAll(Model model){
        model.addAttribute("reminders", reminderService.findAll());
        return "index";
    }

    @GetMapping("/add-page")
    public String showSaveReminderPage(Reminder reminder) {
        return "add";
    }
}
