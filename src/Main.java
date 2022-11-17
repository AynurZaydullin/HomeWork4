public class Main {
    public static void main(String[] args) {
        //Задачи. Условный оператор. Часть 2."
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
        int peopleAge = 20;
        if((peopleAge >= 7) && (peopleAge < 18)){
            System.out.println("Ребёнок ходит в школу.");
        }
        if (peopleAge >= 18){
            System.out.println("Человек уже закончил школу и может отправляться в университет.");
        }
        System.out.println();
    }
}