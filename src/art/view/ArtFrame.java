package art.view;

import javax.swing.JPanel;

import art.controller.ArtController;

public class ArtFrame extends JPanel
{

	private ArtPanel appPanel;
	
	public ArtFrame(ArtController app)
	{
		super();
		appPanel = new ArtPanel(app);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(1200, 700);
		this.setContentPane(appPanel);
		this.setTitle("Creating modern art in Java");
		this.setVisible(true);
	}

	private void setTitle(String string)
	{
		
	}

	private void setContentPane(ArtPanel appPanel2)
	{
		
	}
}
