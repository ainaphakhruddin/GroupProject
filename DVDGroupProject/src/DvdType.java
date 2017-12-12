import java.util.Arrays;

public class DvdType {
	
	String title;
	String[] stars;
	String producer;
	String director;
	String proCompany;
	int copies;
	
	
	public DvdType(String title, String[] stars, String producer, String director, String proCompany, int copies) {
		super();
		this.title = title;
		this.stars = stars;
		this.producer = producer;
		this.director = director;
		this.proCompany = proCompany;
		this.copies = copies;
	}


	public DvdType() {}


	@Override
	public String toString() {
		return "DvdType [title=" + title + ", stars=" + Arrays.toString(stars) + ", producer=" + producer
				+ ", director=" + director + ", proCompany=" + proCompany + ", copies=" + copies + "]";
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String[] getStars() {
		return stars;
	}


	public void setStars(String[] stars) {
		this.stars = stars;
	}


	public String getProducer() {
		return producer;
	}


	public void setProducer(String producer) {
		this.producer = producer;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public String getProCompany() {
		return proCompany;
	}


	public void setProCompany(String proCompany) {
		this.proCompany = proCompany;
	}


	public int getCopies() {
		return copies;
	}


	public void setCopies(int copies) {
		this.copies = copies;
	}
	
	public void checkOut() {
		if (dvdAvailible(this))
			copies--;
		else
			System.out.print("This dvd is not availible");
	}
	
	public void checkIn() {
		copies++;
	}
	
	public boolean dvdAvailible(DvdType dvd) {
		boolean availible = true; 
		if (copies == 0)
			availible = false;
		
		return availible;	
	}

}
