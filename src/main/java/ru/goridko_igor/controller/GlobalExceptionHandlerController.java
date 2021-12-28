package ru.goridko_igor.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ru.goridko_igor.dto.ExceptionHandlerMessage;
import ru.goridko_igor.exception.PriorityNotFoundException;
import ru.goridko_igor.exception.ProjectNotFoundException;
import ru.goridko_igor.exception.ProjectParticipantNotFoundException;
import ru.goridko_igor.exception.ReleaseVersionNotFoundException;
import ru.goridko_igor.exception.RoleNotFoundException;
import ru.goridko_igor.exception.StatusNotFoundException;
import ru.goridko_igor.exception.TaskNotFoundException;
import ru.goridko_igor.exception.TaskTypeNotFoundException;
import ru.goridko_igor.exception.UserNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandlerController {
    @ExceptionHandler(PriorityNotFoundException.class)
    public void handlePriorityNotFoundException(PriorityNotFoundException e) {

    }

    @ExceptionHandler(ProjectNotFoundException.class)
    public void handleProjectNotFoundException(ProjectNotFoundException e) {

    }

    @ExceptionHandler(ProjectParticipantNotFoundException.class)
    public void handleProjectParticipantNotFoundException(ProjectParticipantNotFoundException e) {

    }

    @ExceptionHandler(ReleaseVersionNotFoundException.class)
    public void handleReleaseVersionNotFoundException(ReleaseVersionNotFoundException e) {

    }

    @ExceptionHandler(RoleNotFoundException.class)
    public void handleRoleNotFoundException(RoleNotFoundException e) {

    }

    @ExceptionHandler(StatusNotFoundException.class)
    public void handleStatusNotFoundException(StatusNotFoundException e) {

    }

    @ExceptionHandler(TaskNotFoundException.class)
    public void handleTaskNotFoundException(TaskNotFoundException e) {

    }

    @ExceptionHandler(TaskTypeNotFoundException.class)
    public void handleTaskTypeNotFoundException(TaskTypeNotFoundException e) {

    }

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ExceptionHandlerMessage> handleUserNotFoundException(UserNotFoundException e) {
        return ResponseEntity.badRequest().body(new ExceptionHandlerMessage(e.getMessage()));
    }
}
