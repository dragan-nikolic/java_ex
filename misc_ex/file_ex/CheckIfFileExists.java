/*
Check if file exists example.

Lnk: https://www.baeldung.com/java-file-directory-exists
*/

public class CheckIfFileExists {
	public static void fileExists() throws InterruptedException {
        String path = "myfile.txt";
        long start = System.currentTimeMillis();
        long timeout = 10 * 60_000L;
        
        while (true) {
            if (new java.io.File(path).exists()) {
                System.out.println("FOUND!");
                break;
            } else {
                System.out.println("checking for " + String.valueOf(System.currentTimeMillis() - start));
            }

            Thread.sleep(5_000L);
        }
    }

	public static void main(String[] args) throws InterruptedException {
		fileExists();
	}
}
