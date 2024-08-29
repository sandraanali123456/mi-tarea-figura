//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Figura triangulo = new Triangulo(5, 10);
        Figura rectangulo = new Rectangulo(4, 8);
        Figura circulo = new Circulo(3);

        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del círculo: " + circulo.calcularArea());
    }
}