package ru.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMyGame {
    @Test
    public void test_Count_Bulls_n2() {
        String gameWord = "abaka";
        String gamePlayer = "aaaaa";
        int countGame = Game.countBulls(gameWord, gamePlayer);
        int countTrue = 3;
        assertEquals(countGame, countTrue);
    }

    @Test
    public void test_Count_Bulls_n0() {
        String gameWord = "abaka";
        String gamePlayer = "zzzzz";
        int countGame = Game.countBulls(gameWord, gamePlayer);
        int countTrue = 0;
        assertEquals(countGame, countTrue);
    }

    @Test
    public void test_Count_Cows_n0() {
        String gameWord = "abaka";
        String gamePlayer = "aaaaa";
        int countGame = Game.countCows(gameWord, gamePlayer);
        int countTrue = 0;
        assertEquals(countGame, countTrue);
    }

    @Test
    public void test_Count_Cows_n5() {
        String gameWord = "vlrte";
        String gamePlayer = "lvert";
        int countGame = Game.countCows(gameWord, gamePlayer);
        int countTrue = 5;
        assertEquals(countGame, countTrue);
    }
}
