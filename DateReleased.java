
public class DateReleased {
	
	private String day;
	private String month;
	private String year;
	
	public DateReleased()
	{
		day="";
		month="";
		year="";
	}

	public DateReleased(String d,String m,String y)
	{
		this.day=d;
		this.month=m;
		this.year=y;
	}
	
	public DateReleased(DateReleased D){
		this.day=D.day;
		this.month=D.month;
		this.year=D.year;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	

















}
