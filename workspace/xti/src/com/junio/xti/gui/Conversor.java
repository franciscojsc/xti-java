package com.junio.xti.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.Component;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Conversor extends JFrame {

	private JPanel contentPane;
	private JLabel lblCelsius;
	private JTextField txtResultado;
	private JTextField txtValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor frame = new Conversor();
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
	public Conversor() {
		setTitle("Conversosr de Temperatura");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 198);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JButton btnConvereter = new JButton("Converter");
		btnConvereter.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnConvereter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double fahrenheit = Double.parseDouble(txtValor.getText());
					double celsius = (fahrenheit - 32) / 1.8;
					DecimalFormat format =new DecimalFormat("#,###.##");
					txtResultado.setText(format.format(celsius) + " °C");
				} catch (Exception erro) {

				}

			}
		});
		contentPane.add(btnConvereter, BorderLayout.SOUTH);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2, 5, 5));

		JLabel lblFahrenheit = new JLabel("Fahrenheit:");
		lblFahrenheit.setHorizontalAlignment(SwingConstants.CENTER);
		lblFahrenheit.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(lblFahrenheit);

		txtValor = new JTextField();
		txtValor.setToolTipText("valor");
		txtValor.setHorizontalAlignment(SwingConstants.CENTER);
		txtValor.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(txtValor);
		txtValor.setColumns(10);

		lblCelsius = new JLabel("Celsius:");
		lblCelsius.setHorizontalAlignment(SwingConstants.CENTER);
		lblCelsius.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(lblCelsius);

		txtResultado = new JTextField();
		txtResultado.setToolTipText("resultado");
		txtResultado.setHorizontalAlignment(SwingConstants.CENTER);
		txtResultado.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(txtResultado);
		txtResultado.setColumns(10);
	}

}
