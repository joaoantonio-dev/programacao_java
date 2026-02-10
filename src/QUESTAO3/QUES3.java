package QUESTAO3;

public class QUES3 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 90;
        int num3 = 90;
        int media;
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
