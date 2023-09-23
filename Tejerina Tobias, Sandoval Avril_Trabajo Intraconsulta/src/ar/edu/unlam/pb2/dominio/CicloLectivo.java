package ar.edu.unlam.pb2.dominio;

public class CicloLectivo {

	
	private Integer anio = 0;
	private Cuatrimestre cuatrimestre;
	public CicloLectivo(Integer anio, Cuatrimestre cuatrimestre) {
		
		this.anio = anio;
		this.cuatrimestre = cuatrimestre;
	}
	
	public Integer getAnio() {
		return anio;
	}
	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public Cuatrimestre getCuatrimestre() {
		return cuatrimestre;
	}

	public void setCuatrimestre(Cuatrimestre cuatrimestre) {
		this.cuatrimestre = cuatrimestre;
	}
	
}
