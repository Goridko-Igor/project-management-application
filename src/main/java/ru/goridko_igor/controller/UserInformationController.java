package ru.goridko_igor.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.goridko_igor.dto.UserInformationResponseDto;

@Tag(name = "Информация о пользователях")
@RestController
@RequestMapping("/user-information")
public class UserInformationController {
    @Operation(summary = "Получить информацию о пользователе по userId")
    @GetMapping("/{userId}")
    public ResponseEntity<UserInformationResponseDto> getUserInformation(@PathVariable Long userId) {
        return ResponseEntity.ok().build();
    }
}
