package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorUsuarioCliente;
import modelo.Espiral;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class UsuarioCliente extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ControladorUsuarioCliente controladorUsuarioCliente;
	private JTextArea pro11;
	private JTextArea pro12;
	private JTextArea pro13;
	private JTextArea pro14;
	private JTextArea pro21;
	private JTextArea pro22;
	private JTextArea pro23;
	private JTextArea pro24;
	private JTextArea pro31;
	private JTextArea pro32;
	private JTextArea pro33;
	private JTextArea pro34;
	private JTextArea pro41;
	private JTextArea pro42;
	private JTextArea pro43;
	private JTextArea pro44;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UsuarioCliente frame = new UsuarioCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public UsuarioCliente() throws IOException {
		controladorUsuarioCliente = new ControladorUsuarioCliente();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 788, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProductos = new JLabel("PRODUCTOS");
		lblProductos.setHorizontalAlignment(SwingConstants.CENTER);
		lblProductos.setBounds(10, 11, 414, 14);
		contentPane.add(lblProductos);
		
		pro11 = new JTextArea();
		pro11.setEditable(false);
		pro11.setBounds(10, 36, 100, 50);
		contentPane.add(pro11);
		
		pro12 = new JTextArea();
		pro12.setEditable(false);
		pro12.setBounds(112, 36, 100, 50);
		contentPane.add(pro12);
		
		pro13 = new JTextArea();
		pro13.setEditable(false);
		pro13.setBounds(214, 36, 100, 50);
		contentPane.add(pro13);
		
		pro14 = new JTextArea();
		pro14.setEditable(false);
		pro14.setBounds(316, 36, 100, 50);
		contentPane.add(pro14);
		
		pro21 = new JTextArea();
		pro21.setEditable(false);
		pro21.setBounds(10, 95, 100, 50);
		contentPane.add(pro21);
		
		pro22 = new JTextArea();
		pro22.setEditable(false);
		pro22.setBounds(112, 95, 100, 50);
		contentPane.add(pro22);
		
		pro23 = new JTextArea();
		pro23.setEditable(false);
		pro23.setBounds(214, 95, 100, 50);
		contentPane.add(pro23);
		
		pro24 = new JTextArea();
		pro24.setEditable(false);
		pro24.setBounds(316, 95, 100, 50);
		contentPane.add(pro24);
		
		pro31 = new JTextArea();
		pro31.setEditable(false);
		pro31.setBounds(10, 156, 100, 50);
		contentPane.add(pro31);
		
		pro32 = new JTextArea();
		pro32.setEditable(false);
		pro32.setBounds(112, 156, 100, 50);
		contentPane.add(pro32);
		
		pro33 = new JTextArea();
		pro33.setEditable(false);
		pro33.setBounds(214, 156, 100, 50);
		contentPane.add(pro33);
		
		pro34 = new JTextArea();
		pro34.setEditable(false);
		pro34.setBounds(316, 156, 100, 50);
		contentPane.add(pro34);
		
		pro41 = new JTextArea();
		pro41.setEditable(false);
		pro41.setBounds(10, 215, 100, 50);
		contentPane.add(pro41);
		
		pro42 = new JTextArea();
		pro42.setEditable(false);
		pro42.setBounds(112, 215, 100, 50);
		contentPane.add(pro42);
		
		pro43 = new JTextArea();
		pro43.setEditable(false);
		pro43.setBounds(214, 215, 100, 50);
		contentPane.add(pro43);
		
		pro44 = new JTextArea();
		pro44.setEditable(false);
		pro44.setBounds(316, 215, 100, 50);
		contentPane.add(pro44);
		
		cargarProductosEnEspirales();
	}

	private void cargarProductosEnEspirales() {
		
		List<Espiral> listaEspirales = controladorUsuarioCliente.obtenerEspirales();
		for (int i = 0; i < listaEspirales.size(); i++) {
			System.out.println(listaEspirales.get(i).getFila()+" "+listaEspirales.get(i).getColumna());
			switch (listaEspirales.get(i).getFila()) {
			case 'a':
				switch (listaEspirales.get(i).getColumna()) {
				case 1:
					pro11.append(listaEspirales.get(i).getFila()+""+listaEspirales.get(i).getColumna()+" "+listaEspirales.get(i).getNombreProducto());
					pro11.append("\n# "+listaEspirales.get(i).getCantidadProducto());
					pro11.append("\nPrecio "+listaEspirales.get(i).getPrecioProducto());
					break;
				case 2:
					pro12.append(listaEspirales.get(i).getFila()+""+listaEspirales.get(i).getColumna()+" "+listaEspirales.get(i).getNombreProducto());
					pro12.append("\n# "+listaEspirales.get(i).getCantidadProducto());
					pro12.append("\nPrecio "+listaEspirales.get(i).getPrecioProducto());
					break;
				case 3:
					pro13.append(listaEspirales.get(i).getFila()+""+listaEspirales.get(i).getColumna()+" "+listaEspirales.get(i).getNombreProducto());
					pro13.append("\n# "+listaEspirales.get(i).getCantidadProducto());
					pro13.append("\nPrecio "+listaEspirales.get(i).getPrecioProducto());
					break;
				case 4:
					pro14.append(listaEspirales.get(i).getFila()+""+listaEspirales.get(i).getColumna()+" "+listaEspirales.get(i).getNombreProducto());
					pro14.append("\n# "+listaEspirales.get(i).getCantidadProducto());
					pro14.append("\nPrecio "+listaEspirales.get(i).getPrecioProducto());
					break;
				}
				break;
			case 'b':
				switch (listaEspirales.get(i).getColumna()) {
				case 1:
					pro21.append(listaEspirales.get(i).getFila()+""+listaEspirales.get(i).getColumna()+" "+listaEspirales.get(i).getNombreProducto());
					pro21.append("\n# "+listaEspirales.get(i).getCantidadProducto());
					pro21.append("\nPrecio "+listaEspirales.get(i).getPrecioProducto());
					break;
				case 2:
					pro22.append(listaEspirales.get(i).getFila()+""+listaEspirales.get(i).getColumna()+" "+listaEspirales.get(i).getNombreProducto());
					pro22.append("\n# "+listaEspirales.get(i).getCantidadProducto());
					pro22.append("\nPrecio "+listaEspirales.get(i).getPrecioProducto());
					break;
				case 3:
					pro23.append(listaEspirales.get(i).getFila()+""+listaEspirales.get(i).getColumna()+" "+listaEspirales.get(i).getNombreProducto());
					pro23.append("\n# "+listaEspirales.get(i).getCantidadProducto());
					pro23.append("\nPrecio "+listaEspirales.get(i).getPrecioProducto());
					break;
				case 4:
					pro24.append(listaEspirales.get(i).getFila()+""+listaEspirales.get(i).getColumna()+" "+listaEspirales.get(i).getNombreProducto());
					pro24.append("\n# "+listaEspirales.get(i).getCantidadProducto());
					pro24.append("\nPrecio "+listaEspirales.get(i).getPrecioProducto());
					break;
				}
				break;
			case 'c':
				switch (listaEspirales.get(i).getColumna()) {
				case 1:
					pro31.append(listaEspirales.get(i).getFila()+""+listaEspirales.get(i).getColumna()+" "+listaEspirales.get(i).getNombreProducto());
					pro31.append("\n# "+listaEspirales.get(i).getCantidadProducto());
					pro31.append("\nPrecio "+listaEspirales.get(i).getPrecioProducto());
					break;
				case 2:
					pro32.append(listaEspirales.get(i).getFila()+""+listaEspirales.get(i).getColumna()+" "+listaEspirales.get(i).getNombreProducto());
					pro32.append("\n# "+listaEspirales.get(i).getCantidadProducto());
					pro32.append("\nPrecio "+listaEspirales.get(i).getPrecioProducto());
					break;
				case 3:
					pro33.append(listaEspirales.get(i).getFila()+""+listaEspirales.get(i).getColumna()+" "+listaEspirales.get(i).getNombreProducto());
					pro33.append("\n# "+listaEspirales.get(i).getCantidadProducto());
					pro33.append("\nPrecio "+listaEspirales.get(i).getPrecioProducto());
					break;
				case 4:
					pro34.append(listaEspirales.get(i).getFila()+""+listaEspirales.get(i).getColumna()+" "+listaEspirales.get(i).getNombreProducto());
					pro34.append("\n# "+listaEspirales.get(i).getCantidadProducto());
					pro34.append("\nPrecio "+listaEspirales.get(i).getPrecioProducto());
					break;
				}
				break;
			case 'd':
				switch (listaEspirales.get(i).getColumna()) {
				case 1:
					pro41.append(listaEspirales.get(i).getFila()+""+listaEspirales.get(i).getColumna()+" "+listaEspirales.get(i).getNombreProducto());
					pro41.append("\n# "+listaEspirales.get(i).getCantidadProducto());
					pro41.append("\nPrecio "+listaEspirales.get(i).getPrecioProducto());
					break;
				case 2:
					pro42.append(listaEspirales.get(i).getFila()+""+listaEspirales.get(i).getColumna()+" "+listaEspirales.get(i).getNombreProducto());
					pro42.append("\n# "+listaEspirales.get(i).getCantidadProducto());
					pro42.append("\nPrecio "+listaEspirales.get(i).getPrecioProducto());
					break;
				case 3:
					pro43.append(listaEspirales.get(i).getFila()+""+listaEspirales.get(i).getColumna()+" "+listaEspirales.get(i).getNombreProducto());
					pro43.append("\n# "+listaEspirales.get(i).getCantidadProducto());
					pro43.append("\nPrecio "+listaEspirales.get(i).getPrecioProducto());
					break;
				case 4:
					pro44.append(listaEspirales.get(i).getFila()+""+listaEspirales.get(i).getColumna()+" "+listaEspirales.get(i).getNombreProducto());
					pro44.append("\n# "+listaEspirales.get(i).getCantidadProducto());
					pro44.append("\nPrecio "+listaEspirales.get(i).getPrecioProducto());
					break;
				}
				break;
			}
		}
				
	}
}
