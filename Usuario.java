// Definición de la clase Usuario
public class Usuario {

    // Propiedades privadas del objeto Usuario (atributos)
    private String nombre;           // Nombre del usuario
    private String apellidos;        // Apellidos del usuario
    private int edad;                // Edad actual del usuario
    private int fechaNacimiento;     // Año de nacimiento del usuario (se asume que es solo el año)

    // Constructor de la clase Usuario
    public Usuario(String nombre, String apellidos, int edad, int fechaNacimiento) {
        // Se inicializan los atributos con los valores que se pasan como parámetros
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Métodos "get" que permiten obtener el valor de los atributos

    public int getEdad() {
        return this.edad;  // Retorna la edad del usuario
    }

    public String getNombre() {
        return this.nombre;  // Retorna el nombre del usuario
    }

    public String getApellidos() {
        return this.apellidos;  // Retorna los apellidos del usuario
    }

    public int getFecha() {
        return this.fechaNacimiento;  // Retorna el año de nacimiento del usuario
    }

    // Métodos "set" que permiten modificar (cambiar) el valor de los atributos

    public void setNombre(String nombre) {
        this.nombre = nombre;  // Cambia el nombre del usuario
    }

    public void setApellido(String apellido) {
        this.apellidos = apellido;  // Cambia los apellidos del usuario
    }

    public void setEdad(int edad) {
        this.edad = edad;  // Cambia la edad del usuario
    }

    public void setFecha(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;  // Cambia el año de nacimiento del usuario
    }

    // Método que imprime por pantalla los datos del usuario
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
        System.out.println("Fecha Nacimiento: " + fechaNacimiento);
    }
}
