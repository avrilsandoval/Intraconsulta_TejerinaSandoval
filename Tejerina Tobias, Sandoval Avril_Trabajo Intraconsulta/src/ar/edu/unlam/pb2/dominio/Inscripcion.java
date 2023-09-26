package ar.edu.unlam.pb2.dominio;

public class Inscripcion {
	
	
	public boolean getMismoDiaYTurno(Comision comision) {
        // Supongo que tienes atributos en Comision e Inscripcion que almacenan
        // información sobre el día y el turno, por ejemplo, comision.getDia() y inscripcion.getDia(),
        // comision.getTurno() y inscripcion.getTurno(). Ajusta los nombres de atributos según corresponda.

        // Verificar si el día y el turno de la comisión coinciden con los de la inscripción
        return comision.getDia().equals(this.getDia()) && comision.getTurno().equals(this.getTurno());
    }

	private Object getDia() {
		// TODO Auto-generated method stub
		return null;
	}

	private Object getTurno() {
		// TODO Auto-generated method stub
		return null;
	}




}
