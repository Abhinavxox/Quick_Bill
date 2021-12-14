package com.view;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import com.model.cashier;
import com.service.cashierService;
import com.service.cashierServiceImpl;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

public class admin_cashier_update extends JFrame {

	private JPanel contentPane;
	private JLabel label;
	private JPanel panel_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_2_1;
	private JLabel lblNewLabel_2_2;
	private JLabel lblNewLabel_2_3;
	private JLabel lblNewLabel_2_4;
	private JLabel lblNewLabel_2_5;
	private JTextField caidtxt;
	private JTextField canametxt;
	private JTextField numbertxt;
	private JTextField addresstxt;
	private JTextField emailtxt;
	private JTextField passwordtxt;
	private JButton btnNewButton_1_1;
	private JButton btnNewButton_1_1_1;
	private int sid = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin_cashier_update frame = new admin_cashier_update();
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
	public admin_cashier_update() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 730);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(69, 69, 69));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel_1());
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBorder(new LineBorder(Color.WHITE, 2, true));
			panel_1.setBackground(Color.LIGHT_GRAY);
			panel_1.setBounds(10, 11, 587, 673);
			panel_1.setLayout(null);
			panel_1.add(getLblNewLabel_1());
			panel_1.add(getLblNewLabel_2());
			panel_1.add(getLblNewLabel_2_1());
			panel_1.add(getLblNewLabel_2_2());
			panel_1.add(getLblNewLabel_2_3());
			panel_1.add(getLblNewLabel_2_4());
			panel_1.add(getLblNewLabel_2_5());
			panel_1.add(getCaidtxt());
			panel_1.add(getCanametxt());
			panel_1.add(getNumbertxt());
			panel_1.add(getAddresstxt());
			panel_1.add(getEmailtxt());
			panel_1.add(getPasswordtxt());
			panel_1.add(getBtnNewButton_1_1());
			panel_1.add(getBtnNewButton_1_1_1());
//			displaydata();
		}
		return panel_1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Update Cashier Details\r\n");
			lblNewLabel_1.setForeground(Color.WHITE);
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setFont(new Font("Roboto Medium", Font.PLAIN, 30));
			lblNewLabel_1.setBounds(10, 11, 567, 57);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Cashier ID :");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2.setForeground(Color.WHITE);
			lblNewLabel_2.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2.setBounds(10, 79, 205, 33);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("Cashier Name :");
			lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2_1.setForeground(Color.WHITE);
			lblNewLabel_2_1.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2_1.setBounds(10, 123, 205, 33);
		}
		return lblNewLabel_2_1;
	}
	private JLabel getLblNewLabel_2_2() {
		if (lblNewLabel_2_2 == null) {
			lblNewLabel_2_2 = new JLabel("Mobile Number :");
			lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2_2.setForeground(Color.WHITE);
			lblNewLabel_2_2.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2_2.setBounds(10, 167, 205, 33);
		}
		return lblNewLabel_2_2;
	}
	private JLabel getLblNewLabel_2_3() {
		if (lblNewLabel_2_3 == null) {
			lblNewLabel_2_3 = new JLabel("Address :");
			lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2_3.setForeground(Color.WHITE);
			lblNewLabel_2_3.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2_3.setBounds(10, 211, 205, 33);
		}
		return lblNewLabel_2_3;
	}
	private JLabel getLblNewLabel_2_4() {
		if (lblNewLabel_2_4 == null) {
			lblNewLabel_2_4 = new JLabel("Email-Id :");
			lblNewLabel_2_4.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2_4.setForeground(Color.WHITE);
			lblNewLabel_2_4.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2_4.setBounds(10, 255, 205, 33);
		}
		return lblNewLabel_2_4;
	}
	private JLabel getLblNewLabel_2_5() {
		if (lblNewLabel_2_5 == null) {
			lblNewLabel_2_5 = new JLabel("Password :");
			lblNewLabel_2_5.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2_5.setForeground(Color.WHITE);
			lblNewLabel_2_5.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2_5.setBounds(10, 299, 205, 33);
		}
		return lblNewLabel_2_5;
	}
	private JTextField getCaidtxt() {
		if (caidtxt == null) {
			caidtxt = new JTextField();
			caidtxt.setEditable(false);
			caidtxt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			caidtxt.setColumns(10);
			caidtxt.setBounds(225, 79, 232, 33);
		}
		return caidtxt;
	}
	private JTextField getCanametxt() {
		if (canametxt == null) {
			canametxt = new JTextField();
			canametxt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			canametxt.setColumns(10);
			canametxt.setBounds(225, 123, 232, 33);
		}
		return canametxt;
	}
	private JTextField getNumbertxt() {
		if (numbertxt == null) {
			numbertxt = new JTextField();
			numbertxt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			numbertxt.setColumns(10);
			numbertxt.setBounds(225, 167, 232, 33);
		}
		return numbertxt;
	}
	private JTextField getAddresstxt() {
		if (addresstxt == null) {
			addresstxt = new JTextField();
			addresstxt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			addresstxt.setColumns(10);
			addresstxt.setBounds(225, 211, 232, 33);
		}
		return addresstxt;
	}
	private JTextField getEmailtxt() {
		if (emailtxt == null) {
			emailtxt = new JTextField();
			emailtxt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			emailtxt.setColumns(10);
			emailtxt.setBounds(225, 255, 232, 33);
		}
		return emailtxt;
	}
	private JTextField getPasswordtxt() {
		if (passwordtxt == null) {
			passwordtxt = new JTextField();
			passwordtxt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			passwordtxt.setColumns(10);
			passwordtxt.setBounds(225, 299, 232, 33);
		}
		return passwordtxt;
	}
	private JButton getBtnNewButton_1_1() {
		if (btnNewButton_1_1 == null) {
			btnNewButton_1_1 = new JButton("Update");
			btnNewButton_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//validation
					if(caidtxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(caidtxt, "enter id");
						return;
						}
					
					if(canametxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(canametxt, "enter name");
						return;
						}
					
					if(numbertxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(numbertxt, "enter mobile number");
						return;
						}
					
					if(addresstxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(addresstxt, "enter address");
						return;
						}
					
					if(emailtxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(emailtxt, "enter email ");
						return;
						}
					
					if(passwordtxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(passwordtxt, "enter password");
						return;
						}
					
					//email regex validation
					if(!isEmailValid(emailtxt.getText())) {
						JOptionPane.showMessageDialog(emailtxt, "invalid email");
						return;
					}
					
					cashier c = new cashier();
					c.setId(sid);
					c.setName(canametxt.getText());
					c.setNumber(numbertxt.getText());
					c.setAddress(addresstxt.getText());
					c.setEmail(emailtxt.getText());
					c.setPassword(passwordtxt.getText());
					
					cashierService cc = new cashierServiceImpl();
					if(cc.updateCashier(c)) {
						JOptionPane.showMessageDialog(null, "update success");
						new admin_cashier().setVisible(true);
						dispose();
					}else {
						JOptionPane.showMessageDialog(null, "update failed");
					}
				}
			});
			btnNewButton_1_1.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\java\\workspace\\Quick_Bill\\Icons\\Update.png"));
			btnNewButton_1_1.setForeground(Color.WHITE);
			btnNewButton_1_1.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			btnNewButton_1_1.setBackground(Color.LIGHT_GRAY);
			btnNewButton_1_1.setBounds(171, 439, 151, 49);
		}
		return btnNewButton_1_1;
	}
	
	public  boolean isEmailValid(String email) {
	    final Pattern EMAIL_REGEX = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
	    return EMAIL_REGEX.matcher(email).matches();
	}
	private JButton getBtnNewButton_1_1_1() {
		if (btnNewButton_1_1_1 == null) {
			btnNewButton_1_1_1 = new JButton("Back");
			btnNewButton_1_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new admin_cashier().setVisible(true);
					dispose();
				}
			});
			btnNewButton_1_1_1.setForeground(Color.WHITE);
			btnNewButton_1_1_1.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			btnNewButton_1_1_1.setBackground(Color.LIGHT_GRAY);
			btnNewButton_1_1_1.setBounds(332, 439, 151, 49);
		}
		return btnNewButton_1_1_1;
	}
	
	public void setCashierData(int id) {
		sid = id;
		cashierService cc = new cashierServiceImpl();
		cashier c = cc.getCashierById(id);
		
		caidtxt.setText(String.valueOf(c.getId()));
		canametxt.setText(c.getName());		
		numbertxt.setText(c.getNumber());
		addresstxt.setText(c.getAddress());
		emailtxt.setText(c.getEmail());
		passwordtxt.setText(c.getPassword());
	}
	}
	
	

