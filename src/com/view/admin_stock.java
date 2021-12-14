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

public class admin_stock extends JFrame {

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
	private JTextField pidtxt;
	private JLabel lblNewLabel_2_1;
	private JLabel lblNewLabel_2_2;
	private JLabel lblNewLabel_2_3;
	private JLabel lblNewLabel_2_5;
	private JTextField cnametxt;
	private JTextField pmodeltxt;
	private JTextField availabletxt;
	private JTextField mrptxt;
	private JButton btnNewButton_1_2;
	private JButton btnNewButton_1_2_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin_stock frame = new admin_stock();
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
	public admin_stock() {
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
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new admin_cashier().setVisible(true);
					dispose();
				}
			});
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
			panel_1.add(getPidtxt());
			panel_1.add(getLblNewLabel_2_1());
			panel_1.add(getLblNewLabel_2_2());
			panel_1.add(getLblNewLabel_2_3());
			panel_1.add(getLblNewLabel_2_5());
			panel_1.add(getCnametxt());
			panel_1.add(getPmodeltxt());
			panel_1.add(getAvailabletxt());
			panel_1.add(getMrptxt());
			panel_1.add(getBtnNewButton_1_2());
			panel_1.add(getBtnNewButton_1_2_1());
			displaydata();
		}
		return panel_1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Stock\r\n");
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
	private JButton getBtnNewButton_1_2() {
		if (btnNewButton_1_2 == null) {
			btnNewButton_1_2 = new JButton("Add");
			btnNewButton_1_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//validation
					if(pidtxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(pidtxt, "Enter product id");
						return;
					}
					if(!pidtxt.getText().matches("\\d{10}")) {
						JOptionPane.showMessageDialog(pidtxt, "Invalid Id");
						return;
					}
					if(cnametxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(cnametxt , "Enter company");
						return;
					}
					if(pmodeltxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(pmodeltxt, "Enter product model");
						return;
					}
					if(availabletxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(availabletxt, "Enter product available");
						return;
					}
					if(mrptxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(mrptxt, "Enter product mrp");
						return;
					}
					
					stock s = new stock();
					s.setId(Integer.valueOf(pidtxt.getText()));
					s.setCompany(cnametxt.getText());
					s.setModel(pmodeltxt.getText());
					s.setAvailable(Integer.valueOf(availabletxt.getText()));
					s.setMrp(Integer.valueOf(mrptxt.getText()));
					
					stockService ss = new stockServiceImpl();
					if (ss.addstock(s)) {
						JOptionPane.showMessageDialog(null, "added success");
						displaydata();
						return;
					}else {
						JOptionPane.showMessageDialog(null, "added failed");
					}
					//clear input 
					pidtxt.setText("");
					cnametxt.setText("");
					pmodeltxt.setText("");
					availabletxt.setText("");
					mrptxt.setText("");
					
					
				}
			});
			btnNewButton_1_2.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\java\\workspace\\Quick_Bill\\Icons\\plus.png"));
			btnNewButton_1_2.setForeground(Color.WHITE);
			btnNewButton_1_2.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			btnNewButton_1_2.setBackground(Color.LIGHT_GRAY);
			btnNewButton_1_2.setBounds(64, 398, 151, 49);
		}
		return btnNewButton_1_2;
	}
	private JButton getBtnNewButton_1_2_1() {
		if (btnNewButton_1_2_1 == null) {
			btnNewButton_1_2_1 = new JButton("Update");
			btnNewButton_1_2_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(table.getSelectedRow()<0) {
						JOptionPane.showMessageDialog(null, "select any row");
						return;
					}
					
					int row = table.getSelectedRow();
					int id = (int) table.getModel().getValueAt(row, 0);
					
					admin_stock_update au = new admin_stock_update();
					au.setStockData(id);
					au.setVisible(true);
					dispose();
				}
			});
			btnNewButton_1_2_1.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\java\\workspace\\Quick_Bill\\Icons\\Update.png"));
			btnNewButton_1_2_1.setForeground(Color.WHITE);
			btnNewButton_1_2_1.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			btnNewButton_1_2_1.setBackground(Color.LIGHT_GRAY);
			btnNewButton_1_2_1.setBounds(225, 398, 151, 49);
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
					"Id", "Name", "Model", "Available", "Mrp(USD)"
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
