
public class Weather extends Programme
{
	private String severity;
	
	public Weather(){
		super();
		severity="";
	}
	
	public String toString() { 
		String out;
		out=super.toString()+severity;
		return out;}
	
	public Weather(String desc,String cc,String L,String P,String severity)
	{
		super(desc,cc,L,P); 
	    this.severity=severity; 
	}

	public Weather(Weather W)
	{
		super (W);
		this.severity=W.severity;
		
	}


	public String getSeverity() {
		return severity;
	}


	public void setSeverity(String severity) {
		this.severity = severity;
	}

}

