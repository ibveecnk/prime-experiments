import java.util.List;
import java.util.ArrayList;

public class PrimeFactory {
    public List<Integer> generatePrimesInRange(int lowerBound, int upperBound) {
        if (lowerBound > upperBound) {
            throw new IllegalArgumentException("lowerbound must not be greater than upperbound");
        }

        if (lowerBound < 0) {
            throw new IllegalArgumentException("lowerbound must not be less than 0");
        }

        List<Integer> primes = new ArrayList<Integer>();
        for (int candidate = lowerBound; candidate <= upperBound; candidate++) {
            if (isPrime(candidate)) {
                primes.add(candidate);
            }
        }
        return primes;
    }

    private boolean isPrime(int candidate) {
        for (int divisor = 2; divisor <= Math.sqrt(candidate); divisor++) {
            if (candidate % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
