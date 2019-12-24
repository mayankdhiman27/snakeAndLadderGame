package com.company;

import com.company.pojo.Ladder;
import com.company.pojo.Player;
import com.company.pojo.Snake;
import com.company.services.GameService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Snake> snakes = new ArrayList<>();

        snakes.add(new Snake(10, 6));
        snakes.add(new Snake(15, 10));
        snakes.add(new Snake(22, 8));
        snakes.add(new Snake(34, 26));
        snakes.add(new Snake(50, 20));
        snakes.add(new Snake(65, 11));
        snakes.add(new Snake(75, 25));
        snakes.add(new Snake(88, 43));
        snakes.add(new Snake(93, 54));
        snakes.add(new Snake(98, 60));

        List<Ladder> ladders = new ArrayList<>();

        ladders.add(new Ladder(7, 12));
        ladders.add(new Ladder(16, 36));
        ladders.add(new Ladder(32, 40));
        ladders.add(new Ladder(45, 90));

        List<Player> players = new ArrayList<>();
        players.add(new Player(123));
        players.add(new Player(234));
        players.add(new Player(345));

        GameService gameService = new GameService();
        gameService.setLadders(ladders);
        gameService.setSnakes(snakes);
        gameService.setPlayersInitPosition(players);

        gameService.startGame();

    }
}
