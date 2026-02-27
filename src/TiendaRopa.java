public class TiendaRopa { 

    private OutfitFactory factory;

    public TiendaRopa(OutfitFactory factory) {
        this.factory = factory;
    }

    public void mostrarOutfit() {
        Jean jean = factory.crearJean();
        Camiseta camiseta = factory.crearRemera();

        jean.descripcion();
        Camiseta.descripcion();
    }
}
