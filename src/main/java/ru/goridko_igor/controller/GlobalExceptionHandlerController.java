package ru.goridko_igor.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ru.goridko_igor.exception.PriorityNotFoundException;
import ru.goridko_igor.exception.ProjectNotFoundException;
import ru.goridko_igor.exception.ProjectParticipantNotFoundException;
import ru.goridko_igor.exception.ReleaseVersionNotFoundException;
import ru.goridko_igor.exception.RoleNotFoundException;
import ru.goridko_igor.exception.StatusNotFoundException;
import ru.goridko_igor.exception.TaskNotFoundException;
import ru.goridko_igor.exception.TaskTypeNotFoundException;
import ru.goridko_igor.exception.UserNotFoundException;

@Tag(name = "Обработчики ошибок")
@ControllerAdvice
public class GlobalExceptionHandlerController {
    @Operation(summary = "Обработать PriorityNotFoundException")
    @ExceptionHandler(PriorityNotFoundException.class)
    public void handlePriorityNotFoundException(PriorityNotFoundException e) {

    }

    @Operation(summary = "Обработать ProjectNotFoundException")
    @ExceptionHandler(ProjectNotFoundException.class)
    public void handleProjectNotFoundException(ProjectNotFoundException e) {

    }

    @Operation(summary = "Обработать ProjectParticipantNotFoundException")
    @ExceptionHandler(ProjectParticipantNotFoundException.class)
    public void handleProjectParticipantNotFoundException(ProjectParticipantNotFoundException e) {

    }

    @Operation(summary = "Обработать ReleaseVersionNotFoundException")
    @ExceptionHandler(ReleaseVersionNotFoundException.class)
    public void handleReleaseVersionNotFoundException(ReleaseVersionNotFoundException e) {

    }

    @Operation(summary = "Обработать RoleNotFoundException")
    @ExceptionHandler(RoleNotFoundException.class)
    public void handleRoleNotFoundException(RoleNotFoundException e) {

    }

    @Operation(summary = "Обработать StatusNotFoundException")
    @ExceptionHandler(StatusNotFoundException.class)
    public void handleStatusNotFoundException(StatusNotFoundException e) {

    }

    @Operation(summary = "Обработать TaskNotFoundException")
    @ExceptionHandler(TaskNotFoundException.class)
    public void handleTaskNotFoundException(TaskNotFoundException e) {

    }

    @Operation(summary = "Обработать TaskTypeNotFoundException")
    @ExceptionHandler(TaskTypeNotFoundException.class)
    public void handleTaskTypeNotFoundException(TaskTypeNotFoundException e) {

    }

    @Operation(summary = "Обработать UserNotFoundException")
    @ExceptionHandler(UserNotFoundException.class)
    public void handleUserNotFoundException(UserNotFoundException e) {

    }
}
