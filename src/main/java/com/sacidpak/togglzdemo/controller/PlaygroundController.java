package com.sacidpak.togglzdemo.controller;

import com.sacidpak.togglzdemo.dto.GameDto;
import com.sacidpak.togglzdemo.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/playground")
public class PlaygroundController {

    private final GameService gameService;

    @GetMapping
    @RequestMapping("/games")
    public List<GameDto> getGames(){
        return gameService.getGames();
    }
}
