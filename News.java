
public class News extends Programme
{
	private String newsPeriod;
	
	
	public News()
	{
		super();
		newsPeriod="";
		
	}
	
	public News(String desc,String cc,String L,String P,String NP)
	{
		super(desc,cc,L,P);
		this.newsPeriod=NP;
	}
	
	public News(News N){
		super(N);
		this.newsPeriod=N.newsPeriod;
	}

	public String getNewsPeriod() {
		return newsPeriod;
	}

	public void setNewsPeriod(String newsPeriod) {
		this.newsPeriod = newsPeriod;
	}
}
