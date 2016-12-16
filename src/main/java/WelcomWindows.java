import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.System.exit;

/**
 * Created by Rustam on 12.12.16.
 */
public class WelcomWindows extends JFrame {
    WelcomWindows() {
        super("LogIn");
        initUI();
    }

    private void initUI() {
       // setSize(450, 550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        Client client = new Client();
//        client.client();
//
//        final JTextField text = new JTextField();
//        String s = JOptionPane.showInputDialog(text, "Enter ip", "Log in", JOptionPane.CANCEL_OPTION);
//        JOptionPane.showMessageDialog(null, "Error", "Log in", JOptionPane.INFORMATION_MESSAGE);
//
//        s = JOptionPane.showInputDialog(text, "Enter login", "Log in", JOptionPane.CANCEL_OPTION);
//        JOptionPane.showMessageDialog(null, "Error", "Log in", JOptionPane.INFORMATION_MESSAGE);


        Box box1 = Box.createHorizontalBox();
        JLabel loginLabel = new JLabel("IP:");
        final JTextField textFieldIp = new JTextField(15);
        box1.add(loginLabel);
        box1.add(Box.createHorizontalStrut(6));
        box1.add(textFieldIp);
// Настраиваем вторую горизонтальную панель (для ввода пароля)
        Box box2 = Box.createHorizontalBox();
        JLabel passwordLabel = new JLabel("Login:");
        final JTextField textFieldLogin = new JTextField(15);
        box2.add(passwordLabel);
        box2.add(Box.createHorizontalStrut(6));
        box2.add(textFieldLogin);
// Настраиваем третью горизонтальную панель (с кнопками)
        Box box3 = Box.createHorizontalBox();
        JButton connect = new JButton("Connect");
        final JButton cancel = new JButton("Cancel");
        box3.add(Box.createHorizontalGlue());
        box3.add(connect);
        box3.add(Box.createHorizontalStrut(12));
        box3.add(cancel);
// Уточняем размеры компонентов
        loginLabel.setPreferredSize(passwordLabel.getPreferredSize());
// Размещаем три горизонтальные панели на одной вертикальной
        Box mainBox = Box.createVerticalBox();
        mainBox.setBorder(new EmptyBorder(12,12,12,12));
        mainBox.add(box1);
        mainBox.add(Box.createVerticalStrut(12));
        mainBox.add(box2);
        mainBox.add(Box.createVerticalStrut(17));
        mainBox.add(box3);
        setContentPane(mainBox);
        pack();
        setResizable(false);


        connect.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Client client = new Client();
                client.client(textFieldIp.getText(), (textFieldLogin.getText()));
            }
        });

        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exit(0);
            }
        });



//        final Dates dates = new Dates();
//        final Weather weather = new Weather();
//        final CheckingFormat checkingFormat = new CheckingFormat();

//        JMenuBar menubar = new JMenuBar();
//
//        JMenu menuGeneral = new JMenu("Menu");
//        JMenuItem exitItem = new JMenuItem("Exit");
//        menuGeneral.add(exitItem);
//        menubar.add(menuGeneral);
//
//
//        JMenu menuinfo = new JMenu("Info");
//        JMenuItem aboutItem = new JMenuItem("About");
//        menuinfo.add(aboutItem);
//        menubar.add(menuinfo);
//
//        menubar.add(Box.createHorizontalGlue());
//        setJMenuBar(menubar);
//
//
//        JButton showRed = new JButton("Show Red");
//        JButton showTime = new JButton("Show Time");
//        JButton showWeather = new JButton("Show Weather");
//
//        JPanel buttonsPanel = new JPanel();
//        buttonsPanel.setLayout(new BoxLayout(buttonsPanel, BoxLayout.Y_AXIS));
//
//        buttonsPanel.add(showRed);
//        buttonsPanel.add(showTime);
//        buttonsPanel.add(showWeather);
//        add(buttonsPanel, BorderLayout.EAST);
//
//
//        exitItem.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                System.exit(0);
//            }
//        });
//
//        aboutItem.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(null, "About messge", "About", JOptionPane.INFORMATION_MESSAGE);
//
//            }
//        });
//
//        showRed.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                getContentPane().setBackground(Color.RED);
//            }
//        });
//
//        showTime.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                //JOptionPane.showMessageDialog(null, dates.dates(), "Now Time", JOptionPane.INFORMATION_MESSAGE);
//                TimeDialog dlg = new TimeDialog(Windows.this, 320, 128);
//                dlg.setVisible(true);
//            }
//        });
//
//        final JTextField text = new JTextField();
//        showWeather.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                String s = JOptionPane.showInputDialog(text, "Enter city", "Weather", JOptionPane.CANCEL_OPTION);
//                s = checkingFormat.checkingFormat(s);
//                weather.weather(s);
//                JOptionPane.showMessageDialog(null, weather.weather(s), "Weather", JOptionPane.INFORMATION_MESSAGE);
//            }
//        });
//
//
//    }
}

}
