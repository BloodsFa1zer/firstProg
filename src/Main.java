

import java.awt.*;

import java.io.*;
import java.io.File;
import java.nio.file.*;
import java.io.IOException;
import java.util.*;
import java.util.List;





class Main {

    public static void main(String[] args) throws Exception {
        File f1 = new File("txt");

        BufferedReader br = new BufferedReader(new FileReader(f1));
        String s;
        List lines = Files.readAllLines(Paths.get("res/file.txt"));
        Files.write(Paths.get("res/file.txt"), lines);
        while ((s = br.readLine()) != null) {
            if (s.indexOf('W') == 0) {
                String replace = s.replace('W', 'w');
                System.out.println(replace);
            }
        }
    }
}

        /*class FileWork {
            public static final int  KEY_FOR_SEARCH_WORDS = 'w';

            public String[] readFromFile(String fileName) {


                String[] empty = new String[0];
                List<String> lines = null;
                try {
                    lines = Files.readAllLines(Paths.get(fileName));
                } catch (IOException e) {
                    e.getMessage();
                }
                if (lines.size() == 0) {

                    return empty;
                }
                String oneSmallLineOfAllWords = lines.toString().toLowerCase()
                        .replaceAll("[^a-zA-Z]+", " ");

                String[] linesToArrayString = oneSmallLineOfAllWords.trim().split(" ");
                Arrays.sort(linesToArrayString);

                int counter = 0;
                StringBuilder words = new StringBuilder();
                for (int i = 0; i < linesToArrayString.length; i++) {
                    if (linesToArrayString[i].charAt(0) == KEY_FOR_SEARCH_WORDS) {
                        words.append(linesToArrayString[i] + " ");
                        counter++;
                    }
                }
                String[] returnedWords = words.toString().trim().split(" ");

                if (counter == 0) {

                    return empty;
                }
                return returnedWords;
            }
        }*/


      /*  Car c = new Car(4, 3, "SINAbooba", "G100000505", "red");
        Car clone1 = (Car) c.clone();
        Engine e = new Engine(29, "hukihih", "Eojijoi221213", 300, 60);
        Engine clone2 = (Engine) e.clone2();


        System.out.println(clone1);

        System.out.println(clone2);

        clone1.model = new String("GIBABOBA");
        clone2.markaMashini = new String("oijojo");


        System.out.println(clone1);

        System.out.println(clone2);*/


/*Plane plane = new Plane.Builder()
        .withName("LITACHOK")
        .withdateProizvdotsva(2222200)
        .withAge(-111111)
        .withkolichestvoKoles(76498)
        .withstranaProizdatsva("Konoxa")
        .withcolor("sero-buro-makinoviy")
        .build();
Plane.Builder p1 = new Plane.Builder();*/
