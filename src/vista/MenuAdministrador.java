package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorUsuarioAdministrador;
import modelo.Arca;
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
	private JLabel lblAgregarArca;
	private JLabel lblNombreArca;
	private JTextField denominacionArcaAgregarCampoTexto;
	private JLabel lblCantidad_1;
	private JTextField cantidadDenominacionArcaCampoTexto;
	private JButton agregarArcaBoton;
	private JComboBox listaDeArcasComboBox;
	private JLabel lblListaDeArcas;
	private JLabel lblModificarArca;
	private JTextField modificarDenominacionCampoText;
	private JTextField modificarCantidadDenominacionCampoTexto;
	private JButton modificarDenominacionArcaBoton;
	private JButton modificarCantidadDenominacionBoton;

	/**
	 * Create the dialog.
	 * @throws IOException 
	 */
	public MenuAdministrador(LoginAdministrador parent, boolean modal) throws IOException {
		super(parent, modal);
		controladorUsuarioAdministrador = new ControladorUsuarioAdministrador();
		setBounds(100, 100, 944, 325);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblAgregarEspiral = new JLabel("AGREGAR ESPIRAL");
		lblAgregarEspiral.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgregarEspiral.setBounds(10, 0, 170, 14);
		contentPanel.add(lblAgregarEspiral);
		
		JLabel lblNombreProducto = new JLabel("Nombre Producto");
		lblNombreProducto.setBounds(10, 25, 170, 14);
		contentPanel.add(lblNombreProducto);
		
		agregarNombreProductoCampoTexto = new JTextField();
		agregarNombreProductoCampoTexto.setBounds(10, 42, 170, 20);
		contentPanel.add(agregarNombreProductoCampoTexto);
		agregarNombreProductoCampoTexto.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio ");
		lblPrecio.setBounds(10, 73, 170, 14);
		contentPanel.add(lblPrecio);
		
		agregarPrecioProductoCampoTexto = new JTextField();
		agregarPrecioProductoCampoTexto.setColumns(10);
		agregarPrecioProductoCampoTexto.setBounds(10, 89, 170, 20);
		contentPanel.add(agregarPrecioProductoCampoTexto);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 120, 170, 14);
		contentPanel.add(lblCantidad);
		
		agregarCantidadProductoCampoTexto = new JTextField();
		agregarCantidadProductoCampoTexto.setColumns(10);
		agregarCantidadProductoCampoTexto.setBounds(10, 136, 170, 20);
		contentPanel.add(agregarCantidadProductoCampoTexto);
		
		agregarEspiralBoton = new JButton("Agregar Espiral");
		agregarEspiralBoton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(agregarEspiralBoton.isEnabled())
				agregarEspiral();				
			}
		});
		
		agregarEspiralBoton.setBounds(10, 195, 170, 23);
		contentPanel.add(agregarEspiralBoton);
		
		agregarListaPosicionesEspirales = new JComboBox();
		agregarListaPosicionesEspirales.setBounds(10, 164, 170, 20);
		contentPanel.add(agregarListaPosicionesEspirales);
		
		JLabel lblEditarEspiral = new JLabel("EDITAR ESPIRAL");
		lblEditarEspiral.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditarEspiral.setBounds(190, 0, 170, 14);
		contentPanel.add(lblEditarEspiral);
		
		JLabel label_1 = new JLabel("Nombre Producto");
		label_1.setBounds(190, 25, 170, 14);
		contentPanel.add(label_1);
		
		editarNombreEspiralCampoTexto = new JTextField();
		editarNombreEspiralCampoTexto.setColumns(10);
		editarNombreEspiralCampoTexto.setBounds(190, 42, 170, 20);
		contentPanel.add(editarNombreEspiralCampoTexto);
		
		JLabel label_2 = new JLabel("Precio ");
		label_2.setBounds(190, 73, 170, 14);
		contentPanel.add(label_2);
		
		editarPrecioCampoTexto = new JTextField();
		editarPrecioCampoTexto.setColumns(10);
		editarPrecioCampoTexto.setBounds(190, 89, 170, 20);
		contentPanel.add(editarPrecioCampoTexto);
		
		JLabel label_3 = new JLabel("Cantidad");
		label_3.setBounds(190, 120, 170, 14);
		contentPanel.add(label_3);
		
		editarCantidadCampoTexto = new JTextField();
		editarCantidadCampoTexto.setColumns(10);
		editarCantidadCampoTexto.setBounds(190, 136, 170, 20);
		contentPanel.add(editarCantidadCampoTexto);
		
		editarListaProductoEnEspiral = new JComboBox();
		editarListaProductoEnEspiral.setBounds(190, 164, 170, 20);
		contentPanel.add(editarListaProductoEnEspiral);
		
		editarBotonEspiral = new JButton("Editar Espiral");
		editarBotonEspiral.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(editarBotonEspiral.isEnabled())
				editarEspiral();
			}
		});
		
		editarBotonEspiral.setBounds(190, 195, 170, 23);
		contentPanel.add(editarBotonEspiral);
		
		JLabel label = new JLabel("Cantidad");
		label.setBounds(370, 25, 170, 14);
		contentPanel.add(label);
		
		modificarCantidadCampoTexto = new JTextField();
		modificarCantidadCampoTexto.setColumns(10);
		modificarCantidadCampoTexto.setBounds(370, 42, 170, 20);
		contentPanel.add(modificarCantidadCampoTexto);
		
		modificarCantidadListaNombres = new JComboBox();
		modificarCantidadListaNombres.setBounds(370, 70, 170, 20);
		contentPanel.add(modificarCantidadListaNombres);
		
		JLabel lblEditarCantidad = new JLabel("EDITAR CANTIDAD ESPIRAL");
		lblEditarCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditarCantidad.setBounds(370, 0, 170, 14);
		contentPanel.add(lblEditarCantidad);
		
		modificarCantidadBoton = new JButton("Modificar Cantidad");
		modificarCantidadBoton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(modificarCantidadBoton.isEnabled())
				editarCantidadEspiral();
			}
		});
		modificarCantidadBoton.setBounds(370, 101, 170, 23);
		contentPanel.add(modificarCantidadBoton);
		
		eliminarEspiralLista = new JComboBox();
		eliminarEspiralLista.setBounds(370, 164, 170, 20);
		contentPanel.add(eliminarEspiralLista);
		
		eliminarEspiralBoton = new JButton("Eliminar Espiral");
		eliminarEspiralBoton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					if(eliminarEspiralBoton.isEnabled())
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
		eliminarEspiralBoton.setBounds(370, 195, 170, 23);
		contentPanel.add(eliminarEspiralBoton);
		
		JLabel lblEliminarEspiral = new JLabel("ELIMINAR ESPIRAL");
		lblEliminarEspiral.setHorizontalAlignment(SwingConstants.CENTER);
		lblEliminarEspiral.setBounds(370, 139, 170, 14);
		contentPanel.add(lblEliminarEspiral);
		
		lblAgregarArca = new JLabel("AGREGAR ARCA");
		lblAgregarArca.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgregarArca.setBounds(550, 0, 170, 14);
		contentPanel.add(lblAgregarArca);
		
		lblNombreArca = new JLabel("Denominaci\u00F3n Arca");
		lblNombreArca.setBounds(550, 25, 170, 14);
		contentPanel.add(lblNombreArca);
		
		denominacionArcaAgregarCampoTexto = new JTextField();
		denominacionArcaAgregarCampoTexto.setColumns(10);
		denominacionArcaAgregarCampoTexto.setBounds(550, 42, 170, 20);
		contentPanel.add(denominacionArcaAgregarCampoTexto);
		
		lblCantidad_1 = new JLabel("Cantidad");
		lblCantidad_1.setBounds(550, 73, 170, 14);
		contentPanel.add(lblCantidad_1);
		
		cantidadDenominacionArcaCampoTexto = new JTextField();
		cantidadDenominacionArcaCampoTexto.setColumns(10);
		cantidadDenominacionArcaCampoTexto.setBounds(550, 89, 170, 20);
		contentPanel.add(cantidadDenominacionArcaCampoTexto);
		
		agregarArcaBoton = new JButton("Agregar Arca");
		agregarArcaBoton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(agregarArcaBoton.isEnabled())
					agregarArca();
			}
		});
		agregarArcaBoton.setBounds(550, 120, 170, 23);
		contentPanel.add(agregarArcaBoton);
		
		listaDeArcasComboBox = new JComboBox();
		listaDeArcasComboBox.setBounds(730, 42, 188, 20);
		contentPanel.add(listaDeArcasComboBox);
		
		lblListaDeArcas = new JLabel("Lista de Arcas");
		lblListaDeArcas.setBounds(730, 25, 170, 14);
		contentPanel.add(lblListaDeArcas);
		
		lblModificarArca = new JLabel("MODIFICAR ARCA");
		lblModificarArca.setHorizontalAlignment(SwingConstants.CENTER);
		lblModificarArca.setBounds(730, 0, 188, 14);
		contentPanel.add(lblModificarArca);
		
		JLabel label_4 = new JLabel("Denominaci\u00F3n Arca");
		label_4.setBounds(730, 72, 170, 14);
		contentPanel.add(label_4);
		
		modificarDenominacionCampoText = new JTextField();
		modificarDenominacionCampoText.setColumns(10);
		modificarDenominacionCampoText.setBounds(730, 89, 188, 20);
		contentPanel.add(modificarDenominacionCampoText);
		
		JLabel label_5 = new JLabel("Cantidad");
		label_5.setBounds(730, 149, 170, 14);
		contentPanel.add(label_5);
		
		modificarCantidadDenominacionCampoTexto = new JTextField();
		modificarCantidadDenominacionCampoTexto.setColumns(10);
		modificarCantidadDenominacionCampoTexto.setBounds(730, 164, 188, 20);
		contentPanel.add(modificarCantidadDenominacionCampoTexto);
		
		modificarDenominacionArcaBoton = new JButton("Modificar Denominac\u00EDon");
		modificarDenominacionArcaBoton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (modificarDenominacionArcaBoton.isEnabled()) {
					modificarDenominacion();
				}
			}
		});
		modificarDenominacionArcaBoton.setBounds(730, 116, 188, 23);
		contentPanel.add(modificarDenominacionArcaBoton);
		
		modificarCantidadDenominacionBoton = new JButton("Modificar Cantidad");
		modificarCantidadDenominacionBoton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(modificarCantidadDenominacionBoton.isEnabled())
					editarCantidadDenominacion();
			}
		});
		modificarCantidadDenominacionBoton.setBounds(730, 195, 188, 23);
		contentPanel.add(modificarCantidadDenominacionBoton);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				servicioBoton = new JButton("En Servicio");
				servicioBoton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						if(servicioBoton.isEnabled())
							try {
								cambiarEstadoMaquinaAdmin();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
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
		if(controladorUsuarioAdministrador.isServicio()){
			for (int i = 0; i < componentes.length; i++) {
				if(componentes[i] instanceof JButton||componentes[i] instanceof JComboBox||componentes[i] instanceof JTextField){
					componentes[i].setEnabled(false);
				}
			}
			servicioBoton.setBackground(new Color(255,0,0));
			servicioBoton.setText("en Servicio");
		}else{
			for (int i = 0; i < componentes.length; i++) {
				if(componentes[i] instanceof JButton||componentes[i] instanceof JComboBox||componentes[i] instanceof JTextField){
					componentes[i].setEnabled(true);
				}
			}
			servicioBoton.setEnabled(true);
			servicioBoton.setBackground(new Color(50, 205,50));
			servicioBoton.setText("Fuera de Servicio");
		}
		servicioBoton.setEnabled(true);
	}
	

	
	private void cargarListas() throws IOException {
		List<PosicionEspiral> listaPosicionesEspiralesDisponibles = controladorUsuarioAdministrador.obtenerEspiralesDisponibles();
		List<PosicionEspiral> listaPosicionesEspiralesNoDisponibles = controladorUsuarioAdministrador.obtenerEspiralesNoDisponibles();
		List<Espiral> listaEspirales = controladorUsuarioAdministrador.obtenerEspirales();
		List<Arca> listaArcas = controladorUsuarioAdministrador.obtenerArcas();
		
		modificarCantidadListaNombres.removeAllItems();
		editarListaProductoEnEspiral.removeAllItems();
		agregarListaPosicionesEspirales.removeAllItems();
		eliminarEspiralLista.removeAllItems();
		listaDeArcasComboBox.removeAllItems();
		
		for (Iterator iterator = listaArcas.iterator(); iterator.hasNext();) {
			Arca arca = (Arca) iterator.next();
			listaDeArcasComboBox.addItem("Den = "+arca.getDenominacion()+" #"+arca.getCantidad());
		}
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
	
	private void editarCantidadDenominacion() {
		if (listaDeArcasComboBox.getItemCount()>0) {
			try {
				int cantidad = Integer.parseInt(modificarCantidadDenominacionCampoTexto.getText());
				List<Arca> arcas = controladorUsuarioAdministrador.obtenerArcas();
				if (!controladorUsuarioAdministrador.editarCantidadDenominacion(cantidad,arcas.get(listaDeArcasComboBox.getSelectedIndex()))) {
					JOptionPane.showMessageDialog(this, "Arca no puede contener mas de 500 unidades o menor a cero.");
					return;
				}
				JOptionPane.showMessageDialog(this, "Cantidad modificada.");
				modificarCantidadDenominacionCampoTexto.setText("");
				cargarListas();
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, "Ingresa cantidad entera.");
			}
		}else{
			JOptionPane.showMessageDialog(this, "No hay arcas para modificar.");
		}
		
	}
	
	private void modificarDenominacion() {
		if (listaDeArcasComboBox.getItemCount()>0) {
			try {
				int denominacion = Integer.parseInt(modificarDenominacionCampoText.getText());
				List<Arca> arcas = controladorUsuarioAdministrador.obtenerArcas();
				if(!controladorUsuarioAdministrador.editarDenominacion(denominacion,arcas.get(listaDeArcasComboBox.getSelectedIndex()))){
					JOptionPane.showMessageDialog(this, "Denominacion Invalida.");
				}
				JOptionPane.showMessageDialog(this, "Denominacion modificada.");
				modificarDenominacionCampoText.setText("");
				cargarListas();
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, "Ingresa denominacion entera.");
			}
		}else{
			JOptionPane.showMessageDialog(this, "No hay arcas para modificar.");
		}
		
	}
	
	private void agregarArca() {
		try {
			int denominacion = Integer.parseInt(denominacionArcaAgregarCampoTexto.getText());
			int cantidad = Integer.parseInt(cantidadDenominacionArcaCampoTexto.getText());
			if(controladorUsuarioAdministrador.agregarArca(new Arca(denominacion, cantidad, false))){
				JOptionPane.showMessageDialog(this, "Arca agregada correctamente.");
				cargarListas();
			}else{
				JOptionPane.showMessageDialog(this, "Cantidad o denominacion invalida.");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Digita Cantidades Enteras.");
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
	
	private void cambiarEstadoMaquinaAdmin() throws IOException {
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
				if (cantidad<=0&&cantidad>50) {
					JOptionPane.showMessageDialog(this, "Error la cantidad no puede ser negativa.");
				}else{
					JOptionPane.showMessageDialog(this, "Cantidad editada correctamente.");
					modificarCantidadCampoTexto.setText("");
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
