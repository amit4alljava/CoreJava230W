import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Demo1 extends JFrame { // implements ActionListener {
	JButton b1  = new JButton("Ok");
	JButton b2  = new JButton("Cancel");
	
	Demo1(){
		setSize(300, 300);
		setLocation(200, 200);
		getContentPane().setLayout(null);
		b1.setBounds(20, 20, 70, 50);
		b2.setBounds(100, 20, 70, 50);
		// register the listener with button
		/*b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(Demo1.this, "U Click On Ok, Hello User");
				
			}
		});*/
		b1.addActionListener((e)->JOptionPane.showMessageDialog(Demo1.this, "U Click on Ok , Hello User"));
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(Demo1.this, "U Click On Cancel, Welcome User");
				
			}
		});
		//getContentPane().setLayout(new FlowLayout());
		getContentPane().add(b1);
		getContentPane().add(b2);
		//getContentPane().add(b1,BorderLayout.NORTH);
		//getContentPane().add(b2,BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		Demo1 obj= new Demo1();
		obj.setVisible(true);

	}
	
	/*public void actionPerformed(ActionEvent e){
		String msg = "";
		if(e.getActionCommand().equalsIgnoreCase("ok")){
			msg = "Hello User";
		}
		else
		{
			msg = "Welcome User";
		}
		JOptionPane.showMessageDialog(this, msg);
	}*/

}
