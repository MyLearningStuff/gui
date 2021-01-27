import java.io.File;

public class GUI {

    public static void main(String[] args) {

        Ui.display();

        final File folder = new File("C:/Users/Codrin/Desktop");
        listFilesForFolder(folder);

    }

    public static void listFilesForFolder(final File folder) {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                listFilesForFolder(fileEntry);
            } else {
                System.out.println(fileEntry.getName());
            }
        }
    }
}
