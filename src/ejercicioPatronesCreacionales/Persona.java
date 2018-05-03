package ejercicioPatronesCreacionales;

public class Persona {
	private String colorOjos;
	private String colorPelo;
	private String tipoPelo;
	private String nombre;
	private int edad;
	private String ciudad;
	private int peso;
	private int altura;

	public Persona(String _colorOjos, String _colorPelo, String _tipoPelo, String _nombre, int _edad, String _ciudad,
			int _peso, int _altura) {
		this.colorOjos = _colorOjos;
		this.colorPelo = _colorPelo;
		this.tipoPelo = _tipoPelo;
		this.nombre = _nombre;
		this.edad = _edad;
		this.ciudad = _ciudad;
		this.peso = _peso;
		this.altura = _altura;

	}

	public String getColorPelo() {
		return this.colorPelo;
	}

	public void setColorPelo(String _colorPelo) {
		this.colorPelo = _colorPelo;
	}

	public String getColorOjos() {
		return this.colorOjos;
	}

	public void setColorOjos(String _colorOjos) {
		this.colorOjos = _colorOjos;
	}

	public String getTipoPelo() {
		return this.tipoPelo;
	}

	public void setTipoPelo(String _tipoPelo) {
		this.tipoPelo = _tipoPelo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String _nombre) {
		this.nombre = _nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int _edad) {
		this.edad = _edad;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String _ciudad) {
		this.ciudad = _ciudad;
	}

	public int getPeso() {
		return this.peso;
	}

	public void setPeso(int _peso) {
		this.peso = _peso;
	}

	public int getAltura() {
		return this.altura;
	}

	public void setAltura(int _altura) {
		this.altura = _altura;
	}

}
