/**
 * Created by Mubuntu on 15/02/2017.
 * The purpose of this exercise is to take a problem and break
 * it into smaller problems, and to solve the smaller problems by writing simple
 * methods. Consider the first verse of the song “99 Bottles of Beer”:
 * 99 bottles of beer on the wall,
 * 99 bottles of beer,
 * ya’ take one down, ya’ pass it around,
 * 98 bottles of beer on the wall.
 * Subsequent verses are identical except that the number of bottles gets smaller
 * by one in each verse, until the last verse:
 * No bottles of beer on the wall,
 * no bottles of beer,
 * ya’ can’t take one down, ya’ can’t pass it around,
 * ’cause there are no more bottles of beer on the wall!
 */
public class BeersApp {
    public static void main(String[] args) {
        beerOnTheWall(10);


    }

    private static void beerOnTheWall(int i) {
        if (i > 0) {
            System.out.println(i + " bottles of beer on the wall,");
            System.out.println(i + " bottles of beer,");
            System.out.println("ya’ take one down, ya’ pass it around,");
            oneLessBeer(i - 1);

        }
    }

    private static void oneLessBeer(int i) {
        if (i == 0){
            System.out.println("\nNo bottles of beer on the wall,\n" +
                    "no bottles of beer,\n" +
                    "ya’ can’t take one down, ya’ can’t pass it around,\n" +
                    "’cause there are no more bottles of beer on the wall!");
        }else {
            System.out.println(i+" bottles of beer on the wall.\n");
            beerOnTheWall(i);
        }
    }
}
