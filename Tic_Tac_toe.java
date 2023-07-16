import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Tic_Tac_toe extends JFrame implements ActionListener{
    int count=0;
    Boolean Win;
    int i=0;
    TextField T1,T2;
    JLabel l1,l2;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    Tic_Tac_toe(){
        // l1 = new JLabel("Person1:");
        // l1.setBounds(100,60,60,40);
        // l2 = new JLabel("Person2: ");
        // l2.setBounds(300,60,60,40);
        b1 = new JButton();
        b1.setBounds(100,100,100,100);
        b2 = new JButton();
        b2.setBounds(200,100,100,100);
        b3 = new JButton();
        b3.setBounds(300,100,100,100);
        b4 = new JButton();
        b4.setBounds(100,200,100,100);
        b5 = new JButton();
        b5.setBounds(200,200,100,100);
        b6 = new JButton();
        b6.setBounds(300,200,100,100);
        b7 = new JButton();
        b7.setBounds(100,300,100,100);
        b8 = new JButton();
        b8.setBounds(200,300,100,100);
        b9 = new JButton();
        b9.setBounds(300,300,100,100);
        b10 = new JButton("Reset");
        b10.setBounds(200,420,100,60);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);

        // add(l1);
        // add(l2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
        setSize(600, 560);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        count++;
        String Str = "";
        if(count % 2 == 1){
            Str ="X";
        }
        else{
            Str ="O";
        }

        if(e.getSource() == b1){
            b1.setText(Str);
            b1.setEnabled(false);
        }
        else if(e.getSource() == b2){
            b2.setText(Str);
            b2.setEnabled(false);
        }
        else if(e.getSource() == b3){
            b3.setText(Str);
            b3.setEnabled(false);
        }
        else if(e.getSource() == b4){
            b4.setText(Str);
            b4.setEnabled(false);
        }

        else if(e.getSource() == b5){
            b5.setText(Str);
            b5.setEnabled(false);
        }
        else if(e.getSource() == b6){
            b6.setText(Str);
            b6.setEnabled(false);
        }
        else if(e.getSource() == b7){
            b7.setText(Str);
            b7.setEnabled(false);
        }

        else if(e.getSource() == b8){
            b8.setText(Str);
            b8.setEnabled(false);
        }
        else if(e.getSource() == b9){
            b9.setText(Str);
            b9.setEnabled(false);
        }
        else if(e.getSource() == b10){
            reset();
        } 
        Winner();
    }
    public void reset(){
        count = 0;
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            b5.setEnabled(true);
            b6.setEnabled(true);
            b7.setEnabled(true);
            b8.setEnabled(true);
            b9.setEnabled(true);
            Win = false;
    }
    
        public void Winner(){
        //For Person1 to Win
        if(b1.getText() =="X" && b2.getText() =="X" && b3.getText() == "X"){
            Win = true;
            JOptionPane.showMessageDialog(this,"Person1 Won");
        }
        else if(b4.getText() =="X" && b5.getText() =="X" && b6.getText() == "X"){
            Win = true;
            JOptionPane.showMessageDialog(this,"Person1 Won");
        }
        else if(b7.getText() =="X" && b8.getText() =="X" && b7.getText() == "X"){
            Win = true;
            JOptionPane.showMessageDialog(this,"Person1 Won");
        }
        else if(b1.getText() =="X" && b4.getText() =="X" && b7.getText() == "X"){
            Win = true;
            JOptionPane.showMessageDialog(this,"Person1 Won");
        }
        else if(b2.getText() =="X" && b5.getText() =="X" && b8.getText() == "X"){
            Win = true;
            JOptionPane.showMessageDialog(this,"Person1 Won");
        }
        else if(b3.getText() =="X" && b6.getText() =="X" && b9.getText() == "X"){
            Win = true;
            JOptionPane.showMessageDialog(this,"Person1 Won");
        }
        else if(b1.getText() =="X" && b5.getText() =="X" && b9.getText() == "X"){
            Win = true;
            JOptionPane.showMessageDialog(this,"Person1 Won");
        }
        else if(b3.getText() =="X" && b5.getText() =="X" && b7.getText() == "X"){
            Win = true;
            JOptionPane.showMessageDialog(this,"Person1 Won");
        }


        //Person2 Won
        if(b1.getText() =="O" && b2.getText() =="O" && b3.getText() == "O"){
            Win = true;
            JOptionPane.showMessageDialog(this,"Person2 Won");
        }
        else if(b4.getText() =="O" && b5.getText() =="O" && b6.getText() == "O"){
            Win = true;
            JOptionPane.showMessageDialog(this,"Person2 Won");
        }
        else if(b7.getText() =="O" && b8.getText() =="O" && b7.getText() == "O"){
            Win = true;
            JOptionPane.showMessageDialog(this,"Person2 Won");
        }
        else if(b1.getText() =="O" && b4.getText() =="O" && b7.getText() == "O"){
            Win = true;
            JOptionPane.showMessageDialog(this,"Person2 Won");
        }
        else if(b2.getText() =="O" && b5.getText() =="O" && b8.getText() == "O"){
            Win = true;
            JOptionPane.showMessageDialog(this,"Person2 Won");
        }
        else if(b3.getText() =="O" && b6.getText() =="O" && b9.getText() == "O"){
            Win = true;
            JOptionPane.showMessageDialog(this,"Person2 Won");
        }
        else if(b1.getText() =="O" && b5.getText() =="O" && b9.getText() == "O"){
            Win = true;
            JOptionPane.showMessageDialog(this,"Person2 Won");
        }
        else if(b3.getText() =="O" && b5.getText() =="O" && b7.getText() == "O"){
            Win = true;
            JOptionPane.showMessageDialog(this,"Person2 Won");
        }
        else{
            Win= false;
        }

        if (Win) {
            reset();
         } else if (!Win && count == 9) {
            JOptionPane.showMessageDialog(this,"Draw");
            }
        

    }



    public static void main(String[] args) {
        new Tic_Tac_toe();
    }
}
