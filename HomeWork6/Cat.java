package Work.HomeWork6;

public class Cat extends Animal {
    public static final int DEFAULT_MAX_RUN_DISTANCE = 200;
    public static final int DEFAULT_MAX_JUMP_HEIGHT = 2;
    public static final int DEFAULT_MAX_SWIM_DISTANCE = 0;

    private static int count;

    public static int getCount(){
        return count;
    }

    public Cat(int maxRunDistance, int maxJampHeight){
        super(maxRunDistance, maxJampHeight, DEFAULT_MAX_SWIM_DISTANCE);
        count++;
    }
    public Cat(){
        this(DEFAULT_MAX_RUN_DISTANCE, DEFAULT_MAX_JUMP_HEIGHT);
    }

    @Override
    public boolean run(int distance) {
        if (this.maxRunDistance >= distance) {
            System.out.printf("Кое пробежал дистанцию %d. Max = %d%n", distance, maxRunDistance);
            return true;
        }

        System.out.printf("Кот пробежал дистанцию %d. Max = %d%n", distance, maxRunDistance);
        return false;
    }

    @Override
    public boolean swim(int distance) {
        if (this.maxSwimDistance >= distance)
            System.out.printf("Коты не умеют плавать!");
            return false;
        }

    @Override
    public boolean jump(int height) {
        if (this.maxJumpHeight >= height) {
            System.out.printf("Кот перепрыгнул препядствие %d. Max = %d%n", height, maxJumpHeight);
            return true;
        }

        System.out.printf("Кот перепрыгнул препядствие %d. Max = %d%n", height, maxJumpHeight);
        return false;
    }

}
