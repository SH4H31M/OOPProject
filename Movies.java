
public class Movies extends Programme {
	
	private String rating;
	private DateReleased date;
	private String[] listOfMajorActors; 

	//
	public Movies() {
		super();
		rating="";
		date=new DateReleased();
		listOfMajorActors=new String[3];
	}
	//
	public Movies(String desc,String cc,String L,String P,String rating,DateReleased date,
			String Actor1,String Actor2,String Actor3)
	{
		super(desc,cc,L,P);
		this.rating=rating;
		this.date=date;
		this.listOfMajorActors=new String[]{Actor1,Actor2,Actor3};
	}
	//
	public Movies(Movies m) {
	
		super(m);
		this.rating=m.rating;
		this.date=m.date;
		this.listOfMajorActors=m.listOfMajorActors;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public DateReleased getDate() {
		return date;
	}
	public void setDate(DateReleased date) {
		this.date = date;
	}
	public String[] getListOfMajorActors() {
		return listOfMajorActors;
	}
	public void setListOfMajorActors(String[] listOfMajorActors) {
		this.listOfMajorActors = listOfMajorActors;
	}
	

}
