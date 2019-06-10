import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.*;
import java.net.URL;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.event.*;
import javafx.scene.input.*;
import javafx.scene.text.*;

public class Alien extends GameObject
{
	private int x;
	private int y;
	private int velX;
	private int velY;
	private boolean isAlive;
	private Image image;
	private Image bt;
	private int shooterNum;

	public Alien(int x, int y, Image image){
		super(x, y, image);
		bt = new Image("bullet.png");
		velX = 0;
		velY = 0;
		isAlive = true;
		shooterNum = (int)(Math.random()*10)+1;
	}

	public int getShooterNum() {
		return shooterNum;
	}
}
