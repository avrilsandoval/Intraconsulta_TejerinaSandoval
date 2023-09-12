package ar.edu.unlam.pb2.dominio;

public class Curso {

	private Materia materiaAsignada;
	private Integer codigoComision;
	private Aula aula;
	private Turno turno;
	private CicloLectivo cicloLectivo;

	public Curso(Materia materiaAsignada, Integer codigoComision, Aula aula, Turno turno, CicloLectivo cicloLectivo) {
		this.materiaAsignada = materiaAsignada;
		this.codigoComision = codigoComision;
		this.aula = aula;
		this.turno = turno;
		this.cicloLectivo = cicloLectivo;
	}

	public Materia getMateriaAsignada() {
		return materiaAsignada;
	}

	public void setMateriaAsignada(Materia materiaAsignada) {
		this.materiaAsignada = materiaAsignada;
	}

	public Integer getCodigoComision() {
		return codigoComision;
	}

	public void setCodigoComision(Integer codigoComision) {
		this.codigoComision = codigoComision;
	}

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	public CicloLectivo getCicloLectivo() {
		return cicloLectivo;
	}

	public void setCicloLectivo(CicloLectivo cicloLectivo) {
		this.cicloLectivo = cicloLectivo;
	}

}
