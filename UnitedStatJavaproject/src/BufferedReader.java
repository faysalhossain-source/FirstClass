import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

class Main {
    public static void main(String[] args) {
        String filePath = "F:\\git\\UnitedStatJavaproject\\Worksheet.csv"; // ফাইলের সঠিক পাথ

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line); // ফাইলের লাইন প্রিন্ট করা
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String[]> data = List.of();
        DatabaseHandler.insertData(data);

        
       // data = DatabaseHandler.insertData();


        ChangeTheName.updateNames(data, "newName");


        String newFilePath = new String();
        SaveToNewFile.saveToFile(data, newFilePath);
    }
}
