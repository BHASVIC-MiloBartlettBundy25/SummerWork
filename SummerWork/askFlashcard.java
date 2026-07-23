import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
import java.util.*;
/**
 * Write a description of class askRandomFlashcard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class askFlashcard extends Button
{
    /**
     * Act - do whatever the askRandomFlashcard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int question = 0;
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            MyWorld myWorld = (MyWorld)getWorld();
            myWorld.showQuestion();
        }
    }
}
