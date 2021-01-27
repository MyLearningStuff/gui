import java.io.File;

public class GUI {

    public static void main(String[] args) {

        Ui ui = new Ui();

        File desktop = new File("C:/Users/Codrin/Desktop");
        ui.updateFiles(desktop.listFiles());

        var keyBoardListener = new KeyboardListener(ui);

    }
}
