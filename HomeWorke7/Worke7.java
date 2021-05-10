package Work.HomeWorke7;

import java.util.Scanner;

public class Worke7 {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik",5 ),
                new Cat("Markiz", 4),
                new Cat("Murzik", 7),
        };
        Plate plate = new Plate(15);

        printInfo(cats, plate);
        haveLunch(cats, plate);

        printInfo(cats, plate);

        addFood(plate);

        System.out.println("Adder food: ");
        plate.info();
        System.out.println();

        haveLunch(cats, plate);
        printInfo(cats, plate);
    }


    private static void addFood(Cat[] cats, Plate plate) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new food count: ");
        int foodCount = scanner.nextInt();
        plate.addFood(foodCount);
    }

    private static void printInfo(Cat[] cats, Plate plate) {
        System.out.println("---Info---");
        plate.info();
        printInfo(cats);
        System.out.println("---------");
        System.out.println();
    }

    private static void haveLunch(Cat[] cats, Plate plate) {
        for (Cat cat : cats) {
            boolean result = cat.eat(plate);
            System.out.printf("Did Cat '%s' eat? Answer: %s%n", cat.getName(), result);
        }
        System.out.println();
    }

    private static void printInfo(Cat... cats){
        for (Cat cat : cats){
            System.out.printf("Is cat '%s(appetite: %d)' hugry& Answer: %s%n",
                    cat.getName(),
                    cat.getAppetite(),
                    !cat.isSatiety());
        }
    }
}
