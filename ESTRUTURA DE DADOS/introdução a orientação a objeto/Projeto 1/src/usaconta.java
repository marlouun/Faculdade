
public class usaconta {
    public static void main(String[] args) {

    int x, y;
    float um, dois;
    String cidade;
    conta minha, tua, nossa;

    minha = new conta(111, "Zé");
    tua = new conta(222, "Eva");
    nossa = new conta (333, "Xico");

    tua.depositar(500);

        System.out.println("SALDO DA EVA: " + tua.consultar());

        nossa.depositar(800);

        if (nossa.sacar(300) == false) {
            System.out.println("SALDO INSUFICINTE");
        }
        else {
                System.out.println("SAQUE EFETUADO");
        }
        System.out.println(nossa.consultar());
    }

}
