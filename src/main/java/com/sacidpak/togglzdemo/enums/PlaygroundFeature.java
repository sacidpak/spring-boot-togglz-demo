package com.sacidpak.togglzdemo.enums;

import org.togglz.core.Feature;
import org.togglz.core.annotation.EnabledByDefault;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;

public enum PlaygroundFeature implements Feature {

    @Label("Game discount")
    DISCOUNT,

    @EnabledByDefault
    @Label("New game release")
    NEW_GAME_RELEASE;

    public boolean isActive() {
        return FeatureContext.getFeatureManager().isActive(this);
    }
}
