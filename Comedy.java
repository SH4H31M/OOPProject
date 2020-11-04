
public class Comedy extends Programme {
	
	private String title;
	private String episodeTitle;
	private String[] listOfMajorActors;

	
	public Comedy(){
		super();
		title="";
		episodeTitle="";
		listOfMajorActors=new String[3];
	}
	
	public Comedy
	(String desc,String cc,String L,String P,String title,String ept,String Actor1,String Actor2,String Actor3)
	{
		super(desc,cc,L,P);
		this.title=title;
		this.episodeTitle=ept;
		this.listOfMajorActors=new String[]{Actor1,Actor2,Actor3};
	}
	
	public Comedy(Comedy C){
		super(C);
		this.title=C.title;
		this.episodeTitle=C.episodeTitle;
		this.listOfMajorActors=C.listOfMajorActors;
	}
	
	public String toString(){
		String out;
		out="Title:"+title+"\nEpisode: "+episodeTitle+"\n Description: "+description+"\nClosed Caption: "+closedCaption+"\nLength: "+length+" "+programtype;
		out+="\nMajor Actors: ";
		System.out.println(out);getListOfMajorActors();
		return out;
	}

	public String getEpisodeTitle() {
		return episodeTitle;
	}

	public void setEpisodeTitle(String episodeTitle) {
		this.episodeTitle = episodeTitle;
	}

	public void getListOfMajorActors() {
		
		for (int i = 0; i < listOfMajorActors.length; i++) {
			 System.out.println( listOfMajorActors[i]+"\t");
		}
		
		
	}
	
	
	public void setListOfMajorActors(String[] listOfMajorActors) {
		this.listOfMajorActors = listOfMajorActors;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
	
}
