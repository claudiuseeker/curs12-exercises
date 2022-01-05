package ro.fasttrackit.curs12.exercise2;

import java.util.List;

import static ro.fasttrackit.curs12.exercise2.PersonName.*;

public class MainPerson {
    public static void main(String[] args) {

        PersonCategory personCategory = new PersonCategory(List.of(
               new Person(ANDREEA,27,"brown"),
               new Person(BOGDAN,24,"blonde"),
               new Person(CRISTI,34,"red"),
               new Person(MIHAI,51,"gray"),
               new Person(IULIU,41,"gray")
        ));

        System.out.println(personCategory.getPersonName());
        System.out.println(personCategory.mapNameToAge());
        System.out.println(personCategory.getPersonsOlderThan(30));
        System.out.println(personCategory.mapHairColourToName());

    }
}
