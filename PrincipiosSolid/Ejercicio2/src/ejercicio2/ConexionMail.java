/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author const
 */
public class ConexionMail {
    private static ConexionMail instance;
	
	private ConexionMail() {}
	
	public static ConexionMail getInstance() {
		if(instance == null) {
			instance = new ConexionMail();
		}
		return instance;
	}
	
	private List<Mail> queue =  new ArrayList<Mail>();

	public void cerrar() {
		// dummy
	}

	public void enviar(Mail mail) {
		queue.add(mail);		
	}
	
	public List<Mail> getQueue() {
		return queue;
	}
}
