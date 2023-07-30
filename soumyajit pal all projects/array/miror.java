package array;
import java.util.*;

/**
 * 
 */
public class miror
{

    /**
     * 
     */
    static public void main()
    {
        Scanner sc =  new  Scanner(System.in);
        int i;
        int j;
        int[][] num =  new  int[4][4];
        int[][] num1 =  new  int[4][4];
        System.out.println("the elements of 4*4 matrix are:");
        i = 0;
        while (i < 4) {
            j = 0;
            while (j < 4) {
                num[i][j] = sc.nextInt();
                j = j + 1;
            }
            i = i + 1;
        }
        System.out.println("The elements of4*4 matrix are:");
        i = 0;
        while (i < 4) {
            j = 0;
            while (j < 4) {
                System.out.print(num[i][j] + " ");
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
        System.out.println("The transpose of the matrix:");
        i = 0;
        while (i < 4) {
            j = 0;
            while (j < 4) {
                num1[i][3 - j] = num[i][j];
                j = j + 1;
            }
            i = i + 1;
        }
        i = 0;
        while (i < 4) {
            j = 0;
            while (j < 4) {
                System.out.print(num1[i][j] + " ");
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
}
