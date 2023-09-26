package ar.edu.unlam.pb2.dominio;
import java.util.Date;

public class CicloLectivo {

	private Integer anio = 0;
	private Cuatrimestre cuatrimestre;
    private Date fechaInicioInscripcion;
    private Date fechaFinInscripcion;

    public CicloLectivo(Date fechaInicio, Date fechaFin) {
        this.fechaInicioInscripcion = fechaInicio;
        this.fechaFinInscripcion = fechaFin;
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
	
    public boolean estaDentroDeFechaInscripcion() {
        Date fechaActual = new Date(); // Obtener la fecha actual

        // Verificar si la fecha actual está dentro del período de inscripción
        return fechaActual.after(fechaInicioInscripcion) && fechaActual.before(fechaFinInscripcion);
    }

}
