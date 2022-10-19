import java.util.List;

public class Main {
   private static int START, END;

   public static void main(String[] args) {
      START = 1;
      END = 1_000_000;
      PrimeFactory factory = new PrimeFactory();

      List<Integer> primes = factory.generatePrimesInRange(START, END);

      /*
       * Print the primes and their binary representation.
       *
       */

      // Quick length approximation (not looking if END is actually included)
      int binaryLength = (int) Math.floor((double) Math.log(END) / (double) Math.log(2)) + 1;
      int decimalLength = (int) Math.floor((double) Math.log10(END)) + 1;

      String binaryFormat = "%" + binaryLength + "s";
      String decimalFormat = "%" + decimalLength + "s";

      System.out.printf("[%d, %d]: n=%d%n", START, END, primes.size());
      System.out.printf("Prime Probability: %f", (primes.size() / (double) (END - START)));
      System.out.println();

      for (int prime : primes) {
         System.out.printf("%s -> %s%n", String.format(decimalFormat, prime).replace(' ', '0'),
               String.format(binaryFormat,
                     Integer.toBinaryString(prime)).replace(' ', '0'));
      }

   }

}