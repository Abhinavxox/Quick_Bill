package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cashier_index extends JFrame {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cashier_index frame = new cashier_index();
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
	public cashier_index() {
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
			btnNewButton = new JButton("Create Bill");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new cashier_index_createbill().setVisible(true);
					dispose();
				}
			});
			btnNewButton.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\java\\workspace\\Quick_Bill\\Icons\\New.png"));
			btnNewButton.setBackground(Color.WHITE);
			btnNewButton.setBounds(229, 11, 173, 42);
		}
		return btnNewButton;
	}
	private JButton getBtnSearchBill() {
		if (btnSearchBill == null) {
			btnSearchBill = new JButton("Search Bill");
			btnSearchBill.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new cashier_index_search_bill().setVisible(true);
					dispose();
				}
			});
			btnSearchBill.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\java\\workspace\\Quick_Bill\\Icons\\Search.png"));
			btnSearchBill.setBounds(412, 11, 173, 42);
		}
		return btnSearchBill;
	}
	private JButton getBtnProductInfo() {
		if (btnProductInfo == null) {
			btnProductInfo = new JButton("Product Info\r\n");
			btnProductInfo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new cashier_product_info().setVisible(true);
					dispose();
				}
			});
			btnProductInfo.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\java\\workspace\\Quick_Bill\\Icons\\Product_info.png"));
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
					new cashier_login_form().setVisible(true);
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
			panel_1.setBounds(10, 75, 1168, 609);
		}
		return panel_1;
	}
}
