package com.company.services;

import com.company.pojo.Board;
import com.company.pojo.Ladder;
import com.company.pojo.Player;
import com.company.pojo.Snake;
import com.company.pojo.constants.GlobalConstants;

import java.util.*;

public class GameService {

    private Board board;

    private int numberOfPlayers;

    // to store the players
    // queue is used to make sure of the chances they get
    private Queue<Player> players;

    public GameService(){
        this.board = new Board(GlobalConstants.boardSize);
        this.players = new LinkedList<Player>();
    }

    public void setPlayersInitPosition(List<Player> players){
        this.players.addAll(players);
        this.numberOfPlayers = players.size();
        Map<Integer, Integer> initPosition = new HashMap<>();

        for(Player player : players){
            initPosition.put(player.getId(), 0);
        }
        board.setPlayerPosition(initPosition);
    }

    public void setSnakes(List<Snake> snakes){
        Map<Integer, Integer> snakesPos = new HashMap<>();

        for(Snake snake : snakes){
            snakesPos.put(snake.getStartingPoint(), snake.getEndPoint());
        }

        board.setSnakePositions(snakesPos);

    }

    public void setLadders(List<Ladder> ladders){
        Map<Integer, Integer> ladderPos = new HashMap<>();

        for(Ladder ladder : ladders){
            ladderPos.put(ladder.getLowerPoint(), ladder.getUpperPoint());
        }

        board.setLadderPositions(ladderPos);
    }

    public int moveToNewPosition(int oldPosition, int diceValue){

        int tempPosition = oldPosition + diceValue;

        if(board.getSnakePositions().containsKey(tempPosition)){
            return board.getSnakePositions().get(tempPosition);
        }
        else if(board.getLadderPositions().containsKey(tempPosition)){
            return board.getLadderPositions().get(tempPosition);
        }

        return tempPosition;

    }


    public void startGame(){

        while(!GlobalConstants.isGameEnd){

            Player player = players.poll();

            System.out.println("Starting Game...");
            int newVal = 0;
            int diceRollValue = 0;
            int cnt = 0;
            boolean flag = false;
            while(true){
                diceRollValue = new DiceRollingService().rollDice();
                newVal += diceRollValue;

                // if a player got 6
                if(diceRollValue == 6 && newVal <= 100){
                    cnt++;
                    System.out.println("Player " + player.getId() + " got" + cnt + " 6...");

                    // if he got continuous 3 6s, he will loose this chance
                    if(cnt == 3){
                        System.out.println("Player " + player.getId() + " looses his chance.. bcz he got " +  cnt  +" 6s");
                        players.add(player);
                        flag = true;
                        break;
                    }
                    if(newVal == 100){
                        System.out.println("Player " + player.getId() + " wins the game with 6");
                        GlobalConstants.isGameEnd = true;
                    }
                }
                else{
                    break;
                }

                if(flag) break;

                if(GlobalConstants.isGameEnd) break;

            }

            if(flag && !GlobalConstants.isGameEnd){
                continue;
            }

            int newPos = moveToNewPosition(board.getPlayerPosition().get(player.getId()), newVal);

            if(newPos > 100){
                players.add(player);
                continue;
            }
            System.out.println("Player " + player.getId() + " moved to " + newPos);

            board.getPlayerPosition().replace(player.getId(), newPos);

            if(newPos == GlobalConstants.boardSize){
                System.out.println("Player " + player.getId() + " wins the game");
                GlobalConstants.isGameEnd = true;
            }

            players.add(player);

        }

    }

}
