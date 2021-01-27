import javax.swing.*;

public class Ui {

    private Ui() {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        frame.add(panel);
        JLabel label = new JLabel();

        label.setText("Hello");
        label.setBounds(0, 20, 200, 50);

        frame.addKeyListener(new KeyboardListener());
        panel.add(label);
    }

    public static void display() {
        new Ui();
    }
}
