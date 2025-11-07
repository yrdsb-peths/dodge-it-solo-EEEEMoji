import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bee extends Actor
{
    boolean atTop = true;
    
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(null)){
            atTop = !atTop;
        }
        
        if(atTop){
            setLocation(100,100);
        } else {
           setLocation(300,100); 
        }
    
    }
}
