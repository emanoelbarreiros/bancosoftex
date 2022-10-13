package poligono;

public class UsandoPolygon {

    public static void main(String[] args) {
        Polygon triangulo1 = FactoryPolygon.createPolygon(3);
        Polygon rectangulo1 = FactoryPolygon.createPolygon(4);

        triangulo1.draw();
        rectangulo1.draw();
    }

}
