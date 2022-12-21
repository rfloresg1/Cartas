package es.ieslavereda.cartas.cartas;

import es.ieslavereda.cartas.utils.Input;

public class Game {

    private Baraja baraja;
    private Jugador[] jugadores;
    private Jugador pc;

    public Game(Jugador[] jugadores){
        baraja = new Baraja();
        this.jugadores = jugadores;
        pc = new Jugador("PC");

    }

    public void start(){
        baraja.shuffle();
        for (Jugador player : jugadores){
            juegaJugador(player);
        }
        juegaPC();
        mostrarGanador();
    }
    public void mostrarGanador() {
        int maxPuntuacion = -2;
        String nombreGanador = "";

        for (Jugador player : jugadores) {
            if (player.getPuntuacion() > maxPuntuacion) {
                maxPuntuacion = player.getPuntuacion();
                nombreGanador = player.getNombre();
            }
        }
        if (maxPuntuacion <= pc.getPuntuacion()) {
            nombreGanador = pc.getNombre();

            System.out.println("And the winner is.. " + nombreGanador);
        }
    }
    public void juegaJugador(Jugador player){
        System.out.println("--------------------------------------------");
        System.out.println("It's time for player " + player.getNombre());
        player.addCarta(baraja.getLastCard());
        System.out.println(player);
        String option = Input.getOption("Would you like a new card? ");

        while (option.equals("Y") && player.getPuntuacion() >= 0){
            player.addCarta(baraja.getLastCard());
            System.out.println(player);
            if (player.getPuntuacion() == -1)
                System.out.println("Te has pasado !!");
            else
                option = Input.getOption("Would you like a new card? ");
        }

    }
    private int maxPuntuacion(){
        int maxPuntuacion = -2;
        for (Jugador player : jugadores) {
            if (player.getPuntuacion() > maxPuntuacion) {
                maxPuntuacion = player.getPuntuacion();
            }
        }
        return maxPuntuacion;
    }


    public void juegaPC(){
        System.out.println("--------------------------------------------");
        System.out.println("It's time for player " + pc.getNombre());
        pc.addCarta(baraja.getLastCard());
        System.out.println(pc);
        int max = maxPuntuacion();

        while (pc.getPuntuacion() >= 0 && max>pc.getPuntuacion()){
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            pc.addCarta(baraja.getLastCard());
            System.out.println(pc);
            if (pc.getPuntuacion() == -1)
                System.out.println("PC se ha pasado !!");
        }
    }



}
