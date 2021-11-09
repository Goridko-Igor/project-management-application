package ru.goridko_igor.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.goridko_igor.dto.RoleResponseDto;

import java.util.List;

@Tag(name = "Роли")
@RestController
@RequestMapping("/role")
public class RoleController {
    @Operation(summary = "Получить список всех ролей")
    @GetMapping
    public ResponseEntity<List<RoleResponseDto>> getRoles() {
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Получить роль по id")
    @GetMapping("/{id}")
    public ResponseEntity<RoleResponseDto> getRole(@PathVariable Long id) {
        return ResponseEntity.ok().build();
    }
}
