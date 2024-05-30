public class Glaceon extends Eevee {
    //Construtor
    public Glaceon(String tipo, Double peso, int altura, int hp) {
        super(tipo, peso, altura, hp);
    }

    //Métodos
    @Override
    public String Ataque() {
        return ("Ice Beam");
    }

    @Override
    public String Defesa() {
        return ("Avalanche");
    }

    @Override
    public String Especial() {
        return ("Icy Wind");
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
