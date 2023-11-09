import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

public class Calculator implements ActionListener{
    JFrame f= new JFrame("Calculator");
    JLabel l= new JLabel();
    JButton one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve,thirteen,fourteen,fifteen,sixteen;
    JButton b[]= new JButton[16];
    JPanel p= new JPanel();
    Calculator()
    {
        f.setSize(600,600);
        f.setVisible(true);
        f.setLayout(null);

        one=new JButton("7");
        two=new JButton("8");
        three=new JButton("9");
        four=new JButton("/");
        five=new JButton("4");
        six=new JButton("5");
        seven=new JButton("6");
        eight=new JButton("x");
        nine=new JButton("1");
        ten=new JButton("2");
        eleven=new JButton("3");
        twelve=new JButton("-");
        thirteen=new JButton("0");
        fourteen=new JButton(".");
        fifteen=new JButton("=");
        sixteen=new JButton("+");

        b[1]=one;
        b[2]=two;
        b[3]=three;
        b[4]=four;
        b[5]=five;
        b[6]=six;
        b[7]=seven;
        b[8]=eight;
        b[9]=nine;
        b[10]=ten;
        b[11]=eleven;
        b[12]=twelve;
        b[13]=thirteen;
        b[14]=fourteen;
        b[15]=fifteen;
        b[16]=sixteen;

        Border border = BorderFactory.createLineBorder(Color.green.brighter());

        l.setBounds(50,100,300,60);

        p.setLayout(new GridLayout(4,4,2,2));
        p.setBackground(Color.lightGray);
        p.setBounds(50,170,300,300);

        for (int i = 0; i < 16; i++) {
            b[i].setBackground(Color.black.darker());
            b[i].setForeground(Color.white.brighter());
            b[i].setFocusable(false);
            b[i].addActionListener(this);
            p.add(b[i]);
        }

        f.add(p);
        f.add(l);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
