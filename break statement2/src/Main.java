// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            for(int j=1;j<=5;j++){
                if(i==2&&j==2)
                {
                    break;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}