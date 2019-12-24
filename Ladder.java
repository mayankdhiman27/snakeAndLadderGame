package com.company.pojo;

public class Ladder {

    private int lowerPoint;

    private int upperPoint;

    public Ladder(int lowerPoint, int upperPoint) {
        this.lowerPoint = lowerPoint;
        this.upperPoint = upperPoint;
    }

    public int getLowerPoint() {
        return lowerPoint;
    }

    public void setLowerPoint(int lowerPoint) {
        this.lowerPoint = lowerPoint;
    }

    public int getUpperPoint() {
        return upperPoint;
    }

    public void setUpperPoint(int upperPoint) {
        this.upperPoint = upperPoint;
    }

    @Override
    public String toString() {
        return "Ladder{" +
                "lowerPoint=" + lowerPoint +
                ", upperPoint=" + upperPoint +
                '}';
    }
}
