package gestorEstudios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class ListenerBotones implements ActionListener{

	private ArrayList<Alumno> listaAlumnos; 
	private VentanaEstudios ventana;
	private Alumno alumno;
	public ListenerBotones(VentanaEstudios ventana){
		listaAlumnos= new ArrayList<Alumno>();
		this.ventana = ventana;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		
		if(btn.getText().equals("Buscar")){
			if(buscar(ventana.getTfDNI()) != null)
				ventana.setTexMensaje(buscar(ventana.getTfDNI()).toString());
			else
				ventana.setTexMensaje("No existe el alumno");
		}
		
		else if(btn.getText().equals("Insertar")){
			insertar();
		}
		else if(btn.getText().equals("Modificar Datos")){
			listaAlumnos.remove(buscar(ventana.getTfDNI()));
			insertar();
			buscar(ventana.getTfDNI()).toString();
		}
		else if(btn.getText().equals("Eliminar")){
			listaAlumnos.remove(buscar(ventana.getTfDNI()));
			if(buscar(ventana.getTfDNI())== null)
				ventana.setTexMensaje("Borrado con éxito");
		}
		
		else if(btn.getText().equals("Ver Alumnos")){
			
		}
		else if(btn.getText().equals("Limpiar")){
			ventana.setTfDNI("");
			ventana.setTfNombre("");
			ventana.setTfPoblacion("");
			ventana.setTfTlfn("");
			ventana.setTfNacimiento("");
			//ventana.setListaCarreras(""); cambiar opción no texto
			ventana.setTexMensaje("");
			ventana.setTextArea("");
		}
		else if(btn.getText().equals("Salir")){
			System.exit(0);
		}
	}
	
	public Alumno buscar(String dni){
		for(Alumno alumno : listaAlumnos){
			if(dni == alumno.getDni())
				return alumno;
		}
		return null;
	}
		
	public void insertar(){
		alumno = new Alumno(ventana.getTfDNI(), ventana.getTfNombre(), 
				ventana.getTfPoblacion(), Integer.parseInt(ventana.getTfTlfn()), 
				ventana.getTfNacimiento(), ventana.getListaCarreras());
		listaAlumnos.add(alumno);
		
	}
}
