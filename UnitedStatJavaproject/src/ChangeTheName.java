import java.util.List;

public class ChangeTheName {

    public static void updateNames(List<String[]> data, String newName) {
        for (String[] row : data) {
            if (!row[0].equals("id")) { // হেডার এড়িয়ে যাওয়া
                row[1] = newName; // name পরিবর্তন করা
            }
        }
    }

}
