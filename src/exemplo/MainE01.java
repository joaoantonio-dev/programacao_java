package exemplo;

public class MainE01 {
    public static void main(String[] args) {
        int num1 = 20;
        double num2 =20.0;
        double total;
        num1 = 25;


        total=num1 + num2;

        if(num1>num2){
            System.out.println("é maior");
        } else if (num1 == num2){
            System.out.println("é igual");
        } else{
            System.out.println("é menor");
        }

        System.out.println("o resultado total é " + total);
    }
}