import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       //Задача 1
        System.out.println("Задача 1");
        System.out.print("Введите, пожалуйста, сколько полных лет человеку: ");
        //возраст человека
        int age = scanner.nextInt();
        System.out.print("Если возраст человека равен " + age + ", то ");
        if (age >= 18) {
            System.out.println("он совершеннолетний.\n");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать.\n");
        }


        //Задача 2
        System.out.println("Задача 2");
        System.out.print("Введите, пожалуйста, какая температура на улице: ");
        //температура на улице
        int temperatureAir = scanner.nextInt();
        System.out.print("На улице " + temperatureAir + " градусов, ");
        if (temperatureAir < 5) {
            System.out.println(" холодно, нужно надеть шапку.\n");
        } else {
            System.out.println(" тепло, можно идти без шапки.\n");
        }

        //Задача 3
        System.out.println("Задача 3");
        System.out.print("Введите, пожалуйста, с какой скоростью ехал автомобиль: ");
        //скорость автомобиля
        int speedCar = scanner.nextInt();
        System.out.print("Если скорость " + speedCar + " км/ч, то ");
        if (speedCar > 60) {
            System.out.println(" придется заплатить штраф.\n");
        } else {
            System.out.println(" можно ездить спокойно.\n");
        }


        //Задача 4
        System.out.println("Задача 4");
        System.out.print("Введите, пожалуйста, сколько полных лет человеку: ");
        //возраст человека
        int ageHuman = scanner.nextInt();
        System.out.print("Если возраст человека равен " + ageHuman + " то, ему нужно ходить ");
        if (ageHuman<2){
            System.out.println("в ясли.\n");
        }
        else if (2<=ageHuman && ageHuman <= 6) {
            System.out.println("в детский сад.\n");
        } else if (7<=ageHuman && ageHuman <= 17) {
            System.out.println("в школу.\n");
        } else if (18<=ageHuman && ageHuman <= 24) {
            System.out.println("в университет.\n");
        } else   {
            System.out.println("на работу.\n");
        }

        //Задача 5
        System.out.println("Задача 5");
        System.out.print("Введите, пожалуйста, сколько полных лет ребенку: ");
        //возраст ребенка
        int ageChild = scanner.nextInt();
        System.out.print("Если возраст ребенка равен " + ageChild + ", то ему ");
        if (ageChild < 5) {
            System.out.println(" нельзя кататься на аттракционе.\n");
        } else if (5<=ageChild && ageChild <= 14) {
            System.out.println(" можно кататься на аттракционе, но только в сопровождении взрослого.\n");
        } else {
            System.out.println(" можно кататься на аттракционе без сопровождения взрослого.\n");
        }

        //Задача 6
        System.out.println("Задача 6");
        //вместимость вагона
        int capacityCarriage = 120;
        //количество сидячих мест
        int numberSeats = 60;
        System.out.print("Введите, пожалуйста, сколько человек зашли в вагон: ");
        //количество человек в вагоне
        int numberPeople = scanner.nextInt();
        if (numberPeople >= capacityCarriage) {
            System.out.println("Вагон забит полностью.\n");
        } else {
            if (numberPeople < numberSeats) {
                System.out.println("В вагоне есть " + (numberSeats - numberPeople) + " сидячих мест.\n");
            } else {
                System.out.println("В вагоне сидящих мест не осталось, есть только " +
                        +(capacityCarriage - numberPeople) + " стоячих мест.\n");
            }
        }

        //Задача 7
        System.out.println("Задача 7");

        System.out.print("Введите, пожалуйста, три разные цифры: ");
        int one = scanner.nextInt(), two = scanner.nextInt(), three = scanner.nextInt();
        if (one > two && one > three) {
            System.out.print("Большая цифра " + one + ".");
        } else if (two > one && two > three) {
            System.out.print("Большая цифра " + two + ".");
        } else {
            System.out.print("Большая цифра " + three + ".");
        }

        scanner.close();
    }
}