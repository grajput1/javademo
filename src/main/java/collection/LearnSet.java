package collection;

import java.util.*;

class Animal implements Comparable<Animal>
{
    private String name;
    private int weight;

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return getWeight() == animal.getWeight() &&
                Objects.equals(getName(), animal.getName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getWeight());
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Animal o) {
        if(this.getWeight() > o.getWeight())
            return -1;
        else
            return 1;
    }
}
public class LearnSet {
    public static void main(String [] args){
        List<Integer> values = new ArrayList<Integer>();

        values.add(34);
        values.add(12);
        values.add(45);
        values.add(98);
        values.add(34);

        Collections.sort(values);

        for(Integer val : values)
            System.out.println(val);

        HashSet<Animal> animalSet = new HashSet<Animal>();

        Animal animal1 = new Animal("Cat", 7);
        Animal animal2 = new Animal("Dog", 15);
        Animal animal3 = new Animal("Lion", 200);
        Animal animal4 = new Animal("Cow", 300);
        Animal animal5 = new Animal("Dog", 15);
        Animal animal6 = new Animal("Goat", 30);



        animalSet.add(animal1);
        animalSet.add(animal2);
        animalSet.add(animal3);
        animalSet.add(animal4);
        animalSet.add(animal5);
        animalSet.add(animal6);

        ArrayList<Animal> animalList = new ArrayList<Animal>(animalSet);


        for(Animal val : animalList)
            System.out.println(val);

        Collections.sort(animalList);
        for(Animal val : animalList)
            System.out.println(val);

    }
}
