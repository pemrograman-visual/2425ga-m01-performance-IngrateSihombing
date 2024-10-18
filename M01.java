//12S24022-Ingrate Joy Sihombing
//12S24015-LucasPardede
import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int totalcredit, index;
        double performance, temporaryindex, lastperformance, numbervalue, a, aB, b, bC, c, d, e;
        double credit1;

        credit1 = 0;
        String lettergrade, credit;

        totalcredit = 0;
        credit = input.nextLine();
        while (!credit.equals("---")) {
            if (credit.equals("---")) {
                credit = credit;
            } else {
                credit1 = Integer.parseDouble(credit);
            }
            lettergrade = input.nextLine();
            if (lettergrade.equals("A")) {
                temporaryindex = 4.0;
            } else {
                if (lettergrade.equals("AB")) {
                    temporaryindex = 3.5;
                } else {
                    if (lettergrade.equals("B")) {
                        temporaryindex = 3.0;
                    } else {
                        if (lettergrade.equals("BC")) {
                            temporaryindex = 2.5;
                        } else {
                            if (lettergrade.equals("C")) {
                                temporaryindex = 2.0;
                            } else {
                                if (lettergrade.equals("D")) {
                                    temporaryindex = 1.0;
                                } else {
                                    if (lettergrade.equals("E")) {
                                        temporaryindex = 0.0;
                                    } else {
                                        temporaryindex = 0.0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            lastperformance = Integer.parseInt(credit) * temporaryindex;
            System.out.println(toFixed(lastperformance,1));
            credit = input.nextLine();
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
