
import javax.swing.JButton;
import javax.swing.JTextField;

public class SwingUtil {
    public void setActive(boolean active, JButton ...buttons) {
        for (JButton button : buttons) {
            button.setEnabled(active);
        }
    }
    
    public void setActive(boolean active, JTextField ...texts) {
        for (JTextField text : texts) {
            text.setEnabled(active);
        }
    }
    
    public void clearText(JTextField ...texts) {
        for (JTextField text : texts) {
            text.setText("");
        }
    }
}
