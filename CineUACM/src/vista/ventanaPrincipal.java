package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JSpinner;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ventanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextField textField;
	private JPanel panel3;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JPanel contentPane;
	@SuppressWarnings("unused")
	private JButton btnAadirALista;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox;
	private JLabel lblProductos; 
	private JLabel lblSubtotal;
	private JLabel lblIva;
	private JLabel lblTotal; 
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox_1;
	private JLabel lblGnero;
	private JLabel lblCantidad;
	@SuppressWarnings("unused")
	private JPanel panel2;
	private JButton btnComprar;
	private JButton btnCancelar;
	private JButton btnModificar;
	private JLabel lblNewLabel_1;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaPrincipal frame = new ventanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public ventanaPrincipal() {
		setName("framePrincipal");
		setSize(new Dimension(967, 620));
		setTitle("Cat\u00E1logo Pel\u00EDculas");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Anizz\\Pictures\\imagenes\\Imagenes cine\\LOGOUACM1.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 914, 620);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new LineBorder(new Color(72, 209, 204), 3));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBorder(new CompoundBorder(new TitledBorder(new TitledBorder(new LineBorder(new Color(72, 209, 204), 3), "Cat\u00E1logo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(46, 139, 87)), "C\u00E1talogo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(46, 139, 87)), null));
		
		JCheckBox chckbxRenta = new JCheckBox("");
		
		JCheckBox chckbxVenta = new JCheckBox("");
		
		JButton btnAadirALista = new JButton("A\u00F1adir a lista de Deseos");
		btnAadirALista.setAlignmentY(Component.TOP_ALIGNMENT);
		btnAadirALista.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnAadirALista.setBackground(new Color(255, 255, 153));
		btnAadirALista.setIcon(new ImageIcon("C:\\Users\\Anizz\\Pictures\\imagenes\\Imagenes cine\\listaD.jpg"));
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Terror", "Romance", "Animadas", "Gore", "CienciaFicci\u00F3n"}));
		
		lblGnero = new JLabel("G\u00E9nero");
		lblGnero.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblGnero.setForeground(new Color(204, 153, 255));
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCantidad.setForeground(new Color(204, 153, 255));
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		
		JPanel panel2 = new JPanel();
		panel2.setForeground(new Color(204, 204, 255));
		panel2.setBackground(Color.BLACK);
		panel2.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(72, 209, 204), 3), "Carrito de Pel\u00EDculas", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(46, 139, 87)), null));
		
		panel3 = new JPanel();
		panel3.setBackground(new Color(0, 0, 0));
		panel3.setBorder(new CompoundBorder(new TitledBorder(new LineBorder(new Color(72, 209, 204), 3), "Detalles de pago", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(46, 139, 87)), null));
		
		JLabel lblNewLabel = new JLabel("Renta");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setForeground(new Color(204, 153, 255));
		
		lblNewLabel_1 = new JLabel("Venta");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setForeground(new Color(204, 153, 255));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(40)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxVenta)
								.addComponent(chckbxRenta))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(lblNewLabel_1))
							.addGap(44)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblGnero, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCantidad))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)))
						.addComponent(btnAadirALista, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 382, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel2, GroupLayout.PREFERRED_SIZE, 434, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel3, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE))
					.addGap(32))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblGnero, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNewLabel))
								.addComponent(chckbxRenta))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCantidad)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(chckbxVenta)
								.addComponent(lblNewLabel_1))
							.addGap(33)
							.addComponent(btnAadirALista))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addComponent(panel2, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(panel3, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		
		lblProductos = new JLabel("Productos");
		lblProductos.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblProductos.setForeground(new Color(204, 153, 255));
		lblSubtotal = new JLabel("Subtotal");
		lblSubtotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSubtotal.setForeground(new Color(204, 153, 255));
		lblIva = new JLabel("IVA");
		lblIva.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIva.setForeground(new Color(204, 153, 255));
		lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTotal.setForeground(new Color(204, 153, 255));
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		GroupLayout gl_panel3 = new GroupLayout(panel3);
		gl_panel3.setHorizontalGroup(
			gl_panel3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel3.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTotal, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
						.addComponent(lblIva, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
						.addComponent(lblSubtotal)
						.addComponent(lblProductos))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel3.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textField_4, 0, 0, Short.MAX_VALUE)
						.addComponent(textField_3, 0, 0, Short.MAX_VALUE)
						.addComponent(textField_2, 0, 0, Short.MAX_VALUE)
						.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
					.addContainerGap(289, Short.MAX_VALUE))
		);
		gl_panel3.setVerticalGroup(
			gl_panel3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel3.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblProductos))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel3.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSubtotal))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel3.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblIva))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel3.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTotal))
					.addContainerGap(67, Short.MAX_VALUE))
		);
		panel3.setLayout(gl_panel3);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		
		btnComprar = new JButton("Comprar");
		btnComprar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnComprar.setForeground(new Color(255, 0, 204));
		btnComprar.setIcon(new ImageIcon("C:\\Users\\Anizz\\Pictures\\imagenes\\Imagenes cine\\carritoP.jpg"));
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCancelar.setForeground(new Color(255, 0, 204));
		btnCancelar.setIcon(new ImageIcon("C:\\Users\\Anizz\\Pictures\\imagenes\\Imagenes cine\\CancelarD.jpg"));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnModificar.setForeground(new Color(255, 0, 204));
		btnModificar.setIcon(new ImageIcon("C:\\Users\\Anizz\\Pictures\\imagenes\\Imagenes cine\\EditarD.jpg"));
		GroupLayout gl_panel2 = new GroupLayout(panel2);
		gl_panel2.setHorizontalGroup(
			gl_panel2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel2.createSequentialGroup()
					.addGap(26)
					.addComponent(btnComprar)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnModificar)
					.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
					.addComponent(btnCancelar)
					.addGap(44))
				.addGroup(gl_panel2.createSequentialGroup()
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 418, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(33, Short.MAX_VALUE))
		);
		gl_panel2.setVerticalGroup(
			gl_panel2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel2.createSequentialGroup()
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel2.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnComprar)
						.addComponent(btnCancelar)
						.addComponent(btnModificar))
					.addGap(38))
		);
		panel2.setLayout(gl_panel2);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		contentPane.setLayout(gl_contentPane);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane, panel, scrollPane, table, btnAadirALista, chckbxRenta, lblGnero, chckbxVenta, lblCantidad, comboBox_1, comboBox, panel3, lblProductos, lblTotal, lblIva, lblSubtotal, textField_4, textField_3, textField_2, textField_1, panel2, btnComprar, btnCancelar, textField}));
	}
	public JSpinner getSpinner() {
		return getSpinner();
	}
	public JPanel getPanel_2() {
		return panel3;
	}
}
