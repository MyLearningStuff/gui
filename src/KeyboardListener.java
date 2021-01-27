import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardListener implements KeyListener {

    private final Ui ui;

    public KeyboardListener(Ui ui) {
        this.ui = ui;
        ui.attachKeyboardListener(this);
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {

        if (keyEvent.getKeyCode() == 40) {
            ui.moveCursorDown();
        } else if (keyEvent.getKeyCode() == 38) {
            ui.moveCursorUp();
        } else if (keyEvent.getKeyCode() == 10) {
            ui.enterCurrentFolder();
        } else if (keyEvent.getKeyCode() == 8) {
            ui.goBack();
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
    }
}
