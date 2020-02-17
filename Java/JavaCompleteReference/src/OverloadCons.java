public class OverloadCons {
    public static void main(String args[]) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mybox3 = new Box(7);

        double vol;

        // get volume of the first box
        vol = mybox1.volume();
        System.out.println("MyBox1 volume is " + vol);

        // get volume of the second box
        vol = mybox2.volume();
        System.out.println("MyBox2 volume is " + vol);

        // get volume of the third box
        vol = mybox3.volume();
        System.out.println("MyBox3 volume is " + vol);
    }
}
