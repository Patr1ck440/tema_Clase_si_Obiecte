public class Birou {
	
    private int lungime;
    private int latime;
    private int inaltime;
    private Sertar sertar1;
    private Sertar sertar2;

    public Birou(int lungime, int latime, int inaltime, Sertar sertar1, Sertar sertar2) {
    	
        this.lungime = lungime;
        this.latime = latime;
        this.inaltime = inaltime;
        this.sertar1 = sertar1;
        this.sertar2 = sertar2;
    }

    public void tipareste() {
    	
        System.out.println("Birou " + latime + " " + lungime + " " + inaltime);
        sertar1.tipareste();
        sertar2.tipareste();
        
    }

	public int getLungime() {
		return lungime;
	}

	public void setLungime(int lungime) {
		this.lungime = lungime;
	}

	public int getLatime() {
		return latime;
	}

	public void setLatime(int latime) {
		this.latime = latime;
	}

	public int getInaltime() {
		return inaltime;
	}

	public void setInaltime(int inaltime) {
		this.inaltime = inaltime;
	}

	public Sertar getSertar1() {
		return sertar1;
	}

	public void setSertar1(Sertar sertar1) {
		this.sertar1 = sertar1;
	}

	public Sertar getSertar2() {
		return sertar2;
	}

	public void setSertar2(Sertar sertar2) {
		this.sertar2 = sertar2;
	}
    
}
