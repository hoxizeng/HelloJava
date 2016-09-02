package moe.maouzeng;

import java.util.ArrayList;

/**
 *
 * @author Maou Zeng
 */
public class Java {
    public static void main(String []args) {
        System.out.println("Hello World");
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("abcde");
        arrayList.add("defgh");
        for (String i: arrayList) {
            System.out.println(i);
        }
    }

    private int numberOfMathBook;

    private int numberOfEnglishBook;

    public Java(int numberOfMathBook, int numberOfEnglishBook) {
        this.numberOfMathBook = numberOfMathBook;
        this.numberOfEnglishBook = numberOfEnglishBook;
    }

    public Java() {
    }

    @Override
    public String toString() {
        return "Java{" +
                "numberOfMathBook=" + numberOfMathBook +
                ", numberOfEnglishBook=" + numberOfEnglishBook +
                '}';
    }


}
