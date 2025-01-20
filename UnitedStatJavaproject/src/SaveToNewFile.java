import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

class SaveToNewFile {
    public static void saveToFile(List<String[]> data, String newFilePath) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(newFilePath))) {
            for (String[] row : data) {
                bw.write(String.join(",", row));
                bw.newLine();
            }
            System.out.println("Data saved to file successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
