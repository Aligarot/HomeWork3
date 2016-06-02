package task2.game;

import java.util.Scanner;

/**
 * Created by Dima on 30.05.2016.
 */
public class GameMain {
    public static void main(String[] args) {
        Game newGame= new Game();
        Scanner sc= new Scanner(System.in);
        boolean exiter=true;
        while (exiter==true){
            System.out.println("Введите число");
            int number=sc.nextInt();
            exiter=newGame.findNumber(number);
        }
    }
}
