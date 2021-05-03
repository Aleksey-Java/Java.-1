package Work;

import java.util.Random;

public class HomeWork5 {

    private static final int EMPLOYEE_COUNT = 5;
    private static final int MIN_AGE = 40;

    private static final Random ageRandomize = new Random();

    public static void main(String[] args) {
        Working[] workings = new Working[EMPLOYEE_COUNT];
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            workings[i] = createWoring(i);
        }
    for (Working working : workings){
        if (working.getAge() > MIN_AGE) {
            working.printInfo();
        }
    }
    }

    private static Working createWoring(int i) {
        return new Working(
                "name" + i,
                "surName" + i,
                ageRandomize.nextInt(30) + 30,
                "test" + i + "@test.com",
                "+79126408552" + i,
                "Software Engineer",
                2000 + i * 100);
    }
}