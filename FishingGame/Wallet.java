public class Wallet extends LakeObject {
    public Wallet() {
        super("Wallet");
    }

    @Override
    public String say() {
        return "You found a wallet! Jackpot!";
    }
}
