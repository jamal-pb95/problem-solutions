package javaForDummies;

public class MysteryProgram {
//    public static void mystery(String foo, String bar, String zazz) {
//        System.out.println(zazz + " and " + foo + " like " + bar);
//    }
//    public static void main(String[] args) {
//        String foo = "peanuts";
//        String bar = "foo";
//        mystery(bar, foo, "John");
//    }

    public static void main(String[] args) {
//        int x = 3, y = 5, z = 7;
////        doubleMe(x);
////        System.out.println("x doubled is " + x);
        System.out.println(puzzle(22, 11));
    }
//    public static void doubleMe(int x) {
//        x = x * 2;
//    }
//    public static int smallest(int a, int b, int c) {
//        return Math.min(Math.min(a, b), c);
//    }
//    public static int mystery (int x) {
//        if (x == 5){
//            return x;
//        } else {
//            return mystery(x--) * 5;
//        }
//    }
    public static int puzzle(int i, int j) {
        if (i == j) {
            return 0;
        } else {
            return 1 + puzzle(i - 2, j - 1);
        }
    }
}
