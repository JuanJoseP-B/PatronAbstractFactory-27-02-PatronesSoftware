
public class OuffitClasicoFactory implements OufittFactory {
	
	@Override
    public Jean crearJean() {
        return new JeanSkini();
    }

    @Override
    public Camiseta crearCamiseta() {
        return new CamisetaMangaCorta();
    }

}
