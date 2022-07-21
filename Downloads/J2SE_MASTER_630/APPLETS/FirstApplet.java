//FirstApplet.java
import java.applet.Applet;
import java.awt.Graphics;

/*<applet code="FirstApplet" width="300" height="300">
</applet> */

public class FirstApplet extends Applet{
	public void paint(Graphics g)
	{ g.drawString("Hello",150,150);}
}