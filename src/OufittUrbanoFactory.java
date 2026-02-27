
public class OufittUrbanoFactory {
  @Override
    public Jean crearJean() {
        return new JeanSkini();
    }

    @Override
    public Camiseta crearCamiseta() {
        return new CamisetaMangaCorta();
    }

}

