package mephi.Sem2Java5;

public class BarakaFabric implements EnemyFabricInterface {

    @Override
    public Player create(int i) {
        Player enemy;
        enemy = new Baraka(1, 100, 12, 1);
        return enemy;
    }
}
