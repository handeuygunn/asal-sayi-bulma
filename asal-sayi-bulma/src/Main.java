import javax.swing.plaf.synth.SynthTextAreaUI;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i<=100; i++){
            int sayi = 0;
            for (int j = 1; j<=i; j++){
                if (i % j == 0){
                    sayi++;
                }
            }
            if (sayi == 2){
                System.out.print(i + " ");
            }
        }
    }
}
