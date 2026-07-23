import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NewFlashcard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewFlashcard extends Button
{
    /**
     * Act - do whatever the NewFlashcard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            System.out.println("new flashcard created");
            getWorld().getObjectsAt(451,92,FlashcardDisplay.class).get(0).newFlashcard();
        }
    }
}
