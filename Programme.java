
public class Programme {
	
	protected String description;
	protected String closedCaption;
	protected String length;
	protected String programtype;
	
	public Programme(){
		description="";
		closedCaption="";
		programtype="";
		length="";
	}
	public Programme(String description,String closedCaption,String length,String programtype)
	{
		this.description=description;
		this.closedCaption=closedCaption;
		this.length=length;
		this.programtype=programtype;
	}
	public Programme(Programme p){
		this.description=p.description;
		this.closedCaption=p.closedCaption;
		this.programtype=p.programtype;
		this.length=p.length;
		
	}
	
	public String toString(){
		
		String out;
		out="\n Description: "+description+"\nClosed Caption: "+closedCaption+"\nLength: "+length+"Program is: "+programtype;
		return out;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getClosedCaption() {
		return closedCaption;
	}
	public void setClosedCaption(String closedCaption) {
		this.closedCaption = closedCaption;
	}


	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
}
