import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double km, age, flight;
        double secondPrice, lastPrice = 0, duh = 0;

        System.out.print("Kilometre : ");
        km = input.nextDouble();
        if(km <= 0){
            System.out.print("Hatalı Veri Girdiniz!");
            km = input.nextDouble();
        }

        System.out.print("Yaş : ");
        age = input.nextDouble();
        if(age <= 0){
            System.out.print("Hatalı Veri Girdiniz!");
            age = input.nextDouble();
        }

        System.out.print("1. Tek Yön\n2. Gidiş Geliş\n");
        System.out.print("Uçuş tipini seçiniz : ");
        flight = input.nextDouble();
        if((flight <= 0 ) && (flight >= 3)){
            System.out.print("Hatalı bir veri girdiniz!");
            flight = input.nextDouble();
        }

        secondPrice = km * 0.10;
        if(age < 12){
            lastPrice = secondPrice - (secondPrice*0.50);
        }else if((age > 12) && (age <24)){
            lastPrice = secondPrice - secondPrice*0.10;
        }else if(age > 65){
            lastPrice = secondPrice - secondPrice*0.30;
        }else{
            lastPrice = secondPrice;
        }
        if(flight == 2){
            lastPrice = lastPrice*2;
            duh = lastPrice - (lastPrice*0.20);
        }else {
            duh = lastPrice;
        }

        System.out.print("Fiyat : " + duh);
    }

}