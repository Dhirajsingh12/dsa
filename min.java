
public class min {

    public static void main(String[] args) {
        int[] numbers = {45, 12, 78, 4, 89, 1, 22};

        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            
            }
        }

        System.out.println("Minimum value in the array is: " + min);
    }
}
