package prova1;

public class Mesa {
    private String mesa;
    private boolean ocupada;

    //Valores booleanos para retornar se a mesa está opcupada ou não
    
    public Mesa(String nomeMesa) {
        this.mesa = nomeMesa;
        this.ocupada = false;
    }

    public String getNome() {
        return mesa;
    }

    public boolean Ocupada() {
        return ocupada;
    }

    public void reservar() {
        this.ocupada = true;
        System.out.println("Mesa " + mesa + " reservada.");
    }

    public void liberar() {
        this.ocupada = false;
        System.out.println("Mesa " + mesa + " liberada.");
    }
}