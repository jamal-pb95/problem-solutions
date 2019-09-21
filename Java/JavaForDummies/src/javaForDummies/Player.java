package javaForDummies;

import java.text.DecimalFormat;

public class Player {
    private String name;
    private double avgScore;

    public Player(String name, double avgScore) {
        this.name = name;
        this.avgScore = avgScore;
    }

    public String getName() {
        return name;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public String getAvgScoreString() {
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumIntegerDigits(0);
        decimalFormat.setMaximumFractionDigits(3);
        decimalFormat.setMinimumFractionDigits(3);
        decimalFormat.setNegativePrefix("(");
        decimalFormat.setNegativeSuffix(")");
        return decimalFormat.format(avgScore);
    }
}
