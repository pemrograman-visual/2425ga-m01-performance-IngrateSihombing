//12S24022-Ingrate Joy Sihombing
//12S24015-LucasPardede
import java.util.*;
import java.lang.Math;

public class M01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String nilaiHuruf, kredit;
        double nilaiAngka, performa;

        do {
            kredit = input.nextLine();
            if (kredit.equals("---")) {
            } else {
                nilaiHuruf = input.nextLine();
                if (nilaiHuruf.equals("A")) {
                    nilaiAngka = 4.0;
                } else {
                    if (nilaiHuruf.equals("AB")) {
                        nilaiAngka = 3.5;
                    } else {
                        if (nilaiHuruf.equals("B")) {
                            nilaiAngka = 3.0;
                        } else {
                            if (nilaiHuruf.equals("BC")) {
                                nilaiAngka = 2.5;
                            } else {
                                if (nilaiHuruf.equals("C")) {
                                    nilaiAngka = 2.0;
                                } else {
                                    if (nilaiHuruf.equals("D")) {
                                        nilaiAngka = 1.0;
                                    } else {
                                        if (nilaiHuruf.equals("E")) {
                                            nilaiAngka = 0.0;
                                        } else {
                                            nilaiAngka = 0.0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                performa = Integer.parseInt(kredit) * nilaiAngka;
                System.out.println(toFixed(performa,1));
            }
        } while (!kredit.equals("---"));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
