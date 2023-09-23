package ar.edu.unlam.pb2.dominio;

public class Materia {

	private String nombreMateria;
	private static Integer id=0;
	private Integer codigoMateria;
	
	
	public Materia(String nombreMateria) {
		this.codigoMateria = id++;
		this.nombreMateria = nombreMateria;
	}

	public String getNombreMateria() {
		return nombreMateria;
	}

	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}

	public Integer getCodigoMateria() {
		return codigoMateria;
	}

	public void setCodigoMateria(Integer codigoMateria) {
		this.codigoMateria++;
	}

	
}
