package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class LoginAdministrador extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField campoTextoNombreUsuario;
	private JPasswordField campoTextoContasena;
	private static LoginAdministrador frame;
	private MenuAdministrador menuAdministrador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new LoginAdministrador();
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
	public LoginAdministrador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 407, 224);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblAccesoAdministrador = new JLabel("Acceso Administrador");
		lblAccesoAdministrador.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccesoAdministrador.setBounds(10, 10, 371, 14);
		contentPane.add(lblAccesoAdministrador);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de Usuario");
		lblNombreDeUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreDeUsuario.setBounds(10, 35, 371, 14);
		contentPane.add(lblNombreDeUsuario);
		
		campoTextoNombreUsuario = new JTextField();
		campoTextoNombreUsuario.setBounds(97, 60, 200, 20);
		contentPane.add(campoTextoNombreUsuario);
		campoTextoNombreUsuario.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setHorizontalAlignment(SwingConstants.CENTER);
		lblContrasea.setBounds(10, 91, 371, 14);
		contentPane.add(lblContrasea);
		
		campoTextoContasena = new JPasswordField();
		campoTextoContasena.setBounds(97, 116, 200, 20);
		contentPane.add(campoTextoContasena);
		
		JButton botonIngresar = new JButton("Ingresar");
		botonIngresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					validarIngresarUsuario();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		botonIngresar.setBounds(97, 147, 200, 23);
		contentPane.add(botonIngresar);
	}
	
	public void validarIngresarUsuario() throws IOException{
		
		String userName = "1";
		char[] password = {'1','2','3','4'};
		
		char[] pass = campoTextoContasena.getPassword();
		if (!campoTextoNombreUsuario.getText().equals("") && pass.length!=0) {
			if(campoTextoNombreUsuario.getText().equals(userName)){
				if (pass.length==4&&pass[0]==password[0]&&pass[1]==password[1]&&pass[2]==password[2]&&pass[3]==password[3]) {
					menuAdministrador = new MenuAdministrador(frame, true);
					menuAdministrador.setVisible(true);
					campoTextoContasena.setText("");
					campoTextoNombreUsuario.setText("");
				}else{
					JOptionPane.showMessageDialog(frame, "Error en contraseña.");
				}
			}else{
				JOptionPane.showMessageDialog(frame, "Nombre de usuario invalido.");
			}
		}else{
			JOptionPane.showMessageDialog(frame, "Nombre de usuario o contraseña no pueden estar vacios.");
		}
	}
}
