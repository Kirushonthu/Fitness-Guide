import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {

    // -------------------- Write Text to File --------------------
    public static void writeToFile(String fileName, String content, boolean append){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, append))) {
            writer.write(content);
            writer.newLine();
        } catch (IOException e){
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // -------------------- Read Text from File --------------------
    public static List<String> readFromFile(String fileName){
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = reader.readLine()) != null){
                lines.add(line);
            }
        } catch (IOException e){
            System.out.println("Error reading from file: " + e.getMessage());
        }
        return lines;
    }

    // -------------------- Append Line to File --------------------
    public static void appendLine(String fileName, String line){
        writeToFile(fileName, line, true);
    }

    // -------------------- Overwrite File --------------------
    public static void overwriteFile(String fileName, String content){
        writeToFile(fileName, content, false);
    }

    // -------------------- Check if File Exists --------------------
    public static boolean fileExists(String fileName){
        File file = new File(fileName);
        return file.exists();
    }
}
