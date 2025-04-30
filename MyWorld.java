import greenfoot.*;

public class MyWorld extends World {
    public int score;
    Label scoreLabel;
    public MyWorld() {
        super(600, 400, 1, false);
        Elephant elephant = new Elephant();
        addObject(elephant, 300,300);
        
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createApple();
        
    }
    
    public void gameOver(){
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    public void increaseScore(){
        score++;
        scoreLabel.setValue(score);
    }
    
    public void createApple(){
     Apple apple = new Apple();
     int x = Greenfoot.getRandomNumber(600);
     int y = Greenfoot.getRandomNumber(20);
     addObject(apple, x, y);
    }
}
