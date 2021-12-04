package co.edu.unbosque.Model;

public class Partido {
	
	Equipo equipo;
	Arbitro arbitro;
	/**
	 * @param equipo
	 * @param arbitro
	 */
	public Partido(Equipo equipo, Arbitro arbitro) {
		super();
		this.equipo = equipo;
		this.arbitro = arbitro;
	}
	/**
	 * @return the equipo
	 */
	public Equipo getEquipo() {
		return equipo;
	}
	/**
	 * @param equipo the equipo to set
	 */
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	/**
	 * @return the arbitro
	 */
	public Arbitro getArbitro() {
		return arbitro;
	}
	/**
	 * @param arbitro the arbitro to set
	 */
	public void setArbitro(Arbitro arbitro) {
		this.arbitro = arbitro;
	}
	
	

}
