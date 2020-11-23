public class PreGDA1 {

    public static void main(String[] args) {

        System.out.println("Java skillz\n");

        System.out.println("=== ex 1 ===");
        int[] anArray;
        anArray = new int[3];

        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;

        for(int i = 0; i < anArray.length; i++)
            System.out.println("Elementul " + i + ": " + anArray[i]);


        System.out.println("\n=== ex 2 ===");

        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd'};

        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));

        System.out.println("\n=== ex 3 ===");
        char[] copyTo2 = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        System.out.println(new String(copyTo2));

    }
}