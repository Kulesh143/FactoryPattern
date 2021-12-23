import java.util.Scanner;

public class EnemyShipTesting {
    public static void doStuffEnemy(EnemyShip anEnemyShip){
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
    public static void main(String[] args) {
        EnemyShipFactory shipFactory=new EnemyShipFactory();
        EnemyShip theEnemy=null;
        Scanner userInput=new Scanner(System.in);
        System.out.println("What type of ship?(U/R/B)");
        if(userInput.hasNextLine()){
            String typeOfship=userInput.nextLine();
            theEnemy=shipFactory.makeenemyShip(typeOfship);
            if(theEnemy!=null){
                doStuffEnemy(theEnemy);
            }else System.out.println("Please enter U,R,or B next time");
        }
        EnemyShip ufoSHip=new UfoEnemyShip();
        doStuffEnemy(ufoSHip);
        System.out.println("\n");
        String enemyShipOption="";
        System.out.println("What type of ship?(U or R)");
        if(userInput.hasNextLine()){
            enemyShipOption=userInput.nextLine();
        }
        if (enemyShipOption == "U") {
            theEnemy=new UfoEnemyShip();

        }else if(enemyShipOption=="R"){
            theEnemy=new RocketEnemyShip();
        }else{
            theEnemy=new BigUFOEnemyShip();
        }
        doStuffEnemy(theEnemy);
    }
}
