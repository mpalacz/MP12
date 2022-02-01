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
class Shark extends Animal{

}
interface Run{
    void run();
}
interface Speak{
    void speak();
}
class HomeAnimal<A extends Animal> {
    A animal;

    public HomeAnimal(A animal) {
        this.animal = animal;
    }


    public void sleepOnTheCouch(){
        System.out.println("Home animal sleeps on the couch.");
    }
}