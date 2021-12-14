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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.model.stock;
import com.service.stockService;
import com.service.stockServiceImpl;


import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class admin_stock_update extends JFrame {

	private JPanel contentPane;
	private JLabel label;
	private JPanel panel_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField pidtxt;
	private JLabel lblNewLabel_2_1;
	private JLabel lblNewLabel_2_2;
	private JLabel lblNewLabel_2_3;
	private JLabel lblNewLabel_2_5;
	private JTextField cnametxt;
	private JTextField pmodeltxt;
	private JTextField availabletxt;
	private JTextField mrptxt;
	private JButton btnNewButton_1_2_1;
	private int sid = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin_stock_update frame = new admin_stock_update();
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
	public admin_stock_update() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 660);
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
			panel_1.setBounds(10, 11, 464, 609);
			panel_1.setLayout(null);
			panel_1.add(getLblNewLabel_1());
			panel_1.add(getLblNewLabel_2());
			panel_1.add(getPidtxt());
			panel_1.add(getLblNewLabel_2_1());
			panel_1.add(getLblNewLabel_2_2());
			panel_1.add(getLblNewLabel_2_3());
			panel_1.add(getLblNewLabel_2_5());
			panel_1.add(getCnametxt());
			panel_1.add(getPmodeltxt());
			panel_1.add(getAvailabletxt());
			panel_1.add(getMrptxt());
			panel_1.add(getBtnNewButton_1_2_1());
		}
		return panel_1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Update stock");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setForeground(Color.WHITE);
			lblNewLabel_1.setFont(new Font("Roboto Medium", Font.PLAIN, 30));
			lblNewLabel_1.setBounds(10, 11, 444, 57);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Product ID :");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2.setForeground(Color.WHITE);
			lblNewLabel_2.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2.setBounds(10, 79, 205, 33);
		}
		return lblNewLabel_2;
	}
	private JTextField getPidtxt() {
		if (pidtxt == null) {
			pidtxt = new JTextField();
			pidtxt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			pidtxt.setColumns(10);
			pidtxt.setBounds(225, 79, 232, 33);
		}
		return pidtxt;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("Company Name :");
			lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2_1.setForeground(Color.WHITE);
			lblNewLabel_2_1.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2_1.setBounds(10, 123, 205, 33);
		}
		return lblNewLabel_2_1;
	}
	private JLabel getLblNewLabel_2_2() {
		if (lblNewLabel_2_2 == null) {
			lblNewLabel_2_2 = new JLabel("Model :");
			lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2_2.setForeground(Color.WHITE);
			lblNewLabel_2_2.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2_2.setBounds(10, 167, 205, 33);
		}
		return lblNewLabel_2_2;
	}
	private JLabel getLblNewLabel_2_3() {
		if (lblNewLabel_2_3 == null) {
			lblNewLabel_2_3 = new JLabel("Quantity Available :");
			lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2_3.setForeground(Color.WHITE);
			lblNewLabel_2_3.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2_3.setBounds(10, 211, 205, 33);
		}
		return lblNewLabel_2_3;
	}
	private JLabel getLblNewLabel_2_5() {
		if (lblNewLabel_2_5 == null) {
			lblNewLabel_2_5 = new JLabel("Mrp :");
			lblNewLabel_2_5.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2_5.setForeground(Color.WHITE);
			lblNewLabel_2_5.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2_5.setBounds(10, 255, 205, 33);
		}
		return lblNewLabel_2_5;
	}
	private JTextField getCnametxt() {
		if (cnametxt == null) {
			cnametxt = new JTextField();
			cnametxt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			cnametxt.setColumns(10);
			cnametxt.setBounds(225, 123, 232, 33);
		}
		return cnametxt;
	}
	private JTextField getPmodeltxt() {
		if (pmodeltxt == null) {
			pmodeltxt = new JTextField();
			pmodeltxt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			pmodeltxt.setColumns(10);
			pmodeltxt.setBounds(225, 167, 232, 33);
		}
		return pmodeltxt;
	}
	private JTextField getAvailabletxt() {
		if (availabletxt == null) {
			availabletxt = new JTextField();
			availabletxt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			availabletxt.setColumns(10);
			availabletxt.setBounds(225, 211, 232, 33);
		}
		return availabletxt;
	}
	private JTextField getMrptxt() {
		if (mrptxt == null) {
			mrptxt = new JTextField();
			mrptxt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			mrptxt.setColumns(10);
			mrptxt.setBounds(225, 258, 232, 33);
		}
		return mrptxt;
	}
	private JButton getBtnNewButton_1_2_1() {
		if (btnNewButton_1_2_1 == null) {
			btnNewButton_1_2_1 = new JButton("Update");
			btnNewButton_1_2_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//validation
					if(pidtxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(pidtxt, "Enter product id");
					}
					if(cnametxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(cnametxt , "Enter company");
					}
					if(pmodeltxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(pmodeltxt, "Enter product model");
					}
					if(availabletxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(availabletxt, "Enter product available");
					}
					if(mrptxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(mrptxt, "Enter product mrp");
					}
					
					stock s = new stock();
					s.setId(Integer.valueOf(pidtxt.getText()));
					s.setCompany(cnametxt.getText());
					s.setModel(pmodeltxt.getText());
					s.setAvailable(Integer.valueOf(availabletxt.getText()));
					s.setMrp(Integer.valueOf(mrptxt.getText()));
					
					stockService ss = new stockServiceImpl();
					if (ss.updatestock(s)) {
						JOptionPane.showMessageDialog(null, "update success");
						new admin_stock().setVisible(true);
						return;
					}else {
						JOptionPane.showMessageDialog(null, "update failed");
					}
				}
			});
			btnNewButton_1_2_1.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\java\\workspace\\Quick_Bill\\Icons\\Update.png"));
			btnNewButton_1_2_1.setForeground(Color.WHITE);
			btnNewButton_1_2_1.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			btnNewButton_1_2_1.setBackground(Color.LIGHT_GRAY);
			btnNewButton_1_2_1.setBounds(159, 429, 151, 49);
		}
		return btnNewButton_1_2_1;
	}
	
	public void setStockData(int id) {
		sid = id;
		stockService ss = new stockServiceImpl();
		stock s = ss.getStockById(id);
		
		pidtxt.setText(String.valueOf(s.getId()));
		cnametxt.setText(s.getCompany());
		pmodeltxt.setText(s.getModel());
		availabletxt.setText(String.valueOf(s.getAvailable()));
		mrptxt.setText(String.valueOf(s.getMrp()));
		
		
	}
	

}
