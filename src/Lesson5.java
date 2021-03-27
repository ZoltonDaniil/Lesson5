/*
1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
2. Конструктор класса должен заполнять эти поля при создании объекта.
3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
4. Создать массив из 5 сотрудников.
Пример:
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);

5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */


public class Lesson5 {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        for (int i = 0; i < persArray.length; i++) {
            persArray[i] = new Person(("FIO" + i),"Engineer",("fio" + i + "@mailbox.com"),892312312 + i,30000, 38 + i);
        }
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age >= 40) persArray[i].printPerson();
        }
    }

    public static class Person{
        private String fullName, position, email;
        private int phone, salary, age;

        public Person(String fullName, String position, String email, int phone, int salary, int age) {
            this.fullName = fullName;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }
        public void printPerson(){
            System.out.println(fullName + " " + position + " " + email + " " + phone + " " + salary + " " + age);
        }
    }

}
