
public class Ingredientes {

	private String nombre;
	private String unidad;
	private float cantidad;
	
	
	public Ingredientes( float cantidad, String unidad, String nombre) {
		this.cantidad = cantidad;
		this.unidad = unidad;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	public Float getCantidad() {
		return cantidad;
	}

	public void setCantidad(Float cantidad) {
		this.cantidad = cantidad;
	}

	public String toString (){
		String Mensaje= "  "+cantidad+"  "+unidad+"  "+nombre;
		return Mensaje;
	}
	
	public static void main(String [] args) {
		Ingredientes i = new Ingredientes (3,"Kg","Tomates");
		System.out.print(i.toString());
		
	}
}
