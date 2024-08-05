package zipcode;

public class Hamming {



    private String one;
    private String two;


    public Hamming(String s, String s1) {
        this.one = s;
        this.two = s1;
    }

    public int getHammingDistance() {


        int length = two.length();
        int counter = 0;

        for (int i = 0; i < length; i++){
            if (one.charAt(i) != two.charAt(i)){
                counter++;
            }
        }
        return counter;
    }

}
