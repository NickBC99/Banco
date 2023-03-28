import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<>();

        LocalDate fecha1 = LocalDate.of(2022, 04, 15);
        
        LocalDate fecha2 = LocalDate.of(2021, 05, 30);
        
        Cuenta cuenta1 = new Cuenta(1, true, 500.0f);
        Cuenta cuenta2 = new Cuenta(2, true, 350.0f);

        Prestamo prestamo1 = new Prestamo(1, 2000f);

        Cuenta cuenta3 = new Cuenta(1, true, 350.0f);
        Cuenta cuenta4 = new Cuenta(2, true, 550.0f);

        Prestamo prestamo2 = new Prestamo(1, 5000f);
        
        Prestamo[] prestamos2 = {prestamo2};
        Cuenta[] cuentas2 = {cuenta3, cuenta4};

        Prestamo[] prestamos1 = {prestamo1};
        Cuenta[] cuentas1 = {cuenta1, cuenta2};
        
        Cliente cliente1 = new Cliente(1l, "Romina", "Minetti", 1134514510, "rominetti@gmail.com", fecha1, 1000.0f);

        Cliente cliente2 = new Cliente(2l, "Marcos", "Picaso", 1145653080, "marcaso@gmail.com", fecha1,  4000.0f);

        Cliente cliente3 = new Cliente(3l, "Roman", "Gonzalo", 1124883090, "romango@gmail.com", fecha2, 0.0f);


        if (cliente1.getIngresoMensual() > 2000.0f || cliente1.calculoAntiguedad() >= 12) {
            System.out.println("Cliente tipo A");
        } else if (cliente1.getIngresoMensual() > 0.0f) {
            System.out.println("Cliente tipo B");
        } else {
            System.out.println("Cliente tipo Estudiante");
        }


        ArrayList<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente(1L, "Juan", "Perez", 1234567890, 1000.0f));

        clientes.add(new Cliente(2L, "Maria", "Gonzalez", 1234567870, 2000.0f));

        clientes.add(new Cliente(3L, "Pedro", "Garcia", 1234567880, 3000.0f));

        long idBuscado = 2L;
        boolean encontrado = false;
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId() == idBuscado) {
                clientes.remove(i); 
                encontrado = true;
            }
            
        if (encontrado) {
            System.out.println("El cliente con ID " + idBuscado + " ha sido eliminado.");
        } else {
            System.out.println("No se ha encontrado ningún cliente con ID " + idBuscado + ".");
        }

    }

  }

} 
