package ar.edu.unlam.pb2.dominio;

public class Aula {

	private static Integer incremental = 0;
	private Integer capacidad;
	private Integer numeroAula;
	
	public Aula(Integer capacidad) {
		this.numeroAula = incremental++;
		this.capacidad = capacidad; 
	}

	public Integer getNumeroAula() {
		return numeroAula;
	}

	public void setNumeroAula(Integer numeroAula) {
		this.numeroAula = numeroAula;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}
}
