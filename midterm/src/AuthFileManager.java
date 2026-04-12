import java.io.*;

public class AuthFileManager {

    private static final String FILE_NAME = "users.txt";

    // REGISTER
    public static boolean registerUser(String username, String password) {
        try {
            File file = new File(FILE_NAME);

            // create file if not exists
            if (!file.exists()) {
                file.createNewFile();
            }

            // check if username already exists
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals(username)) {
                    reader.close();
                    return false; // already exists
                }
            }
            reader.close();

            // save user
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            writer.write(username + "," + password);
            writer.newLine();
            writer.close();

            return true;

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    // LOGIN VALIDATION
    public static boolean validateUser(String username, String password) {
        try {
            File file = new File(FILE_NAME);

            if (!file.exists()) return false;

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");

                if (parts[0].equals(username) && parts[1].equals(password)) {
                    reader.close();
                    return true;
                }
            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }
}