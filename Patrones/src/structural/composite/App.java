package structural.composite;

public class App {
    public static void main(String[] args) {
        CuentaComponent cuentaAhorro = new CuentaAhorro(100d, "ahorro");
        CuentaComponent cuentaCorriente = new CuentaCorriente(100d, "corriente");
        
        CuentaComposite cuentaComposite = new CuentaComposite();
        cuentaComposite.addCuenta(cuentaAhorro);
        cuentaComposite.addCuenta(cuentaCorriente);

        cuentaComposite.showAccountName();
        System.out.println(cuentaComposite.getAmount());


    }
}
