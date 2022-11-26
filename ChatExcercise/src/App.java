import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Archivo");
        JMenu helpMenu = new JMenu("Ayuda");
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);
        JMenuItem openItem = new JMenuItem ("Abrir");
        JMenuItem saveItem = new JMenuItem ("Guardar Como");
        fileMenu.add(openItem);
        helpMenu.add(saveItem);

        JPanel panel = new JPanel();
        JLabel messageLabel = new JLabel("Mensaje: ");
        JTextField chatTextField = new JTextField(10);
        JButton sendButton = new JButton("Enviar");
        JButton resetButton = new JButton("Restablecer");
        panel.setLayout(new FlowLayout());
        panel.add(messageLabel);
        panel.add(chatTextField);
        panel.add(sendButton);
        panel.add(resetButton);

        JTextArea chatHistory = new JTextArea();

        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, menuBar);
        frame.getContentPane().add(BorderLayout.CENTER, chatHistory);
        frame.setVisible(true);

        public static void resetTextField(JTextField target){
            target.setText(true);
        }
        

    }
}
