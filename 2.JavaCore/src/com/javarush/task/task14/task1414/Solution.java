package com.javarush.task.task14.task1414;

import java.util.Scanner;

/* 
MovieFactory
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String line = scanner.nextLine();
            Movie movie = MovieFactory.getMovie(line);
            if (movie == null){
                break;
            }
            System.out.println(movie.getClass().getSimpleName());
        }
    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            } else if (key.equals("cartoon")) {
                movie = new Cartoon();
            } else if (key.equals("thriller")) {
                movie = new Thriller();
            }
            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Thriller extends Movie {
    }

    static class Cartoon extends Movie {

    }
}
