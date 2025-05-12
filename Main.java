// Clase principal donde se ejecuta el programa
public class Main {
 
  public static void main(String[] args) {
      
      // Crear dos objetos de tipo Usuario
      // Cada objeto es un usuario con su nombre, apellido y fecha de nacimiento (día y año)
      Usuario usuario1 = new Usuario("Vivian", "Lopez P",  16, 2009);
      Usuario usuario2 = new Usuario("Mia", "Estrada C", 16, 2008);
  
      // Usamos el método setNombre para cambiar el nombre de 'usuario1' a "Felipe"
      usuario1.setNombre("Felipe");
      
      // Llamamos al método mostrarDatos() para que imprima la información de usuario1
      usuario1.mostrarDatos();
      
      // Llamamos al método mostrarDatos() para imprimir la información de usuario2
      usuario2.mostrarDatos();
  
      // Imprime la edad de usuario1 (usando el método getEdad)
      System.out.println(usuario1.getEdad());
  
      // Verifica si usuario1 tiene 18 años o más
      if (usuario1.getEdad() >= 18) {
          // Si es mayor o igual a 18, imprime "Mayor de edad"
          System.out.println("Mayor de edad");
      }

  }

}

