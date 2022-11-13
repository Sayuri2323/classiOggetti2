package it.develhope.es2;

public class Main {
    public static void main(String[] args) {

Programmer unknown=new Programmer();
unknown.name="Giuseppe";
unknown.programmingLanguage="Javascript";
unknown.yearsOfExperience=3;

        System.out.println(unknown.printDetails());
        System.out.println(unknown.yearsOfExperience);
        System.out.println("--------------------");

        Programmer programmers=new Programmer();
        programmers.teamName="Geisha";
        System.out.println("Il nome nome del team è: "+programmers.teamName);
        System.out.println("--------------------");

        Programmer p1=new Programmer();
        p1.name="Sayuri";
        p1.programmingLanguage="Java";
        p1.yearsOfExperience=0;

        System.out.println(p1.printTeamDetails());
        System.out.println(p1.yearsOfExperience+" anni di esperienza");
        System.out.println("--------------------");

        Programmer p2= new Programmer();
        p2.name="Hatsumomo";
        p2.programmingLanguage="PHP";
        p2.yearsOfExperience=1;

        System.out.println(p2.printTeamDetails());
        System.out.println(p2.yearsOfExperience+" anno di esperienza");
        System.out.println("--------------------");

            Programmer teamA=new Programmer();
            teamA.name= unknown.name;
            teamA.programmingLanguage= p2.programmingLanguage;
            teamA.yearsOfExperience=6;

            System.out.println(teamA.printTeamDetails());
        System.out.println(teamA.yearsOfExperience+" anni di esperienza");
        System.out.println("-------------------------");

        Programmer teamB=new Programmer();
        teamB.name= p2.name;
        teamB.programmingLanguage= unknown.programmingLanguage;
        teamB.yearsOfExperience=10;
        System.out.println(teamB.printTeamDetails());
        System.out.println(teamB.yearsOfExperience+" anni di esperienza");

}

    }

