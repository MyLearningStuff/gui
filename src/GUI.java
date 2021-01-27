import java.io.File;

public class GUI {

    public static void main(String[] args) {

        Ui ui = new Ui();

        File desktop = new File("C:/Users/Codrin/Desktop");
        ui.displayFiles(desktop.listFiles());
    }
}
