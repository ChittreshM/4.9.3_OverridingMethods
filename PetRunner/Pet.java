public abstract class Pet {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("I am a Pet");
    }
}
