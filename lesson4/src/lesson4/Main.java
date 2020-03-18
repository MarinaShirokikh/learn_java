package lesson4;

public class Main {
    public static void main(String[] args) {
       Emp emp1 = new Emp("Ivanov", "Director", 100, 1965);
       System.out.println("Фамилия: " + emp1.getSurname() + ", Должность: " + emp1.getTitle());


        //инициализация массива данных о сотрудниках
        Emp[] arr = new Emp[5];
        arr[0] = new Emp("Ivanov", "Director", 100, 1965); //105
        arr[1] = new Emp("Petrova", "Buh", 80, 1979);
        arr[2] = new Emp("Sidorov", "Manager", 75, 1988);
        arr[3] = new Emp("Pupkin", "Security", 60, 1970); //65
        arr[4] = new Emp("Levin", "Operator", 30, 1995);
        System.out.println("Список сотрудников:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Фамилия: " + arr[i].getSurname() + ", Должность: " + arr[i].getTitle() + ", Зарплата: " + arr[i].getSalary() + ", Возраст:" + arr[i].getAge());
        }
        System.out.println();



        //печать инфо о сотрудниках старше 40 лет
        printInfoAge(arr);

        //п.6 метод увеличения зарплаты на 5000 если возраст больше 45 (условия передаю в метод)
        incSalary(arr, 45, 5);

        //7. * Подсчитать средние арифметические зарплаты и возраста сотрудников из п.5
        AverageEmp(arr);

    }

    private static void AverageEmp(Emp[] arr) {
        int avSalary = arr[0].getSalary();
        int avAge = arr[0].getAge();
        for (int i = 1; i < arr.length; i++) {
            avSalary += arr[i].getSalary();
            avAge += arr[i].getAge();
        }
        avSalary = avSalary / arr.length;
        avAge = avAge / arr.length;
        System.out.println("Количество сотрдуников равно: " + arr.length);
        System.out.println("Среднее арифметическое зарплаты сотруднкиов: " + avSalary);
        System.out.println("Среднее арифметическое возраста сотруднкиов: " + avAge);
    }

    private static void printInfoAge(Emp[] arr) {
        System.out.println("Сотрудники, старше 40 лет:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge() > 40) {
                System.out.println("Фамилия: " + arr[i].getSurname() + ", Должность: " + arr[i].getTitle() + ", Зарплата: " + arr[i].getSalary() + ", Возраст:" + arr[i].getAge());
            }
        }
        System.out.println();
    }

    private static void incSalary(Emp[] arr, int incAge, int incSum) {
        System.out.println("Запрлата увеличина следующим сотрудникам:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge() > incAge) {
                arr[i].setSalary(arr[i].getSalary() + incSum);
                System.out.println("Фамилия: " + arr[i].getSurname() + ", Должность: " + arr[i].getTitle() + ", Зарплата: " + arr[i].getSalary() + ", Возраст:" + arr[i].getAge());
            }
        }
        System.out.println();
    }


}
