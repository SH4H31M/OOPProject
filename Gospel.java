
public class Gospel extends Programme 
{
	
	private String title;
	private String denomination;
	
	
	public Gospel(){super();title="";denomination="";}

	public Gospel(String desc,String cc,String L,String P,String t,String d)
	{
		super(desc,cc,L,P);
		this.title=t;
		this.denomination=d;
	}
	
	public Gospel(Gospel G){
		super(G);
		this.title=G.title;
		this.denomination=G.denomination;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDenomination() {
		return denomination;
	}

	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}
}