package com.msb.learnspringframework.game;

public class GameRunner {
    //    private final MarioGame game;
    private final SuperContraGame game;

    public GameRunner(SuperContraGame marioGame) {
        this.game = marioGame;
    }

    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
