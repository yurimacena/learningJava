package List.src.Ordination;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonOrdination {
    private final List<Person> personList;

    public PersonOrdination() {
        this.personList = new ArrayList<>();
    }

    public void addPerson(String name, int age, double height){
        personList.add(new Person(name, age, height));
    }
    
    public List<Person> ordinatePerAge() {
        List<Person> personsPerAge = new ArrayList<>(personList);
        Collections.sort(personsPerAge);
        return personsPerAge;
    }

    public List<Person> ordinatePerHeight() {
        List<Person> personsPerHeight = new ArrayList<>(personList);
        Collections.sort(personsPerHeight, new ComparatorPerHeight());
        return personsPerHeight;
    }

    public static void main(String[] args) {
        PersonOrdination personOrdination = new PersonOrdination();
        personOrdination.addPerson("Name 1", 20, 1.56);
        personOrdination.addPerson("Name 2", 30, 1.70);
        personOrdination.addPerson("Name 3", 18, 1.80);
        personOrdination.addPerson("Name 4", 17, 1.90);
        
        System.out.println(personOrdination.personList);
        System.out.println("");
        System.out.println(personOrdination.ordinatePerAge());
        System.out.println(personOrdination.ordinatePerHeight());

    }
}