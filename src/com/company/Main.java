package  com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            while(true) {
                int n = s.nextInt();
                int jiecheng1 = jiecheng(n);
                System.out.println(jiecheng1);


            }


    }

        public static int jiecheng(int n) {
                  if (n == 1){
                      return 1;
                  }
                  return  n * jiecheng(n-1);
        }




}

class  Smart{

}





