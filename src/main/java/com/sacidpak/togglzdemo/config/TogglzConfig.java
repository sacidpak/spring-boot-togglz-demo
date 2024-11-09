package com.sacidpak.togglzdemo.config;

import com.sacidpak.togglzdemo.enums.PlaygroundFeature;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.togglz.core.manager.FeatureManager;
import org.togglz.core.manager.FeatureManagerBuilder;
import org.togglz.core.user.NoOpUserProvider;
import org.togglz.core.repository.jdbc.JDBCStateRepository;

import javax.sql.DataSource;

@Configuration
@RequiredArgsConstructor
public class TogglzConfig {

    private final DataSource dataSource;

    @Bean
    public FeatureManager featureManager() {
        return new FeatureManagerBuilder()
                .featureEnum(PlaygroundFeature.class)
                .stateRepository(new JDBCStateRepository(dataSource))
                .userProvider(new NoOpUserProvider())
                .build();
    }

}
