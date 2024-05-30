public class Vaporeon extends Eevee{
    //Construtor
    public Vaporeon(String tipo, Double peso, int altura, int hp) {
        super(tipo, peso, altura, hp);
    }

    //Método
    @Override
    public String Ataque() {
        return ("Bubble Beam");
    }

    @Override
    public String Defesa() {
        return ("Acid Armor");
    }

    @Override
    public String Especial() {
        return ("Hydro Pump");
    }

    @Override
    public void Imprimir() {
        super.Imprimir();
    }

    //Getter e Setter
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
    
    
    
}
