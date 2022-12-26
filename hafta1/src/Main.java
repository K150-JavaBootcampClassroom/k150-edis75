import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int bakiye=1000;
        Scanner scan=new Scanner(System.in);
        System.out.println("Merhabalar Edis Banka hoş geldiniz Para çekmek için lütfen 1 e para yatırmak için lütfen 2 'ye bakiye görüntülmek için lütfen 3 'e çıkış yapmak için lütfen 4  ' e tıklayınız");
        int secilmisNumara=scan.nextInt();
        if(secilmisNumara==1){
            System.out.println("lütfen çekmek istediğiniz sayıyı giriniz");
            int  cekilecekPara=scan.nextInt();
            if(cekilecekPara>bakiye){
                System.out.println("Bakiyeniz geçersiz lütfen mümkün bir ücret talep ediniz");
            }
            else{
                bakiye+=cekilecekPara;
                System.out.println("işlem başarılı ");
            }
        } else if (secilmisNumara==2) {
            System.out.println("lütfen yatırmak istediğiniz tutarı giriniz");
            int yatirilacakTutar=scan.nextInt();
            bakiye+=yatirilacakTutar;
            System.out.println("işleminiz başarı ile gerçekleşmiştir");
        } else if (secilmisNumara==3) {
            System.out.println("Bakiyeniz "+bakiye);

        }
        else{
            System.exit(0);
        }
    }
}