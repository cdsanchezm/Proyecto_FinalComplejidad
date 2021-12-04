package co.edu.unbosque.Model;

public class Arbitro {

	private String region;
	private int puntuacion;
	private String nombre;
	
	

	/**
	 * @param region
	 * @param nombre
	 */
	public Arbitro(String region, String nombre) {
		puntuacion = 0;
		this.region = region;
		this.nombre = nombre;
	}
	
	public void puntuarArbitro(int puntuacionEquipo) {
		
		puntuacion = puntuacion+puntuacionEquipo;
	}

	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * @return the puntuacion
	 */
	public int getPuntuacion() {
		return puntuacion;
	}

	/**
	 * @param puntuacion the puntuacion to set
	 */
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
