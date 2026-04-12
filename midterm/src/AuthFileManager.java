import java.io.*;

public class AuthFileManager {

    private static final String FILE_NAME = "users.txt";

    // SAVE USER (REGISTER)
    public static void saveUser(String username, String password) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true))) {

            bw.write(username + "," + password);
            bw.newLine();

        } catch (IOException e) {
            System.out.println("Error saving user: " + e.getMessage());
        }
    }

    // LOGIN VALIDATION
    public static boolean validateUser(String username, String password) {

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                if (data.length == 2) {

                    String fileUser = data[0];
                    String filePass = data[1];

                    if (fileUser.equals(username) && filePass.equals(password)) {
                        return true;
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return false;
    }
}