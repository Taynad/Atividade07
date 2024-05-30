public class App {
    public static void main(String[] args) throws Exception {
      Eevee e = new Eevee("Normal", 85.6, 130, 300);
      e.Imprimir();

      Espeon p = new Espeon("Psychic", 89.0, 137, 800);
      p.Imprimir();

      Floreon f = new Floreon("Fire", 77.9, 122, 650);
      f.Imprimir();

      Jolteon j = new Jolteon("Eletric", 110.8, 158, 500);
      j.Imprimir();

      Glaceon g = new Glaceon("ice", 89.3, 147, 1000);
      g.Imprimir();

      Leafeon l = new Leafeon("Glass", 65.8, 133, 788);
      l.Imprimir();

      Sylveon s = new Sylveon("Fairy", 76.2, 166, 976);
      s.Imprimir();

      Umbreon u = new Umbreon("Dark", 88.9, 144, 1055);
      u.Imprimir();

      Vaporeon v = new Vaporeon("Water", 50.3, 132, 964);
      v.Imprimir();
    }
}
