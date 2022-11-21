public class Main {
    public static void main(String[] args) {
        //Задачи. Условный оператор. Часть 1.
        System.out.println("Задачи. Условный оператор. Часть 2.");
        //Задача 1.
        System.out.println("Задание 1.");
        int ageOfUser = 19;
        if(ageOfUser >= 18){
            System.out.println("Поздравляю вас с совершеннолетием!");
        }
        System.out.println("Возраст совершеннолетия еще не наступил, и нужно немного подождать.");
        System.out.println();
        //Задача 2.
        System.out.println("Задача 2.");
        int peopleAge = 10;
        if(peopleAge >= 7 && peopleAge < 18){
            System.out.println("Ребёнок ходит в школу.");
        }
        if (peopleAge >= 18){
            System.out.println("Человек уже закончил школу и может отправляться в университет.");
        }
        if (peopleAge >= 24){
            System.out.println("Человек уже закончил университет и ему пора искать первую работу.");
        }
        System.out.println();
        //Задача 3.
        System.out.println("Задание 3.");
        int numberOfPlacesInTrainCarriage = 102;
        int numberOfSeatPlacesInTrainCarriage = 60;
        int seatForOrder = 100;
        if (seatForOrder <= numberOfSeatPlacesInTrainCarriage){
            System.out.println("Есть сидячее место.");
        }
        if (seatForOrder > numberOfSeatPlacesInTrainCarriage && seatForOrder <= numberOfPlacesInTrainCarriage){
            System.out.println("Есть стоячее место.");
        }
        if (seatForOrder > numberOfPlacesInTrainCarriage) {
            System.out.println("Мест в вагоне нет.");
        }
        //Задачи. Условный оператор. Часть 2.
        //Задание 1.
        System.out.println("Задачи. Условный оператор. Часть 2.");
        System.out.println("Задание 1.");
        int ageOfUser2 = 19;
        if (ageOfUser2 >= 18){
            System.out.println("Поздравляем с совершеннолетием!");
        }
        else {
            System.out.println("Возраст совершеннолетия еще не наступил.");
        }
        System.out.println();
        //Задание 2.
        System.out.println("Задание 2.");
        int people2Age = 24;
        if (people2Age >= 7 && people2Age <18){
            System.out.println("Ребёнок ходит в школу.");
        }
        else if (people2Age >= 18 && people2Age < 24){
            System.out.println("Человек уже закончил школу и может отправляться в университет.");
        } else if (people2Age >= 24) {
            System.out.println("Человек закончил университет и ему пора искать первую работу.");
        }
        else {
            System.out.println("Возраст человека меньше 7 лет.");
        }
        System.out.println();

        //Задача 3.
        System.out.println("Задание 3.");
        int numberOfPlacesInTrainCarriage2 = 102;
        int numberOfSeatPlacesInTrainCarriage2 = 60;
        int seatForOrder2 = 60;
        if (seatForOrder2 <= numberOfSeatPlacesInTrainCarriage2){
            System.out.println("Есть сидячее место.");
        }
        else if (seatForOrder2 > numberOfSeatPlacesInTrainCarriage2 && seatForOrder2 <= numberOfPlacesInTrainCarriage2){
            System.out.println("Есть стоячее место.");
        }
        else {
            System.out.println("Мест в вагоне нет.");
        }
        System.out.println();

        //Домашнее задание - 3. Задание 1.
        System.out.println("Домашнее задание - 3. Задание 1.");
        int peopleAge3 = 20;
        if (peopleAge3 >= 2 && peopleAge3 <=6){
            System.out.println("Если возраст человека " + peopleAge3 + ", то ему нужно ходить в детский сад.");
        } else  if (peopleAge3 >= 7 && peopleAge3 <= 18){
            System.out.println("Если возраст человека равен " + peopleAge3 + ", то ему нужно ходить в школу.");
        } else if (peopleAge3 >= 19 && peopleAge3 <= 23) {
            System.out.println("Если возраст человека равен " + peopleAge3 + ", то ему нужно ходить в университет.");
        } else if (peopleAge3 >= 24) {
            System.out.println("Если возраст человека равен " + peopleAge3 + ", то ему нужно ходить на работу.");
        }
        System.out.println();

        //Домашнее задание - 3. Задание 2.
        System.out.println("Домашнеее задание - 3. Задание 2.");
        int ageOfKid = 10;
        if (ageOfKid < 5){
            System.out.println("Ребёнок не может кататься на аттракционе.");
        } else if (ageOfKid >= 5 && ageOfKid < 14) {
            System.out.println("Ребёнок может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else if (ageOfKid >= 14) {
            System.out.println("Ребёнок может кататься без сопровождения взрослого.");
        }
        System.out.println();

        //Домашнее задание - 3. Задание 3.
        System.out.println("Домашнеее задание - 3. Задание 3.");
        int one = 5;
        int two = 2;
        int three = 7;
        if (one > two && one > three){
            System.out.println("Число " + one + " самое большее.");
        } else if (two > one && two > three){
            System.out.println("Число " + two + " самое большее.");
        } else if (three > one && three > two) {
            System.out.println("Число " + three + " самое большее.");
        }
        System.out.println();
        System.out.println("Домашнее задание сделано!.");
    }
}