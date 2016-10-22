package OOP4;

public class Main {

    public static void main(String args[]) {
        FlowerBucket bucket = new FlowerBucket();
        FlowerSpec mak = new FlowerSpec();
        mak.setFresh(false);
        mak.setPrice(80000);
        mak.setType(FlowerType.MAK);
        mak.setColor(FlowerColor.RED);
        mak.setLength(80);
        bucket.addFlower(mak);

        System.out.println(bucket);
    }
}
