package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class index extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_3_1;
	private JLabel lblNewLabel_1_1;
	private JLabel lblQuickBill;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					index frame = new index();
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
	public index() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(69,69,69));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getLblQuickBill());
		contentPane.add(getLblNewLabel_3_1());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getButton_1());
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_1_1());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Welcome To Super Market Billing System");
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Roboto Medium", Font.PLAIN, 30));
			lblNewLabel.setBounds(10, 11, 768, 74);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\java\\workspace\\Quick_Bill\\Icons\\bank (200).png"));
			lblNewLabel_1.setBounds(0, 292, 282, 293);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\java\\workspace\\Quick_Bill\\Icons\\Asset 5ldpi.png"));
			lblNewLabel_2.setBounds(316, 96, 400, 458);
		}
		return lblNewLabel_2;
	}
	private JButton getButton_1() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Admin");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new admin_login_form().setVisible(true);
					dispose();
				}
			});
			btnNewButton.setBackground(Color.LIGHT_GRAY);
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.setFont(new Font("Roboto Medium", Font.PLAIN, 30));
			btnNewButton.setBounds(392, 263, 254, 59);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\java\\workspace\\Quick_Bill\\Icons\\admin (1).png"));
			lblNewLabel_3.setBounds(446, 133, 144, 128);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_3_1() {
		if (lblNewLabel_3_1 == null) {
			lblNewLabel_3_1 = new JLabel("");
			lblNewLabel_3_1.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\java\\workspace\\Quick_Bill\\Icons\\cashier (2).png"));
			lblNewLabel_3_1.setBounds(446, 333, 144, 128);
		}
		return lblNewLabel_3_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("");
			lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\java\\workspace\\Quick_Bill\\Icons\\Asset 1ldpi.png"));
			lblNewLabel_1_1.setBounds(0, 175, 282, 118);
		}
		return lblNewLabel_1_1;
	}
	private JLabel getLblQuickBill() {
		if (lblQuickBill == null) {
			lblQuickBill = new JLabel("Quick Bill\r\n");
			lblQuickBill.setHorizontalAlignment(SwingConstants.CENTER);
			lblQuickBill.setForeground(Color.WHITE);
			lblQuickBill.setFont(new Font("Roboto Medium", Font.PLAIN, 30));
			lblQuickBill.setBounds(0, 197, 282, 74);
		}
		return lblQuickBill;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Cashier");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new cashier_login_form().setVisible(true);
					dispose();
				}
			});
			btnNewButton_1.setBackground(Color.LIGHT_GRAY);
			btnNewButton_1.setFont(new Font("Roboto Medium", Font.PLAIN, 30));
			btnNewButton_1.setForeground(Color.WHITE);
			btnNewButton_1.setBounds(392, 460, 254, 59);
		}
		return btnNewButton_1;
	}
}
