package com.msb.learnspringframework;

import com.msb.learnspringframework.game.GameRunner;
import com.msb.learnspringframework.game.GamingConsole;
import com.msb.learnspringframework.game.PacManGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game() {
        return new PacManGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }
}
