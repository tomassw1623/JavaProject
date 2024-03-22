import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class F06_filterStreamEx {

    public static void main(String[] args) {
        // filterStream
        try (
            FileReader input = new FileReader("test.txt");
            FileWriter output = new FileWriter("test_out.txt");
            BufferedReader bufInput = new BufferedReader(input);
            BufferedWriter bufOutput = new BufferedWriter(output);
        ) {
            String line;
            while ((line = bufInput.readLine()) != null) {
                bufOutput.write(line, 0, line.length());
                bufOutput.newLine();
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
