package ro.fasttrackit.curs12.exercise2;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class PersonCategory {

    private final List<Person> persons;

    public PersonCategory(){
        this(new ArrayList<>());
    }

    public PersonCategory(Collection<Person> persons){
         this.persons= persons == null
                ? new ArrayList<>()
                : new ArrayList<>(persons);
    }

     public List<PersonName> getPersonName(){
        List<PersonName> result = new ArrayList<>();

        for (Person person : persons){

                result.add(person.getName());
        }
         return result;
    }

    public Map<PersonName, Integer> mapNameToAge(){
        Map<PersonName, Integer> nameToAge = new HashMap<>();

        for (Person person: persons){
            nameToAge.put(person.getName(),person.getAge());
        }
        return nameToAge;
    }

    public List<PersonName> getPersonsOlderThan(int number){
        List<PersonName> result = new ArrayList<>();

        for (Person person : persons){
            if(person.getAge()>number){
                result.add(person.getName());
            }
        }
        return result;
    }

    public Map<PersonName, List<String>> mapHairColourToName(){
        Map<PersonName, List<String>> result = new HashMap<>();

        for (Person person: persons){
            List<String> hairColours = result.get(person.getHairColour());
            if( hairColours== null) {
                hairColours = new ArrayList<>();
                result.put(person.getName(), hairColours);
            }
            hairColours.add(person);
        }
        return result;
    }
}
