import java.awt.Button;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/* <applet code="AudioDemo" width="300" height="300">
</applet>  */

public class AudioDemo extends Applet implements ActionListener{
AudioClip ac;
  Button btnp,btns;

  public void init()
	{ ac=getAudioClip
	  (getDocumentBase(),"music.wav");
      btnp=new Button("Play");	  
	  btns=new Button("Stop");   }

  public void start(){
	  add(btnp);
	  add(btns);
	  setBackground(Color.YELLOW);  
	 btnp.addActionListener(this);
	  btns.addActionListener(this); }

  public void actionPerformed(ActionEvent a)
	{ 
	    String name=a.getActionCommand();
		if(name.equals("Play"))
			ac.play();
		else if(name.equals("Stop"))
			ac.stop();
   }
}