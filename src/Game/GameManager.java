package Game;

import GameEngine.AbstractGame;
import GameEngine.GameContainer;
import GameEngine.Renderer;

import java.awt.event.KeyEvent;

public class GameManager extends AbstractGame {

    public GameManager(){

    }

    @Override
    public void update(GameContainer gc, float dl) {

    }

    @Override
    public void render(GameContainer gc, Renderer r) {

    }

    public static void main(String args[]){
        GameContainer gc = new GameContainer(new GameManager());
        gc.start();
    }
}
