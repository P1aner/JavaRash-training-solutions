package com.javarush.task.task13.task1327;

public class Person implements RepkaItem {
    private String name;
    private String namePadezh;

    public Person(String name, String namePadezh) {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamePadezh() {
        return namePadezh;
    }

    public void setNamePadezh(String namePadezh) {
        this.namePadezh = namePadezh;
    }

    public void pull(Person person) {
        System.out.println(person.getName() + " за " + this.namePadezh);
    }
}
/*
Давай напишем программу по мотивам сказки "Репка":
Реализуй интерфейс RepkaItem в классе Person.
В классе Person реализуй метод pull(Person person), который выводит фразу типа '<name> за <person>'.
Пример:
Бабка за Дедку
Дедка за Репку

Исправь логическую ошибку цикла в методе tell класса RepkaStory.
Выполни метод main и наслаждайся сказкой!
 */
/*
Внучка за Бабку
Бабка за Дедку
Дедка за Репку

Process finished with exit code 0
 */