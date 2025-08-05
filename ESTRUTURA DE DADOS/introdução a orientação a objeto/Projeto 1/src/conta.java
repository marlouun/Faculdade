public class conta {
    private int numConta;
    private String Titular;
    private int Saldo;

    conta(int nm, String quem){
        numConta = nm;
        Titular = quem;
        Saldo = 0;
    }

    public void depositar (int quanto) {
        Saldo = Saldo + quanto;
    }

    public boolean sacar (int quanto) {
        if (quanto <= Saldo) {
            Saldo = Saldo - quanto;
            return true;
        }
        return false;
    }

    public int consultar() {
        return Saldo;
    }
}