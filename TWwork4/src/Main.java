import com.tw.practice.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String randnumber = new NumberGenerator().generate();
        Scanner scanner = new Scanner(System.in);
        int round = 0;
        while(round < 6){
            String inputnumber = scanner.next().toString();
            String result = new NumberCompare().compare(inputnumber, randnumber);
            System.out.println(result);
            if(result.equals("4A0B")){
                System.out.println("you win");
                return;
            }
            round++;
        }
        System.out.println("game over");
    }
}
