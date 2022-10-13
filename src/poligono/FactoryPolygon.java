package poligono;

public class FactoryPolygon {

    public static Polygon createPolygon(int qtdLados) {

        if (qtdLados == 3) {
            return new Triangle();
        } else if (qtdLados == 4) {
            return new Rectangle();
        }

        return null;
    }

}
