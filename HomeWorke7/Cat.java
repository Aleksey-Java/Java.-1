package Work.HomeWorke7;

import lesson_7.Cat_and_Plate.Plate;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean satiety;

    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
    }
    public String getName() {
        return name;
    }
    public int getAppetite() {
        return appetite;

    }
    public boolean eat(Plate plate) {
        String validateMassage = checkEat(plate);
        if (validateMassage != null) {
            System.out.println(validateMassage);
            return false;
        }
        doEat(plate);
        satiety = true;
        return true;
    }
    private String checkEat(Plate plate) {
        if ( !plate.isFoodEnough(appetite)) {
            return "Food is not enough in the plate!";
        }
        if (satiety) {
            return "Cat is already satiety!";
        }
        return null;
    }
    private void doEat(Plate plate) {
        plate.decreaseFood(appetite);
    }
}
