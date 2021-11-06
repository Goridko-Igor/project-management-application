package ru.goridko_igor.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.goridko_igor.dto.PasswordRequestDto;

@Tag(name = "Пароли")
@RestController
@RequestMapping("/password")
public class PasswordController {
    @Operation(summary = "Обновить пароль")
    @PutMapping
    public ResponseEntity<Void> updatePassword(@RequestBody PasswordRequestDto passwordRequestDto) {
        return ResponseEntity.ok().build();
    }
}
