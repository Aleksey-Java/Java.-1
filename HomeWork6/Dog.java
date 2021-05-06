package Work.HomeWork6;

public class Dog extends Animal {
        public static final int DEFAULT_MAX_RUN_DISTANCE = 500;
        public static final int DEFAULT_MAX_JUMP_HEIGHT = 1;
        public static final int DEFAULT_MAX_SWIM_DISTANCE = 10;

        private static int count;

        public static int getCount(){
            return count;
        }

        public Dog(int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
            super(maxRunDistance, maxJumpHeight, maxSwimDistance);
            count++;
        }

        public Dog(){
            this(DEFAULT_MAX_RUN_DISTANCE, DEFAULT_MAX_JUMP_HEIGHT, DEFAULT_MAX_SWIM_DISTANCE);
        }

    @Override
    public boolean run(int distance) {
        if (this.maxRunDistance >= distance) {
            System.out.printf("Собака пробежала дистанцию %d. Max = %d%n", distance, maxRunDistance);
            return true;
        }

        System.out.printf("Собака пробежала дистанцию %d. Max = %d%n", distance, maxRunDistance);
        return false;
    }

    @Override
    public boolean swim(int distance) {
    if (this.maxSwimDistance >= distance) {
        System.out.printf("Собака проплыла дистанцию %d. Max = %d%n", distance, maxSwimDistance);
        return true;
    }

        System.out.printf("Собака проплыла дистанцию %d. Max = %d%n", distance, maxSwimDistance);
        return false;
        }

    @Override
    public boolean jump(int height) {
        if (this.maxJumpHeight >= height) {
            System.out.printf("Собака перепрыгнула препядствие %d. Max = %d%n", height, maxJumpHeight);
            return true;
        }

        System.out.printf("Собака перепрыгнула препядствие %d. Max = %d%n", height, maxJumpHeight);
        return false;
    }
}

