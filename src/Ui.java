import javax.swing.*;
import java.io.File;

public class Ui {

    private final JLabel text;

    public Ui() {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        frame.add(panel);
        text = new JLabel();

        text.setText("<html>Hello <br> Hello </html>");
        text.setBounds(0, 20, 200, 50);

        frame.addKeyListener(new KeyboardListener());
        panel.add(text);
    }

    public void displayFiles(File[] files) {
        if (files == null)
            return;

        String outputString = "<html>";
        for (File file : files) {
            outputString = outputString + file.getName() + "<br>";
        }

        outputString = outputString + "</html>";

        text.setText(outputString);
    }
}
