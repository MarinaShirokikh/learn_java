package lesson4;
/*
1. Создать класс "Сотрудник" с полями: Фамилия, зарплата, возраст, должность;
2. Конструктор класса должен заполнять эти поля при создании объекта;
3. Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
4. Вывести при помощи методов из пункта 3 ФИО и должность.
5. Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
6. * Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
7. * Подсчитать средние арифметические зарплаты и возраста сотрудников из п.5
8. *** Продумать конструктор таким образом, чтобы при создании каждому сотруднику присваивался личный уникальный идентификационный порядковый номер
* */


public class Emp {
    private String surname;
    private String title;
    private int salary;
    private int birthDate;
    private static final int CURRENT_YEAR = 2020;


    //публичный конструктор для вызова из вне
    public Emp(String surname, String title, int salary, int birthDate) {
        this.surname = surname;
        this.title = title;
        this.salary = salary;
        this.birthDate = birthDate;

    }

    //методы возврата значений полей
    public String getSurname() {
        return surname;
    }

    public String getTitle() {
        return title;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return CURRENT_YEAR - birthDate;
    }

}
