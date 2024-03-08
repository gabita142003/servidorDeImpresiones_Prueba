import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.PriorityQueue;
import java.util.Queue;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class impresiónDeArchivos_GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField TextNombreArchivo;
	private JTextField textContenido;
	private JTextField textFecha;
	private JTextField textUsuario;
	private JTextField txtArchivo;
	private JTextField txtImpresiones;
	private JTextField textField_2;
	private JList listArchivosP;
	private JList listImpresionesL;
    public DefaultComboBoxModel comboTamaño = new DefaultComboBoxModel(); //Combo de tamaño archivo
    public DefaultComboBoxModel comboFormato = new DefaultComboBoxModel(); //combo del formato archivo
    public  DefaultListModel modelArchivo = new DefaultListModel();         //Jtlist de la lista de archivos 
    public  DefaultListModel modelImpresiones = new DefaultListModel();     // Jtlist de la lista de impresiones 
   
    Queue<archivo> colaArchivos = new PriorityQueue<archivo>();
    
    /**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					impresiónDeArchivos_GUI frame = new impresiónDeArchivos_GUI();
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
	public impresiónDeArchivos_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 801, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SERVIDOR DE IMPRESIONES");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(233, -5, 330, 72);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(new Color(248, 155, 116));
		textField.setForeground(new Color(248, 155, 116));
		textField.setBounds(0, 0, 785, 72);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Crear Archivo");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(97, 83, 138, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lbNombre = new JLabel("Nombre del archivo:");
		lbNombre.setBounds(22, 126, 113, 14);
		contentPane.add(lbNombre);
		
		TextNombreArchivo = new JTextField();
		TextNombreArchivo.setBounds(142, 123, 168, 20);
		contentPane.add(TextNombreArchivo);
		TextNombreArchivo.setColumns(10);
		
		JLabel lbContenido = new JLabel("Contenido:");
		lbContenido.setBounds(20, 151, 125, 25);
		contentPane.add(lbContenido);
		
		textContenido = new JTextField();
		textContenido.setColumns(10);
		textContenido.setBounds(22, 178, 288, 99);
		contentPane.add(textContenido);
		
		JLabel lbFecha = new JLabel("Fecha de creación:");
		lbFecha.setBounds(10, 297, 135, 14);
		contentPane.add(lbFecha);
		
		textFecha = new JTextField();
		textFecha.setColumns(10);
		textFecha.setBounds(142, 294, 168, 20);
		contentPane.add(textFecha);
		
		JLabel lblNewLabel_2 = new JLabel("Formato de impresión");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(72, 356, 198, 30);
		contentPane.add(lblNewLabel_2);
		
		JLabel lbUsuario = new JLabel("Usuario");
		lbUsuario.setBounds(10, 333, 146, 14);
		contentPane.add(lbUsuario);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(48, 330, 262, 20);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Tamaño:");
		lblNewLabel_3.setBounds(10, 399, 91, 14);
		contentPane.add(lblNewLabel_3);
		
		JComboBox comboTamaño = new JComboBox();
		comboTamaño.setModel(new DefaultComboBoxModel(new String[] {"Carta", "Oficio", "A5", "B4"}));
		comboTamaño.setBounds(71, 395, 241, 22);
		contentPane.add(comboTamaño);
		
		JLabel lblNewLabel_3_1 = new JLabel("Formato:");
		lblNewLabel_3_1.setBounds(10, 424, 91, 14);
		contentPane.add(lblNewLabel_3_1);
		
		JComboBox comboFormato = new JComboBox();
		comboFormato.setModel(new DefaultComboBoxModel(new String[] {"PDF", "WORD", "EXCEL", "TXT", "PNG", "JPG"}));
		comboFormato.setBounds(72, 424, 241, 22);
		contentPane.add(comboFormato);
		
		JButton btCrearArchivo = new JButton("Crear archivo");
		btCrearArchivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btCrearArchivo.setBounds(10, 457, 131, 23);
		contentPane.add(btCrearArchivo);
		
		listArchivosP = new JList();
		listArchivosP.setBounds(362, 125, 173, 222);
		contentPane.add(listArchivosP);
		
		listImpresionesL = new JList();
		listImpresionesL.setBounds(555, 125, 173, 222);
		contentPane.add(listImpresionesL);
		
		txtArchivo = new JTextField();
		txtArchivo.setHorizontalAlignment(SwingConstants.CENTER);
		txtArchivo.setText("ARCHIVO PENDIENTES");
		txtArchivo.setBounds(359, 97, 176, 20);
		contentPane.add(txtArchivo);
		txtArchivo.setColumns(10);
		
		txtImpresiones = new JTextField();
		txtImpresiones.setText("IMPRESIONES LISTAS");
		txtImpresiones.setHorizontalAlignment(SwingConstants.CENTER);
		txtImpresiones.setColumns(10);
		txtImpresiones.setBounds(552, 97, 176, 20);
		contentPane.add(txtImpresiones);
		
		JButton btImprimir = new JButton("Imprimir archivo");
		btImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btImprimir.setBounds(448, 373, 229, 23);
		contentPane.add(btImprimir);
		
		JButton btnMostrarImpresiones = new JButton("Mostrar archivos pendientes");
		btnMostrarImpresiones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMostrarImpresiones.setBounds(448, 415, 229, 23);
		contentPane.add(btnMostrarImpresiones);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(250, 240, 207));
		textField_2.setBounds(0, 70, 785, 421);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}
}
