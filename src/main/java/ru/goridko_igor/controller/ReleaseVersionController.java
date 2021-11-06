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
import ru.goridko_igor.dto.ReleaseVersionRequestDto;
import ru.goridko_igor.dto.ReleaseVersionResponseDto;

import java.util.List;

@Tag(name = "Версии релиза")
@RestController
@RequestMapping("/release-version")
public class ReleaseVersionController {
    @Operation(summary = "Получить список всех версий релиза")
    @GetMapping
    public ResponseEntity<List<ReleaseVersionResponseDto>> getReleaseVersions() {
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Получить версию релиза по id")
    @GetMapping("/{id}")
    public ResponseEntity<ReleaseVersionResponseDto> getReleaseVersion(@PathVariable Long id) {
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Создать новую версию релиза")
    @PostMapping
    public ResponseEntity<Void> createReleaseVersion(@RequestBody ReleaseVersionRequestDto releaseVersionRequestDto) {
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Обновить версию релиза")
    @PutMapping
    public ResponseEntity<Void> updateReleaseVersion(@RequestBody ReleaseVersionRequestDto releaseVersionRequestDto) {
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Удалить версию релиза по id")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReleaseVersion(@PathVariable Long id) {
        return ResponseEntity.ok().build();
    }
}
