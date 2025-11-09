public class process {
    public static void main(String[] args) {
        System.out.println("Program started... running for 3 minutes.");

        long startTime = System.currentTimeMillis();
        long duration = 3 * 60 * 1000; // 3 minutes in milliseconds

        while (System.currentTimeMillis() - startTime < duration) {
            // Perform any task or keep idle
        }

        System.out.println("3 minutes completed. Program ended.");
    }
}
