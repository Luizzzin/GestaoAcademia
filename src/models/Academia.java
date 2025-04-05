package models;
import java.util.ArrayList;
//composicao e polimorfismo

public class Academia {

    private String nomeAcademia;
    private ArrayList<Pessoa> pessoasAcademia;


    public Academia(String nomeAcademia) {
        this.nomeAcademia = nomeAcademia;
        this.pessoasAcademia = new  ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa){
        pessoasAcademia.add(pessoa);
    }
    public void listarPessoas(){
        System.out.println("Listas de pessoas: ");
        for (Pessoa pessoa : pessoasAcademia){
            System.out.println(pessoa.getDescricao());
        }

    }

}
