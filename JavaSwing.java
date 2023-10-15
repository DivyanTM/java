package swingTest;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JavaSwing {
         JavaSwing(){
        	 Image icon =Toolkit.getDefaultToolkit().getImage("C:/Users/91701/Pictures/court.jpg");
        	 
        	 JFrame f=new JFrame("RESULT PAGE");
        	 f.setSize(500,500);
        	 JLabel l=new JLabel("REGISTER NUMBER :");
        	 JTextField tf=new JTextField();
        	 tf.setToolTipText("reg.no here");
        	 tf.setBounds(150,35,200,20);
        	 JButton b=new JButton("check");
        	 b.setBounds(200, 90, 80, 30);
        	 f.add(b);
        	 f.setIconImage(icon);
        	 f.add(tf);
        	 f.add(l);
        	 l.setBounds(20, 20, 150, 50);
        	 f.setLayout(null);
        	 f.setVisible(true);
        	 b.addActionListener(new ActionListener() {
        		 public void actionPerformed(ActionEvent e) {
        			if(tf.getText().equals("8208E22ITR012")) {
        				 b.setVisible(false);
            			 tf.setVisible(false);
            			 l.setText("FAIL "
            			 		+ " FAIL"
            			 		+ " FAIL");
        			}else {
System.out.println("wrong register number");
        			}
        		 }
        	 });
         }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          new JavaSwing();
	}


}
