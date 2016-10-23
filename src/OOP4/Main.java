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

        FlowerSpec tul = new FlowerSpec();
        tul.setFresh(false);
        tul.setPrice(280000);
        tul.setType(FlowerType.TULPAN);
        tul.setColor(FlowerColor.GREEN);
        tul.setLength(380);
        bucket.addFlower(tul);

        System.out.println(bucket);

        System.out.println(bucket.searchFlower(tul));
    }
}
