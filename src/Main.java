import java.util.*;
public class Main {

    public static void main(String[] args) {
        int[] sumNums = new int[5];
        Scanner keyboard = new Scanner(System.in);
        int a, b, temp;

        for (a = 0; a < sumNums.length; a++) {
            System.out.print("Enter number " + (a + 1) + " >> ");
            sumNums[a] = keyboard.nextInt();
        }

        a = 1;
        while (a < sumNums.length) {
            temp = sumNums[a];
            b = a - 1;
            while (b >= 0 && sumNums[b] > temp) {
                sumNums[b + 1] = sumNums[b];
                --b;
            }
            sumNums[b + 1] = temp;
            display(sumNums, a);
            a++;

        }
    }

    public static void display(int[] sumNums, int a) {
        System.out.print("Iteration " + a + ": ");
        System.out.println();
        for (int x = 0; x < sumNums.length; x++) {
            System.out.print(sumNums[x] + " ");
            System.out.println();
        }

    }
}
