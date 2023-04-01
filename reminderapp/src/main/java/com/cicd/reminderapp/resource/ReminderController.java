package com.cicd.reminderapp.resource;

import com.cicd.reminderapp.model.Reminder;
import com.cicd.reminderapp.service.ReminderService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@AllArgsConstructor
public class ReminderController {
    private ReminderService reminderService;

    @GetMapping("/index")
    public String findAll(Model model){
        model.addAttribute("reminders", reminderService.findAll());
        return "index";
    }

    @GetMapping("/reminderapp-0.0.1-SNAPSHOT/add-page")
    public String showSaveReminderPage(Model model) {
        model.addAttribute("reminder", new Reminder());
        return "add-reminder";
    }

    @PostMapping("/saveReminder")
    public String save(Reminder reminder) {
        reminderService.save(reminder);
        return "redirect:/index";
    }
}
