public class LakeObject {
    private int cost;
    private int weight;
    private String objectName;

    public LakeObject(String name) {
        objectName = name;
        cost = (int)(Math.random() * 8);
        weight = (int)(Math.random() * 16);
    }

    public int getCost() {
        return cost;
    }

    public int getWeight() {
        return weight;
    }

    public String getObjectName() {
        return objectName;
    }

    public boolean wasCaught(Hook h) {
        return h.getStrength() > this.getWeight();
    }

    public String say() {
        return "You have collected a LakeObject";
    }
}
