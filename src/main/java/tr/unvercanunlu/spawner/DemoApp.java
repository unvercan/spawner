package tr.unvercanunlu.spawner;

import tr.unvercanunlu.spawner.component.ISpawner;
import tr.unvercanunlu.spawner.component.impl.EnemySpawnerImpl;
import tr.unvercanunlu.spawner.component.impl.ItemSpawnerImpl;
import tr.unvercanunlu.spawner.component.impl.PlayerSpawnerImpl;
import tr.unvercanunlu.spawner.model.item.Item;
import tr.unvercanunlu.spawner.model.item.armor.Armor;
import tr.unvercanunlu.spawner.model.item.potion.HealthPotion;
import tr.unvercanunlu.spawner.model.item.weapon.Sword;
import tr.unvercanunlu.spawner.model.living.Player;
import tr.unvercanunlu.spawner.model.living.enemy.Bandit;
import tr.unvercanunlu.spawner.model.living.enemy.Enemy;
import tr.unvercanunlu.spawner.model.living.enemy.Orc;

public class DemoApp {

  public static void main(String[] args) {
    // spawners
    ISpawner<Player> playerSpawner = new PlayerSpawnerImpl();
    ISpawner<Enemy> enemySpawner = new EnemySpawnerImpl();
    ISpawner<Item> itemSpawner = new ItemSpawnerImpl();

    // registering prototypes
    playerSpawner.addPrototype("default-player", new Player());
    enemySpawner.addPrototype("orc", new Orc());
    enemySpawner.addPrototype("bandit", new Bandit());
    itemSpawner.addPrototype("sword", new Sword());
    itemSpawner.addPrototype("armor", new Armor());
    itemSpawner.addPrototype("potion", new HealthPotion());

    // spawn objects
    Player clonedPlayer = playerSpawner.spawn("default-player");
    Enemy clonedOrc = enemySpawner.spawn("orc");
    Enemy clonedBandit = enemySpawner.spawn("bandit");
    Item clonedSword = itemSpawner.spawn("sword");
    Item clonedArmor = itemSpawner.spawn("armor");
    Item clonedPotion = itemSpawner.spawn("potion");

    // Display clones
    System.out.println("Spawned Player:\n" + clonedPlayer);
    System.out.println("Spawned Orc:\n" + clonedOrc);
    System.out.println("Spawned Bandit:\n" + clonedBandit);
    System.out.println("Spawned Sword:\n" + clonedSword);
    System.out.println("Spawned Armor:\n" + clonedArmor);
    System.out.println("Spawned Health Potion:\n" + clonedPotion);
  }

}
