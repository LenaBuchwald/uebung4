
public class RobotAdapter implements Spieler 
{

	Robot r1;
	
	public RobotAdapter()
	{
		r1 = new Robot();
	}

	public int geheNachLinks(int a) 
	{
		r1.rolleNach(r1.getX()-a,r1.getX());
		return (int) r1.getX();
	}

	public int geheNachRechts(int a) 
	{
		r1.rolleNach(r1.getX()+a,r1.getX());
		return (int) r1.getX();
	}

	
	public int geheNachOben(int a) 
	{
		
		r1.rolleNach(r1.getY(),r1.getY()+a);
		return (int) r1.getY();
	}


	public int geheNachUnten(int a) 
	{
		r1.rolleNach(r1.getY(),r1.getY()-a);
		return (int) r1.getY();
		
	}

	
}
