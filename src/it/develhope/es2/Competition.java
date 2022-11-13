package it.develhope.es2;

import java.util.concurrent.Callable;

public class Competition {
    public static void main(String[] args) {
        CompetitionRules print = CompetitionRules.getInstance();

        System.out.println(print.printTeamDetails());

    }

    }
