package ejercicio1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventana extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextArea txtn1;
	private JTextArea txtn2;
	private JTextArea txtn3;
	private JScrollPane scrollPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JTextArea txts;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana frame = new ventana();
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
	public ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("PRIMER NÚMERO:");
			lblNewLabel.setBounds(24, 40, 117, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("SEGUNDO NÚMERO:");
			lblNewLabel_1.setBounds(24, 83, 117, 14);
			contentPane.add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("TERCER NÚMERO:");
			lblNewLabel_2.setBounds(24, 127, 117, 14);
			contentPane.add(lblNewLabel_2);
		}
		{
			txtn1 = new JTextArea();
			txtn1.setBounds(151, 35, 89, 22);
			contentPane.add(txtn1);
		}
		{
			txtn2 = new JTextArea();
			txtn2.setBounds(151, 78, 89, 22);
			contentPane.add(txtn2);
		}
		{
			txtn3 = new JTextArea();
			txtn3.setBounds(149, 122, 91, 22);
			contentPane.add(txtn3);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(48, 181, 310, 119);
			contentPane.add(scrollPane);
			{
				txts = new JTextArea();
				txts.setText("verificando ");
				scrollPane.setViewportView(txts);
			}
		}
		{
			btnNewButton = new JButton("SUMAR 2 ENTEROS");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(257, 36, 138, 23);
			contentPane.add(btnNewButton);
		}
		{
			btnNewButton_1 = new JButton("SUMAR 3 ENTEROS");
			btnNewButton_1.addActionListener(this);
			btnNewButton_1.setBounds(257, 74, 138, 23);
			contentPane.add(btnNewButton_1);
		}
		{
			btnNewButton_2 = new JButton("SUMAR 2 REALES");
			btnNewButton_2.addActionListener(this);
			btnNewButton_2.setBounds(257, 123, 138, 23);
			contentPane.add(btnNewButton_2);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_2) {
			do_btnNewButton_2_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		try {
			int n1=Integer.parseInt(txtn1.getText());
			int n2=Integer.parseInt(txtn2.getText());
			calculadora c=new calculadora (n1, n2);
			txts.setText("");
			txts.append("La suma es: " +c.sumar(n1, n2));
		}catch(Exception e2){
			JOptionPane.showMessageDialog(this, "NO INGRESÓ UN NÚMERO REAL, Ingrese un número real");
		}
		
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		try {
			int n1=Integer.parseInt(txtn1.getText());
			int n2=Integer.parseInt(txtn2.getText());
			int n3=Integer.parseInt(txtn3.getText());
			calculadora c=new calculadora (n1, n2, n3);
			txts.setText("");
			txts.append("La suma es: " +c.sumar(n1, n2, n3));
		}catch(Exception e2){
			JOptionPane.showMessageDialog(this, "NO INGRESÓ UN NÚMERO REAL, Ingrese un número real");
		}
	}
	protected void do_btnNewButton_2_actionPerformed(ActionEvent e) {
	
	}
}
