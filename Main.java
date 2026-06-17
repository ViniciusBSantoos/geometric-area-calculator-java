import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // Mapa: Nome da figura + cálculo da área
        Map<String, FiguraGeometrica> figuras = new LinkedHashMap<>();

        figuras.put("Quadrado", () -> {
            double lado = 5;
            return lado * lado;
        });

        figuras.put("Retângulo", () -> {
            double base = 4;
            double altura = 3;
            return base * altura;
        });

        figuras.put("Círculo", () -> {
            double raio = 2;
            return Math.PI * raio * raio;
        });

        // Exibindo resultados
        for (String nome : figuras.keySet()) {

            double area = figuras.get(nome).calcularArea();

            System.out.printf("%s: %.2f%n", nome, area);
        }
    }
}