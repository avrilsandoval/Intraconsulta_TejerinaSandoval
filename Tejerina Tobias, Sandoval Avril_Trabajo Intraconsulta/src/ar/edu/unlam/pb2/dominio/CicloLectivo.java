package ar.edu.unlam.pb2.dominio;

public class CicloLectivo {

	
	private Integer anio = 0;
	private Integer cuatrimestre = 0;
	public CicloLectivo(Integer anio, Integer cuatrimestre) {
		
		this.anio = anio;
		this.cuatrimestre = cuatrimestre;
	}
	
	public Integer getAnio() {
		return anio;
	}
	public void setAnio(Integer anio) {
		this.anio = anio;
	}
	public Integer getCuatrimestre() {
		return cuatrimestre;
	}
	public void setCuatrimestre(Integer cuatrimestre) {
		this.cuatrimestre = cuatrimestre;
	}
	
	
}
