public class _39tryCatchVSThrows {
    
    public static void ruko() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ruko();
    }
}
