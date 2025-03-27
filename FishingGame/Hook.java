public class Hook extends LakeObject {
    private int strength;

    public Hook() {
        super("Hook");
        strength = 10;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String say() {
        return "You now have a hook!";
    }
}
