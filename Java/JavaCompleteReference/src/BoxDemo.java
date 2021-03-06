public class BoxDemo {
    public static void main(String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        // assign values to mybox1's instance variables
        mybox1.width  = 10;
        mybox1.height = 20;
        mybox1.depth  = 15;

        // assign different values to mybox2's instance variables
        mybox2.width  = 3;
        mybox2.height = 6;
        mybox2.depth  = 9;

        // display value of the first box
        mybox1.volume();

        // display value of the second box
        mybox2.volume();
    }
}
