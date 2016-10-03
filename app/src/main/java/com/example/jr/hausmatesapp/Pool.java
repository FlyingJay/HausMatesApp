package com.example.jr.hausmatesapp;

/**
 * Created by thomas on 21/09/16.
 */
public class Pool
{
    boolean requiresConfirm = new boolean
    String name = new String;
    int[] people = new int[];
    int[] scores = new int[];
    double[] pledges = new double[];
    double minPledge = new double;
    int poolId = new int;
    PoolType poolType;

    void addPersonById(int id)
    {
        private int counter = new int;
        private int counter2 = new int;

        for(int j = 0; j < this.people.length; j++)
        {
            if(id == this.people[j])
            {
                counter++;
            }
        }

        if(counter == 0)
        {
            int[] people2 = new int[people.length + 1];
            int[] scores2 = new int[scores.length + 1];
            double[] pledges2 = new double[pledges.length + 1];
            people2[0] = id;
            scores2[0] = 0;
            pledges2[0] = minPledge;

            for(int k = 1; k <= people2.length; k++)
            {
                people2[k] = people[k-1];
                scores2[k] = scores[k-1];
                pledges2[k] = pledges[k-1];
            }

            people = people2;
            scores = scores2;
            pledges = pledges2;

            for(int i = 0; i < Application.localContacts.length; i++)
            {
                if (id == Application.localContacts[i].getUserID())
                {
                    counter2++;
                }
            }

            if(counter2 == 0)
            {
                //TODO: Create function that gets user information from database using their ID and adds them to your local contacts
            }
        }
    }

    void incrementScore(int user)
    {
        for(int i = 0; i < this.people.length; i++)
        {
            if(this.people[i] == user)
            {
                this.scores[i]++;
            }
        }
    }

    void pledgeMoney(int user, double amount)
    {
        for(int i = 0; i < this.people.length; i++)
        {
            if(this.people[i] == user)
            {
                this.pledges[i] += amount;
            }
        }
    }

    void payWinnings()
    {
        int sum;
        int winningScore = new int;
        int[] winner = new int[];

        if(poolType.isWinnerTakeAll())
        {
            int counter = new int;
            for (int i = 0; i < this.people.length; i++)
            {
                sum += (pledges[i]*100);
                if (scores[i] > winningScore)
                {
                    scores[i]= winningScore;
                }
            }

            for(int j = 0; j < this.scores.length; j++)
            {
                if(scores[j] == winningScore)
                {
                    counter++;
                }
            }

            winner.length = counter;

            for (int k = 0; k < this.people.length; k++)
            {
                if(scores[k] == winningScore)
                {
                    for (int a = 0; a < winner.length; a++)
                    {
                        winner[a] = this.people[k];
                    }
                }
            }
            int[] winnerBalance = new int[winner.length];


            for(int b = sum; b > winner.length; b -= winner.length)
            {
                for(int c = 0; c < winner.length; c++)
                {
                    winnerBalance[c]++;
                }
            }

            //TODO create function in userclass to call
        }
    }

    void sendConfirmJobNotify()
    {

    }

    void changeInfo(String[] name, boolean confirm, double minPledge)
    {

    }

    void leavePool()
    {

    }

    
}
