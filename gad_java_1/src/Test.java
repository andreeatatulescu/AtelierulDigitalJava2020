import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        System.out.println("Challenge 2");
        challenge2 chall2 = new challenge2();
        System.out.println("\n====== STAGE1 ======");
        for(int i = 1; i < 54; i++) {
            System.out.print(i + " => ");
            System.out.println(chall2.compute(i));
        }

        System.out.println("\n====== STAGE2 ======");
        System.out.println("101 => " + chall2.compute2(101));
        System.out.println("303 => " + chall2.compute2(303));
        System.out.println("105 => " + chall2.compute2(105));
        System.out.println("10101 => " + chall2.compute2(10101));

        System.out.println("\n===================================\nChallenge 3\n");
        challenge3 chall3 = new challenge3();
        int[] array1 = {3, 2, -3 , -2, 3, 0};
        System.out.println(Arrays.toString(array1) + " => " + chall3.pairOf2(array1));

        int[] array2 = {1, 1, 0 , -1, -1};
        System.out.println(Arrays.toString(array2) + " => " + chall3.pairOf2(array2));

        int[] array3 = {5, 9, -5 , 7, -5};
        System.out.println(Arrays.toString(array3) + " => " + chall3.pairOf2(array3));

        System.out.println("\n===================================\nChallenge 4\n");
        challenge4 chall4 = new challenge4();
        int[] array4 = {-1, -1, -1, 2};
        System.out.println(Arrays.toString(array4) + " => " + chall4.pairOf3(array4));

        System.out.println("\n=============== END ===============\n");
	// write your code here
    }
}
