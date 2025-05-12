import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    GreenfootImage idle = new Greenfoot("images");
    
    public void act()
    {
        //mdd your action code here.
        if(Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left")){
            move(-2);
        } else if (Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")){
            move(2);
        }
        
        eat();
    }
    
    public void eat(){
        
        if(isTouching(Apple.class)){
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
            elephantSound.play();
        }
    }
}
