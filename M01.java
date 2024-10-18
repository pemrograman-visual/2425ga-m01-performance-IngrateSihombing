//12S24022-Ingrate Joy Sihombing
//12S24015-LucasPardede
import java.util.*;
import java.lang.Math;

public class M01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int totalkredit, indeks;
        double performa, indekssementara, performaakhir, nilaiangka, a, aB, b, bC, c, d, e;
        double kredit1;

        kredit1 = 0;
        String nilaihuruf, kredit;

        totalkredit = 0;
        kredit = input.nextLine();
        while (!kredit.equals("---")) {
            if (kredit.equals("---")) {
                kredit = kredit;
            } else {
                kredit1 = Integer.parseDouble(kredit);
            }
            nilaihuruf = input.nextLine();
            if (nilaihuruf.equals("A")) {
                indekssementara = 4.0;
            } else {
                if (nilaihuruf.equals("AB")) {
                    indekssementara = 3.5;
                } else {
                    if (nilaihuruf.equals("B")) {
                        indekssementara = 3.0;
                    } else {
                        if (nilaihuruf.equals("BC")) {
                            indekssementara = 2.5;
                        } else {
                            if (nilaihuruf.equals("C")) {
                                indekssementara = 2.0;
                            } else {
                                if (nilaihuruf.equals("D")) {
                                    indekssementara = 1.0;
                                } else {
                                    if (nilaihuruf.equals("E")) {
                                        indekssementara = 0.0;
                                    } else {
                                        indekssementara = "";
                                    }
                                }
                            }
                        }
                    }
                }
            }
            performaakhir = Integer.parseDouble(kredit) * indekssementara;
            System.out.println(toFixed(performaakhir,1));
            kredit = input.nextLine();
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
