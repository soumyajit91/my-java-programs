package number;
public class v5 {
   public static void main(int number) {
        int originalNumber, remainder, result = 0, n = 0;
        originalNumber = number;       
        for (;originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = number;
        for (;originalNumber != 0; originalNumber /= 10)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }
        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
           System.out.println(number + " is not an Armstrong number.");
   }
}
