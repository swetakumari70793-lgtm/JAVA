public class HeartPattern {

    public static void main(String[] args) {
        int size = 6; // Adjust size for a larger or smaller heart

        // Upper part of the heart
        for (int i = size / 2; i < size; i += 2) 
        {
            // Print leading spaces for the first lobe
            for (int j = 1; j < size - i; j += 2) {
                System.out.print(" ");
            }
            // Print stars for the first lobe
            for (int j = 1; j < i + 1; j++) {
                System.out.print("*");
            }
            // Print spaces between the lobes
            for (int j = 1; j < size - i + 1; j++) {
                System.out.print(" ");
            }
            // Print stars for the second lobe
            for (int j = 1; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }

        // Lower part of the heart (inverted pyramid)
        for (int i = size; i > 0; i--) 
        {
            // Print leading spaces for the pyramid
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            // Print stars for the pyramid
            for (int j = 1; j < (i * 2); j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
}
