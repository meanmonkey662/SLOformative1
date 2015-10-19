package SloController;

import Slo.view.Popup;
import Slo.view.SloDisplay;

public class SloController
{
	//Declaration section
	private int myCookies;
	private String name;
	private Popup myPopUp;
	private SloDisplay myDisplay;
	
	public SloController()
	{
		name = " Cookie Monster";
		myPopUp = new Popup();
		myDisplay = new SloDisplay();
		
	}
	
	public void start()
	{
		myPopUp.displayResponse("I AM COOKIE MONSTER");
				
		String name = myPopUp.getAnswer("How many cookies do you want me to eat!?!?!");
		
		myPopUp.displayResponse(" You told me to eat " + myCookies);
		
		int myCookies;
		String tempmyCookies = myPopUp.getAnswer(" ");
		if(1 == 1)
		{
			
		}
		else
		{
			
		}
	}
	
	private void Answer()
	{
		System.out.println(" Hello i am Cookie monster, and i LOVE candy!!!");
		
		
	}
}
