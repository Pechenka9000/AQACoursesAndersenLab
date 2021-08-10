package school.lesson4.task1_4;

/**
 * Создать классы Собака и Кот с наследованием от класса Животное.
 * Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
 * Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
 * У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
 * Добавить подсчет созданных котов, собак и животных.
 */
public class Main {
    public static void main(String[] args) {
        Cat burger = new Cat("Бургер");
        Cat vovka = new Cat("Вован");
        Dog bobik = new Dog("Бобег");
        Dog simba = new Dog("Симба");
        burger.run(150);
        vovka.run(360);
        bobik.run(350);
        simba.run(599);
        System.out.println("Коты:" + Cat.getCount());
        System.out.println("Собаки:" + Dog.getCount());
        System.out.println("Всего животинок: " + Animal.getCount());
        System.out.println(vovka);
        System.out.println(simba);
    }
}
