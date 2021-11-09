package ru.goridko_igor.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.goridko_igor.dto.TaskTypeResponseDto;

import java.util.List;

@Tag(name = "Типы задач")
@RestController
@RequestMapping("/task-type")
public class TaskTypeController {
    @Operation(summary = "Получить список всех типов задач")
    @GetMapping
    public ResponseEntity<List<TaskTypeResponseDto>> getTaskTypes() {
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Получить тип задачи по id")
    @GetMapping("/{id}")
    public ResponseEntity<TaskTypeResponseDto> getTaskType(@PathVariable Long id) {
        return ResponseEntity.ok().build();
    }
}
