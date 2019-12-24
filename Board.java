package com.company.pojo;
import java.util.Map;

public class Board {

    // size of board
    private int numberOfCells;

    // to store first position of snake as key and last position as value
    private Map<Integer, Integer> snakePositions;

    // to store first position of ladder as key and last as value
    private Map<Integer, Integer> ladderPositions;

    private Map<Integer, Integer> playerPosition;

    public Board(){

    }

    public Board(int numberOfCells) {
        this.numberOfCells = numberOfCells;
    }

    public int getNumberOfCells() {
        return numberOfCells;
    }

    public void setNumberOfCells(int numberOfCells) {
        this.numberOfCells = numberOfCells;
    }

    public Map<Integer, Integer> getSnakePositions() {
        return snakePositions;
    }

    public void setSnakePositions(Map<Integer, Integer> snakePositions) {
        this.snakePositions = snakePositions;
    }

    public Map<Integer, Integer> getLadderPositions() {
        return ladderPositions;
    }

    public void setLadderPositions(Map<Integer, Integer> ladderPositions) {
        this.ladderPositions = ladderPositions;
    }

    public Map<Integer, Integer> getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(Map<Integer, Integer> playerPosition) {
        this.playerPosition = playerPosition;
    }
}
