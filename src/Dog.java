public class Dog extends Animal {
    private static int dogAmount;

    public Dog() {
        dogAmount++;
    }

    public static int getDogAmount() {
        return dogAmount;
    }
    @Override
    public void run(int distance) {
        if (distance <= 500) {
            super.run(distance);
        } else {
            System.out.println(getName() + "  cannot run more than 500 meters!");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            super.swim(distance);
        } else {
            System.out.println(getName() + "  cannot swim more than 10 meters!");
        }
    }
}
