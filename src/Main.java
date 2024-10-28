import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tamanho do raio da bola: ");
        int raio = scanner.nextInt();
        System.out.print("Posição de x: ");
        float x = scanner.nextFloat();
        System.out.print("Posição de y: ");
        float y = scanner.nextFloat();
        System.out.print("Velocidade de xDelta: ");
        float xDelta = scanner.nextFloat();
        System.out.print("Velocidade yDelta: ");
        float yDelta = scanner.nextFloat();

        Ball bola = new Ball(raio, x, y, xDelta, yDelta);
        System.out.println(bola);

        System.out.print("Limite minimo de x: ");
        float xMin = scanner.nextFloat();
        System.out.print("Limite máximo de x: ");
        float xMax = scanner.nextFloat();
        System.out.print("Limite minimo de y: ");
        float yMin = scanner.nextFloat();
        System.out.print("Limite máximo de y: ");
        float yMax = scanner.nextFloat();

        for (int i = 0; i < 4; i++) {
            bola.move();
            System.out.println(bola);
            float xNew = bola.getX();
            float yNew = bola.getY();
            int raioValor = bola.getRaio();

           if((xNew + raioValor) > xMax || (xNew - raioValor) < xMin){
            bola.reflectHorizontal();
           }
           if((yNew + raioValor) > yMax || (yNew - raioValor) < yMin){
            bola.reflectVertical();
           }

        }
        scanner.close();
    }
}
