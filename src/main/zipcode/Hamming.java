package zipcode;

public class Hamming {
    private String s;
    private String s1;
    public Hamming(String s, String s1) {
        this.s = s;
        this.s1 = s1;
    }

    public void exception(){
        if (s.length() != s1.lenth()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

    }

    public int getHammingDistance() {
        return -1;
    }
}
