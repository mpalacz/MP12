package Zad1;

public class Animal {
}

class Dog extends Animal implements Run,Speak{
    @Override
    public void run() {
        System.out.println("Dog runs");
    }

    @Override
    public void speak() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal implements Run,Speak{
    @Override
    public void run() {
        System.out.println("Cat runs");
    }

    @Override
    public void speak() {
        System.out.println("Cat meows");
    }
}

class Shark extends Animal{ }

interface Run{
    void run();
}

interface Speak{
    void speak();
}

class HomeAnimal<A extends Animal> {
    A object;

    HomeAnimal(A animal) {
        this.object = animal;
    }

    A getObject() {
        return object;
    }

    void showType(){
        System.out.println("Type A is "+ object.getClass().getName());
    }

    public void sleepOnTheCouch() {
        System.out.println("Home animal sleeps on the couch.");
    }
}

class Main{
    public static void main(String[] args) {
        HomeAnimal<Animal> catHomeAnimal = new HomeAnimal<>(new Cat());

        System.out.println(catHomeAnimal.getObject());
        catHomeAnimal.showType();
        catHomeAnimal.sleepOnTheCouch();
        System.out.println();

        HomeAnimal<Animal> dogHomeAnimal = new HomeAnimal<>(new Dog());
        System.out.println(dogHomeAnimal.getObject());
        dogHomeAnimal.showType();
        dogHomeAnimal.sleepOnTheCouch();
        System.out.println();

        HomeAnimal<Animal> sharkHomeAnimal = new HomeAnimal<>(new Shark());

    }
}