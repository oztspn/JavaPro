public class Cat extends Animal {
    private static int catAmount;

    public Cat() {
        catAmount++;
    }

    public static int getCatAmount() {
        return catAmount;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            super.run(distance);
        } else {
            System.out.println(getName() + " cannot run more than 200 meters!");
        }

    }

    @Override
    public void swim(int distance) {
            System.out.println("Unfortunately " + getName() + " cannot swim!");
    }
}
