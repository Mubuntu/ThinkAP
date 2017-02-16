import java.util.Scanner;

/**
 * Created by Mubuntu on 15/02/2017.
 * hier checken we of Fermat's wet klopt:
 * Fermat’s Last Theorem says that there are no doubleegers a, b,
  and c such that an + bn = cn, except when n ≤ 2.
 Write a method named checkFermat that takes four doubleegers as parameters –
 a, b, c and n – and checks to see if Fermat’s theorem holds. If n is greater
 than 2 and an + bn = cn, the program should display “Holy smokes, Fermat
 was wrong!” Otherwise the program should display “No, that doesn’t work.”
 */
public class Fermat {
    public static void main(String[] args) {
        double a=4,b=6, c=10, n;
        System.out.println("tot welke macht wil je de berekening laten gaan?");
        Scanner sc = new Scanner(System.in);
        n = sc.nextDouble();
        checkFermat(a,b,c,n);
    }

    private static void checkFermat(double a, double b, double c, double n) {
        double  _firstSection, _secondSection;
        _firstSection = Math.pow(a, n) + Math.pow(b,n);
        _secondSection = Math.pow(c,n);
        if (n>2 && _firstSection == _secondSection){
            System.out.println("Holy smokes, Fermat" +
                    " was wrong");
        }
        else {
            System.out.println("No, that doesn’t work");
            System.out.println(_firstSection + " does not equals "+ _secondSection);
        }
    }
}
