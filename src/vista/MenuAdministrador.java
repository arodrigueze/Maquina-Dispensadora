package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controlador.ControladorUsuarioAdministrador;
import modelo.Espiral;
import modelo.PosicionEspiral;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;

public class MenuAdministrador extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField nombreProductoCampoTexto;
	private JTextField precioProductoCampoTexto;
	private JTextField cantidadProductoCampoTexto;
	private JComboBox listaPosicionesEspirales;
	JComboBox listaProductoEnEspiralEditar;
	private ControladorUsuarioAdministrador controladorUsuarioAdministrador;
	private JTextField editarProductoCampoTexto;
	private JTextField editarPrecioCampoTexto;
	private JTextField editarCantidadCampoTexto;

	/**
	 * Create the dialog.
	 * @throws IOException 
	 */
	public MenuAdministrador(LoginAdministrador parent, boolean modal) throws IOException {
		super(parent, modal);
		controladorUsuarioAdministrador = new ControladorUsuarioAdministrador();
		setBounds(100, 100, 781, 395);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblAgregarEspiral = new JLabel("AGREGAR ESPIRAL");
		lblAgregarEspiral.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgregarEspiral.setBounds(10, 0, 140, 14);
		contentPanel.add(lblAgregarEspiral);
		
		JLabel lblNombreProducto = new JLabel("Nombre Producto");
		lblNombreProducto.setBounds(10, 25, 115, 14);
		contentPanel.add(lblNombreProducto);
		
		nombreProductoCampoTexto = new JTextField();
		nombreProductoCampoTexto.setBounds(10, 42, 140, 20);
		contentPanel.add(nombreProductoCampoTexto);
		nombreProductoCampoTexto.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio ");
		lblPrecio.setBounds(10, 73, 115, 14);
		contentPanel.add(lblPrecio);
		
		precioProductoCampoTexto = new JTextField();
		precioProductoCampoTexto.setColumns(10);
		precioProductoCampoTexto.setBounds(10, 89, 140, 20);
		contentPanel.add(precioProductoCampoTexto);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 120, 115, 14);
		contentPanel.add(lblCantidad);
		
		cantidadProductoCampoTexto = new JTextField();
		cantidadProductoCampoTexto.setColumns(10);
		cantidadProductoCampoTexto.setBounds(10, 136, 140, 20);
		contentPanel.add(cantidadProductoCampoTexto);
		
		JButton agregarEspiralBoton = new JButton("Agregar Espiral");
		agregarEspiralBoton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				agregarEspiral();				
			}
		});
		
		agregarEspiralBoton.setBounds(10, 195, 140, 23);
		contentPanel.add(agregarEspiralBoton);
		
		listaPosicionesEspirales = new JComboBox();
		listaPosicionesEspirales.setBounds(10, 164, 140, 20);
		contentPanel.add(listaPosicionesEspirales);
		
		JLabel lblEditarEspiral = new JLabel("EDITAR ESPIRAL");
		lblEditarEspiral.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditarEspiral.setBounds(176, 0, 140, 14);
		contentPanel.add(lblEditarEspiral);
		
		JLabel label_1 = new JLabel("Nombre Producto");
		label_1.setBounds(176, 25, 115, 14);
		contentPanel.add(label_1);
		
		editarProductoCampoTexto = new JTextField();
		editarProductoCampoTexto.setColumns(10);
		editarProductoCampoTexto.setBounds(176, 42, 140, 20);
		contentPanel.add(editarProductoCampoTexto);
		
		JLabel label_2 = new JLabel("Precio ");
		label_2.setBounds(176, 73, 115, 14);
		contentPanel.add(label_2);
		
		editarPrecioCampoTexto = new JTextField();
		editarPrecioCampoTexto.setColumns(10);
		editarPrecioCampoTexto.setBounds(176, 89, 140, 20);
		contentPanel.add(editarPrecioCampoTexto);
		
		JLabel label_3 = new JLabel("Cantidad");
		label_3.setBounds(176, 120, 115, 14);
		contentPanel.add(label_3);
		
		editarCantidadCampoTexto = new JTextField();
		editarCantidadCampoTexto.setColumns(10);
		editarCantidadCampoTexto.setBounds(176, 136, 140, 20);
		contentPanel.add(editarCantidadCampoTexto);
		
		listaProductoEnEspiralEditar = new JComboBox();
		listaProductoEnEspiralEditar.setBounds(176, 164, 140, 20);
		contentPanel.add(listaProductoEnEspiralEditar);
		
		JButton botonEditarEspiral = new JButton("Editar Espiral");
		botonEditarEspiral.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				editarEspiral();
			}
		});
		botonEditarEspiral.setBounds(176, 195, 140, 23);
		contentPanel.add(botonEditarEspiral);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		cargarListaPosicionesEspirales();
	}
	
	private void cargarListaPosicionesEspirales() throws IOException {
		List<PosicionEspiral> listaPosicionesEspiralesDisponibles = controladorUsuarioAdministrador.obtenerEspiralesDisponibles();
		List<PosicionEspiral> listaPosicionesEspiralesNoDisponibles = controladorUsuarioAdministrador.obtenerEspiralesNoDisponibles();
		for (Iterator iterator = listaPosicionesEspiralesDisponibles.iterator(); iterator.hasNext();) {
			PosicionEspiral posicionEspiral = (PosicionEspiral) iterator.next();
			listaPosicionesEspirales.addItem(posicionEspiral.getFila()+" "+posicionEspiral.getColumna());
		}
		for (Iterator iterator = listaPosicionesEspiralesNoDisponibles.iterator(); iterator.hasNext();) {
			PosicionEspiral posicionEspiral1 = (PosicionEspiral) iterator.next();
			listaProductoEnEspiralEditar.addItem(posicionEspiral1.getFila()+" "+posicionEspiral1.getColumna());
		}
		
	}
	
	private void editarEspiral() {
		// TODO Auto-generated method stub
		
	}

	private void agregarEspiral() {
		try {
			String nombre = nombreProductoCampoTexto.getText();
			double precio = Double.parseDouble(precioProductoCampoTexto.getText());
			int cantidad = Integer.parseInt(cantidadProductoCampoTexto.getText());
			char fila = listaPosicionesEspirales.getSelectedItem().toString().charAt(0);
			int columna = Integer.parseInt(listaPosicionesEspirales.getSelectedItem().toString().substring(2,3));
			if(!nombre.equals("")&&precio>=0&&cantidad>=0&&listaPosicionesEspirales.getItemCount()>0){
				if(controladorUsuarioAdministrador.agregarEspiral(new Espiral(nombre,precio , cantidad,fila,columna))){
					JOptionPane.showMessageDialog(this, "Espiral agregada correctamente.");
					nombreProductoCampoTexto.setText("");
					precioProductoCampoTexto.setText("");
					cantidadProductoCampoTexto.setText("");
					listaPosicionesEspirales.removeAllItems();
					controladorUsuarioAdministrador.ocuparPosicionEspiral(new PosicionEspiral(fila, columna, true));
					cargarListaPosicionesEspirales();
				}else{
					JOptionPane.showMessageDialog(this, "Producto no agregado.");
				}
				
			}else{
				JOptionPane.showMessageDialog(this, "Los campos no pueden estar vacios.");
			}
		} catch (NumberFormatException | IOException e) {
			JOptionPane.showMessageDialog(this, "Verifica los campos numericos.");
		} 
		
	}
}
