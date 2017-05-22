package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorUsuarioCliente;
import modelo.Arca;
import modelo.Espiral;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultComboBoxModel;

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
	private JButton cienMonedaBoton;
	private BufferedImage imageMonedaDe100;
	private BufferedImage imageMonedaDe500;
	private BufferedImage imageMonedaDe200;
	private BufferedImage imageBillete1000;
	private BufferedImage imageBilleteDe2000;
	private JButton docientosMonedaBoton;
	private JButton quinientosMonedaBoton;
	private JButton milBilleteBoton;
	private JButton dosmilBilleteBoton;
	private List<Arca> arcas;
	private List<Integer> saldoCliente;
	private List<Integer> vueltasCliente;
	private JTextArea mensajesTextArea;
	private JTextArea saldoTextArea;
	private JComboBox listaFilaComboBox;
	private JComboBox listaColumnaComboBox;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel lblA;
	private JLabel lblB;
	private JLabel lblC;
	private JLabel lblD;

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
		saldoCliente = new ArrayList<>();
		vueltasCliente = new ArrayList<>();
		controladorUsuarioCliente = new ControladorUsuarioCliente();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 899, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProductos = new JLabel("PRODUCTOS");
		lblProductos.setHorizontalAlignment(SwingConstants.CENTER);
		lblProductos.setBounds(37, 11, 414, 14);
		contentPane.add(lblProductos);
		
		pro11 = new JTextArea();
		pro11.setEditable(false);
		pro11.setBounds(45, 47, 100, 50);
		contentPane.add(pro11);
		
		pro12 = new JTextArea();
		pro12.setEditable(false);
		pro12.setBounds(147, 47, 100, 50);
		contentPane.add(pro12);
		
		pro13 = new JTextArea();
		pro13.setEditable(false);
		pro13.setBounds(249, 47, 100, 50);
		contentPane.add(pro13);
		
		pro14 = new JTextArea();
		pro14.setEditable(false);
		pro14.setBounds(351, 47, 100, 50);
		contentPane.add(pro14);
		
		pro21 = new JTextArea();
		pro21.setEditable(false);
		pro21.setBounds(45, 106, 100, 50);
		contentPane.add(pro21);
		
		pro22 = new JTextArea();
		pro22.setEditable(false);
		pro22.setBounds(147, 106, 100, 50);
		contentPane.add(pro22);
		
		pro23 = new JTextArea();
		pro23.setEditable(false);
		pro23.setBounds(249, 106, 100, 50);
		contentPane.add(pro23);
		
		pro24 = new JTextArea();
		pro24.setEditable(false);
		pro24.setBounds(351, 106, 100, 50);
		contentPane.add(pro24);
		
		pro31 = new JTextArea();
		pro31.setEditable(false);
		pro31.setBounds(45, 167, 100, 50);
		contentPane.add(pro31);
		
		pro32 = new JTextArea();
		pro32.setEditable(false);
		pro32.setBounds(147, 167, 100, 50);
		contentPane.add(pro32);
		
		pro33 = new JTextArea();
		pro33.setEditable(false);
		pro33.setBounds(249, 167, 100, 50);
		contentPane.add(pro33);
		
		pro34 = new JTextArea();
		pro34.setEditable(false);
		pro34.setBounds(351, 167, 100, 50);
		contentPane.add(pro34);
		
		pro41 = new JTextArea();
		pro41.setEditable(false);
		pro41.setBounds(45, 226, 100, 50);
		contentPane.add(pro41);
		
		pro42 = new JTextArea();
		pro42.setEditable(false);
		pro42.setBounds(147, 226, 100, 50);
		contentPane.add(pro42);
		
		pro43 = new JTextArea();
		pro43.setEditable(false);
		pro43.setBounds(249, 226, 100, 50);
		contentPane.add(pro43);
		
		pro44 = new JTextArea();
		pro44.setEditable(false);
		pro44.setBounds(351, 226, 100, 50);
		contentPane.add(pro44);
		
		
		
		cienMonedaBoton = new JButton("New button");
		cienMonedaBoton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(cienMonedaBoton.isEnabled()){
					try {
						cargarCienPesos();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		cienMonedaBoton.setBounds(481, 36, 60, 60);
		imageMonedaDe100 = ImageIO.read(new File("100.png"));
		Image escalada100=imageMonedaDe100.getScaledInstance((int)cienMonedaBoton.getSize().getWidth(), (int)cienMonedaBoton.getSize().getHeight(), (int)java.awt.Image.SCALE_SMOOTH);
		cienMonedaBoton.setIcon(new ImageIcon(escalada100));
		
		contentPane.add(cienMonedaBoton);
		
		docientosMonedaBoton = new JButton("New button");
		docientosMonedaBoton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (docientosMonedaBoton.isEnabled()) {
					try {
						cargarDocientosPesos();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		docientosMonedaBoton.setBounds(481, 107, 60, 60);
		imageMonedaDe200 = ImageIO.read(new File("200.png"));
		Image escalada200=imageMonedaDe200.getScaledInstance((int)docientosMonedaBoton.getSize().getWidth(), (int)docientosMonedaBoton.getSize().getHeight(), (int)java.awt.Image.SCALE_SMOOTH);
		docientosMonedaBoton.setIcon(new ImageIcon(escalada200));
		contentPane.add(docientosMonedaBoton);
		
		quinientosMonedaBoton = new JButton("New button");
		quinientosMonedaBoton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (quinientosMonedaBoton.isEnabled()) {
					try {
						cargarQuinientosPesos();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		quinientosMonedaBoton.setBounds(481, 178, 60, 60);
		imageMonedaDe500 = ImageIO.read(new File("500.png"));
		Image escalada500=imageMonedaDe500.getScaledInstance((int)quinientosMonedaBoton.getSize().getWidth(), (int)quinientosMonedaBoton.getSize().getHeight(), (int)java.awt.Image.SCALE_SMOOTH);
		quinientosMonedaBoton.setIcon(new ImageIcon(escalada500));
		contentPane.add(quinientosMonedaBoton);
		
		milBilleteBoton = new JButton("New button");
		milBilleteBoton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (milBilleteBoton.isEnabled()) {
					try {
						cargarMilPesos();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		milBilleteBoton.setBounds(481, 249, 60, 60);
		imageBillete1000 = ImageIO.read(new File("1000.png"));
		Image escalada1000=imageBillete1000.getScaledInstance((int)milBilleteBoton.getSize().getWidth(), (int)milBilleteBoton.getSize().getHeight(), (int)java.awt.Image.SCALE_SMOOTH);
		milBilleteBoton.setIcon(new ImageIcon(escalada1000));
		contentPane.add(milBilleteBoton);
		
		dosmilBilleteBoton = new JButton("New button");
		dosmilBilleteBoton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (dosmilBilleteBoton.isEnabled()) {
					try {
						cargarDosMilPesos();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		dosmilBilleteBoton.setBounds(481, 320, 60, 60);
		imageBilleteDe2000 = ImageIO.read(new File("2000.png"));
		Image escalada2000=imageBilleteDe2000.getScaledInstance((int)dosmilBilleteBoton.getSize().getWidth(), (int)dosmilBilleteBoton.getSize().getHeight(), (int)java.awt.Image.SCALE_SMOOTH);
		dosmilBilleteBoton.setIcon(new ImageIcon(escalada2000));
		contentPane.add(dosmilBilleteBoton);
		
		saldoTextArea = new JTextArea();
		saldoTextArea.setEditable(false);
		saldoTextArea.setBounds(667, 36, 180, 132);
		contentPane.add(saldoTextArea);
		
		JButton comprarBoton = new JButton("Comprar");
		comprarBoton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (comprarBoton.isEnabled()) {
					try {
						comprar();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		
		comprarBoton.setBackground(Color.ORANGE);
		comprarBoton.setFont(new Font("Swis721 Lt BT", Font.PLAIN, 22));
		comprarBoton.setBounds(68, 316, 150, 60);
		contentPane.add(comprarBoton);
		
		JButton botonCancelar = new JButton("Cancelar");
		botonCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (botonCancelar.isEnabled()) {
					cancelarTransaccion();
				}
			}
		});
		botonCancelar.setBackground(Color.RED);
		botonCancelar.setFont(new Font("Swis721 Lt BT", Font.PLAIN, 22));
		botonCancelar.setBounds(273, 316, 150, 60);
		contentPane.add(botonCancelar);
		
		mensajesTextArea = new JTextArea();
		mensajesTextArea.setEditable(false);
		mensajesTextArea.setBounds(667, 197, 180, 132);
		contentPane.add(mensajesTextArea);
		
		JButton servicioBoton = new JButton("");
		servicioBoton.setEnabled(false);
		servicioBoton.setBounds(667, 340, 180, 40);
		contentPane.add(servicioBoton);
		
		listaFilaComboBox = new JComboBox();
		listaFilaComboBox.setModel(new DefaultComboBoxModel(new String[] {"a", "b", "c", "d"}));
		listaFilaComboBox.setBounds(557, 61, 100, 48);
		contentPane.add(listaFilaComboBox);
		
		JLabel lblNewLabel = new JLabel("FILA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(557, 36, 100, 14);
		contentPane.add(lblNewLabel);
		
		listaColumnaComboBox = new JComboBox();
		listaColumnaComboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		listaColumnaComboBox.setBounds(557, 159, 100, 48);
		contentPane.add(listaColumnaComboBox);
		
		JLabel lblColumna = new JLabel("COLUMNA");
		lblColumna.setHorizontalAlignment(SwingConstants.CENTER);
		lblColumna.setBounds(557, 134, 100, 14);
		contentPane.add(lblColumna);
		
		label = new JLabel("1");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(47, 22, 98, 14);
		contentPane.add(label);
		
		label_1 = new JLabel("2");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(149, 22, 98, 14);
		contentPane.add(label_1);
		
		label_2 = new JLabel("3");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(251, 22, 98, 14);
		contentPane.add(label_2);
		
		label_3 = new JLabel("4");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(353, 22, 98, 14);
		contentPane.add(label_3);
		
		lblA = new JLabel("a");
		lblA.setBounds(22, 52, 13, 14);
		contentPane.add(lblA);
		
		lblB = new JLabel("b");
		lblB.setBounds(22, 111, 13, 14);
		contentPane.add(lblB);
		
		lblC = new JLabel("c");
		lblC.setBounds(22, 172, 13, 14);
		contentPane.add(lblC);
		
		lblD = new JLabel("d");
		lblD.setBounds(22, 231, 13, 14);
		contentPane.add(lblD);
		Component[] componentes = this.contentPane.getComponents();
		if(controladorUsuarioCliente.isServicio()){
			for (int i = 0; i < componentes.length; i++) {
				if(componentes[i] instanceof JButton||componentes[i] instanceof JComboBox||componentes[i] instanceof JTextField){
					componentes[i].setEnabled(true);
				}
			}
			servicioBoton.setBackground(new Color(50, 205,50));
			servicioBoton.setText("en Servicio");
			servicioBoton.setEnabled(false);
		}else{
			for (int i = 0; i < componentes.length; i++) {
				if(componentes[i] instanceof JButton||componentes[i] instanceof JComboBox||componentes[i] instanceof JTextField){
					componentes[i].setEnabled(false);
				}
			}
			servicioBoton.setBackground(new Color(255,0,0));
			servicioBoton.setText("Fuera de Servicio");
			servicioBoton.setEnabled(false);
		}
		borrarContenidoProductos();
		cargarProductosEnEspirales();
		saldoTextArea.append("Estado de dinero.");
		mensajesTextArea.append("Maquina dispensadora.");
	}
	
	private void cancelarTransaccion() {
		JOptionPane.showMessageDialog(this, "Compra cancelada");
		saldoTextArea.setText("");
		mensajesTextArea.setText("");
		mensajesTextArea.append("\nCompra cancelada.");
		mensajesTextArea.append("\nTe devolvemos tu dinero.");
		for (int j = 0; j < saldoCliente.size(); j++) {
			mensajesTextArea.append("\n"+saldoCliente.get(j));
		}
		vueltasCliente.clear();
		saldoCliente.clear();
	}
	
	private void comprar() throws IOException {
		// TODO Auto-generated method stub
		int total=0;
		boolean hayProducto = false;
		for (int i = 0; i < saldoCliente.size(); i++) {
			total=total+saldoCliente.get(i);
		}
		List<Espiral> listaEspirales = controladorUsuarioCliente.obtenerEspirales();
		List<Arca> arcas = controladorUsuarioCliente.cargarArcas();
		for (int i = 0; i<listaEspirales.size(); i++) {
			if(listaEspirales.get(i).getFila()==listaFilaComboBox.getSelectedItem().toString().charAt(0)&&listaEspirales.get(i).getColumna()==Integer.parseInt(listaColumnaComboBox.getSelectedItem().toString())){
				hayProducto=true;
				if (listaEspirales.get(i).getPrecioProducto()<=total) {
					
					listaEspirales.get(i).setCantidadProducto(listaEspirales.get(i).getCantidadProducto()-1);
					
					int diferencia = (int)(total-listaEspirales.get(i).getPrecioProducto());
					
					for (int j = 0; j < arcas.size(); j++) {
						if(arcas.get(j).getDenominacion()<=diferencia && arcas.get(j).getCantidad()>0){
							vueltasCliente.add(arcas.get(j).getDenominacion());
							diferencia = diferencia-arcas.get(j).getDenominacion();
							arcas.get(j).setCantidad(arcas.get(j).getCantidad()-1);
						}
						if(diferencia==0)
							break;
					}
					if(diferencia==0){
						JOptionPane.showMessageDialog(this, "Compra Éxitosa.");
						mensajesTextArea.setText("");
						mensajesTextArea.append("\nCompra éxitosa");
						mensajesTextArea.append("\nTus vueltasa son:");
						for (int j = 0; j < vueltasCliente.size(); j++) {
							mensajesTextArea.append("\n"+vueltasCliente.get(j));
						}
						if(listaEspirales.get(i).getCantidadProducto()==0){
							listaEspirales.remove(i);
							controladorUsuarioCliente.guardarEspirales(listaEspirales);
							controladorUsuarioCliente.eliminarPosicionEspiral(listaEspirales.get(i).getFila(),listaEspirales.get(i).getColumna());
						}
						saldoTextArea.setText("");
						controladorUsuarioCliente.guardarArcas(arcas);
						vueltasCliente.clear();
						saldoCliente.clear();
						borrarContenidoProductos();
						cargarProductosEnEspirales();
					}else{
						JOptionPane.showMessageDialog(this, "No tenemos cambio para tu compra. Te devolvemos tu dinero.");
						cancelarTransaccion();
					}
				}else{
					JOptionPane.showMessageDialog(this, "Saldo insuficiente");
				}
			}
		}
		if (!hayProducto) {
			JOptionPane.showMessageDialog(this, "Espiral Vacia");	
		}
	}
	
	private void cargarDosMilPesos() throws IOException {
		boolean cargaFallida = false;
		int total = 0;
		for (int i = 0; i < saldoCliente.size(); i++) {
			total = total + saldoCliente.get(i);
		}
		if(total>10000){
			JOptionPane.showMessageDialog(this, "No puedes cargar mas de 10000.");
		}
		arcas = controladorUsuarioCliente.cargarArcas();
		for (int i = 0; i < arcas.size(); i++) {
			if(arcas.get(i).getDenominacion()==2000){
				if (arcas.get(i).getCantidad()<50) {
					saldoCliente.add(2000);
					arcas.get(i).setCantidad(arcas.get(i).getCantidad()+1);
					controladorUsuarioCliente.guardarArcas(arcas);
					saldoTextArea.append("\n2000");
					return;
				}else{
					cargaFallida = true;
				}
			}
		}
		if (cargaFallida) {
			JOptionPane.showMessageDialog(this, "Temporalmente Denominacion Invalida.");
		}else
		JOptionPane.showMessageDialog(this, "Temporalmente Denominacion invalida");
		
	}
	
	private void cargarQuinientosPesos() throws IOException {
		boolean cargaFallida = false;
		int total = 0;
		for (int i = 0; i < saldoCliente.size(); i++) {
			total = total + saldoCliente.get(i);
		}
		if(total>10000){
			JOptionPane.showMessageDialog(this, "No puedes cargar mas de 10000.");
		}
		arcas = controladorUsuarioCliente.cargarArcas();
		for (int i = 0; i < arcas.size(); i++) {
			if(arcas.get(i).getDenominacion()==500){
				if (arcas.get(i).getCantidad()<50) {
					saldoCliente.add(500);
					arcas.get(i).setCantidad(arcas.get(i).getCantidad()+1);
					controladorUsuarioCliente.guardarArcas(arcas);
					saldoTextArea.append("\n500");
					return;
				}else{
					cargaFallida = true;
				}
			}
		}
		if (cargaFallida) {
			JOptionPane.showMessageDialog(this, "Temporalmente Denominacion Invalida.");
		}else
		JOptionPane.showMessageDialog(this, "Temporalmente Denominacion Invalida.");
		
	}
	private void cargarMilPesos() throws IOException {
		int total = 0;
		for (int i = 0; i < saldoCliente.size(); i++) {
			total = total + saldoCliente.get(i);
		}
		if(total>10000){
			JOptionPane.showMessageDialog(this, "No puedes cargar mas de 10000.");
		}
		boolean cargaFallida = false;
		arcas = controladorUsuarioCliente.cargarArcas();
		for (int i = 0; i < arcas.size(); i++) {
			if(arcas.get(i).getDenominacion()==1000){
				if (arcas.get(i).getCantidad()<50) {
					saldoCliente.add(1000);
					arcas.get(i).setCantidad(arcas.get(i).getCantidad()+1);
					controladorUsuarioCliente.guardarArcas(arcas);
					saldoTextArea.append("\n1000");
					return;
				}else{
					cargaFallida = true;
				}
			}
		}
		if (cargaFallida) {
			JOptionPane.showMessageDialog(this, "Temporalmente Denominacion Invalida.");
		}else
		JOptionPane.showMessageDialog(this, "Temporalmente Denominacion Invalida.");
		
	}
	
	private void cargarDocientosPesos() throws IOException {
		boolean cargaFallida = false;
		int total = 0;
		for (int i = 0; i < saldoCliente.size(); i++) {
			total = total + saldoCliente.get(i);
		}
		if(total>10000){
			JOptionPane.showMessageDialog(this, "No puedes cargar mas de 10000.");
		}
		arcas = controladorUsuarioCliente.cargarArcas();
		for (int i = 0; i < arcas.size(); i++) {
			if(arcas.get(i).getDenominacion()==200){
				if (arcas.get(i).getCantidad()<50) {
					saldoCliente.add(200);
					arcas.get(i).setCantidad(arcas.get(i).getCantidad()+1);
					controladorUsuarioCliente.guardarArcas(arcas);
					saldoTextArea.append("\n200");
					return;
				}else{
					cargaFallida = true;
				}
			}
		}
		if (cargaFallida) {
			JOptionPane.showMessageDialog(this, "Temporalmente Denominacion Invalida.");
		}
		JOptionPane.showMessageDialog(this, "Temporalmente Denominacion Invalida.");
	}
	
	private void cargarCienPesos() throws IOException {
		boolean cargaFallida = false;
		int total = 0;
		for (int i = 0; i < saldoCliente.size(); i++) {
			total = total + saldoCliente.get(i);
		}
		if(total>10000){
			JOptionPane.showMessageDialog(this, "No puedes cargar mas de 10000.");
		}
		arcas = controladorUsuarioCliente.cargarArcas();
		for (int i = 0; i < arcas.size(); i++) {
			if(arcas.get(i).getDenominacion()==100){
				if (arcas.get(i).getCantidad()<50) {
					saldoCliente.add(100);
					arcas.get(i).setCantidad(arcas.get(i).getCantidad()+1);
					controladorUsuarioCliente.guardarArcas(arcas);
					saldoTextArea.append("\n100");
					return;
				}else{
					cargaFallida = true;
				}
			}
		}
		if (cargaFallida) {
			JOptionPane.showMessageDialog(this, "Temporalmente Denominacion Invalida.");
		}else
		JOptionPane.showMessageDialog(this, "Temporalmente Denominacion Invalida.");
	}

	private void borrarContenidoProductos() {
		pro11.setText("");
		pro12.setText("");
		pro13.setText("");
		pro14.setText("");
		pro21.setText("");
		pro22.setText("");
		pro23.setText("");
		pro24.setText("");
		pro31.setText("");
		pro32.setText("");
		pro33.setText("");
		pro34.setText("");
		pro41.setText("");
		pro42.setText("");
		pro43.setText("");
		pro44.setText("");
	}

	private void cargarProductosEnEspirales() {
		
		List<Espiral> listaEspirales = controladorUsuarioCliente.obtenerEspirales();
		for (int i = 0; i < listaEspirales.size(); i++) {
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
