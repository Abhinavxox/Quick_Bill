package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
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

public class admin_cashier extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblQuickBill;
	private JLabel label;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JButton btnSearchBill;
	private JButton btnProductInfo;
	private JButton btnSales;
	private JButton btnNewButton_4;
	private JPanel panel_1;
	private JLabel lblNewLabel_1;
	private JScrollPane scrollPane;
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
	private JButton btnNewButton_1;
	private JButton btnNewButton_1_1;
	private JButton btnNewButton_1_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin_cashier frame = new admin_cashier();
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
	public admin_cashier() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 730);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(69, 69, 69));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getPanel_1());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(Color.LIGHT_GRAY);
			panel.setBounds(0, 0, 1188, 64);
			panel.setLayout(null);
			panel.add(getLblQuickBill());
			panel.add(getLblNewLabel());
			panel.add(getBtnNewButton());
			panel.add(getBtnSearchBill());
			panel.add(getBtnProductInfo());
			panel.add(getBtnSales());
			panel.add(getBtnNewButton_4());
		}
		return panel;
	}
	private JLabel getLblQuickBill() {
		if (lblQuickBill == null) {
			lblQuickBill = new JLabel("Quick Bill\r\n");
			lblQuickBill.setBounds(10, 0, 126, 64);
			lblQuickBill.setHorizontalAlignment(SwingConstants.CENTER);
			lblQuickBill.setForeground(Color.WHITE);
			lblQuickBill.setFont(new Font("Roboto Medium", Font.PLAIN, 30));
		}
		return lblQuickBill;
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setBounds(146, 0, 73, 64);
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\java\\workspace\\Quick_Bill\\Icons\\bank (3).png"));
		}
		return lblNewLabel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Cashier\r\n\r\n");
			btnNewButton.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\java\\workspace\\Quick_Bill\\Icons\\Cashier.png"));
			btnNewButton.setBackground(Color.WHITE);
			btnNewButton.setBounds(229, 11, 173, 42);
		}
		return btnNewButton;
	}
	private JButton getBtnSearchBill() {
		if (btnSearchBill == null) {
			btnSearchBill = new JButton("Transaction\r\n");
			btnSearchBill.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\java\\workspace\\Quick_Bill\\Icons\\Transaction.png"));
			btnSearchBill.setBounds(412, 11, 173, 42);
		}
		return btnSearchBill;
	}
	private JButton getBtnProductInfo() {
		if (btnProductInfo == null) {
			btnProductInfo = new JButton("Stock\r\n");
			btnProductInfo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new admin_stock().setVisible(true);
					dispose();
				}
			});
			btnProductInfo.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\java\\workspace\\Quick_Bill\\Icons\\Stock.png"));
			btnProductInfo.setBounds(595, 11, 173, 42);
		}
		return btnProductInfo;
	}
	private JButton getBtnSales() {
		if (btnSales == null) {
			btnSales = new JButton("Sales");
			btnSales.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\java\\workspace\\Quick_Bill\\Icons\\Sales.png"));
			btnSales.setBounds(778, 11, 173, 42);
		}
		return btnSales;
	}
	private JButton getBtnNewButton_4() {
		if (btnNewButton_4 == null) {
			btnNewButton_4 = new JButton("");
			btnNewButton_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new admin_index().setVisible(true);
					dispose();
				}
			});
			btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\java\\workspace\\Quick_Bill\\Icons\\remove.png"));
			btnNewButton_4.setBounds(1121, 11, 57, 42);
		}
		return btnNewButton_4;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBorder(new LineBorder(Color.WHITE, 2, true));
			panel_1.setBackground(Color.LIGHT_GRAY);
			panel_1.setBounds(10, 75, 1168, 609);
			panel_1.setLayout(null);
			panel_1.add(getLblNewLabel_1());
			panel_1.add(getScrollPane());
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
			panel_1.add(getBtnNewButton_1());
			panel_1.add(getBtnNewButton_1_1());
			panel_1.add(getBtnNewButton_1_2());
			displaydata();
		}
		return panel_1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Add Cashier Details\r\n");
			lblNewLabel_1.setForeground(Color.WHITE);
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setFont(new Font("Roboto Medium", Font.PLAIN, 30));
			lblNewLabel_1.setBounds(10, 11, 477, 57);
		}
		return lblNewLabel_1;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(495, 11, 663, 587);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
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
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Add");
			btnNewButton_1.addActionListener(new ActionListener() {
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
					c.setId(Integer.valueOf(caidtxt.getText()));
					c.setName(canametxt.getText());
					c.setNumber(numbertxt.getText());
					c.setAddress(addresstxt.getText());
					c.setEmail(emailtxt.getText());
					c.setPassword(passwordtxt.getText());
					
					cashierService cc = new cashierServiceImpl();
					if(cc.addCashier(c)) {
						JOptionPane.showMessageDialog(null, "added success");
						displaydata();
					}else {
						JOptionPane.showMessageDialog(null, "failed");
					}

					
				}
			});
			btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\java\\workspace\\Quick_Bill\\Icons\\add-user-button.png"));
			btnNewButton_1.setForeground(Color.WHITE);
			btnNewButton_1.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			btnNewButton_1.setBackground(Color.LIGHT_GRAY);
			btnNewButton_1.setBounds(10, 439, 151, 49);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_1_1() {
		if (btnNewButton_1_1 == null) {
			btnNewButton_1_1 = new JButton("Update");
			btnNewButton_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(table.getSelectedRow()<0) {
						JOptionPane.showMessageDialog(null, "select any row");
						return;
					}
					
					int row = table.getSelectedRow();
					int id = (int) table.getModel().getValueAt(row, 0);
					
					admin_cashier_update ad = new admin_cashier_update();
					ad.setCashierData(id);
					ad.setVisible(true);
					dispose();
					
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
	private JButton getBtnNewButton_1_2() {
		if (btnNewButton_1_2 == null) {
			btnNewButton_1_2 = new JButton("Delete");
			btnNewButton_1_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(table.getSelectedRow()<0) {
						JOptionPane.showMessageDialog(null, "select any row");
						return;
					}
					
					int row = table.getSelectedRow();
					int id = (int) table.getModel().getValueAt(row, 0);
					
					cashierService ss = new cashierServiceImpl();
					if(ss.deleteCashier(id)) {
						JOptionPane.showMessageDialog(null, "deleted success");
						displaydata();
				}
				}
			});
			btnNewButton_1_2.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\java\\workspace\\Quick_Bill\\Icons\\delete.png"));
			btnNewButton_1_2.setForeground(Color.WHITE);
			btnNewButton_1_2.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			btnNewButton_1_2.setBackground(Color.LIGHT_GRAY);
			btnNewButton_1_2.setBounds(332, 439, 151, 49);
		}
		return btnNewButton_1_2;
	}

	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setFont(new Font("Roboto Medium", Font.PLAIN, 11));
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"ID", "Name", "Phn.", "Address", "Email", "Password"
				}
			));
		}
		return table;
	}
	
	public  boolean isEmailValid(String email) {
	    final Pattern EMAIL_REGEX = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
	    return EMAIL_REGEX.matcher(email).matches();
	}
	
	private void displaydata() {
		cashierService cc = new cashierServiceImpl();
		List<cashier> slist = cc.getAllCashier();
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		
		for(cashier c :slist) {
			model.addRow(new Object[] {c.getId(),c.getName(),c.getNumber(),c.getAddress(),c.getEmail(),c.getPassword()});
		}
		
	}
	
	
}
