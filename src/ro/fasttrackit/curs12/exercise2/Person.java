package ro.fasttrackit.curs12.exercise2;

import java.util.Objects;

public class Person {
    private final PersonName name;
    private final int age;
    private final String hairColour;

    public Person(PersonName name, int age, String hairColour){
        this.name= name;
        this.age=age;
        this.hairColour = hairColour;
    }

    public PersonName getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHairColour() {
        return hairColour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(hairColour, person.hairColour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, hairColour);
    }

    @Override
    public String
    toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hairColour='" + hairColour + '\'' +
                '}';
    }
}
