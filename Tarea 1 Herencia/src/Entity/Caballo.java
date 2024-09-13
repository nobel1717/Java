package Entity;

public class Caballo extends Animal {
    String raza;
    int peso;
    public Caballo(String nombre, String tipo_alimentacion, int edad,String raza,int peso) {
        super(nombre, tipo_alimentacion, edad);
        this.raza = raza;
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public int getPeso(){
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void relinchar() {
        System.out.println(getNombre() + " está relinchando.");
    }

    @Override
    public void comer() {
        System.out.println(getNombre() + " está comiendo cesped.");
    }

    public void comer(String food) {
        System.out.println(getNombre() + " está comiendo " + food + ".");
    }

    public void mostrar(){
        System.out.println(getNombre() + "-"+getTipo_alimentacion()+"-"+getEdad()+"-"+getRaza()+"-"+getPeso());
    }
}

