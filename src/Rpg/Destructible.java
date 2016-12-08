/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rpg;

/**
 *
 * @author licence
 */
public class Destructible {
    private float hit_me;
    private float life;
    
    Destructible(float d){
        this.hit_me=d;
        this.life=life-d;
    }
}
