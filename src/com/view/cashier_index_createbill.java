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
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.model.bill;
import com.model.stock;
import com.service.billService;
import com.service.billServiceImpl;
import com.service.stockService;
import com.service.stockServiceImpl;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.sql.Date;
import java.util.List;

public class cashier_index_createbill extends JFrame {

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
	private JTextField billnotxt;
	private JTextField customernametxt;
	private JTextField pidtxt;
	private JTextField cnametxt;
	private JTextField modeltxt;
	private JTextField mrptxt;
	private JButton btnNewButton_1;
	private JButton btnNewButton_1_2;
	private JLabel lblNewLabel_2_5_1;
	private JLabel lblNewLabel_2_5_2;
	private JTextField quantitytxt;
	private JTextField discounttxt;
	private JTable table;
	private JLabel lblNewLabel_2_5_2_1;
	private JDateChooser dateChooser;
	private JLabel lblNewLabel_2_5_2_1_1;
	private JTextField totaltxt;
	private JButton btnNewButton_1_2_1;
	private float total= 0;
	private float discount = 0;
	private JLabel lblNewLabel_2_5_2_1_1_1;
	private JTextField paymenttxt;
	private float payment = 0;
	private JButton btnNewButton_1_2_1_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cashier_index_createbill frame = new cashier_index_createbill();
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
	public cashier_index_createbill() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 730);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(69, 69, 69));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getPanel_1_1());
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
					new cashier_index().setVisible(true);
					dispose();
				}
			});
			btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\java\\workspace\\Quick_Bill\\Icons\\remove.png"));
			btnNewButton_4.setBounds(1121, 11, 57, 42);
		}
		return btnNewButton_4;
	}
	private JPanel getPanel_1_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.setBorder(new LineBorder(Color.WHITE, 2, true));
			panel_1.setBackground(Color.LIGHT_GRAY);
			panel_1.setBounds(10, 75, 1168, 609);
			panel_1.add(getLblNewLabel_1_1());
			panel_1.add(getScrollPane_1());
			panel_1.add(getLblNewLabel_2_1());
			panel_1.add(getLblNewLabel_2_1_1());
			panel_1.add(getLblNewLabel_2_2());
			panel_1.add(getLblNewLabel_2_3());
			panel_1.add(getLblNewLabel_2_4());
			panel_1.add(getLblNewLabel_2_5());
			panel_1.add(getTextField_1());
			panel_1.add(getTextField_1_1());
			panel_1.add(getPidtxt());
			panel_1.add(getCnametxt());
			panel_1.add(getModeltxt());
			panel_1.add(getMrptxt());
			panel_1.add(getBtnNewButton_1());
			panel_1.add(getBtnNewButton_1_2());
			panel_1.add(getLblNewLabel_2_5_1());
			panel_1.add(getLblNewLabel_2_5_2());
			panel_1.add(getQuantitytxt());
			panel_1.add(getDiscounttxt());
			panel_1.add(getLblNewLabel_2_5_2_1());
			panel_1.add(getDateChooser());
			panel_1.add(getLblNewLabel_2_5_2_1_1());
			panel_1.add(getTotaltxt());
			panel_1.add(getBtnNewButton_1_2_1());
			panel_1.add(getLblNewLabel_2_5_2_1_1_1());
			panel_1.add(getPaymenttxt());
			panel_1.add(getBtnNewButton_1_2_1_1());
		}
		return panel_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("New Bill\r\n");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setForeground(Color.WHITE);
			lblNewLabel_1.setFont(new Font("Roboto Medium", Font.PLAIN, 30));
			lblNewLabel_1.setBounds(10, 11, 477, 57);
		}
		return lblNewLabel_1;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(495, 79, 663, 409);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Bill no. :");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2.setForeground(Color.WHITE);
			lblNewLabel_2.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2.setBounds(10, 79, 205, 33);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_2_1_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("Customer  Name :");
			lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2_1.setForeground(Color.WHITE);
			lblNewLabel_2_1.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2_1.setBounds(10, 123, 205, 33);
		}
		return lblNewLabel_2_1;
	}
	private JLabel getLblNewLabel_2_2() {
		if (lblNewLabel_2_2 == null) {
			lblNewLabel_2_2 = new JLabel("Product Id :");
			lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2_2.setForeground(Color.WHITE);
			lblNewLabel_2_2.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2_2.setBounds(10, 167, 205, 33);
		}
		return lblNewLabel_2_2;
	}
	private JLabel getLblNewLabel_2_3() {
		if (lblNewLabel_2_3 == null) {
			lblNewLabel_2_3 = new JLabel("Company :");
			lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2_3.setForeground(Color.WHITE);
			lblNewLabel_2_3.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2_3.setBounds(10, 211, 205, 33);
		}
		return lblNewLabel_2_3;
	}
	private JLabel getLblNewLabel_2_4() {
		if (lblNewLabel_2_4 == null) {
			lblNewLabel_2_4 = new JLabel("Model :");
			lblNewLabel_2_4.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2_4.setForeground(Color.WHITE);
			lblNewLabel_2_4.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2_4.setBounds(10, 255, 205, 33);
		}
		return lblNewLabel_2_4;
	}
	private JLabel getLblNewLabel_2_5() {
		if (lblNewLabel_2_5 == null) {
			lblNewLabel_2_5 = new JLabel("Mrp :");
			lblNewLabel_2_5.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2_5.setForeground(Color.WHITE);
			lblNewLabel_2_5.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2_5.setBounds(10, 299, 205, 33);
		}
		return lblNewLabel_2_5;
	}
	private JTextField getTextField_1() {
		if (billnotxt == null) {
			billnotxt = new JTextField();
			billnotxt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			billnotxt.setColumns(10);
			billnotxt.setBounds(225, 79, 232, 33);
		}
		return billnotxt;
	}
	private JTextField getTextField_1_1() {
		if (customernametxt == null) {
			customernametxt = new JTextField();
			customernametxt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			customernametxt.setColumns(10);
			customernametxt.setBounds(225, 123, 232, 33);
		}
		return customernametxt;
	}
	private JTextField getPidtxt() {
		if (pidtxt == null) {
			pidtxt = new JTextField();
			pidtxt.addKeyListener(new KeyAdapter() {
				
				
				@Override
				public void keyReleased(KeyEvent e) {
					String data = pidtxt.getText().trim();
					stockService ss = new stockServiceImpl();
					List<stock> slist = ss.searchStock(data);
					

					
//					if(slist!=null) {

					if(pidtxt.getText().isEmpty()) {
						cnametxt.setText("");
						modeltxt.setText("");
						mrptxt.setText("");
					}else {
						for(stock s:slist) {
							cnametxt.setText(s.getCompany());
							modeltxt.setText(s.getModel());
							mrptxt.setText(String.valueOf(s.getMrp()));
						}	
					}
					
//					}else {
//						cnametxt.setText("");
//						modeltxt.setText("");
//						mrptxt.setText("");
//					}
					
					
				}

			});
			pidtxt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			pidtxt.setColumns(10);
			pidtxt.setBounds(225, 167, 232, 33);
		}
		return pidtxt;
	}
	private JTextField getCnametxt() {
		if (cnametxt == null) {
			cnametxt = new JTextField();
			cnametxt.setEditable(false);
			cnametxt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			cnametxt.setColumns(10);
			cnametxt.setBounds(225, 211, 232, 33);
		}
		return cnametxt;
	}
	private JTextField getModeltxt() {
		if (modeltxt == null) {
			modeltxt = new JTextField();
			modeltxt.setEditable(false);
			modeltxt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			modeltxt.setColumns(10);
			modeltxt.setBounds(225, 255, 232, 33);
		}
		return modeltxt;
	}
	private JTextField getMrptxt() {
		if (mrptxt == null) {
			mrptxt = new JTextField();
			mrptxt.setEditable(false);
			mrptxt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			mrptxt.setColumns(10);
			mrptxt.setBounds(225, 299, 232, 33);
		}
		return mrptxt;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Add");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//validation
					if(billnotxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(billnotxt, "enter bill no");
						return;
						}
					if(customernametxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(customernametxt, "enter customer name");
						return;
						}
					if(pidtxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(pidtxt, "enter product id");
						return;
						}	
					if(quantitytxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(quantitytxt, "enter quantity");
						return;
						}
					if(discounttxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(discounttxt, "enter discount");
						return;
						}
					if(Integer.valueOf(discounttxt.getText())>=101) {
						JOptionPane.showMessageDialog(discounttxt, "enter valid discount rate");
						return;
					}
					if(dateChooser.getDate()==null) {
						JOptionPane.showMessageDialog(dateChooser, "enter date");
						return;
						}
					
					//calculation of price
					int price;
					int quantity = Integer.valueOf(quantitytxt.getText());
					int mrp = Integer.valueOf(mrptxt.getText());
					price = quantity*mrp;
					
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.addRow(new Object[] {cnametxt.getText(),modeltxt.getText(),quantitytxt.getText(),mrptxt.getText(),price});
					
					//finding amount
					total += price;
					totaltxt.setText(String.valueOf(total));
					

					
					
				}
			});
			btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\java\\workspace\\Quick_Bill\\Icons\\plus.png"));
			btnNewButton_1.setForeground(Color.WHITE);
			btnNewButton_1.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			btnNewButton_1.setBackground(Color.LIGHT_GRAY);
			btnNewButton_1.setBounds(64, 439, 151, 49);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_1_2() {
		if (btnNewButton_1_2 == null) {
			btnNewButton_1_2 = new JButton("Remove");
			btnNewButton_1_2.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\java\\workspace\\Quick_Bill\\Icons\\remove.png"));
			btnNewButton_1_2.setForeground(Color.WHITE);
			btnNewButton_1_2.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			btnNewButton_1_2.setBackground(Color.LIGHT_GRAY);
			btnNewButton_1_2.setBounds(225, 439, 151, 49);
		}
		return btnNewButton_1_2;
	}
	private JLabel getLblNewLabel_2_5_1() {
		if (lblNewLabel_2_5_1 == null) {
			lblNewLabel_2_5_1 = new JLabel("Quantity :");
			lblNewLabel_2_5_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2_5_1.setForeground(Color.WHITE);
			lblNewLabel_2_5_1.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2_5_1.setBounds(10, 343, 205, 33);
		}
		return lblNewLabel_2_5_1;
	}
	private JLabel getLblNewLabel_2_5_2() {
		if (lblNewLabel_2_5_2 == null) {
			lblNewLabel_2_5_2 = new JLabel("Discount :");
			lblNewLabel_2_5_2.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2_5_2.setForeground(Color.WHITE);
			lblNewLabel_2_5_2.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2_5_2.setBounds(10, 387, 205, 33);
		}
		return lblNewLabel_2_5_2;
	}
	private JTextField getQuantitytxt() {
		if (quantitytxt == null) {
			quantitytxt = new JTextField();
			quantitytxt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			quantitytxt.setColumns(10);
			quantitytxt.setBounds(225, 343, 232, 33);
		}
		return quantitytxt;
	}
	private JTextField getDiscounttxt() {
		if (discounttxt == null) {
			discounttxt = new JTextField();
			discounttxt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			discounttxt.setColumns(10);
			discounttxt.setBounds(225, 387, 232, 33);
		}
		return discounttxt;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Company", "Model", "Mrp", "Quantity", "Price"
				}
			));
		}
		return table;
	}
	private JLabel getLblNewLabel_2_5_2_1() {
		if (lblNewLabel_2_5_2_1 == null) {
			lblNewLabel_2_5_2_1 = new JLabel("Date :");
			lblNewLabel_2_5_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2_5_2_1.setForeground(Color.WHITE);
			lblNewLabel_2_5_2_1.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2_5_2_1.setBounds(497, 35, 205, 33);
		}
		return lblNewLabel_2_5_2_1;
	}
	private JDateChooser getDateChooser() {
		if (dateChooser == null) {
			dateChooser = new JDateChooser();
			dateChooser.setBounds(712, 35, 232, 33);
		}
		return dateChooser;
	}
	private JLabel getLblNewLabel_2_5_2_1_1() {
		if (lblNewLabel_2_5_2_1_1 == null) {
			lblNewLabel_2_5_2_1_1 = new JLabel("Total :");
			lblNewLabel_2_5_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2_5_2_1_1.setForeground(Color.WHITE);
			lblNewLabel_2_5_2_1_1.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2_5_2_1_1.setBounds(495, 499, 104, 33);
		}
		return lblNewLabel_2_5_2_1_1;
	}
	private JTextField getTotaltxt() {
		if (totaltxt == null) {
			totaltxt = new JTextField();
			totaltxt.setEditable(false);
			totaltxt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			totaltxt.setColumns(10);
			totaltxt.setBounds(609, 502, 193, 33);
		}
		return totaltxt;
	}
	private JButton getBtnNewButton_1_2_1() {
		if (btnNewButton_1_2_1 == null) {
			btnNewButton_1_2_1 = new JButton("Print");
			btnNewButton_1_2_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					bill b = new bill();
					b.setBillNo(Integer.valueOf(billnotxt.getText()));
					b.setCustomerName(customernametxt.getText());
					b.setAmount(Float.valueOf(totaltxt.getText()));
					b.setDate(new Date(dateChooser.getDate().getTime()));
					
					billService bb = new billServiceImpl();
					if(bb.addbill(b)) {
						try {
							table.print();
						} catch (PrinterException e1) {
							e1.printStackTrace();
						}
						return;
					}else {
						JOptionPane.showMessageDialog(null, "failed to add");
					}
				}
			});
			btnNewButton_1_2_1.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\java\\workspace\\Quick_Bill\\Icons\\printer.png"));
			btnNewButton_1_2_1.setForeground(Color.WHITE);
			btnNewButton_1_2_1.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			btnNewButton_1_2_1.setBackground(Color.LIGHT_GRAY);
			btnNewButton_1_2_1.setBounds(712, 543, 151, 49);
		}
		return btnNewButton_1_2_1;
	}
	private JLabel getLblNewLabel_2_5_2_1_1_1() {
		if (lblNewLabel_2_5_2_1_1_1 == null) {
			lblNewLabel_2_5_2_1_1_1 = new JLabel("Payment :");
			lblNewLabel_2_5_2_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2_5_2_1_1_1.setForeground(Color.WHITE);
			lblNewLabel_2_5_2_1_1_1.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2_5_2_1_1_1.setBounds(812, 499, 104, 33);
		}
		return lblNewLabel_2_5_2_1_1_1;
	}
	private JTextField getPaymenttxt() {
		if (paymenttxt == null) {
			paymenttxt = new JTextField();
			paymenttxt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			paymenttxt.setEditable(false);
			paymenttxt.setColumns(10);
			paymenttxt.setBounds(926, 502, 193, 33);
		}
		return paymenttxt;
	}
	private JButton getBtnNewButton_1_2_1_1() {
		if (btnNewButton_1_2_1_1 == null) {
			btnNewButton_1_2_1_1 = new JButton("");
			btnNewButton_1_2_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					discount = Integer.valueOf(discounttxt.getText());
					float total_1 = Float.valueOf(totaltxt.getText());
					
					payment = total_1 - (total_1*(discount/100));
					paymenttxt.setText(String.valueOf(payment));
				}
			});
			btnNewButton_1_2_1_1.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\java\\workspace\\Quick_Bill\\Icons\\calculator (1).png"));
			btnNewButton_1_2_1_1.setForeground(Color.WHITE);
			btnNewButton_1_2_1_1.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			btnNewButton_1_2_1_1.setBackground(Color.LIGHT_GRAY);
			btnNewButton_1_2_1_1.setBounds(1119, 499, 39, 36);
		}
		return btnNewButton_1_2_1_1;
	}
}
