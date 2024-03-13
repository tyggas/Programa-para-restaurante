package prova1;

import java.util.Scanner;


public class Prova1 {
    
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Restaurante restaurante = new Restaurante();
        
       //Variaveis
        char opcao, fimProg = 'N';
        int numMesa;
        
            
          while(fimProg == 'N'){   
        //Entrada de dados para o programa
        System.out.println("Escolha uma opção");
        System.out.println("A - Reservar Mesa");
        System.out.println("B - Liberar Mesa");
        System.out.println("C - Listar Mesas Livres");
        opcao = scan.next().toUpperCase().charAt(0);
        
        
        
        //saida de dados
        if(opcao == 'A'){
            System.out.println("Informe o numero da mesa");
            numMesa = scan.nextInt();
            restaurante.reservarMesa(numMesa);
        } else if(opcao == 'B'){
            System.out.println("Informe o numero da mesa");
            numMesa = scan.nextInt();
            restaurante.liberarMesa(numMesa);
        }else if(opcao == 'C'){
            restaurante.listarMesas();
        }else {
            System.out.println("opção invalida!");
            }
        
         System.out.println("Finaliza o programa(S/N)?"); 	
            fimProg = scan.next().toUpperCase().charAt(0);
            while (fimProg != 'N' && fimProg != 'S') {                
                System.out.println("Opção Invalida. Informe S/N");
                fimProg = scan.next().toUpperCase().charAt(0);
        }
        
          }
    }
}

        
    

   
