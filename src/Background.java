import javax.swing.*;

public class Background {
    public Background() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        GUIbackground app = new GUIbackground();
        app.setVisible(true);
    }
    public static void main(String[] arg) {
        new Background();
    }
}
class GUIbackground extends JFrame {
    public GUIbackground() {
        super("ImageBackground");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0, 23, 800, 600);
        this.setResizable(false);
        this.setContentPane(new JLabel());
        ImageIcon background = new ImageIcon("background.jpg");
        for (int i = 1; i <= 800/50; i++) {
            for (int j = 1; j <= 600/50; j++) {
                JLabel label_background = new JLabel();
                label_background.setIcon(background);
                label_background.setBounds(i*50-50, j*50-50, background.getIconWidth(), background.getIconHeight());
                this.add(label_background);
            }
        }
        this.setVisible(true);
    }
}
