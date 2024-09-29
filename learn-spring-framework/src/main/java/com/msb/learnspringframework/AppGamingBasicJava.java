package com.msb.learnspringframework;

import com.msb.learnspringframework.game.GameRunner;
import com.msb.learnspringframework.game.MarioGame;
import com.msb.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
//        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(superContraGame);
        gameRunner.run();
    }
}
