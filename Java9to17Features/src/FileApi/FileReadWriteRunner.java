package FileApi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadWriteRunner {
    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("./Resources/Sample.txt");
        String fileContent = Files.readString(filePath); //@since Java 11.
        System.out.println(fileContent);

        String newFileContent = fileContent.replace("Java Developer","Full Stack Developer");


        Path newFilePath = Paths.get("./Resources/newSample.txt");
        Files.writeString(newFilePath,newFileContent);

    }
}
