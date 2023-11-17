package Code;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16,
            btn17, btn18;
    JTextField leb;
    double n1, n2, n3, n1len;
    String lx, opr = "";

    Calculator() {
        setLayout(null);
        setBounds(500, 75, 400, 600);
        getContentPane().setBackground(Color.gray);
        setTitle("Calculator By: Vishal ( MADARA )");

        JLabel text = new JLabel("Note:- Try and Share your feedback..!!");
        text.setBounds(20, 30, 340, 30);
        text.setForeground(Color.RED);
        text.setFont(new Font("Tahaoma", Font.BOLD, 15));
        add(text);

        JLabel text2 = new JLabel("              If you have any idea you can share it too..!!");
        text2.setBounds(20, 50, 340, 30);
        text2.setForeground(Color.YELLOW);
        text2.setFont(new Font("Tahaoma", Font.BOLD, 12));
        add(text2);

        btn0 = new JButton("0");
        btn0.setBounds(20, 500, 160, 40);
        btn0.setBackground(Color.BLACK);
        btn0.setForeground(Color.white);
        btn0.addActionListener(this);
        add(btn0);

        btn1 = new JButton("1");
        btn1.setBounds(20, 450, 70, 40);
        btn1.setBackground(Color.BLACK);
        btn1.setForeground(Color.white);
        btn1.addActionListener(this);
        add(btn1);

        btn2 = new JButton("2");
        btn2.setBounds(110, 450, 70, 40);
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.white);
        btn2.addActionListener(this);
        add(btn2);

        btn3 = new JButton("3");
        btn3.setBounds(200, 450, 70, 40);
        btn3.setBackground(Color.BLACK);
        btn3.setForeground(Color.white);
        btn3.addActionListener(this);
        add(btn3);

        btn4 = new JButton("4");
        btn4.setBounds(20, 400, 70, 40);
        btn4.setBackground(Color.BLACK);
        btn4.setForeground(Color.white);
        btn4.addActionListener(this);
        add(btn4);

        btn5 = new JButton("5");
        btn5.setBounds(110, 400, 70, 40);
        btn5.setBackground(Color.BLACK);
        btn5.setForeground(Color.white);
        btn5.addActionListener(this);
        add(btn5);

        btn6 = new JButton("6");
        btn6.setBounds(200, 400, 70, 40);
        btn6.setBackground(Color.BLACK);
        btn6.setForeground(Color.white);
        btn6.addActionListener(this);
        add(btn6);

        btn7 = new JButton("7");
        btn7.setBounds(20, 350, 70, 40);
        btn7.setBackground(Color.BLACK);
        btn7.setForeground(Color.white);
        btn7.addActionListener(this);
        add(btn7);

        btn8 = new JButton("8");
        btn8.setBounds(110, 350, 70, 40);
        btn8.setBackground(Color.BLACK);
        btn8.setForeground(Color.white);
        btn8.addActionListener(this);
        add(btn8);

        btn9 = new JButton("9");
        btn9.setBounds(200, 350, 70, 40);
        btn9.setBackground(Color.BLACK);
        btn9.setForeground(Color.white);
        btn9.addActionListener(this);
        add(btn9);

        btn10 = new JButton("=");
        btn10.setFont(new Font("Raleway", Font.BOLD, 15));
        btn10.setBounds(290, 450, 70, 90);
        btn10.setBackground(Color.BLACK);
        btn10.setForeground(Color.white);
        btn10.addActionListener(this);
        add(btn10);

        btn11 = new JButton("+");
        btn11.setFont(new Font("Raleway", Font.BOLD, 15));
        btn11.setBounds(290, 350, 70, 90);
        btn11.setBackground(Color.BLACK);
        btn11.setForeground(Color.white);
        btn11.addActionListener(this);
        add(btn11);

        btn12 = new JButton(".");
        btn12.setFont(new Font("Raleway", Font.BOLD, 15));
        btn12.setBounds(200, 500, 70, 40);
        btn12.setBackground(Color.BLACK);
        btn12.setForeground(Color.white);
        btn12.addActionListener(this);
        add(btn12);

        btn13 = new JButton("x");
        btn13.setFont(new Font("Raleway", Font.BOLD, 15));
        btn13.setBounds(20, 300, 70, 40);
        btn13.setBackground(Color.BLACK);
        btn13.setForeground(Color.white);
        btn13.addActionListener(this);
        add(btn13);

        btn14 = new JButton("/");
        btn14.setFont(new Font("Raleway", Font.BOLD, 15));
        btn14.setBounds(110, 300, 70, 40);
        btn14.setBackground(Color.BLACK);
        btn14.setForeground(Color.white);
        btn14.addActionListener(this);
        add(btn14);

        btn15 = new JButton("-");
        btn15.setFont(new Font("Raleway", Font.BOLD, 15));
        btn15.setBounds(200, 300, 70, 40);
        btn15.setBackground(Color.BLACK);
        btn15.setForeground(Color.white);
        btn15.addActionListener(this);
        add(btn15);

        btn16 = new JButton("%");
        btn16.setFont(new Font("Raleway", Font.BOLD, 15));
        btn16.setBounds(290, 300, 70, 40);
        btn16.setBackground(Color.BLACK);
        btn16.setForeground(Color.white);
        btn16.addActionListener(this);
        add(btn16);

        btn17 = new JButton("CE");
        btn17.setFont(new Font("Raleway", Font.BOLD, 13));
        btn17.setBounds(20, 250, 160, 40);
        btn17.setBackground(Color.BLACK);
        btn17.setForeground(Color.white);
        btn17.addActionListener(this);
        add(btn17);

        btn18 = new JButton("AC");
        btn18.setFont(new Font("Raleway", Font.BOLD, 13));
        btn18.setBounds(200, 250, 160, 40);
        btn18.setBackground(Color.BLACK);
        btn18.setForeground(Color.white);
        btn18.addActionListener(this);
        add(btn18);

        leb = new JTextField("");
        leb.setBackground(Color.white);
        leb.setFont(new Font("Tahoma", Font.BOLD, 15));
        leb.setHorizontalAlignment(JTextField.RIGHT);
        leb.setBounds(18, 150, 337, 50);
        add(leb);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn0) {
            String str = leb.getText();
            str = str + "0";
            leb.setText(str);
        } else if (e.getSource() == btn1) {
            String str = leb.getText();
            str += "1";
            leb.setText(str);
        } else if (e.getSource() == btn2) {
            String str = leb.getText();
            str += "2";
            leb.setText(str);
        } else if (e.getSource() == btn3) {
            String str = leb.getText();
            str += "3";
            leb.setText(str);
        } else if (e.getSource() == btn4) {
            String str = leb.getText();
            str += "4";
            leb.setText(str);
        } else if (e.getSource() == btn5) {
            String str = leb.getText();
            str += "5";
            leb.setText(str);
        } else if (e.getSource() == btn6) {
            String str = leb.getText();
            str += "6";
            leb.setText(str);
        } else if (e.getSource() == btn7) {
            String str = leb.getText();
            str += "7";
            leb.setText(str);
        } else if (e.getSource() == btn8) {
            String str = leb.getText();
            str += "8";
            leb.setText(str);
        } else if (e.getSource() == btn9) {
            String str = leb.getText();
            str += "9";
            leb.setText(str);
        } else if (e.getSource() == btn11 && opr == "") {
            String str = leb.getText();
            n1len = str.length();
            n1 = Double.parseDouble(str);
            opr = " + ";
            lx = str + opr;
            leb.setText(lx);
        } else if (e.getSource() == btn13 && opr == "") {
            String str = leb.getText();
            n1len = str.length();
            n1 = Double.parseDouble(str);
            opr = " x ";
            lx = str + opr;
            leb.setText(lx);
        } else if (e.getSource() == btn14 && opr == "") {
            String str = leb.getText();
            n1len = str.length();
            n1 = Double.parseDouble(str);
            opr = " / ";
            lx = str + opr;
            leb.setText(lx);
        } else if (e.getSource() == btn15 && opr == "") {
            String str = leb.getText();
            n1len = str.length();
            n1 = Double.parseDouble(str);
            opr = " - ";
            lx = str + opr;
            leb.setText(lx);
        } else if (e.getSource() == btn16 && opr == "") {
            String str = leb.getText();
            n1len = str.length();
            n1 = Double.parseDouble(str);
            opr = " % ";
            lx = str + opr;
            leb.setText(lx);
        } else if (e.getSource() == btn10) {
            String str = leb.getText();
            if (opr != "") {
                n2 = Double.parseDouble(str.substring(lx.length(), str.length()));
                opr = opr.trim();
                if (opr.equals("+")) {
                    n3 = n1 + n2;
                } else if (opr.equals("x")) {
                    n3 = n1 * n2;
                } else if (opr.equals("-")) {
                    n3 = n1 - n2;
                } else if (opr.equals("/")) {
                    n3 = n1 / n2;
                } else if (opr.equals("%")) {
                    n3 = n1 % n2;
                } else {
                    leb.setText("INVALID INPUT");
                }
                leb.setText("" + n3);
                opr = "";
            } else {
                leb.setText(str);
            }
        } else if (e.getSource() == btn17) {
            String str, nx;
            str = nx = leb.getText().trim();
            if (nx.charAt(nx.length() - 1) == opr.charAt(1)) {
                opr = "";
            }
            str = str.substring(0, str.length() - 1).trim();
            leb.setText(str);
        } else if (e.getSource() == btn18) {
            leb.setText("");
            opr = "";
        } else if (e.getSource() == btn12) {
            String str = leb.getText().trim();
            char ch = str.charAt(str.length() - 1);
            if (ch != '+' && ch != '-' && ch != 'x' && ch != '/' && ch != '%') {
                str = str + ".";
                leb.setText(str);
            } else {
                leb.setText("MATHEMATICAL ERROR");
            }
        } else {
            leb.setText("MATHEMATICAL ERROR");
            opr = "";
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }

}


/*                              THE END                                */