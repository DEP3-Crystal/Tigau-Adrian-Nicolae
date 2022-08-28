public class Ex1 {

    public static void main(String[] args) {
        //There is an array of 10 elements of the int type:
        //int[] integers = {1, 3, 5, 2, 5, 6, 7, 4, 9, 7};
        //Using one of the loops, write a code fragment that displays:
        //all numbers
        //first 6 numbers
        //last 6 numbers
        //all even numbers
        //all digits at odd indexes
        //all numbers backwards
        //all numbers except 5
        //all digits up to and including 7
        //all digits divisible by 3
        //sum of all digits
        //sum of all digits greater or equal 4
        //the smallest and largest digit

        int[] integers = {1, 3, 5, 2, 5, 6, 7, 4, 9, 7};

        System.out.println();

        for (int i = 0; i < integers.length; i++) {

            System.out.print(integers[i]);
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < 6; i++) {

            System.out.print(integers[i]);
        }

        System.out.println();
        System.out.println();

        for (int i = 4; i < integers.length; i++) {

            System.out.print(integers[i]);
        }

        System.out.println();
        System.out.println();


        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0) {
                System.out.print(integers[i]);
            }
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < integers.length; i++) {

            if (i % 2 != 0) {
                System.out.print(integers[i]);
            }
        }

        System.out.println();
        System.out.println();

        for (int i = integers.length - 1; i >= 0; i--) {

            System.out.print(integers[i]);
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < integers.length; i++) {

            if (i == 2 || i == 4) {
                continue;
            }

            System.out.print(integers[i]);
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < integers.length; i++) {

            if (i == 7) {
                break;
            }

            System.out.print(integers[i]);
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < integers.length; i++) {

            if (integers[i] % 3 == 0) {
                System.out.print(integers[i]);
            }
        }

        System.out.println();
        System.out.println();

        int sum = 0;


        for (int i = 0; i < integers.length; i++) {


            sum = sum + integers[i];
            //int sum = integers[0] + integers[1] + integers[2] + integers[3] + integers[4] + integers[5] + integers[6] + integers[7] + integers[8] + integers[9];


        }

        System.out.print(sum);

        System.out.println();
        System.out.println();

        int sum2 = 0;

        for (int i = 0; i < integers.length; i++) {


            if (integers[i] >= 4) {

                sum2 = sum2 + integers[i];
            }
        }

        System.out.print(sum2);

        System.out.println();
        System.out.println();

        System.out.println(integers[0]);
        System.out.println(integers[8]);


    }
}