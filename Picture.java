/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle sun2;
    private Square grass;
    private Square sky;
    private Person Luke;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        sun2 = new Circle();
        grass = new Square();
        sky = new Square();
        Luke = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            sky.changeColor("blue");
            sky.moveHorizontal(-310);
            sky.moveVertical(-120);
            sky.changeSize(500);
            sky.makeVisible();
            
            grass.changeColor("green");
            grass.moveHorizontal(-310);
            grass.moveVertical(120);
            grass.changeSize(500);
            grass.makeVisible();
            
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            
            sun2.changeColor("magenta");
            sun2.moveHorizontal(-200);
            sun2.moveVertical(-70);
            sun2.makeVisible();
            
            Luke.moveHorizontal(200);
            Luke.moveVertical(20);
            Luke.makeVisible();
            Luke.slowMoveHorizontal(-150);
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        sky.changeColor("white");
        grass.changeColor("black");
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
        sun2.changeColor("black");
        Luke.changeColor("black");
        Luke.moveHorizontal(150);
        Luke.slowMoveHorizontal(-150);
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        sky.changeColor("blue");
        grass.changeColor("green");
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
        sun2.changeColor("magenta");
        Luke.changeColor("black");
        Luke.moveHorizontal(150);
        Luke.slowMoveHorizontal(-150);
    }
}
