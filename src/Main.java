import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {

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
                case 1:
                    petMachine.takeAShower();
                    break;
                case 2:
                    setWater();
                    break;
                case 3:
                    setShampoo();
                    break;
                case 4:
                    verifyWater();
                    break;
                case 5:
                    verifyShampoo();
                    break;
                case 6:
                    checkIfHasPetInMachine();
                    break;
                case 7:
                    setPetInPetMachine();
                    break;
                case 8:
                    petMachine.removePet();
                    break;
                case 9:
                    petMachine.washMachine();
                    break;
                default:
                    if (option != 0) {
                        System.out.println("Opção inválida. Tente novamente.");
                    }
            }

        } while (option != 0);

    }

    public static void setWater() {
        System.out.println("Abastecendo a máquina com água...");
        petMachine.addWater();
    }

    public static void setShampoo() {
        System.out.println("Abastecendo a máquina com shampoo...");
        petMachine.addShampoo();
    }

    private static void verifyWater() {
        var water = petMachine.getWater();
        System.out.println("A máquina tem " + water + " litros de água.");
    }

    private static void verifyShampoo() {
        var shampoo = petMachine.getShampoo();
        System.out.println("A máquina tem " + shampoo + " litros de shampoo.");
    }

    private static void checkIfHasPetInMachine() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem um pet na máquina de banho." : "Não tem um pet na máquina de banho.");
    }

    public static void setPetInPetMachine() {
        var name = "";
        while (name == null || name.isEmpty()) {
            System.out.println("Informe o nome do pet:");
            name = scanner.next();
        }

        var pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.println("Pet " + pet.getName() + " adicionado na máquina de banho.");
    }

}
