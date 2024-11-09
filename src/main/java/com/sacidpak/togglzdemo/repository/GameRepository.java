package com.sacidpak.togglzdemo.repository;

import com.sacidpak.togglzdemo.domain.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
