package srp;

import java.io.FileWriter;
import java.io.IOException;

public class ReportFileSaver {

    public void saveToFile(String content, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content + "\n");
            System.out.println("Report saved to " + filename);
        } catch (IOException e) {
            System.out.println("Error writing report file: " + e.getMessage());
        }
    }
}
