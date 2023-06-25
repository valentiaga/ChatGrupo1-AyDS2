package UI;

import java.awt.event.ActionListener;

import back.Conexion;

public interface IVistaModoEscucha 
{
	void ConfirmarConexion();
	void Temporizador();
	void addActionListener(ActionListener actionListener);
	void mostrarVentana(boolean cond);
	Conexion getConexion();
	void setConexion(Conexion conexion);
	int getPuerto();
}
