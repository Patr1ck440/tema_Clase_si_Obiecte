public class Main {
	
    public static void main(String[] args) {
    	
        Sertar sertar1 = new Sertar(3, 5, 6);
        Sertar sertar2 = new Sertar(4, 6, 7);
        Birou birou = new Birou(10, 20, 30, sertar1, sertar2);

        birou.tipareste();
    }
}