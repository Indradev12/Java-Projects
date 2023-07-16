import javax.swing.*;
import javax.swing.filechooser.FileSystemView;

import java.awt.Font;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Text_editor extends JFrame implements ActionListener{
    
    JMenuBar mb;
    JMenu menue,menue1;
    JMenuItem m1,m2,m3,m4,m5,m6,m7,m8;
    JTextArea A1;
    Text_editor(){
        mb = new JMenuBar();
        menue = new JMenu("Edit");
        menue1 = new JMenu("File");
        m1 = new JMenuItem("Cut");
        m2 = new JMenuItem("Copy");
        m3 = new JMenuItem("Select All");
        m4 = new JMenuItem("Paste");
        m5 = new JMenuItem("Open");
        m6 = new JMenuItem("Save");
        m7 = new JMenuItem("Print");
        m8 = new JMenuItem("Close");
        A1 = new JTextArea();
        A1.setBounds(0,0,800,1000);
        A1.setFont(new Font("Times Roman",Font.PLAIN,22));
        add(A1);
        mb.add(menue);
        mb.add(menue1);
        menue.add(m1);
        menue.add(m2);
        menue.add(m3);
        menue.add(m4);
        menue1.add(m5);
        menue1.add(m6);
        menue1.add(m7);
        menue1.add(m8);
        setJMenuBar(mb);  
        setSize(800,1000);  
        setLayout(null);  
        setVisible(true);  
        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);
        m4.addActionListener(this);
        m5.addActionListener(this);
        m6.addActionListener(this);
        m7.addActionListener(this);
        m8.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();
        if(e.getSource() == m1){
            A1.cut();
        }
        else if(e.getSource() == m2){
            A1.copy();
        }
        else if(e.getSource() == m3){
            A1.selectAll();
        }
        else if(e.getSource() == m4){
            A1.paste();
        }
        else if (e.getSource() == m5) {
            JFileChooser jf = new JFileChooser("f:");
            int r = jf.showOpenDialog(null);
            if (r == JFileChooser.APPROVE_OPTION) {
                File fi = new File(jf.getSelectedFile().getAbsolutePath());
 
                try {
                    String s1 = "", sl = "";
                    FileReader fr = new FileReader(fi);
                    BufferedReader br = new BufferedReader(fr);
                    sl = br.readLine();
                    while ((s1 = br.readLine()) != null) {
                        sl = sl + "\n" + s1;
                    }
                    A1.setText(sl);
                    fr.close();
                    br.close();
                }
                catch (Exception evt) {
                    JOptionPane.showMessageDialog(this,"File can't be created");
                }
            }
        }
        else if (e.getSource() == m6) {
            JFileChooser jf = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
            int r = jf.showSaveDialog(null);
            if (r == JFileChooser.APPROVE_OPTION) {
                File fi = new File(jf.getSelectedFile().getAbsolutePath());
    
                try {
                    FileWriter fw = new FileWriter(fi);
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(A1.getText());
                    bw.close();
                    fw.close();
                } catch (Exception evt) {
                    JOptionPane.showMessageDialog(this, "File can't be saved");
                }
            }
        } 
        else if (e.getSource() == m7) {
            try {
                A1.print();
            } catch (Exception evt) {
                JOptionPane.showMessageDialog(this, "Error occurred while printing");
            }
        } 
        else if (e.getSource() == m8) {
            System.exit(0);
        }
    }
        

    public static void main(String[] args) {
        new Text_editor();
    }
}
