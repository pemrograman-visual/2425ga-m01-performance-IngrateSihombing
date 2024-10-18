//12S24022-Ingrate Joy Sihombing
//12S24015-LucasPardede
import java.util.*;
import java.lang.Math;

public class M01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int totalcredit, index, credit;
        double performance, temporaryindex, lastperformance, numbervalue, a, aB, b, bC, c, d, e;
        double credit1;

        credit1 = 0;
        double lettergrade;

        totalcredit = 0;
        credit = Integer.parseInt(input.nextLine());
        while (credit != "---") {
            if (credit == "---") {
                credit = credit;
            } else {
                credit1 = Integer.parseDouble(credit);
            }
            lettergrade = Double.parseDouble(input.nextLine());
            if (lettergrade == "A") {
                temporaryindex = 4.0;
            } else {
                if (lettergrade == "AB") {
                    temporaryindex = 3.5;
                } else {
                    if (lettergrade == "B") {
                        temporaryindex = 3.0;
                    } else {
                        if (lettergrade == "BC") {
                            temporaryindex = 2.5;
                        } else {
                            if (lettergrade == "C") {
                                temporaryindex = 2.0;
                            } else {
                                if (lettergrade == "D") {
                                    temporaryindex = 1.0;
                                } else {
                                    if (lettergrade == "E") {
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
            lastperformance = Integer.parseDouble(credit) * temporaryindex;
            System.out.println(toFixed(lastperformance,1));
            credit = Integer.parseInt(input.nextLine());
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
