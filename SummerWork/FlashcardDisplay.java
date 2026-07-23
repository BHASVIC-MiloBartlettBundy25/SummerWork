import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Write a description of class Flashcard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlashcardDisplay extends Actor
{
    /**
     * Act - do whatever the Flashcard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        
    }
    public void newFlashcard(){
        //getWorld().showText("write now",451,92);
        String inputValue1 = JOptionPane.showInputDialog("Please input the first side of the new flashcard");
        String inputValue2 = JOptionPane.showInputDialog("Please input the second side of the new flashcard");
        MyWorld myWorld = (MyWorld)getWorld();
        if (inputValue1 != null && inputValue2 != null){
            myWorld.addFlashcard(inputValue1,inputValue2);
        }
    }
}
