package ru.goridko_igor.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.goridko_igor.dto.StatusResponseDto;

import java.util.List;

@Tag(name = "Статусы")
@RestController
@RequestMapping("/status")
public class StatusController {
    @Operation(summary = "Получить список всех статусов")
    @GetMapping
    public ResponseEntity<List<StatusResponseDto>> getStatuses() {
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Получить статус по id")
    @GetMapping("/{id}")
    public ResponseEntity<StatusResponseDto> getStatus(@PathVariable Long id) {
        return ResponseEntity.ok().build();
    }
}
