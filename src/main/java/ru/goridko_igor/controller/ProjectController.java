package ru.goridko_igor.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.goridko_igor.dto.ProjectRequestDto;
import ru.goridko_igor.dto.ProjectResponseDto;

import java.util.List;

@Tag(name = "Проекты")
@RestController
@RequestMapping("/project")
public class ProjectController {
    @Operation(summary = "Получить список всех проектов")
    @GetMapping
    public ResponseEntity<List<ProjectResponseDto>> getProjects() {
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Получить проект по id")
    @GetMapping("/{id}")
    public ResponseEntity<ProjectResponseDto> getProject(@PathVariable Long id) {
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Создать новый проект")
    @PostMapping
    public ResponseEntity<Void> createProject(@RequestBody ProjectRequestDto projectRequestDto) {
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Обновить проект")
    @PutMapping
    public ResponseEntity<Void> updateProject(@RequestBody ProjectRequestDto projectRequestDto) {
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Удалить проект по id")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProject(@PathVariable Long id) {
        return ResponseEntity.ok().build();
    }
}
