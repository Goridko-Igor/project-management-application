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
import org.springframework.web.bind.annotation.RestController;
import ru.goridko_igor.dto.ProjectParticipantRequestDto;
import ru.goridko_igor.dto.ProjectParticipantResponseDto;

import java.util.List;

@Tag(name = "Участники проектов")
@RestController
@RequestMapping("/project-participant")
public class ProjectParticipantController {
    @Operation(summary = "Получить список всех участников проектов")
    @GetMapping
    public ResponseEntity<List<ProjectParticipantResponseDto>> getProjectParticipants() {
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Получить список участников проектов, которые участвуют в конкретном проекте")
    @GetMapping("/project/{projectId}")
    public ResponseEntity<List<ProjectParticipantResponseDto>> getProjectParticipantsByProjectId(
            @PathVariable Long projectId) {
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Получить список участников проектов, в которых участвует конкретный пользователь")
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<ProjectParticipantResponseDto>> getProjectParticipantsByUserId(
            @PathVariable Long userId) {
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Получить конкретного участника конкретного проекта")
    @GetMapping("/project/{projectId}/user/{userId}")
    public ResponseEntity<ProjectParticipantResponseDto> getProjectParticipant(
            @PathVariable Long projectId,
            @PathVariable Long userId) {
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Создать нового участника проекта")
    @PostMapping
    public ResponseEntity<Void> createProjectParticipant(
            @RequestBody ProjectParticipantRequestDto projectParticipantRequestDto) {
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Удалить конкретного участника конкретного проекта")
    @DeleteMapping("/project/{projectId}/user/{userId}")
    public ResponseEntity<Void> deleteProjectParticipant(
            @PathVariable Long projectId,
            @PathVariable Long userId) {
        return ResponseEntity.ok().build();
    }
}
