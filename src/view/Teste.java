package view;

import model.Carga;
import model.Motor;
import model.Passeio;

public class Teste {
    public static void main(String[] args) {

        Motor motorPasseio = new Motor(4, 150);
        Passeio passeio1 = new Passeio("ABC1234", "Fiat", "Uno", "Azul", 120, 4, motorPasseio, 5);
        System.out.println("Velocidade máxima do Passeio 1: " + passeio1.calcVel(passeio1.getVelocMax()) + " m/h");
        Passeio passeio2 = new Passeio("AB123I45", "Volks", "Gol", "Preto", 220, 4, motorPasseio, 5);
        System.out.println("Velocidade máxima do Passeio 2: " + passeio2.calcVel(passeio2.getVelocMax()) + " m/h");
        

        Motor motorCarga = new Motor(8, 300);
        Carga carga1 = new Carga("DEF5678", "Scania", "P310", "Vermelho", 80, 8, motorCarga, 1000, 500);
        System.out.println("Velocidade máxima da Carga 1: " + carga1.calcVel(carga1.getVelocMax()) + " cm/h");
        Carga carga2 = new Carga("DE5F1678", "Scania", "G420", "Verde", 100, 8, motorCarga, 1000, 500);
        System.out.println("Velocidade máxima da Carga 2: " + carga2.calcVel(carga2.getVelocMax()) + " cm/h");
    }
}