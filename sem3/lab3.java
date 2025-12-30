package sem3;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class lab3 {
    public static void main(String[] args) {
        String sourceFilePath = "source.txt";
        String destinationFilePath = "destination.txt";

        File sourceFile = new File(sourceFilePath);
        try {
            if (sourceFile.createNewFile()) {
                System.out.println("Source file created: " + sourceFile.getName());
                try (FileOutputStream fos = new FileOutputStream(sourceFile)) {
                    String initialContent = "This is some sample data for the source file.";
                    fos.write(initialContent.getBytes());
                    System.out.println("Initial content written to source file.");
                }
            } else {
                System.out.println("Source file already exists.");
            }
        } catch (IOException e) {
            System.err.println("Error creating source file: " + e.getMessage());
        }

        File destinationFile = new File(destinationFilePath);
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("Data copied from " + sourceFilePath + " to " + destinationFilePath);

        } catch (IOException e) {
            System.err.println("Error copying file: " + e.getMessage());
        }
    }
}