import models.Academia;
import models.Cliente;
import models.Instrutor;

public class Main {
    public static void main(String[] args) {


        Academia academia = new Academia("Gym Cariane");
        Cliente cliente = new Cliente("luiz",19, "SS");
        Cliente cliente2 = new Cliente("gigi", 19, "D");

        Instrutor instrutor = new Instrutor("Leo", 50, "corrida");
        Instrutor instrutor2 = new Instrutor("giovanna", 30, "pilates");

        academia.adicionarPessoa(cliente);
        academia.adicionarPessoa(cliente2);
      academia.adicionarPessoa(instrutor);
        academia.adicionarPessoa(instrutor2);

        academia.listarPessoas();

    }
}