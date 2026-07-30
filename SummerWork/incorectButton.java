import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class incorectButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class incorectButton extends Button
{
    /**
     * Act - do whatever the incorectButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            MyWorld myWorld = (MyWorld)getWorld();
            myWorld.incorrectbuttonpressed();
            
            
        }
    }
}
