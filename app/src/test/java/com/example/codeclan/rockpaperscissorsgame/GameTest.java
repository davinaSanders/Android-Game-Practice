package com.example.codeclan.rockpaperscissorsgame;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by davinasanders on 29/05/2018.
 */

public class GameTest {
    Game game;

    @Before
    public void before(){
        game = new Game();
    }

    @Test
    public void hasArrayCount(){
        assertEquals(3, game.getResults().size());
    }

    @Test
    public void canRandom(){
        assertEquals("rock", game.randomResult());
    }

    @Test
    public void canGameResult(){
        assertEquals("You have won", game.oldGameResult("rock"));
    }

}
