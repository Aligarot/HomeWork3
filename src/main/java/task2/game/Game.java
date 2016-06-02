package task2.game;

/**
 * Created by Dima on 30.05.2016.
 */
public class Game {
    private int secretNumber;

    public Game() {
        secretNumber=(int)(Math.random()*100+1);
    }

    public int getSecretNumber() {
        return secretNumber;
    }

    public void setSecretNumber(int secretNumber) {
        this.secretNumber = secretNumber;
    }

    public boolean findNumber(int enterNumber){
        if(enterNumber==secretNumber){
            System.out.println("Вы угодали");
            return false;
        }else if((enterNumber>100)|(enterNumber<1)){
            System.out.println("Число не входит в указанный промежуток");
            return true;
        }else if(secretNumber<enterNumber){
            System.out.println("Задуманное число меньше");
            return true;
        }else if(secretNumber>enterNumber) {
            System.out.println("Задуманное число больше");
            return true;
        }
        return true;
    }
}
