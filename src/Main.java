import java.util.Scanner;


public class Main {

    private final static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args){

        var option = -1;

        do {

            System.out.println("===Escolha uma opção===");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a máquina com água");
            System.out.println("3 - Abastecer a máquina com shampoo");
            System.out.println("4 - Verifica água da máquina");
            System.out.println("5 - Verifica shampoo da máquina");
            System.out.println("6 - Verifica se tem pet no banho");
            System.out.println("7 - Coloca pet na máquina");
            System.out.println("8 - Tira pet da máquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - Sair");
            option = scanner.nextInt();  
            
            switch (option) {
                case 7:
                    setPetInPetMachine();
                    break;
            }
            
           
        
        } while (option != 0);

    }

    public static void setPetInPetMachine(){
        System.out.println("Informe o nome do pet:");
        var name = scanner.next();
        var pet = new Pet(name);
    }
       
}
