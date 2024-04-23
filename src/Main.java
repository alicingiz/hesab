import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//
//    power(number,power);
//
//
//
//    }
//
//    public static int power(int number,int power) {
//    for (int i =1;i<=number;i++){
//        if(power>=0){
//
//
//        }
//    }
//        System.out.println(power=number*number);
//        return power;

        boolean check = true;
        while (check) {
            System.out.println("add");
            System.out.println("subtract");
            System.out.println("multiply");
            System.out.println("divide");
            Scanner scanner = new Scanner(System.in);

            System.out.println("Secim edin");
            int choise = scanner.nextInt();
            System.out.println("ededi daxil edin");
            int eded = scanner.nextInt();
            System.out.println("diger eded ededi daxil edin");
            int eded1 = scanner.nextInt();


            switch (choise) {
                case 1:

                    System.out.println(add(eded, eded1));
                    break;

                case 2:

                    System.out.println(subtract(eded, eded1));
                    break;
                case 3:

                    System.out.println(multiply(eded, eded1));
                    break;
                case 4:

                    System.out.println(divide(eded, eded1));
                    break;
            }

            boolean check2 = true;
            while(check2){

            System.out.println("davam etmek isteyirsiniz? : yes-1/no-2");
            int davamEtmek = scanner.nextInt();
            if(davamEtmek == 1){
                check = true;
                check2 = false;
            }else if(davamEtmek == 2){
                check = false;
                check2 = false;
            }else{
                check2 =true;
            }

            }

        }

    }

    public static double add(int eded, int eded1) {
        int sum = 0;
        sum = eded + eded1;

        return sum;
    }


    public static double subtract(int eded, int eded1) {

        int ferq = 0;
        ferq = eded - eded1;


        return ferq;
    }

    public static double multiply(int eded, int eded1) {
        int hasil = 0;
        hasil = eded * eded1;


        return hasil;
    }


    public static double divide(int eded, int eded1) {
        int bolme = 0;
        bolme = eded / eded1;
        return bolme;
    }
}