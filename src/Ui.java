import javax.swing.*;
import java.io.File;

public class Ui {
    private final JFrame frame;
    private final JLabel text;
    private int cursorPosition;
    private File[] currentFiles;

    public Ui() {
        cursorPosition = 0;
        frame = new JFrame();
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        frame.add(panel);
        text = new JLabel();

        text.setText("<html>Hello <br> Hello </html>");
        text.setBounds(0, 20, 200, 50);

        panel.add(text);
    }

    public void attachKeyboardListener(KeyboardListener keyboardListener) {
        frame.addKeyListener(keyboardListener);
    }

    public void displayFiles() {
        if (currentFiles == null)
            return;

        var outputString = "<html>";
        for (int i = 0; i < currentFiles.length; i++) {
            File file = currentFiles[i];

            var displayString = file.isDirectory()
                    ? "Folder " + file.getName()
                    : "FIle " + file.getName();
            if (i == cursorPosition) {
                displayString = "*** " + displayString;
            }

            outputString = outputString + displayString + "<br>";
        }

        outputString = outputString + "</html>";

        text.setText(outputString);
    }

    public void moveCursorUp() {
        cursorPosition = Math.max(cursorPosition - 1, 0);
        displayFiles();
    }

    public void moveCursorDown() {
        cursorPosition = Math.min(cursorPosition + 1, currentFiles.length - 1);
        displayFiles();
    }

    public void updateFiles(File[] listFiles) {
        currentFiles = listFiles;
        displayFiles();
    }
}
