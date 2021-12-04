package co.edu.unbosque.Model;

import java.util.Arrays;

public class Equipo {
	
	private String Nombre;
	
	private String Region;
	
	private int[] puntuacion;

	/**
	 * @param nombre
	 * @param region
	 * @param puntuacion
	 */
	public Equipo(String nombre, String region, int[] puntuacion) {
		super();
		Nombre = nombre;
		Region = region;
		this.puntuacion = puntuacion;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return Nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	/**
	 * @return the region
	 */
	public String getRegion() {
		return Region;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		Region = region;
	}

	/**
	 * @return the puntuacion
	 */
	public int[] getPuntuacion() {
		return puntuacion;
	}

	/**
	 * @param puntuacion the puntuacion to set
	 */
	public void setPuntuacion(int[] puntuacion) {
		this.puntuacion = puntuacion;
	}

	@Override
	public String toString() {
		return "Equipo [Nombre=" + Nombre + ", Region=" + Region + ", puntuacion=" + Arrays.toString(puntuacion) + "]";
	}
	
	
	
	

}
