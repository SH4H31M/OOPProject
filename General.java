
public class General  extends Programme
{
	private String title;
	
	public General()
	{
		super();
		title="";
	}
	
	public General(String desc,String cc,String L,String P,String t)
	{
		super(desc,cc,L,P);
		this.title=t;
	}
	
	public General(General G)
	{
		super(G);
		this.title=G.title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
