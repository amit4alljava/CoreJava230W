import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Demo2 extends JFrame {
	private JTextField textField;
	private boolean isXOrZero = false;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					Demo2 frame = new Demo2();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public Demo2() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				Demo2.this.setVisible(false);
				Demo2.this.dispose();
			}
		});
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 18));
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCancel.setText("Hello");
				textField.setText("Hi");
			}
		});
		btnOk.setForeground(Color.RED);
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnOk.setBounds(66, 210, 89, 23);
		getContentPane().add(btnOk);
		
		
		btnCancel.setBounds(216, 209, 161, 23);
		getContentPane().add(btnCancel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(56, 145, 200, 50);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton one = new JButton("");
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			xorZero(one);
			}
		});
		one.setFont(new Font("Tahoma", Font.BOLD, 18));
		one.setBounds(20, 28, 119, 50);
		getContentPane().add(one);
		
		JButton two = new JButton("");
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xorZero(two);
			}
		});
		two.setFont(new Font("Tahoma", Font.BOLD, 18));
		two.setBounds(163, 28, 119, 50);
		getContentPane().add(two);
		
		JButton three = new JButton("");
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xorZero(three);
			}
		});
		three.setFont(new Font("Tahoma", Font.BOLD, 18));
		three.setBounds(305, 28, 119, 50);
		getContentPane().add(three);
	}
	void xorZero(JButton b1){
		if(b1.getText().trim().length()==0){
		if(isXOrZero){
			b1.setText("0");
		}
		else
		{
			b1.setText("X");
		}
		isXOrZero= !isXOrZero;
		}
	}
	
}
