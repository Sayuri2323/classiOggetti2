package it.develhope.es2;

public class Programmer {

    public String name;
    public String programmingLanguage;
    public int yearsOfExperience;
    public String teamName;


    public String printDetails() {
        return name + ", " + programmingLanguage;}

    public String printTeamDetails() {
        return "Il nome è: " + name + ", il linguaggio conosciuto è: " + programmingLanguage;

    }
}
