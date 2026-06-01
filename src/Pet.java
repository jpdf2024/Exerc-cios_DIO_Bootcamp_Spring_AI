public class Pet {

    private final String name; //final pois não será necessário alterar o nome do pet

    private boolean clean; //variável para verificar se o pet está limpo ou sujo

    public Pet(String name) {
        this.name = name;
        this.clean = false; //inicialmente o pet está sujo
    }

    public String getName() {
        return name;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean; //método para limpar o pet, alterando o estado para limpo
    }
}
