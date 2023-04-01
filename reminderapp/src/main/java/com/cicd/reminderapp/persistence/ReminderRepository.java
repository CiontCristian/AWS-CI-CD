package com.cicd.reminderapp.persistence;

import com.cicd.reminderapp.model.Reminder;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ReminderRepository extends CrudRepository<Reminder, UUID> {
}
