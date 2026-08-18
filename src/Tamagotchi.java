public class Tamagotchi {

    private String nome;
    private int fome;
    private int energia;

    public Tamagotchi(String nome) {
        this.nome = nome;
        energia = 50;
        fome = 50;
    }

    public String getNome() {
        return nome;
    }

    public int getFome() {
        return fome;
    }

    public int getEnergia() {
        return energia;
    }

    public String getHumor() {

        if (energia > 75 && fome < 25) {
            return "Feliz e sem fome";

        } else if (energia >= 50 && fome <= 50) {
            return "Ok pode comer";

        } else if (energia > 25 && fome < 75) {
            return "Cansado e com fome";

        } else {
            return "Faminto e triste";
        }
    }

    public void setFome(int fome) {
        if (fome >= 0 && fome <= 100) {
            this.fome = fome;
        }
    }

    public void setEnergia(int energia) {
        if (energia >= 0 && energia <= 100) {
            this.energia = energia;
        }
    }
}