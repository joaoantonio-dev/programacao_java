public class QUES3 {
    public static void main(String[] args) {
        double num1 = 10.00;
        double num2 = 90.00;
        double num3 = 90.00;
        double media;
        media = (num1 + num2 + num3) / 3;
        if (media>=70){
            System.out.println("Aprovado");
        } else if (media<40){
            System.out.println("Reprovado");
        } else{
            System.out.println("Final");
        }
    }
}
