void main() {
    Tamagotchi tamagotchi = new Tamagotchi("Vitinho");

    IO.println(tamagotchi.getHumor());
    tamagotchi.setFome(20);
    tamagotchi.setEnergia(80);
    IO.println(tamagotchi.getHumor());
}