package it.develhope.es2;

public class CompetitionRules {

    public static CompetitionRules lista=new CompetitionRules();


    private CompetitionRules(){}

    private String competitionRule1="non copiare e incollare da StackOverflow";
    private String competitionRule2="imparate ogni giorno!";
    private String competitionRule3="siate i migliori!";

    public static CompetitionRules getInstance(){
        return lista;

    }
    public String printTeamDetails(){
        return competitionRule1+" "+competitionRule2+" "+competitionRule3;

    }


}


