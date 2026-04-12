import java.io.*;
import java.util.ArrayList;

public class SaiyanManager {

    private static final String FILE_NAME = "saiyans.txt";

    // LOAD ALL DATA
    public static ArrayList<String[]> loadAll() {
        ArrayList<String[]> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {

            String line;
            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                if (data.length == 4) {
                    list.add(data);
                }
            }

        } catch (IOException e) {
            // file not found = ok (first run)
        }

        return list;
    }

    // SAVE ALL DATA (overwrite file)
    public static void saveAll(ArrayList<String[]> list) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {

            for (String[] s : list) {
                bw.write(String.join(",", s));
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}