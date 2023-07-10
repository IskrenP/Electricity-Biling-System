package LoginPlusMainPage;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MainPage extends JPanel implements ActionListener{

    JPanel panel;
    JLabel user_payment, user_details, message;
    JTextField user_pmethod;
    JPasswordField user_card;
    JButton pay, cancel;
    MainPage() {

        user_payment = new JLabel();
        String[] optionsToChoose = {"Apple", "Visa", "MasterCard", "PayPal", "None of the listed"};
        String paymentMethod = (String) JOptionPane.showInputDialog(
                null,
                "What pay method do you prefer?",
                "Choose payment",
                JOptionPane.QUESTION_MESSAGE,
                null,
                optionsToChoose,
                optionsToChoose[3]);




        user_payment.setText("User Name :");



        userName_text = new JTextField();
        
        password_label = new JLabel();
        password_label.setText("Card Number :");
        password_label.setText("CVC :");
        password_label.setText("Billing Addres :");
        password_text = new JPasswordField();

        submit = new JButton("SUBMIT");
        panel = new JPanel(new GridLayout(3, 1));
        panel.add(user_label);
        panel.add(userName_text);
        panel.add(password_label);
        panel.add(password_text);
        message = new JLabel();
        panel.add(message);
        panel.add(submit);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        submit.addActionListener(this);
        add(panel, BorderLayout.CENTER);
        setTitle("EBL Sofia City");
        setSize(450,250);
        setVisible(true);
    }


}