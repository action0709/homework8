public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        int salary = 0;
        int month = 1;
        int deposit = 15_000;
        while (salary < 2_459_000) {
            salary = salary + deposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + salary + " рублей");
            month = month + 1;
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i + " ");

        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
        System.out.println();
        int population = 12_000_000;
        float birthrate = 17 / 1000F;
        float mortality = 8 / 1000F;
        int years = 1;
        while (years <= 10) {
            population = (int) (population + population * birthrate - population * mortality);
            System.out.println("Год " + years + " численность населения составляет " + population);
            years = years + 1;
        }


    }

    public static void task4() {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
        float deposit = 15000F;
        for (int i = 1; deposit < 12_000_000; i++) {
            deposit = deposit + deposit * 0.07F;
            System.out.println(i + " месяц-сумма накоплений равна " + deposit + " рублей");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        // Пишем код для задачи 5
        float deposit = 15000F;
        for (int i = 1; deposit < 12_000_000; i++) {
            deposit = deposit + deposit * 0.07F;
            if (i % 6 == 0) {
                System.out.println(i + " месяц-сумма накоплений равна " + deposit + " рублей");
            }
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        // Пишем код для задачи 6
        float deposit = 15000F;
        for (int i = 1; i<=(9*12); i++) {
            deposit = deposit + deposit * 0.07F;
            if (i % 6 == 0) {
                System.out.println(i + " месяц-сумма накоплений равна " + deposit + " рублей");
            }
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        // Пишем код для задачи 7
       int friday = 3;
       for (int i=1;i<=31;i++){
           if (i==friday){
               System.out.println("Сегодня пятница, "+i+"-е число. Необходимо подготовить отчет.");
                      friday=friday+7;}
       }
    }
    public static void task8() {
        System.out.println("Задача 8");
        // Пишем код для задачи 8

        int futureYear = 2123;
        int lastYear = 1823;
        for (int i=1;i<2123;i++)
            if(i%79==0&&i<futureYear&&i>lastYear){
                System.out.println(i);
            }


    }
}