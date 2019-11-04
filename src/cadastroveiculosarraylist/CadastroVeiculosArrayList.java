package cadastroveiculosarraylist;

import java.util.*;

public class CadastroVeiculosArrayList {
    static ArrayList<Veiculo> veiculos = new ArrayList();
    static Scanner ent = new Scanner(System.in);
    
    public static void main(String[] args) {
        mostrarMenu();
    }
    
    public static void mostrarMenu(){
       while(true){
           System.out.println("1. Cadastrar Veiculo");
           System.out.println("2. Listar Veiculos");
           System.out.println("3. Sair");
           System.out.print("Sua op��o: ");
           int opcao = Integer.parseInt(ent.nextLine());
           
           switch(opcao){
             case 1:  
               cadastrarVeiculo();
               break;
             case 3:
               System.out.println("\nGoodbye!\n");
               System.exit(0);
               break;
           }
       } 
    }
    
    public static void cadastrarVeiculo(){
        System.out.println("\nCadastrar Novo Veículo:\n");
        System.out.print("Código: ");
        int codigo = Integer.parseInt(ent.nextLine());
        System.out.print("Modelo: ");
        String modelo = ent.nextLine();
        System.out.print("Marca: ");
        String marca = ent.nextLine();
        System.out.print("Preço: ");
        double preco = Double.parseDouble(ent.nextLine());
        veiculos.add(new Veiculo(codigo, modelo, marca, preco));
        System.out.println("\nCadastro efetuado com sucesso.\n");
        System.out.println("Há " + veiculos.size() +
           " veículos cadastrados.\n");
    }
}
