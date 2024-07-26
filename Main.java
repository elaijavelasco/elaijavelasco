public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        Cat cat = new Cat("Whiskers",2, "Black");

        System.out.println("Dog Details:");
        dog.display();

        System.out.println("Cat Details:");
        cat.display();
    }
}
