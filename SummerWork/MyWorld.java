import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

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
    public void act(){
        updateStats();
    }
    public void updateStats(){
        int total = flashcards.size();
        int learned = 0;
        for (int f = 0; f < total; f++){
            if (Integer.parseInt((flashcards.get(f)[3])) > 0){
                learned++;
            }
        }
        showText("you have learned "+learned+" out of "+total+" cards", 200, 350);
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        NewFlashcard newFlashcard = new NewFlashcard();
        addObject(newFlashcard,171,178);

        
        askFlashcard askFlashcard = new askFlashcard();
        addObject(askFlashcard,361,282);
        showAnswer showAnswer = new showAnswer();
        addObject(showAnswer,442,282);
        newFlashcard.setLocation(285,290);
        correctButton correctButton = new correctButton();
        addObject(correctButton,516,228);
        incorectButton incorectButton = new incorectButton();
        addObject(incorectButton,521,303);
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
        if (flashcards.size() != 0){
            showText(flashcards.get(question)[0],100,50);
        }
            
        
        
            
    }
    public void showAnswer(){
        System.out.println("give answer");
        if (flashcards.size() != 0){
            showText(flashcards.get(question)[1],400,50);
        }
    }
    public void correctbuttonpressed(){
        getRidOfTextDisplay();
        flashcards.get(question)[2] = Integer.toString(Integer.parseInt((flashcards.get(question)[2]) + 1));
        flashcards.get(question)[3] = Integer.toString(Integer.parseInt((flashcards.get(question)[3]) + 1));
        question++;
        if (question == flashcards.size() ){
            question = 0;
            }
        System.out.println("answer correct");
        
    }
    public void incorrectbuttonpressed(){
        getRidOfTextDisplay();
        flashcards.get(question)[2] = Integer.toString(Integer.parseInt((flashcards.get(question)[2]) + 1));
        
        question++;
        if (question == flashcards.size() ){
            question = 0;
            }
        System.out.println("answer incorrect");
    }
    public void newFlashcard(){
        //getWorld().showText("write now",451,92);
        String inputValue1 = JOptionPane.showInputDialog("Please input the first side of the new flashcard");
        String inputValue2 = JOptionPane.showInputDialog("Please input the second side of the new flashcard");
        
        if (inputValue1 != null && inputValue2 != null){
            addFlashcard(inputValue1,inputValue2);
        }
    }
}
