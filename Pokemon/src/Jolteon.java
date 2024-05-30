public class Jolteon extends Eevee {

    //Construtor
    public Jolteon(String tipo, Double peso, int altura, int hp) {
        super(tipo, peso, altura, hp);
        
    }

    //Métodos
    @Override
    public String Ataque() {
        return("Trovoada - Thuder-Shock");
    }

    @Override
    public String Defesa() {
        return ("Carga - Wild Charge");
    }

    @Override
    public String Especial() {
        return ("Raio - Thurderbolt");
    }

    // Getter e Setter
    @Override
    public int getAltura() {
        return super.getAltura();
    }

    @Override
    public int getHp() {
        return super.getHp();
    }

    @Override
    public Double getPeso() {
        return super.getPeso();
    }

    @Override
    public String getTipo() {
        
        return super.getTipo();
    }

    @Override
    public void setAltura(int altura) {
        super.setAltura(altura);
    }

    @Override
    public void setHp(int hp) {
        super.setHp(hp);
    }

    @Override
    public void setPeso(Double peso) {
        super.setPeso(peso);
    }

    @Override
    public void setTipo(String tipo) {
        
        super.setTipo(tipo);
    }

    @Override
    public void Imprimir() {
        super.Imprimir();
    }
    
    
}
