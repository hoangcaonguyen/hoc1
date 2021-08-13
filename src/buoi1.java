import java.util.Scanner;

public class buoi1 {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int chucnag = -1;
        //code 1 ham while chon chuc nang
        //ben trong ham while{
        // switch cac so vua chon, chon 1 thi vao case 1, chon 2 vao case 2
        // chon 3 de ket thuc}
        // vong lap while se lap lai neu dieu kien trong while thoa man
        // vi du
        // boi den doan code ->> ctrl + alt + L de format code
        //viet theo kieu nay
        // switch case no cung la 1 vong lap, no se chay tu tren xuong duoi, case 1 dung -> case 1, xong tiep tuc chay
        //case 2, ---> dung break de thoat vong lap, TIM HIEU BREAK VA CONTINUE
        System.out.println("----------MENU----------");
        System.out.println("Chuc nang 1: giai phuong trinh bac 2");
        System.out.println("Chuc nang 2: tinh tong 2 so nguyen");
        System.out.println("Chuc nang 3: Ket thuc");
        while (chucnag != 3) {
            System.out.println("chon chuc nang");
            chucnag = scanner.nextInt();
            switch (chucnag) {
                case 1: {
                    System.out.println("nhap gia tri a ,b ,c");
                    float a = scanner.nextFloat();
                    float b = scanner.nextFloat();
                    float c = scanner.nextFloat();
                    phuongtrinhbac2(a ,b ,c);
                    break;
                }
                case 2: {
                    System.out.println("nhap gia tri a ,b");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    sum(a ,b);
                    break;
                }
                case 3: {
                    System.out.println("-----------END-----------");
                    break;
                }
                default: {
                    System.out.println("nhap sai, moi nhap lai");
                    break;
                }
            }
        }

    }
    public static void phuongtrinhbac2(float a, float b, float c){
        try{
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
    public static void sum(int a, int b){
        int sum = a+b;
        System.out.println("tong cua 2 so la:" +sum );
    }
}
