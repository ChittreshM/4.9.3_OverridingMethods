public class Boot extends LakeObject {
    public Boot() {
        super("Boot");
    }

    @Override
    public String say() {
        return "You fished out an old boot. Yuck!";
    }

    @Override
    public boolean wasCaught(Hook h) {
        return true;
    }
}
