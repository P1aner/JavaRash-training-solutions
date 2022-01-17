package com.javarush.task.task08.task0820;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();

        //напишите тут ваш код
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());

        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        Set<Dog> result = new HashSet<>();
        result.add(new Dog());
        result.add(new Dog());
        result.add(new Dog());
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set<Object> pets = new HashSet<>();
        pets.addAll(dogs);
        pets.addAll(cats);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        pets.removeAll(cats);

    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for(Object pet : pets){
            System.out.println(pet);
        }
    }

    //напишите тут ваш код
    public static class Cat{

    }
    public static class Dog{

    }
}







