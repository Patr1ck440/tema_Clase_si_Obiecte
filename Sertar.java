public class Sertar {
	
    private int lungime;
    private int latime;
    private int inaltime;

    public Sertar(int lungime, int latime, int inaltime) {
        this.lungime = lungime;
        this.latime = latime;
        this.inaltime = inaltime;
    }
    public void tipareste() {
        System.out.println("Sertar " + latime + " " + lungime + " " + inaltime);
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
    
    
}