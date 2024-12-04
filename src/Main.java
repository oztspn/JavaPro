public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Tom");
        cat.run(201);
        cat.swim(10);

        Cat cat1 = new Cat();
        cat1.setName("Fluffy");
        cat1.run(150);
        cat1.swim(2);


        Dog dog = new Dog();
        dog.setName("Bourbon");
        dog.run(200);
        dog.swim(10);

        System.out.println("We have " + Animal.getAnimalAmount() + " animal(s)");
        System.out.println("We have " + Cat.getCatAmount() + " cat(s)");
        System.out.println("We have " + Dog.getDogAmount() + " dog(s)");
    }
}