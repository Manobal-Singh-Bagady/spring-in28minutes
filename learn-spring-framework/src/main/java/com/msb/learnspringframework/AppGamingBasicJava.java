package com.msb.learnspringframework;

import com.msb.learnspringframework.game.GameRunner;
import com.msb.learnspringframework.game.MarioGame;
import com.msb.learnspringframework.game.PacManGame;
import com.msb.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
//        var game = new MarioGame();
//        var game = new SuperContraGame();
        var game = new PacManGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
