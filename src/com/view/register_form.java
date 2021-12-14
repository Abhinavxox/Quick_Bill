package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import com.model.admin;
import com.service.adminService;
import com.service.adminSeriviceImpl;
import com.service.adminSeriviceImpl;
import com.service.adminService;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.awt.event.ActionEvent;

public class register_form extends JFrame {

	private JPanel contentPane;
	private JLabel lblRegister;
	private JButton btnNewButton;
	private JSeparator separator;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_2_1;
	private JLabel lblNewLabel_2_2;
	private JLabel lblNewLabel_2_3;
	private JLabel lblNewLabel_2_4;
	private JLabel lblNewLabel_2_5;
	private JLabel lblNewLabel_2_6;
	private JTextField fnametxt;
	private JTextField lnametxt;
	private JTextField usernametxt;
	private JTextField addresstxt;
	private JPasswordField newpasstxt;
	private JPasswordField confirmpasstxt;
	private JDateChooser dateChooser;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					register_form frame = new register_form();
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
	public register_form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(69, 69, 69));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblRegister());
		contentPane.add(getBtnNewButton());
		contentPane.add(getSeparator());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_2_1_1());
		contentPane.add(getLblNewLabel_2_2_1());
		contentPane.add(getLblNewLabel_2_3_1());
		contentPane.add(getLblNewLabel_2_4_3());
		contentPane.add(getLblNewLabel_2_5());
		contentPane.add(getLblNewLabel_2_6());
		contentPane.add(getFnametxt());
		contentPane.add(getLnametxt());
		contentPane.add(getUsernametxt());
		contentPane.add(getAddresstxt());
		contentPane.add(getNewpasstxt());
		contentPane.add(getConfirmpasstxt());
		contentPane.add(getDateChooser());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getLblNewLabel_3());
	}

	private JLabel getLblRegister() {
		if (lblRegister == null) {
			lblRegister = new JLabel("Register");
			lblRegister.setHorizontalAlignment(SwingConstants.CENTER);
			lblRegister.setForeground(Color.WHITE);
			lblRegister.setFont(new Font("Roboto Medium", Font.PLAIN, 40));
			lblRegister.setBounds(0, -2, 260, 71);
		}
		return lblRegister;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Back");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new index().setVisible(true);
					dispose();
				}
			});
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.setFont(new Font("Roboto Medium", Font.PLAIN, 30));
			btnNewButton.setBackground(Color.LIGHT_GRAY);
			btnNewButton.setBounds(610, 11, 168, 49);
		}
		return btnNewButton;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(10, 80, 768, 2);
		}
		return separator;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("First Name :");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2.setForeground(Color.WHITE);
			lblNewLabel_2.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2.setBounds(142, 96, 205, 33);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_2_1_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("Last Name :");
			lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2_1.setForeground(Color.WHITE);
			lblNewLabel_2_1.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2_1.setBounds(142, 140, 205, 33);
		}
		return lblNewLabel_2_1;
	}
	private JLabel getLblNewLabel_2_2_1() {
		if (lblNewLabel_2_2 == null) {
			lblNewLabel_2_2 = new JLabel("New Password :");
			lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2_2.setForeground(Color.WHITE);
			lblNewLabel_2_2.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2_2.setBounds(142, 228, 205, 33);
		}
		return lblNewLabel_2_2;
	}
	private JLabel getLblNewLabel_2_3_1() {
		if (lblNewLabel_2_3 == null) {
			lblNewLabel_2_3 = new JLabel("Confirm Password :");
			lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2_3.setForeground(Color.WHITE);
			lblNewLabel_2_3.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2_3.setBounds(142, 272, 205, 33);
		}
		return lblNewLabel_2_3;
	}
	private JLabel getLblNewLabel_2_4_3() {
		if (lblNewLabel_2_4 == null) {
			lblNewLabel_2_4 = new JLabel("Username :");
			lblNewLabel_2_4.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2_4.setForeground(Color.WHITE);
			lblNewLabel_2_4.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2_4.setBounds(142, 184, 205, 33);
		}
		return lblNewLabel_2_4;
	}
	private JLabel getLblNewLabel_2_5() {
		if (lblNewLabel_2_5 == null) {
			lblNewLabel_2_5 = new JLabel("Birth Date :");
			lblNewLabel_2_5.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2_5.setForeground(Color.WHITE);
			lblNewLabel_2_5.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2_5.setBounds(142, 316, 205, 33);
		}
		return lblNewLabel_2_5;
	}
	private JLabel getLblNewLabel_2_6() {
		if (lblNewLabel_2_6 == null) {
			lblNewLabel_2_6 = new JLabel("Address :");
			lblNewLabel_2_6.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2_6.setForeground(Color.WHITE);
			lblNewLabel_2_6.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2_6.setBounds(142, 360, 205, 33);
		}
		return lblNewLabel_2_6;
	}
	private JTextField getFnametxt() {
		if (fnametxt == null) {
			fnametxt = new JTextField();
			fnametxt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			fnametxt.setColumns(10);
			fnametxt.setBounds(357, 93, 232, 33);
		}
		return fnametxt;
	}
	private JTextField getLnametxt() {
		if (lnametxt == null) {
			lnametxt = new JTextField();
			lnametxt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			lnametxt.setColumns(10);
			lnametxt.setBounds(357, 140, 232, 33);
		}
		return lnametxt;
	}
	private JTextField getUsernametxt() {
		if (usernametxt == null) {
			usernametxt = new JTextField();
			usernametxt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			usernametxt.setColumns(10);
			usernametxt.setBounds(357, 184, 232, 33);
		}
		return usernametxt;
	}
	private JTextField getAddresstxt() {
		if (addresstxt == null) {
			addresstxt = new JTextField();
			addresstxt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			addresstxt.setColumns(10);
			addresstxt.setBounds(357, 360, 232, 33);
		}
		return addresstxt;
	}
	private JPasswordField getNewpasstxt() {
		if (newpasstxt == null) {
			newpasstxt = new JPasswordField();
			newpasstxt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			newpasstxt.setBounds(357, 228, 232, 33);
		}
		return newpasstxt;
	}
	private JPasswordField getConfirmpasstxt() {
		if (confirmpasstxt == null) {
			confirmpasstxt = new JPasswordField();
			confirmpasstxt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			confirmpasstxt.setBounds(357, 272, 232, 33);
		}
		return confirmpasstxt;
	}
	private JDateChooser getDateChooser() {
		if (dateChooser == null) {
			dateChooser = new JDateChooser();
			dateChooser.setBounds(357, 316, 232, 33);
		}
		return dateChooser;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Register");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//validation
					if(fnametxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(fnametxt, "enter your fisrt name");
						return;
						}
					
					if(lnametxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(lnametxt, "enter your last name");
						return;
						}
					if(usernametxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(usernametxt, "enter your username");
						return;
						}				
					if(newpasstxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(newpasstxt, "enter your new password");
						return;
						}
					if(!confirmpasstxt.getText().equals(newpasstxt.getText())) {
						JOptionPane.showMessageDialog(confirmpasstxt, "passwords don't match");
						return;
						}
					if(dateChooser.getDate()==null) {
						JOptionPane.showMessageDialog(dateChooser, "Enter yout dob");
						return;
					}				
					if(addresstxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(addresstxt, "enter your username");
						return;
						}	
					
					admin a = new admin();
					a.setFname(fnametxt.getText());
					a.setLname(lnametxt.getText());
					a.setUsername(usernametxt.getText());
					a.setPassword(confirmpasstxt.getText());
					a.setDob(new Date(dateChooser.getDate().getTime()));
					a.setAddress(addresstxt.getText());
				
					
					adminService aa = new adminSeriviceImpl();
					if(aa.addAdmin(a)) {
						JOptionPane.showMessageDialog(null, "added success");
					}else {
						JOptionPane.showMessageDialog(null, "failed");
					}
					
					//clear input 
					fnametxt.setText("");
					lnametxt.setText("");
					usernametxt.setText("");
					newpasstxt.setText("");
					confirmpasstxt.setText("");
					addresstxt.setText("");
					
					new index().setVisible(true);
					dispose();
				}
				
			});
			btnNewButton_1.setForeground(Color.WHITE);
			btnNewButton_1.setFont(new Font("Roboto Medium", Font.PLAIN, 30));
			btnNewButton_1.setBackground(Color.LIGHT_GRAY);
			btnNewButton_1.setBounds(357, 404, 151, 49);
		}
		return btnNewButton_1;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Already have an account? \r\n");
			lblNewLabel_3.setForeground(Color.WHITE);
			lblNewLabel_3.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_3.setBounds(179, 464, 410, 37);
		}
		return lblNewLabel_3;
	}
}
