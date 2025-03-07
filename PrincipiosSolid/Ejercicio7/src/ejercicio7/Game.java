/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author const
 */
public class Game {
    private List<Enemy> enemies;
    private boolean endGame = false;
    
    public void init(){
        enemies = new ArrayList<>();
        enemies.add(new KnifeEnemy());
        enemies.add(new GunEnemy());
    }
    
    public void run(){
        while (!endGame){
            for (Enemy enemy : enemies){
                enemy.doAction();
            }
            endGame = true;
        }
    }
    
    public static void main(String[]args){
        Game game = new Game();
        game.init();
        game.run();
    }
}
