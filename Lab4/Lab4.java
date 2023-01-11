package Lab4;

import java.util.Arrays;
import java.util.Comparator;

public class Lab4 {
    public static void main(String[] args) {
        Clothes[] clothes = {new Clothes(Sex.FEMALE, Size.S, 123, "pink", "dress"),
                new Clothes(Sex.FEMALE, Size.XL, 987, "black", "trousers"),
                new Clothes(Sex.MALE, Size.L, 623, "orange", "shirt"),
                new Clothes(Sex.MALE, Size.XXL, 234, "navy", "overalls"),
                new Clothes(Sex.FEMALE, Size.XS, 932, "fuchsia", "strapless dress"),
                new Clothes(Sex.MALE, Size.M, 745, "khaki", "overalls"),
                new Clothes(Sex.MALE, Size.XXL, 453, "asure", "shirt"),};
        System.out.println("Before sorting...");
        for (Clothes c : clothes){
            System.out.println(c.toString());
        }
        System.out.println("After sorting1...");
        Arrays.sort(clothes, Comparator.comparing(Clothes::getSize));
        for (Clothes c : clothes){
            System.out.println(c.toString());
        }
        System.out.println("After sorting2...");
        Arrays.sort(clothes, Comparator.comparing(Clothes::getPrice).reversed());
        for (Clothes c : clothes){
            System.out.println(c.toString());
        }
    }

}
