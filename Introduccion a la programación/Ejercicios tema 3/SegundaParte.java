public class Main {

    public static void main(String[] args) {

        coche miCoche = new coche ();

        miCoche.IncrementarPuerta();

        System.out.println(miCoche.puertas);
    }

    public static int suma (int numero1,int numero2,int numero3) {
        return numero1 + numero2 + numero3;
    }
}

class coche {

    public int puertas = 3;

    public void IncrementarPuerta () {
        this.puertas++;
    }
}
