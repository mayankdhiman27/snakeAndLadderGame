package com.company.pojo;

public class Snake {

    private int startingPoint;

    private int endPoint;

    public Snake(int startingPoint, int endPoint) {
        this.startingPoint = startingPoint;
        this.endPoint = endPoint;
    }

    public int getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(int startingPoint) {
        this.startingPoint = startingPoint;
    }

    public int getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(int endPoint) {
        this.endPoint = endPoint;
    }

}
