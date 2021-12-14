package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.List;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.model.stock;
import com.service.stockService;
import com.service.stockServiceImpl;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cashier_product_info extends JFrame {

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
	private JTextField searchtxt;
	private JButton btnNewButton_1_2_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cashier_product_info frame = new cashier_product_info();
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
	public cashier_product_info() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 730);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(69, 69, 69));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getPanel_1());
		displaydata();
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
					new cashier_index().setVisible(true);
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
			panel_1.setLayout(null);
			panel_1.setBorder(new LineBorder(Color.WHITE, 2, true));
			panel_1.setBackground(Color.LIGHT_GRAY);
			panel_1.setBounds(10, 75, 1168, 609);
			panel_1.add(getLblNewLabel_1());
			panel_1.add(getScrollPane());
			panel_1.add(getLblNewLabel_2());
			panel_1.add(getSearchtxt());
			panel_1.add(getBtnNewButton_1_2_1());
		}
		return panel_1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Product Information");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setForeground(Color.WHITE);
			lblNewLabel_1.setFont(new Font("Roboto Medium", Font.PLAIN, 30));
			lblNewLabel_1.setBounds(10, 11, 477, 57);
		}
		return lblNewLabel_1;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(497, 11, 663, 587);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Product :");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2.setForeground(Color.WHITE);
			lblNewLabel_2.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2.setBounds(10, 79, 205, 33);
		}
		return lblNewLabel_2;
	}
	private JTextField getSearchtxt() {
		if (searchtxt == null) {
			searchtxt = new JTextField();
			searchtxt.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					String data = searchtxt.getText().trim();
					stockService ss = new stockServiceImpl();
					List<stock> slist = ss.searchStock(data);
					
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.setRowCount(0); //reset table data
					
					for(stock s:slist) {
						model.addRow(new Object[] {s.getId(),s.getCompany(),s.getModel(),s.getAvailable(),s.getMrp()});
					}
					
				}
			});
			searchtxt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			searchtxt.setColumns(10);
			searchtxt.setBounds(225, 79, 232, 33);
		}
		return searchtxt;
	}
	private JButton getBtnNewButton_1_2_1() {
		if (btnNewButton_1_2_1 == null) {
			btnNewButton_1_2_1 = new JButton("Search");
			btnNewButton_1_2_1.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\java\\workspace\\Quick_Bill\\Icons\\Search.png"));
			btnNewButton_1_2_1.setForeground(Color.WHITE);
			btnNewButton_1_2_1.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			btnNewButton_1_2_1.setBackground(Color.LIGHT_GRAY);
			btnNewButton_1_2_1.setBounds(166, 128, 151, 49);
		}
		return btnNewButton_1_2_1;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Id", "Company", "Model", "Available", "Mrp(USD)"
				}
			));
		}
		return table;
	}
	
	private void displaydata() {
		stockService ss = new stockServiceImpl();
		List<stock> slist = ss.getAllStock();
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		for(stock s:slist) {
		model.addRow(new Object[] {s.getId(),s.getCompany(),s.getModel(),s.getAvailable(),s.getMrp()});
		}
	}
	
}
