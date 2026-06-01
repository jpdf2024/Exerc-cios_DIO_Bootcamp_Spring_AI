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
        return pet != null; //perguntando se tem um pet na máquina
    }

    public void setPet(Pet pet) {
        if(!this.clean) {
            System.out.println("A máquina precisa ser limpa antes de adicionar um pet.");
            return;
        }
        
        if (hasPet()) {
            System.out.println("Já há um pet na máquina. Remova o pet atual antes de adicionar outro.");
            return;
        }
        this.pet = pet;
    }

    
}