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
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.HeadlessException;

public class MenuAdministrador extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JComboBox agregarListaPosicionesEspirales;
	private JComboBox editarListaProductoEnEspiral;
	private JComboBox modificarCantidadListaNombres;
	private final JPanel contentPanel = new JPanel();
	private JTextField agregarNombreProductoCampoTexto;
	private JTextField agregarPrecioProductoCampoTexto;
	private JTextField agregarCantidadProductoCampoTexto;
	private ControladorUsuarioAdministrador controladorUsuarioAdministrador;
	private JTextField editarNombreEspiralCampoTexto;
	private JTextField editarPrecioCampoTexto;
	private JTextField editarCantidadCampoTexto;
	private JTextField modificarCantidadCampoTexto;
	private JButton agregarEspiralBoton;
	private JButton editarBotonEspiral;
	private JButton modificarCantidadBoton;
	private JButton servicioBoton;
	private JButton eliminarEspiralBoton;
	private JComboBox eliminarEspiralLista;

	/**
	 * Create the dialog.
	 * @throws IOException 
	 */
	public MenuAdministrador(LoginAdministrador parent, boolean modal) throws IOException {
		super(parent, modal);
		controladorUsuarioAdministrador = new ControladorUsuarioAdministrador();
		setBounds(100, 100, 781, 325);
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
		
		agregarNombreProductoCampoTexto = new JTextField();
		agregarNombreProductoCampoTexto.setBounds(10, 42, 140, 20);
		contentPanel.add(agregarNombreProductoCampoTexto);
		agregarNombreProductoCampoTexto.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio ");
		lblPrecio.setBounds(10, 73, 115, 14);
		contentPanel.add(lblPrecio);
		
		agregarPrecioProductoCampoTexto = new JTextField();
		agregarPrecioProductoCampoTexto.setColumns(10);
		agregarPrecioProductoCampoTexto.setBounds(10, 89, 140, 20);
		contentPanel.add(agregarPrecioProductoCampoTexto);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 120, 115, 14);
		contentPanel.add(lblCantidad);
		
		agregarCantidadProductoCampoTexto = new JTextField();
		agregarCantidadProductoCampoTexto.setColumns(10);
		agregarCantidadProductoCampoTexto.setBounds(10, 136, 140, 20);
		contentPanel.add(agregarCantidadProductoCampoTexto);
		
		agregarEspiralBoton = new JButton("Agregar Espiral");
		agregarEspiralBoton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				agregarEspiral();				
			}
		});
		
		agregarEspiralBoton.setBounds(10, 195, 140, 23);
		contentPanel.add(agregarEspiralBoton);
		
		agregarListaPosicionesEspirales = new JComboBox();
		agregarListaPosicionesEspirales.setBounds(10, 164, 140, 20);
		contentPanel.add(agregarListaPosicionesEspirales);
		
		JLabel lblEditarEspiral = new JLabel("EDITAR ESPIRAL");
		lblEditarEspiral.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditarEspiral.setBounds(176, 0, 140, 14);
		contentPanel.add(lblEditarEspiral);
		
		JLabel label_1 = new JLabel("Nombre Producto");
		label_1.setBounds(176, 25, 140, 14);
		contentPanel.add(label_1);
		
		editarNombreEspiralCampoTexto = new JTextField();
		editarNombreEspiralCampoTexto.setColumns(10);
		editarNombreEspiralCampoTexto.setBounds(176, 42, 140, 20);
		contentPanel.add(editarNombreEspiralCampoTexto);
		
		JLabel label_2 = new JLabel("Precio ");
		label_2.setBounds(176, 73, 140, 14);
		contentPanel.add(label_2);
		
		editarPrecioCampoTexto = new JTextField();
		editarPrecioCampoTexto.setColumns(10);
		editarPrecioCampoTexto.setBounds(176, 89, 140, 20);
		contentPanel.add(editarPrecioCampoTexto);
		
		JLabel label_3 = new JLabel("Cantidad");
		label_3.setBounds(176, 120, 140, 14);
		contentPanel.add(label_3);
		
		editarCantidadCampoTexto = new JTextField();
		editarCantidadCampoTexto.setColumns(10);
		editarCantidadCampoTexto.setBounds(176, 136, 140, 20);
		contentPanel.add(editarCantidadCampoTexto);
		
		editarListaProductoEnEspiral = new JComboBox();
		editarListaProductoEnEspiral.setBounds(176, 164, 140, 20);
		contentPanel.add(editarListaProductoEnEspiral);
		
		editarBotonEspiral = new JButton("Editar Espiral");
		editarBotonEspiral.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				editarEspiral();
			}
		});
		
		editarBotonEspiral.setBounds(176, 195, 140, 23);
		contentPanel.add(editarBotonEspiral);
		
		JLabel label = new JLabel("Cantidad");
		label.setBounds(340, 25, 140, 14);
		contentPanel.add(label);
		
		modificarCantidadCampoTexto = new JTextField();
		modificarCantidadCampoTexto.setColumns(10);
		modificarCantidadCampoTexto.setBounds(340, 42, 140, 20);
		contentPanel.add(modificarCantidadCampoTexto);
		
		modificarCantidadListaNombres = new JComboBox();
		modificarCantidadListaNombres.setBounds(340, 70, 140, 20);
		contentPanel.add(modificarCantidadListaNombres);
		
		JLabel lblEditarCantidad = new JLabel("EDITAR CANTIDAD ESPIRAL");
		lblEditarCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditarCantidad.setBounds(340, 0, 140, 14);
		contentPanel.add(lblEditarCantidad);
		
		modificarCantidadBoton = new JButton("Modificar Cantidad");
		modificarCantidadBoton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				editarCantidadEspiral();
			}
		});
		modificarCantidadBoton.setBounds(340, 101, 140, 23);
		contentPanel.add(modificarCantidadBoton);
		
		eliminarEspiralLista = new JComboBox();
		eliminarEspiralLista.setBounds(340, 164, 140, 20);
		contentPanel.add(eliminarEspiralLista);
		
		eliminarEspiralBoton = new JButton("Eliminar Espiral");
		eliminarEspiralBoton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					eliminarEspiral();
				} catch (HeadlessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		eliminarEspiralBoton.setBounds(340, 195, 140, 23);
		contentPanel.add(eliminarEspiralBoton);
		
		JLabel lblEliminarEspiral = new JLabel("ELIMINAR ESPIRAL");
		lblEliminarEspiral.setHorizontalAlignment(SwingConstants.CENTER);
		lblEliminarEspiral.setBounds(340, 139, 140, 14);
		contentPanel.add(lblEliminarEspiral);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				servicioBoton = new JButton("En Servicio");
				servicioBoton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						cambiarEstadoMaquina();
					}
				});
				servicioBoton.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 14));
				servicioBoton.setBackground(Color.RED);
				servicioBoton.setActionCommand("Cancel");
				buttonPane.add(servicioBoton);
			}
		}
		cargarListas();
		Component[] componentes = this.contentPanel.getComponents();
		for (int i = 0; i < componentes.length; i++) {
			if(componentes[i] instanceof JButton||componentes[i] instanceof JComboBox||componentes[i] instanceof JTextField){
				componentes[i].setEnabled(false);
			}
		}
		servicioBoton.setEnabled(true);
	}
	

	
	private void cargarListas() throws IOException {
		List<PosicionEspiral> listaPosicionesEspiralesDisponibles = controladorUsuarioAdministrador.obtenerEspiralesDisponibles();
		List<PosicionEspiral> listaPosicionesEspiralesNoDisponibles = controladorUsuarioAdministrador.obtenerEspiralesNoDisponibles();
		List<Espiral> listaEspirales = controladorUsuarioAdministrador.obtenerEspirales();
		
		modificarCantidadListaNombres.removeAllItems();
		editarListaProductoEnEspiral.removeAllItems();
		agregarListaPosicionesEspirales.removeAllItems();
		
		for (Iterator iterator = listaPosicionesEspiralesDisponibles.iterator(); iterator.hasNext();) {
			PosicionEspiral posicionEspiral = (PosicionEspiral) iterator.next();
			agregarListaPosicionesEspirales.addItem(posicionEspiral.getFila()+" "+posicionEspiral.getColumna());
		}
		for (Iterator iterator = listaPosicionesEspiralesNoDisponibles.iterator(); iterator.hasNext();) {
			PosicionEspiral posicionEspiral1 = (PosicionEspiral) iterator.next();
			editarListaProductoEnEspiral.addItem(posicionEspiral1.getFila()+" "+posicionEspiral1.getColumna());
		}	
		for (Iterator iterator = listaEspirales.iterator(); iterator.hasNext();) {
			Espiral espiral = (Espiral) iterator.next();
			eliminarEspiralLista.addItem(espiral.getFila()+" "+espiral.getColumna()+" "+espiral.getNombreProducto());
			modificarCantidadListaNombres.addItem(espiral.getFila()+" "+espiral.getColumna()+" "+espiral.getNombreProducto());
		}
	}
	
	private void eliminarEspiral() throws HeadlessException, IOException {
		if(eliminarEspiralLista.getItemCount()>0){
			char fila = eliminarEspiralLista.getSelectedItem().toString().charAt(0);
			int columna = Integer.parseInt(eliminarEspiralLista.getSelectedItem().toString().substring(2,3));
			if (controladorUsuarioAdministrador.eliminarEspiral(fila,columna)) {
				JOptionPane.showMessageDialog(this, "Se ha eliminado la espiral");
				controladorUsuarioAdministrador.desocuparPosicionEspiral(new PosicionEspiral(fila, columna, false));
			}else{
				JOptionPane.showMessageDialog(this, "No se ha eliminado la espiral");
			}	
		}else{
			JOptionPane.showMessageDialog(this, "No hay espirales para eliminar");
		}
		cargarListas();
		
	}
	
	private void cambiarEstadoMaquina() {
		Component[] componentes = this.contentPanel.getComponents();
		if(controladorUsuarioAdministrador.isServicio()){
			for (int i = 0; i < componentes.length; i++) {
				if(componentes[i] instanceof JButton||componentes[i] instanceof JComboBox||componentes[i] instanceof JTextField){
					componentes[i].setEnabled(true);
				}
			}
			servicioBoton.setBackground(new Color(50, 205,50));
			servicioBoton.setText("Fuera de Servicio");
			controladorUsuarioAdministrador.cambiarEstadoMaquina(false);
		}else{
			for (int i = 0; i < componentes.length; i++) {
				if(componentes[i] instanceof JButton||componentes[i] instanceof JComboBox||componentes[i] instanceof JTextField){
					componentes[i].setEnabled(false);
				}
			}
			servicioBoton.setEnabled(true);
			servicioBoton.setBackground(new Color(255,0,0));
			servicioBoton.setText("en Servicio");
			controladorUsuarioAdministrador.cambiarEstadoMaquina(true);
		}
	}

	private void editarCantidadEspiral() {
		try {
			int cantidad = Integer.parseInt(modificarCantidadCampoTexto.getText());
			char fila = modificarCantidadListaNombres.getSelectedItem().toString().charAt(0);
			int columna = Integer.parseInt(modificarCantidadListaNombres.getSelectedItem().toString().substring(2,3));
			if(modificarCantidadListaNombres.getItemCount()>0){
				if (cantidad<=0) {
					JOptionPane.showMessageDialog(this, "Error la cantidad no puede ser negativa.");
				}else{
					JOptionPane.showMessageDialog(this, "Cantidad editada correctamente.");
					controladorUsuarioAdministrador.editarCantidad(fila,columna,cantidad);
					cargarListas();
				}				
			}else{
				JOptionPane.showMessageDialog(this, "No hay productos");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Digitar una cantidad entera.");
		}		
	}
	
	private void editarEspiral() {
		try {
			String nombre = editarNombreEspiralCampoTexto.getText();
			double precio = Double.parseDouble(editarPrecioCampoTexto.getText());
			int cantidad = Integer.parseInt(editarCantidadCampoTexto.getText());
			char fila = editarListaProductoEnEspiral.getSelectedItem().toString().charAt(0);
			int columna = Integer.parseInt(editarListaProductoEnEspiral.getSelectedItem().toString().substring(2,3));
			if(!nombre.equals("")&&precio>=0&&cantidad>=0&&editarListaProductoEnEspiral.getItemCount()>0){
				if(controladorUsuarioAdministrador.editarEspiral(new Espiral(nombre,precio,cantidad,fila,columna))){
					JOptionPane.showMessageDialog(this, "Espiral editada correctamente.");
					editarNombreEspiralCampoTexto.setText("");
					editarCantidadCampoTexto.setText("");
					editarPrecioCampoTexto.setText("");
					cargarListas();
				}else{
					JOptionPane.showMessageDialog(this, "Espiral no editado.");
				}
			}else{
				JOptionPane.showMessageDialog(this, "Los campos no pueden estar vacios.");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Verifica los campos numericos.");
		}
		
		
		
	}

	private void agregarEspiral() {
		try {
			String nombre = agregarNombreProductoCampoTexto.getText();
			double precio = Double.parseDouble(agregarPrecioProductoCampoTexto.getText());
			int cantidad = Integer.parseInt(agregarCantidadProductoCampoTexto.getText());
			char fila = agregarListaPosicionesEspirales.getSelectedItem().toString().charAt(0);
			int columna = Integer.parseInt(agregarListaPosicionesEspirales.getSelectedItem().toString().substring(2,3));
			if(!nombre.equals("")&&precio>=0&&cantidad>=0&&agregarListaPosicionesEspirales.getItemCount()>0){
				if(controladorUsuarioAdministrador.agregarEspiral(new Espiral(nombre,precio , cantidad,fila,columna))){
					JOptionPane.showMessageDialog(this, "Espiral agregada correctamente.");
					agregarNombreProductoCampoTexto.setText("");
					agregarPrecioProductoCampoTexto.setText("");
					agregarCantidadProductoCampoTexto.setText("");
					controladorUsuarioAdministrador.ocuparPosicionEspiral(new PosicionEspiral(fila, columna, true));
					cargarListas();
				}else{
					JOptionPane.showMessageDialog(this, "Espiral no agregado.");
				}
				
			}else{
				JOptionPane.showMessageDialog(this, "Los campos no pueden estar vacios.");
			}
		} catch (NumberFormatException | IOException e) {
			JOptionPane.showMessageDialog(this, "Verifica los campos numericos.");
		} 
		
	}
}
