package ru.goridko_igor.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.goridko_igor.dto.PriorityResponseDto;

import java.util.List;

@Tag(name = "Приоритеты")
@RestController
@RequestMapping("/priority")
public class PriorityController {
    @Operation(summary = "Получить список всех приориетов")
    @GetMapping
    public ResponseEntity<List<PriorityResponseDto>> getPriorities() {
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Получить приоритет по id")
    @GetMapping("/{id}")
    public ResponseEntity<PriorityResponseDto> getPriority(@PathVariable Long id) {
        return ResponseEntity.ok().build();
    }
}
