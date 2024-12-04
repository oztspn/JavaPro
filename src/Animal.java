public class Animal {

    private static int animalAmount;
    private String name;

    public Animal() {
        animalAmount++;
    }

    public static int getAnimalAmount() {
        return animalAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(int distance) {
        System.out.println(name + " ran " + distance + " meters");
    }

    public void swim( int distance) {
        System.out.println(name + " swam " + distance + " meters");
    }
}
