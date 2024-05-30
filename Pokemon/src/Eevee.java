public class Eevee {
    //atributos
    private String tipo;
    private Double peso;
    private int altura;
    private int hp;

    //Método construtor
    public Eevee(String tipo, Double peso, int altura, int hp) {
        this.tipo = tipo;
        this.peso = peso;
        this.altura = altura;
        this.hp = hp;
    }

    // Getter e Setter
    public String getTipo() {
        return tipo;
    }
   
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }

    //Métodos
    public String Ataque(){
        return "Ataque rápido";
    }

    public String Defesa(){
        return "Desvio";
    }

    public String Especial(){
        return "Tri-ataque";
    }

    public void Imprimir(){
        System.out.println("------POKEMON--------");
        System.out.println("Tipo: " + getTipo());
        System.out.println("Peso: " + getPeso());
        System.out.println("Altura: " + getAltura());
        System.out.println("HP: " + getHp());
        System.out.println("Ataque: " + Ataque());
        System.out.println("Defesa: " + Defesa());
        System.out.println("Especial: " + Especial());
        System.out.println("---------------------");

    }

    
    

}
