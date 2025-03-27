public class PetRunner {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Spot");
        Dog dog2 = new Dog("Doug");

        Cat cat1 = new Cat("Philip");
        Cat cat2 = new Cat("Sparkles");

        dog1.speak();
        dog2.speak();

        cat1.speak();
        cat2.speak();
    }
}
