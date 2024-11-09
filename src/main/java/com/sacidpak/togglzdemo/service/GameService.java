package com.sacidpak.togglzdemo.service;

import com.sacidpak.togglzdemo.dto.GameDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.sacidpak.togglzdemo.enums.PlaygroundFeature.DISCOUNT;
import static com.sacidpak.togglzdemo.enums.PlaygroundFeature.NEW_GAME_RELEASE;

@Service
@RequiredArgsConstructor
public class GameService {

    public List<GameDto> getGames() {
        var games = new ArrayList<GameDto>();

        games.add(getGame("puzzle"));
        games.add(getGame("chess"));

        if (NEW_GAME_RELEASE.isActive()) {
            games.add(getGame("monopoly"));
        }

        return games;
    }

    private GameDto getGame(String name) {
        var price = 55.55;

        if (DISCOUNT.isActive()) {
            price = price - 5.55;
        }

        return GameDto.builder()
                .name(name)
                .price(price)
                .description("Classic description")
                .build();
    }
}
