package com.example.jr.hausmatesapp;

/**
 * Created by thomas on 02/10/16.
 */
public class PoolType
{

    private int periodLength;
    private boolean isRecurring;
    private boolean winnerTakeAll;


    public PoolType(int length, boolean recurrance, boolean notSplitPot)
    {
        periodLength = length;
        isRecurring = recurrance;
        winnerTakeAll = notSplitPot;
    }

    public int getPeriodLength() {
        return periodLength;
    }

    public boolean isRecurring() {
        return isRecurring;
    }

    public void setPeriodLength(int periodLength) {
        this.periodLength = periodLength;
    }

    public void setRecurring(boolean recurring) {
        isRecurring = recurring;
    }

    public boolean isWinnerTakeAll() {
        return winnerTakeAll;
    }

    public void setWinnerTakeAll(boolean winnerTakeAll) {
        this.winnerTakeAll = winnerTakeAll;
    }

}
