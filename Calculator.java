import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.*;
public class Calculator extends JFrame implements ActionListener{
    JTextField T1;
    JLabel l1;
    int z = 0;
    String result="",expression="";
	ArrayList<String> token=new ArrayList<String>();
	
	boolean num=false;  
	boolean dot=false;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,
    b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30;
    String str="";
    Calculator(){

        T1 = new JTextField();
        T1.setBounds(30,20,410,50);
        l1 = new JLabel();
        l1.setBounds(30,75,410,55);
        b11 = new JButton("2^x");
        b11.setBounds(30,150,60,30);
        b12 = new JButton("sin");
        b12.setBounds(100,150,60,30);
        b13 = new JButton("C");
        b13.setBounds(170,150,60,30);
        b14 = new JButton("()");
        b14.setBounds(240,150,60,30);
        b15 = new JButton("%");
        b15.setBounds(310,150,60,30);
        b16 = new JButton("/");
        b16.setBounds(380,150,60,30);


        b17 = new JButton("sin");
        b17.setBounds(30,190,60,30);
        b18 = new JButton("cos");
        b18.setBounds(100,190,60,30);
        b7 = new JButton("7");
        b7.setBounds(170,190,60,30);
        b8 = new JButton("8");
        b8.setBounds(240,190,60,30);
        b9 = new JButton("9");
        b9.setBounds(310,190,60,30);
        b19 = new JButton("X");
        b19.setBounds(380,190,60,30);

        b20 = new JButton("tan");
        b20.setBounds(30,230,60,30);
        b21 = new JButton("cosec");
        b21.setBounds(100,230,60,30);
        b4 = new JButton("4");
        b4.setBounds(170,230,60,30);
        b5 = new JButton("5");
        b5.setBounds(240,230,60,30);
        b6 = new JButton("6");
        b6.setBounds(310,230,60,30);
        b22 = new JButton("-");
        b22.setBounds(380,230,60,30);


        b23 = new JButton("sec");
        b23.setBounds(30,270,60,30);
        b24 = new JButton("cot");
        b24.setBounds(100,270,60,30);
        b1 = new JButton("1");
        b1.setBounds(170,270,60,30);
        b2 = new JButton("2");
        b2.setBounds(240,270,60,30);
        b3 = new JButton("3");
        b3.setBounds(310,270,60,30);
        b25 = new JButton("+");
        b25.setBounds(380,270,60,30);


        b26 = new JButton("log");
        b26.setBounds(30,310,60,30);
        b27 = new JButton("ln");
        b27.setBounds(100,310,60,30);
        b28 = new JButton("e^x");
        b28.setBounds(170,310,60,30);
        b29 = new JButton("+/-");
        b29.setBounds(240,310,60,30);
        b10 = new JButton("0");
        b10.setBounds(310,310,60,30);
        b30 = new JButton("=");
        b30.setBounds(380,310,60,30);





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
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);
        b25.addActionListener(this);
        b26.addActionListener(this);
        b27.addActionListener(this);
        b28.addActionListener(this);
        b29.addActionListener(this);
        b30.addActionListener(this);


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
        add(b11);
        add(b12);
        add(b13);
        add(b14);
        add(b15);
        add(b16);
        add(b17);
        add(b18);
        add(b19);
        add(b20);
        add(b21);
        add(b22);
        add(b23);
        add(b24);
        add(b25);
        add(b26);
        add(b27);
        add(b28);
        add(b29);
        add(b30);
        add(T1);
        add(l1);

        setSize(510, 390);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if (s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") || s.equals("5") || s.equals("6")
                || s.equals("7") || s.equals("8") || s.equals("9") || s.equals("0")) {
            expression += s;
            T1.setText(expression);
        } else if (s.equals("+") || s.equals("-") || s.equals("X") || s.equals("/") || s.equals("%")) {
            expression += " " + s + " ";
            T1.setText(expression);
        } else if (s.equals("=")) {
            evaluateExpression();
        } else if (s.equals("C")) {
            clearExpression();
        } else if (s.equals("()")) {
            expression += "(";
            T1.setText(expression);
        } else if (s.equals("+/-")) {
            negateExpression();
        } else if (s.equals(".")) {
            expression += ".";
            T1.setText(expression);
        } else if (s.equals("sin")) {
            double num = Double.parseDouble(T1.getText());
            double result = Math.sin(Math.toRadians(num));
            T1.setText(Double.toString(result));
            expression = Double.toString(result);
        } else if (s.equals("cos")) {
            double num = Double.parseDouble(T1.getText());
            double result = Math.cos(Math.toRadians(num));
            T1.setText(Double.toString(result));
            expression = Double.toString(result);
        } else if (s.equals("tan")) {
            double num = Double.parseDouble(T1.getText());
            double result = Math.tan(Math.toRadians(num));
            T1.setText(Double.toString(result));
            expression = Double.toString(result);
        } else if (s.equals("cosec")) {
            double num = Double.parseDouble(T1.getText());
            double result = 1 / Math.sin(Math.toRadians(num));
            T1.setText(Double.toString(result));
            expression = Double.toString(result);
        } else if (s.equals("sec")) {
            double num = Double.parseDouble(T1.getText());
            double result = 1 / Math.cos(Math.toRadians(num));
            T1.setText(Double.toString(result));
            expression = Double.toString(result);
        } else if (s.equals("cot")) {
            double num = Double.parseDouble(T1.getText());
            double result = 1 / Math.tan(Math.toRadians(num));
            T1.setText(Double.toString(result));
            expression = Double.toString(result);
        } else if (s.equals("2^x")) {
            double num = Double.parseDouble(T1.getText());
            double result = Math.pow(2, num);
            T1.setText(Double.toString(result));
            expression = Double.toString(result);
        } else if (s.equals("log")) {
            double num = Double.parseDouble(T1.getText());
            double result = Math.log10(num);
            T1.setText(Double.toString(result));
            expression = Double.toString(result);
        } else if (s.equals("ln")) {
            double num = Double.parseDouble(T1.getText());
            double result = Math.log(num);
            T1.setText(Double.toString(result));
            expression = Double.toString(result);
        } else if (s.equals("e^x")) {
            double num = Double.parseDouble(T1.getText());
            double result = Math.exp(num);
            T1.setText(Double.toString(result));
            expression = Double.toString(result);
        }
    }

    private void evaluateExpression() {
        try {
            String[] tokens = expression.split(" ");
            Stack<Double> values = new Stack<>();
            Stack<String> operators = new Stack<>();

            for (String token : tokens) {
                if (isNumber(token)) {
                    values.push(Double.parseDouble(token));
                } else if (isOperator(token)) {
                    while (!operators.isEmpty() && hasPrecedence(token, operators.peek())) {
                        double result = applyOperator(operators.pop(), values.pop(), values.pop());
                        values.push(result);
                    }
                    operators.push(token);
                } else if (token.equals("(")) {
                    operators.push(token);
                } else if (token.equals(")")) {
                    while (!operators.peek().equals("(")) {
                        double result = applyOperator(operators.pop(), values.pop(), values.pop());
                        values.push(result);
                    }
                    operators.pop(); // Discard the "("
                }
            }

            while (!operators.isEmpty()) {
                double result = applyOperator(operators.pop(), values.pop(), values.pop());
                values.push(result);
            }

            result = Double.toString(values.pop());
            T1.setText(result);
            expression = result;
        } catch (Exception ex) {
            T1.setText("Error");
        }
    }

    private boolean isNumber(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("X") || token.equals("/") || token.equals("%");
    }

    private boolean hasPrecedence(String op1, String op2) {
        return (op2.equals("+") || op2.equals("-")) && !op1.equals("(");
    }

    private double applyOperator(String operator, double operand2, double operand1) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "X":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            case "%":
                return operand1 % operand2;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }

    private void clearExpression() {
        T1.setText("");
        expression = "";
    }

    private void negateExpression() {
        if (expression.startsWith("-")) {
            expression = expression.substring(1);
        } else {
            expression = "-" + expression;
        }
        T1.setText(expression);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
