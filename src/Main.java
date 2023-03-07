public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1 () {
        System.out.println("Задача 1");
    // Пишем код для задачи 1
        int salary = 0;
        int month =1;
        int deposit = 15_000;
        while (salary<2_459_000){
            salary=salary+deposit;
            System.out.println("Месяц "+month+", сумма накоплений равна "+salary+" рублей");
            month=month+1;
        }
    }

  public static void task2 () {
    System.out.println("Задача 2");
      // Пишем код для задачи 2
      int i=0;
      while (i<10) {
          i=i+1;
          System.out.print(i+" ");
               }
      System.out.println();
      for (;i>=1;i--) {
          System.out.print(i+" ");

      }
  }
    public static void task3 () {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
        System.out.println();
        float population = 12_000_000L;
        float birthrate =17/1000F;
        float mortality = 8/1000F;
        int years = 1;
while (years<=10){
    population= population+population*birthrate-population*mortality;
    System.out.println("Год "+years+" численность населения составляет "+population);
    years=years+1;
}


    }
}