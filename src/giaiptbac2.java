import java.util.Scanner;

public class giaiptbac2 {
    public static void main(String...args){
        System.out.println("nhap gia tri a ,b ,c");
        Scanner scanner = new Scanner(System.in);

        try{
            float a = scanner.nextFloat();
            float b = scanner.nextFloat();
            float c = scanner.nextFloat();
            float deta,x1,x2;
            if (a==0){
                System.out.println("pt co nghiem la "+(-c/b));
            }else {
                deta = b*b-4*a*c;
                if(deta==0){
                    x1 = -b/2*a;
                    System.out.println("pt co nghiem kep:"+x1);
                }else if(deta<0){
                    System.out.println("pt vo nghiem");
                }else {
                    x1 = (float) ((-b + Math.sqrt(deta)) / 2* a);
                    x2 = (float) ((-b - Math.sqrt(deta))/ 2*a);
                    System.out.println("pt co 2 nghiem la");
                    System.out.println("X1 = "+x1);
                    System.out.println("x2 = "+x2);
                }
            }
        }catch (Exception e){
            System.out.println("xin hay nhap so");
        }

    }
}
