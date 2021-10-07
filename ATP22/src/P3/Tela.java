package P3;

public class Tela {
    public static void main(String[] args) {
        Calculadora hp = new Calculadora();
        double op1 = 11.4;
        double op2 = 1.6;
        int a = 11;
        int b = 1;
        int c = 2; 
        float d = 10.4f;
        float e = 1.6f;
        float f = 4.0f;

        System.out.printf("Soma usando double: %.2f + %.2f = %.2f\n", op1, op2, hp.soma(op1, op2));
        System.out.printf("Soma usando int: %d + %d = %d\n", a, b, hp.soma(a, b));
        System.out.printf("Soma usando float: %.2f + %.2f + %.2f = %.2f\n",d, e, f, hp.soma(d, e, f));
        System.out.printf("Soma usando long: %d + %d + %d = %d\n", a, b, c, hp.soma(a, b, c));
    }
}
