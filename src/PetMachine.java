public class PetMachine {

    private boolean clean;

    private int water;

    private int shampoo;

    private Pet pet;

    public void takeAShower() {

        if (this.pet == null) {
            System.out.println("Não há um pet para tomar banho.");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;

        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " está limpo!");

    }

    public void addWater() {
        if (water == 30) {
            System.out.println("A capacidade de água da máquina está no máximo");
            return;
        }

        water += 2;

    }

    public void addShampoo() {
        if (shampoo == 10) {
            System.out.println("A capacidade de shampoo da máquina está no máximo");
            return;
        }

        shampoo += 2;

    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet() {
        return pet != null; // perguntando se tem um pet na máquina
    }

    public void setPet(Pet pet) {
        if (!this.clean) {
            System.out.println("A máquina precisa ser limpa antes de adicionar um pet.");
            return;
        }

        if (hasPet()) {
            System.out.println("Já há um pet na máquina. Remova o pet atual antes de adicionar outro.");
            return;
        }
        this.pet = pet;
    }

    public void removePet (){
        this.clean = this.pet.isClean(); //verificando se o pet está limpo ou sujo para limpar a máquina
        System.out.println("O pet " + this.pet.getName() + " foi removido da máquina. A máquina está " + (clean ? "limpa" : "suja") + ".");
        // se o pet estiver limpo, a máquina ficará limpa, caso contrário, a máquina ficará suja
        this.pet = null; //removendo o pet da máquina
    }

    public void washMachine(){
        this.water -= 10; //reabastecendo a água da máquina
        this.shampoo -= 2; //reabastecendo o shampoo da máquina
        this.clean = true; //limpando a máquina, alterando o estado para limpo
        System.out.println("A máquina foi lavada e está limpa agora.");
    }
}