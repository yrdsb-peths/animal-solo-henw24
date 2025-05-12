import greenfoot.*;

public class MyWorld extends World {
    public int score;
    Label scoreLabel;
    int lvl = 1;
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
        if (score % 5 == 0){
            lvl++;
        }
    }
    
    public void createApple(){
     Apple apple = new Apple();
     apple.setSpeed(lvl);
     int x = Greenfoot.getRandomNumber(600);
     int y = Greenfoot.getRandomNumber(20);
     addObject(apple, x, y);
    }
}
