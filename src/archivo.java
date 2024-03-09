
public class archivo implements Comparable<archivo> {
	private String nomArchivo;
	private String contenido;
	private String nomUsuario;
	private String fechaCrea;
	private String formato;
	private String tamaño;
	private int ordenPrioridad;

public archivo(String nomArchivo, String contenido, String nomUsuario, String fechaCrea, String formato, String tamaño, int ordenPrioridad) {
	
	this.nomArchivo = nomArchivo;
	this.contenido = contenido;
	this.nomUsuario = nomUsuario;
	this.fechaCrea = fechaCrea;
	this.formato = formato;
	this.tamaño = tamaño;
	this.ordenPrioridad= ordenPrioridad; // 1- Urgente, 2-Pendiente , 3-No importante 
	
	}
	public String getNomArchivo() {
	return nomArchivo;
	}
	public void setNomArchivo(String nomArchivo) {
	this.nomArchivo = nomArchivo;
	}
	public String getContenido() {
	return contenido;
	}
	public void setContenido(String contenido) {
	this.contenido = contenido;
	}
	public String getNomUsuario() {
	return nomUsuario;
	}
	public void setNomUsuario(String nomUsuario) {
	this.nomUsuario = nomUsuario;
	}
	public String getFechaCrea() {
	return fechaCrea;
	}
	public void setFechaCrea(String fechaCrea) {
	this.fechaCrea = fechaCrea;
	}
	public String getFormato() {
	return formato;
	}
	public void setFormato(String formato) {
	this.formato = formato;
	}
	public String getTamaño() {
	return tamaño;
	}
	public void setTamaño(String tamaño) {
	this.tamaño = tamaño;
	}
	public int getOrdenPrioridad() {
		return ordenPrioridad;
    }
	public void  setOrdenPrioridad(int ordenPrioridad) {
		this.ordenPrioridad=ordenPrioridad;
    }
	 @Override
	 //para visualizar lo que se imprimira en los jtlist
	    public String toString() {
	        return nomArchivo + " - " + formato;
	 }
	 public int compareTo(archivo nuevoArchivo) {
		    // comparar archivos para mantener la cola ordenada
		    return Integer.compare(this.ordenPrioridad, nuevoArchivo.getOrdenPrioridad());
	 }
	}
