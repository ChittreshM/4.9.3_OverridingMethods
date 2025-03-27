public void goFish() {
    LakeObject[] lakeObjects = new LakeObject[4];
    lakeObjects[0] = new Fish();
    lakeObjects[1] = new Wallet();
    lakeObjects[2] = new Fish();
    lakeObjects[3] = new Boot();

    if (player.hasHook() && player.hasBait()) {
        int i = (int)(Math.random() * lakeObjects.length);
        Hook strongestHook = player.getStrongestHook();
        setOutput("\n");

        if (i >= lakeObjects.length) {
            setOutput("\nYou lost your hook  :(");
            player.updateInventory(new Hook(), false);
        } else if (lakeObjects[i].wasCaught(strongestHook)) {
            if (lakeObjects[i].getObjectName().equals("Wallet")) {
                player.updateWallet(lakeObjects[i].getCost());
                setOutput("You caught a Wallet!");
                setOutput(lakeObjects[i].say());
                setOutput("Money from the wallet was added to your inventory");
            } else {
                player.updateInventory(lakeObjects[i], true);
                setOutput(lakeObjects[i].say());
            }
        } else {
            setOutput("\nYour hook had a strength of " + strongestHook.getStrength() +
                      "\nand needed at least a strength of " + lakeObjects[i].getWeight());
        }
    } else {
        setOutput("You need a hook and bait to go fishing. You can buy them at the shop.");
    }
}
