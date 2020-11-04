
public class Kids extends Programme
{
	private String title;
	private String ageRange;
	
	
	public Kids(){
		super();
		title="";
		ageRange="";
	}
	public Kids(String description,String closedCaption,String length,String programtype,String t,String ar)
	{
		super( description, closedCaption,length,programtype);
		this.title=t;
		this.ageRange=ar;
	}
	public Kids(Kids K)
	{
		super(K);
		this.title=K.title;
		this.ageRange=K.ageRange;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAgeRange() {
		return ageRange;
	}
	public void setAgeRange(String ageRange) {
		this.ageRange = ageRange;
	}
}
