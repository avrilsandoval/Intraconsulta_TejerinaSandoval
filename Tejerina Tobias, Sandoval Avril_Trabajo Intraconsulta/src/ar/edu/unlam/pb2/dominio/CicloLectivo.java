package ar.edu.unlam.pb2.dominio;
import java.util.Calendar;
import java.util.Date;

public class CicloLectivo {

	private Integer anio = 0;
	private Cuatrimestre cuatrimestre;
    private Calendar fechaInicioInscripcion;
    private Calendar fechaFinInscripcion;

    public CicloLectivo(Calendar fechaInicio, Calendar fechaFinal) {
        this.fechaInicioInscripcion = fechaInicio;
        this.fechaFinInscripcion = fechaFinal;
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
