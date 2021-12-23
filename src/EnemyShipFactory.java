public class EnemyShipFactory {
    public EnemyShip makeenemyShip(String newShipType){
        EnemyShip newship=null;
        if(newShipType.equals("U")){
            return new UfoEnemyShip();
        }else if(newShipType.equals("R")){
            return new RocketEnemyShip();
        }else if(newShipType.equals("B")){
            return new BigUFOEnemyShip();
        }else{
            return null;
        }
    }
}
