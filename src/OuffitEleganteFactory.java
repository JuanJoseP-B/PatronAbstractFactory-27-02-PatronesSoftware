
public class OuffitEleganteFactory {
  @Override
    public Jean crearJean() {
        return new JeanRecto();
    }

    @Override
    public Camiseta crearCamiseta() {
        return new CamisetaAlCuerpo();
    }

}

