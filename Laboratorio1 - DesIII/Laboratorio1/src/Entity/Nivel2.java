package Entity;
import java.util.*;
public class Nivel2 extends Colaboradores {

    public Nivel2(String nombre, String apellido, String cedula, String departamento, int fechaDeNacimiento, double salario, int horasTrabajadasDiariamente, int nivelColaborador, String estatusEmpresa, int horasExtras, int numExtInterna) {
        super(nombre, apellido, cedula, departamento, fechaDeNacimiento, salario, horasTrabajadasDiariamente, nivelColaborador, estatusEmpresa, horasExtras, numExtInterna);
    }

    public int vacaExtraor(int diaVacaciones){
        return diaVacaciones * super.getHorasTrabajadasDiariamente();
    }

    @Override
    public double horasExtras(double salario, int horasExtras){
        double horExtra;
        horExtra = salario + (horasExtras * 1.5);
        return horExtra;
    }

    @Override
    public int vacaciones(){
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese un valor");
        int valorU = scan.nextInt();
        return getHorasTrabajadasDiariamente()*valorU;
    }
    public void imprimirNivel2(){
        System.out.println(
                "Información Colaborador de Nivel 2:" + "\n\n" +
                "Nombre: " + getNom() + "\n" +
                "Apellido: " + getape() + "\n" +
                "Cédula: " + getCedula() + "\n" +
                "Departamento: " + getDepartamento() + "\n" +
                "Edad: " + calcularEdad(getFechaDeNacimiento()) + "\n" +
                "Salario: " + calcularSalarioBase(getSalario(), getHorasTrabajadasDiariamente()) + "\n" +
                "Nivel Colaborador: " + getNivelColaborador() + "\n"+
                "Estatus: " + getEstatusEmpresa() + "\n" +
                "Horas Extras: " + horasExtras(getSalario(), getHorasExtras()) + "\n" +
                "Numero de Extensión: " + getNumExtInterna() +
                "Vacaciones: " + getHorasTrabajadasDiariamente() + "\n"
        );
    }
}
