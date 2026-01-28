import model.Cliente;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(
                "Paulo Eduardo",
                "13132245543",
                LocalDate.of(1998, 5, 26)
        );

        System.out.println("Sistema iniciado com sucesso");
        System.out.println(cliente);
    }
}
