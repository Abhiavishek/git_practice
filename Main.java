import java.util.*;

interface Bheema {
    // Change the method signature to match the implementing class
    void bheema(String str);
}

 class BheemaImpli implements Bheema {
    // Implement the method with the correct method signature
    public void bheema(String str) {
        System.out.println(str);
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = scn.nextLine();
        BheemaImpli b = new BheemaImpli();
        b.bheema(str);
    }
}
