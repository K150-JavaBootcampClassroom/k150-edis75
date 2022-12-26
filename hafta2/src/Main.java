import java.util.Random;

public class Main {
    public static void main(String[] args) {


        Random rand=new Random();
        int sayac=0;
        boolean sayiyiBuldu=true;
        while (sayiyiBuldu){
            int random=rand.nextInt(500);
            sayac++;
            if(random>50 && random<100){

                sayiyiBuldu=false;
            }
        }
        System.out.println(
                sayac+ " Defa da bulduk   "
        );

    }
}