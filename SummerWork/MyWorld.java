import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    List<String[]> flashcards = new ArrayList<String[]>();
    //front,back,times answered,times correct
    int question = 0;
    
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        NewFlashcard newFlashcard = new NewFlashcard();
        addObject(newFlashcard,171,178);

        FlashcardDisplay flashcardDisplay = new FlashcardDisplay();
        addObject(flashcardDisplay,451,92);
        askFlashcard askFlashcard = new askFlashcard();
        addObject(askFlashcard,361,282);
        showAnswer showAnswer = new showAnswer();
        addObject(showAnswer,442,282);
        newFlashcard.setLocation(285,290);
        correctButton correctButton = new correctButton();
        addObject(correctButton,516,228);
    }

    public void addFlashcard(String front, String back){
        String[] f = {front,back,"0","0"};
        flashcards.add(f);
        
    }
    public void getRidOfTextDisplay(){
        showText("",100,50);
        showText("",400,50);
    }
    public void showQuestion(){
        System.out.println("should ask new flashcard");
        
            
        showText(flashcards.get(question)[0],100,50);
        
            
    }
    public void showAnswer(){
        System.out.println("give answer");
        showText(flashcards.get(question)[1],400,50);
    }
    public void correctbuttonpressed(){
        getRidOfTextDisplay();
        question++;
        if (question == flashcards.size() ){
            question = 0;
            }
        System.out.println("answer correct");
    }
}
