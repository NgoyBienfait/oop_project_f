package org.iuea.oop;



import java.awt.EventQueue;
import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import javax.swing.border.EmptyBorder;

import views.Menu;
/*AKILI SIMPLICE 18/158/BIT-J
 * ALINGI PEPE 18/527/BSCS-J
 * NGOY KIAKU BIENFAIT 18/265/BSCS-J
 */

public class login extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login Systems");
		lblNewLabel.setBounds(186, 11, 92, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(30, 80, 69, 27);
		contentPane.add(lblUsername);
		
		JLabel lblpassword = new JLabel("Password");
		lblpassword.setBounds(30, 155, 69, 22);
		contentPane.add(lblpassword);
		
		JTextField txtUsername = new JTextField();
		txtUsername.setBounds(186, 77, 166, 30);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		JPasswordField txtPassword = new JPasswordField();
		txtPassword.setBounds(186, 151, 166, 30);
		contentPane.add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String password = txtPassword.getText();
				String username = txtUsername.getText();
				
				if(password.contains("two") && username.contains("one")) {
					JOptionPane.showMessageDialog(null, "you are successfuly logged in", "Login Error", JOptionPane.INFORMATION_MESSAGE);
					
					/**view2 window= new view2();
					view2.main(null);**/
					txtPassword.setText(null);
					txtPassword.setText(null);
					
					/**view v = new view();
					view.main(null);
//					Menu.main(null);
					/**Menu.setVisible(true);*/
								
		}
				else {
					JOptionPane.showMessageDialog(null, "Username and Password does not match what is expected", "Login Error", JOptionPane.ERROR_MESSAGE);
					txtPassword.setText(null);
					txtPassword.setText(null);
				}
			}
		});
		btnLogin.setBounds(95, 215, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnReset = new JButton("Cancel");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtUsername.setText(null);
				txtPassword.setText(null);
			}
		});
		btnReset.setBounds(352, 215, 89, 23);
		contentPane.add(btnReset);
		
		
	}
}
