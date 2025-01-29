package com.trishawrites;

/**
 * Purpose: The purpose of this program is to understand how we can use insertion sort methods to sort values within
 * an Array and "insert" them into an empty Array. Hence, "insertion".
 *
 * @author Trisha Ganesh
 * @version 6/26/2021
 *
 */

public class MovieTester {

    public static void main(String[] args) {

        // Movie Array
        Movie[] movie = new Movie[10];
        Movie[] sortedArray = new Movie[10];

        movie[0] = new Movie("Luca", 2021, "Walt Disney Pictures");
        movie[1] = new Movie("In The Heights", 2021, "Warner Bros");
        movie[2] = new Movie("A Quiet Place Part II", 2021, "Platinum Dunes");
        movie[3] = new Movie("Fatherhood", 2021, "Columbia Pictures");
        movie[4] = new Movie("Infinite", 2021, "Di Bonaventura Pictures");
        movie[5] = new Movie("A Quiet Place", 2018, "Sunday Night Productions");
        movie[6] = new Movie("Wish Dragon", 2020, "Sony Pictures Animation");
        movie[7] = new Movie("A Space Odyssey", 2001, "Stanley Kubrick Productions");
        movie[8] = new Movie("Grand Illusion", 1937, "Réalisations d'Art Cinématographique");
        movie[9] = new Movie("Harry Potter (the Sorcerer's stone)", 2001, "Warner Bros. Pictures");

        //calling method
        printResults(movie);

        insertionSortTitleAscending(movie, sortedArray);

        for(int index = 0; index < sortedArray.length; index++)
            System.out.println(sortedArray[index] );

        insertionSortTitleDescending(movie, sortedArray);

        for(int index = movie.length - 1; index >= 0; index--)
            System.out.println(sortedArray[index] );

        insertionSortYearAscending(movie, sortedArray);

        for(int index = 0; index < sortedArray.length; index++)
            System.out.println(sortedArray[index]);

        insertionSortYearDescending(movie, sortedArray);

        for(int index = 0; index < sortedArray.length; index++)
            System.out.println(sortedArray[index]);

        movie = insertionSortStudioAscending(movie);
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("   by studio in ascending order \n");
        for(int index = 0; index < movie.length; index++)
            System.out.println(movie[index]);

        movie = insertionSortStudioDescending(movie);
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("   by studio in descending order \n");
        for(int index = movie.length - 1; index >= 0; index--)
            System.out.println(movie[index]);
    }

    //insertion sort methods
    public static void insertionSortTitleAscending(Movie[] element, Movie[] destination) {
        for (int index = 0; index < element.length; index++) {
            Movie next = element[index];
            int insertIndex = 0;
            int k = index;
            while (k > 0 && insertIndex == 0) {
                if (next.getTitle().compareTo(destination[k - 1].getTitle()) > 0) {
                    insertIndex = k;
                } else {
                    destination[k] = destination[k - 1];
                }
                k--;
            }
            destination[insertIndex] = next;
        }
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("  by title in ascending order   \n");
    }

    public static void insertionSortTitleDescending(Movie[] element, Movie[] destination) {
        for (int index = 0; index < element.length; index++) {
            Movie next = element[index];
            int insertIndex = 0;
            int k = index;
            while (k > 0 && insertIndex == 0) {
                if (next.getTitle().compareTo(destination[k - 1].getTitle()) > 0) {
                    insertIndex = k;
                } else {
                    destination[k] = destination[k - 1];
                }
                k--;
            }
            destination[insertIndex] = next;
        }
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("  by title in descending order   \n");
    }


    public static void insertionSortYearAscending(Movie[] element, Movie[] destination) {
        for (int index = 0; index < element.length; index++) {
            Movie next = element[index];
            int insertIndex = 0;
            int k = index;
            while (k > 0 && insertIndex == 0) {
                if (next.getYear() > destination[k - 1].getYear()) {
                    insertIndex = k;
                } else {
                    destination[k] = destination[k - 1];
                }
                k--;
            }
            destination[insertIndex] = next;
        }
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("    by year in ascending order   \n");
    }

    public static void insertionSortYearDescending(Movie[] element, Movie[] destination) {
        for (int index = 0; index < element.length; index++) {
            Movie next = element[index];
            int insertIndex = 0;
            int k = index;
            while (k > 0 && insertIndex == 0) {
                if (next.getYear() < destination[k - 1].getYear()) {
                    insertIndex = k;
                } else {
                    destination[k] = destination[k - 1];
                }
                k--;
            }
            destination[insertIndex] = next;
        }
        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("    by year in descending order   \n");
    }

    public static Movie[] insertionSortStudioAscending(Movie[] element) {
        Movie[] destination = new Movie[element.length];

        for (int index = 0; index < element.length; index++) {
            Movie next = element[index];
            int insertIndex = 0;
            int k = index;
            while (k > 0 && insertIndex == 0) {
                if (next.getStudio().compareTo(destination[k - 1].getStudio()) > 0) {
                    insertIndex = k;
                } else {
                    destination[k] = destination[k - 1];
                }
                k--;
            }
            destination[insertIndex] = next;
        }
        return destination;
    }

    public static Movie[] insertionSortStudioDescending(Movie[] element) {
        Movie[] destination = new Movie[element.length];

        for (int index = 0; index < element.length; index++) {
            Movie next = element[index];
            int insertIndex = 0;
            int k = index;
            while (k > 0 && insertIndex == 0) {
                if (next.getStudio().compareTo(destination[k - 1].getStudio()) > 0) {
                    insertIndex = k;
                } else {
                    destination[k] = destination[k - 1];
                }
                k--;
            }
            destination[insertIndex] = next;
        }
        return destination;
    }

    //method to print
    public static void printResults(Movie[] element) {
        System.out.println("    <<<< Before Sorting >>>> \n");
        for (Movie movie : element)
            System.out.printf("%-30s %4d   %-20s \n", movie.getTitle(), movie.getYear(), movie.getStudio());
    }
}