package Entity;
import java.util.Scanner;

public class Nivel1 extends Colaboradores{
     private int ventasRealizadas;
    public interface Interface1 {
        public void Salario();

    }

    public Nivel1(String Nom, String apellido, String cedula, int ventasRealizadas) {
        super(Nom, apellido, cedula);
        this.ventasRealizadas = ventasRealizadas;
    }
    void Salario(){
        System.out.print("Ingrese el nombre del primer jugador:");
        Scanner Leer = new Scanner(System.in);
        Double Salario = Leer.nextDouble();
    }
    public int getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(int ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }
    public double bonoVentas(int ventasRealizadas){
        double calcBono;
        calcBono = ventasRealizadas * 0.03;
        return calcBono;
    }

    @Override
    public double horasExtras(double salario, int horasExtras) {
        double horExtra;
        horExtra = salario + (horasExtras * 1.5);
        return horExtra;
    }

    @Override
    public int vacaciones() {
        return 0;
    }

    public void imprimirNivel1(){
        System.out.println(
                "Información Colaborador de Nivel 1:" + "\n\n" +
                "Nom: " + getNom() + "\n" +
                "Apellido: " + getape() + "\n" +
                "Cédula: " + getCedula() + "\n" +
                "Departamento: " + getDepartamento() + "\n" +
                "Edad: " + calcularEdad(getFechaDeNacimiento()) + "\n" +
                "Salario: " + calcularSalarioBase(getSalario(), getHorasTrabajadasDiariamente()) + "\n" +
                "Nivel Colaborador: " + getNivelColaborador() + "\n"+
                "Estatus: " + getEstatusEmpresa() + "\n" +
                "Horas Extras: " + horasExtras(getSalario(), getHorasExtras()) + "\n" +
                "Numero de Extensión: " + getNumExtInterna()
        );
    }
}
