package Entity;

public class Perro extends Animal {
    private String raza;
    int peso;
    public Perro(String nombre,String tipo_alimentacion,int edad,String raza,int peso){
        super(nombre,tipo_alimentacion,edad);
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

    public void ladrar() {
        System.out.println(getNombre() + " está ladrando.");
    }
    //sobrecargando
    public void comer(String food) {
        System.out.println(getNombre() + " está comiendo " + food + ".");
    }
    @Override
    public void comer() {
        System.out.println(getNombre() + " está comiendo Pechuga de pollo");
    }

    public void mostrar(){
        System.out.println(getNombre() + "-"+getTipo_alimentacion()+"-"+getEdad()+"-"+getRaza()+"-"+getPeso());
    }
}

