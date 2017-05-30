import java.util.ArrayList;

public class Receta {

	private String nombre;
	
	ArrayList<Ingredientes>ingredientes = new ArrayList<Ingredientes>();
	ArrayList<String>preparacion = new ArrayList<String>();
	
	Receta() {
		
	}
	
	Receta(String nombre, ArrayList<Ingredientes> ingredientes, ArrayList<String> preparacion) {
		this.nombre=nombre;
		this.ingredientes=ingredientes;
		this.preparacion=preparacion;	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Ingredientes> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<Ingredientes> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public ArrayList<String> getPreparacion() {
		return preparacion;
	}

	public void setPreparacion(ArrayList<String> preparacion) {
		this.preparacion = preparacion;
	}
	
	
	public void addIngrediente(Ingredientes ingredientes) {	
		this.ingredientes.add(ingredientes);
	}
	
	public void addPreparacion(String preparacion) {
		this.preparacion.add(preparacion);
	}
	
	public String listarIngredientes() {
		String lista="";
		for(Ingredientes i:ingredientes) {
			lista+=i.toString()+"\n";
		}
		return lista;
	}
	public String listarPreparacion() {
		String lista="";
		for(int i=0; i<preparacion.size(); i++) {
			int paso = i+1;
			lista+="Paso "+ paso + " : " +preparacion.get(i)+"\n";
		}
		return lista;
	}
	@Override
	public String toString() {
		return "Receta: " + nombre.toUpperCase() + "\n\nIngredientes\n" + listarIngredientes() + "\nPreparacion\n" + listarPreparacion();
	}
	 public static void main(String[] args) {
		Ingredientes i = new Ingredientes(3, "kg", "tomates");
		Ingredientes i2 = new Ingredientes(3, "kg", "macarrones");
		Receta r = new Receta();
		r.setNombre("Macarrones con tomate");
		r.addIngrediente(i);
		r.addIngrediente(i2);
		r.addPreparacion("Pelar los tomates");
		r.addPreparacion("Poner una olla con agua a hervir");
		r.addPreparacion("Añadir los macarrones");
		System.out.println(r.toString());
	 }
}
