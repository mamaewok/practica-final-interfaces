package gestorEstudios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class VentanaEstudios extends JFrame{

	private static final long serialVersionUID = 1L;
	private JTextField tfDNI;
	private JTextField tfNombre;		
	private JTextField tfPoblacion;
	private JTextField tfTlfn;
	private JTextField tfNacimiento;
	private JComboBox<String> listaCarreras;
	private JButton boton;
	private JLabel mensaje;
	private JTextArea textArea;
	
	public VentanaEstudios(){
		this.setTitle("Gestor de Estudios");
		this.setSize(800, 650);
		this.setDefaultCloseOperation(VentanaEstudios.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new GridLayout(2,1));
		ListenerBotones accionBoton = new ListenerBotones(this);
		JPanel panelSuperior = new JPanel(new BorderLayout());
				
				JLabel jlCabecera1 = new JLabel("GESTIÓN DE ALUMNOS", SwingConstants.CENTER);
				jlCabecera1.setBackground(Color.DARK_GRAY);
				jlCabecera1.setForeground(Color.WHITE);
				jlCabecera1.setOpaque(true);
				
					JPanel panelCentral1 = new JPanel(new GridLayout(7,1));
					
						JPanel panel1 = new JPanel();
							JLabel labelDNI = new JLabel("DNI");
							tfDNI = new JTextField(18);
							panel1.add(labelDNI);
							panel1.add(tfDNI);
							
						JPanel panel2 = new JPanel();
							JLabel labelNombre = new JLabel("Nombre");
							tfNombre = new JTextField(18);
							panel2.add(labelNombre);
							panel2.add(tfNombre);
							
						JPanel panel3 = new JPanel();
							JLabel labelPoblacion = new JLabel("Población");
							tfPoblacion = new JTextField(18);
							panel3.add(labelPoblacion);
							panel3.add(tfPoblacion);
							
						JPanel panel4 = new JPanel();
							JLabel labelTlfn = new JLabel("Teléfono");
							tfTlfn = new JTextField(18);
							panel4.add(labelTlfn);
							panel4.add(tfTlfn);
							
						JPanel panel5 = new JPanel();
							JLabel labelNacimiento = new JLabel("Fecha nacimiento");
							tfNacimiento = new JTextField(18);
							panel5.add(labelNacimiento);
							panel5.add(tfNacimiento);
							
						JPanel panel6 = new JPanel();
							JLabel labelCarrera = new JLabel("Carrera");
							String []carreras = {"Ingenieria Técnica en Informática e Gestión",
									"Ingeniería Informática",
									"Ingeniería Técnica Inustrial",
									"Ingeniería de Telecomunicaciones",
									"Historia",
									"Administracxión y Dirección de Empresas",
									"Derecho",
									"Turismo"};
							listaCarreras = new JComboBox<String>(carreras);
							panel6.add(labelCarrera);
							panel6.add(listaCarreras);
							
						JPanel panel7 = new JPanel();
							mensaje = new JLabel("Información");
							mensaje.setBackground(Color.LIGHT_GRAY);
							mensaje.setOpaque(true);
							panel7.add(mensaje);
						
					panelCentral1.add(panel1);
					panelCentral1.add(panel2);
					panelCentral1.add(panel3);
					panelCentral1.add(panel4);
					panelCentral1.add(panel5);
					panelCentral1.add(panel6);
					panelCentral1.add(panel7);
						
				
				JPanel panelBotones1 = new JPanel(new FlowLayout());
					boton = new JButton("Buscar");
					boton.addActionListener(accionBoton);
					panelBotones1.add(boton);
					boton = new JButton("Insertar");
					boton.addActionListener(accionBoton);
					panelBotones1.add(boton);
					boton = new JButton("Modificar");
					boton.addActionListener(accionBoton);
					panelBotones1.add(boton);
					boton = new JButton("Eliminar");
					boton.addActionListener(accionBoton);
					panelBotones1.add(boton);
					
				panelSuperior.add(jlCabecera1, BorderLayout.NORTH);
				panelSuperior.add(panelCentral1);
				panelSuperior.add(panelBotones1, BorderLayout.SOUTH);
			
			JPanel panelInferior = new JPanel(new BorderLayout());
			
				JLabel jlCabecera2 = new JLabel("CONSULTAS DE CARRERAS", SwingConstants.CENTER);
				jlCabecera2.setBackground(Color.DARK_GRAY);
				jlCabecera2.setForeground(Color.WHITE);
				jlCabecera2.setOpaque(true);
				
				JPanel panelCentral2 = new JPanel(new BorderLayout());
					
					JPanel panelControles = new JPanel(new FlowLayout());
						JLabel labelCarreras = new JLabel("Carreras");
						listaCarreras = new JComboBox<String>(carreras);
						boton = new JButton("Ver Alumnos");
						boton.addActionListener(accionBoton);
						panelControles.add(labelCarreras);
						panelControles.add(listaCarreras);
						panelControles.add(boton);
					
					JPanel panel = new JPanel(new FlowLayout());
						textArea = new JTextArea(35, 65);
						textArea.setVisible(true);
						panel.add(textArea);
						
						panelCentral2.add(panelControles, BorderLayout.NORTH);
						panelCentral2.add(panel, BorderLayout.SOUTH);
						
				JPanel panelBotones2 = new JPanel(new FlowLayout());
					boton = new JButton("Limpiar");
					boton.addActionListener(accionBoton);
					panelBotones2.add(boton);
					boton = new JButton("Salir");
					boton.addActionListener(accionBoton);
					panelBotones2.add(boton);
							
			panelInferior.add(jlCabecera2, BorderLayout.NORTH);
			panelInferior.add(panelCentral2);
			panelInferior.add(panelBotones2, BorderLayout.SOUTH);
		
		this.add(panelSuperior);
		this.add(panelInferior);	
	} //!Constructr
	
    //returns
	public String getTfDNI() {
		return tfDNI.getText();
	}
	public String getTfNombre() {
		return tfNombre.getText();
	}
	public String getTfPoblacion() {
		return tfPoblacion.getText();
	}
	public String getTfTlfn() {
		return tfTlfn.getText();
	}
	public String getTfNacimiento() {
		return tfNacimiento.getText();
	}
	public String getListaCarreras() {
		return (String)listaCarreras.getSelectedItem();
	}

	
	//setters
	
	public void setTfDNI(String text) {
		tfDNI.setText(text);
	}
	public void setTfNombre(String text) {
		tfNombre.setText(text);
	}
	public void setTfPoblacion(String text) {
		 tfPoblacion.setText(text);
	}
	public void setTfTlfn(String text) {
		 tfTlfn.setText(text);
	}
	public void setTfNacimiento(String text) {
		 tfNacimiento.setText(text);
	}
	public void setListaCarreras(String text) {
		listaCarreras.setSelectedItem(text);
	}
	
	public void setTexMensaje(String texto){
		mensaje.setText(texto);
	}
	
	public void setTextArea(String texto) {
		textArea.setText(texto);
	}
	

}
