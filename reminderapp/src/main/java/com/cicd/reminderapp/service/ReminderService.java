package com.cicd.reminderapp.service;

import com.cicd.reminderapp.model.Reminder;
import com.cicd.reminderapp.persistence.ReminderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ReminderService {
    private ReminderRepository reminderRepository;

    public List<Reminder> findAll(){
        return (List<Reminder>) reminderRepository.findAll();
    }

    public UUID save(Reminder reminder){
        return reminderRepository.save(reminder).getId();
    }
}
