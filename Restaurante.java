package prova1;


public class Restaurante {
    private Mesa[] mesas;
    
  

    public Restaurante() {
        //vetor de 20 casa, para as 20 mesas
        mesas = new Mesa[20];
        for (int i = 0; i < 20; i++) {
            mesas[i] = new Mesa("M " + (i + 1));
        }
    }

    public void reservarMesa(int numMesa) {
      
        // lê o numero da mesa e reserva ela
        if (numMesa < 1 || numMesa > 20) {
            System.out.println("Número de mesa inválido.");
            return;
        }
        if (mesas[numMesa - 1].Ocupada()) {
            //indica se a mesa ja esta ocupada
            System.out.println("Esta mesa já está ocupada.");
        } else {
            mesas[numMesa - 1].reservar();
        }
    }

    public void liberarMesa(int numMesa) {
        if (numMesa < 1 || numMesa > 20) {
            //Indica numero de mesa invalido
            System.out.println("Número de mesa inválido.");
            return;
        }
        if (!mesas[numMesa - 1].Ocupada()) {
            //indica se a mesa ja esta livre
            System.out.println("Esta mesa já está livre.");
        } else {
            mesas[numMesa - 1].liberar();
        }
        
    }

    public void listarMesas() {
        //informa ao usuario as mesas livres
        System.out.println("Mesas livres:");
        for (Mesa mesa : mesas) {
            
            //inverte o boolean para não mostrar as mesas ocupada
            if (!mesa.Ocupada()) {
                System.out.println(mesa.getNome());
            }
        }
    }
}


