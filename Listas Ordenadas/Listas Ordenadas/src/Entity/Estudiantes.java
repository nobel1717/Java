package Entity;

public class Estudiantes{
    private String nombre;
    private String cedula;
    private int edad;
    private int estatura;

    // Constructores
    public Estudiantes() {
    }

    public Estudiantes(String nombre, String cedula, int edad, int estatura) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.estatura = estatura;
    }

    // Getter y Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }


    public String infoEstudiante(){
        return
                        "Informacion: \n" +
                        "Nombre: " + getNombre() + "\n" +
                        "Cédula: " + getCedula() + "\n" +
                        "Edad: " + getEdad() + "\n" +
                        "Estatura: " + getEstatura() + " cm\n";
    }

}

