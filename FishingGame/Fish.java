public class Fish extends LakeObject {
    public Fish() {
        super("Fish");
    }

    @Override
    public String say() {
        return "You caught a fish! Dinner is served.";
    }
}
