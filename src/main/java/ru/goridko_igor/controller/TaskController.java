package ru.goridko_igor.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.goridko_igor.dto.TaskRequestDto;
import ru.goridko_igor.dto.TaskResponseDto;

import java.util.List;

@Tag(name = "Задачи")
@RestController
@RequestMapping("/task")
public class TaskController {
    @Operation(summary = "Получить список всех задач")
    @GetMapping
    public ResponseEntity<List<TaskResponseDto>> getTasks() {
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Получить список задач по фильтрам")
    @GetMapping("/filter")
    public ResponseEntity<List<TaskResponseDto>> getTasks(
            @RequestParam(value = "projectId", required = false) Long projectId,
            @RequestParam(value = "authorUserId", required = false) Long authorUserId,
            @RequestParam(value = "executorUserId", required = false) Long executorUserId,
            @RequestParam(value = "statusId", required = false) Long statusId,
            @RequestParam(value = "taskTypeId", required = false) Long taskTypeId,
            @RequestParam(value = "releaseVersionId", required = false) Long releaseVersionId,
            @RequestParam(value = "priorityId", required = false) Long priorityId) {
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Получить задачу по id")
    @GetMapping("/{id}")
    public ResponseEntity<TaskResponseDto> getTask(@PathVariable Long id) {
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Создать новую задачу")
    @PostMapping
    public ResponseEntity<Void> createTask(@RequestBody TaskRequestDto taskRequestDto) {
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Удалить задачу по id")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        return ResponseEntity.ok().build();
    }
}
