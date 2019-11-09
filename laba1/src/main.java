import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array;
        int s1=0;
        int s2=0;
        int s3=0;

        int i=0;
        int lenght=in.nextInt();
        array = new int[5];
        for (i = 0; i < lenght; i++) {
            array[i] = in.nextInt();
            s1=s1+array[i];
        }
        i=0;

        while(i<lenght){
            s2=s2+array[i];
            i++;
        }
        i=0;
        do{
            s3=s3+array[i];
            i++;
        }while (i<lenght);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(array.length);

    }



}