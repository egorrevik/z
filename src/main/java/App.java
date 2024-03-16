import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App {
    private JButton button;
    private JPanel panel;

    private JTextField input;

    static int num;

    public App() {
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int userNum = Integer.parseInt(input.getText());
                if (userNum > num)
                    JOptionPane.showMessageDialog(null, "Число меньше!");
                else if (userNum < num)
                    JOptionPane.showMessageDialog(null, "Число больше!");
                else
                    JOptionPane.showMessageDialog(null, "Вы угадали!");
            }
        });
    }

    public static void main(String[] args) {
        num = (int) Math.floor(Math.random() * 10);

        JFrame flame = new JFrame("Default");
        flame.setContentPane(new App().panel);
        flame.setDefaultCloseOperation(flame.EXIT_ON_CLOSE);
        flame.pack();
        flame.setVisible(true);

    }

}



