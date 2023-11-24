package Proje03.Proje3_FilmTahmin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Filmler {
    String c_RED    = "\u001B[31m";
    String BOLD     = "\033[0;1m";
    String c_RESET  = "\u001B[0m";
    String c_BLUE   = "\u001B[34m";
    String c_PURPLE = "\u001B[35m";
    String c_GREEN  = "\u001B[32m";

    private static String adminUser = "admin";
    private static String adminPass = "admin01";
    private String userName;
    private String userPass;

    static Scanner scan = new Scanner(System.in);
    static ArrayList<String> filmListe = new ArrayList<>(
            Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "GODFATHER","MATRIX", "BRAVEHEART",
                    "LEON", "GODFATHER", "JURASSICPARK", "TITANIC","HOBBITS","MISSIONIMPOSSIBLE","KINGKONG"));

    static ArrayList<String> userList = new ArrayList<>(Arrays.asList("user1","user2","user3","user4"));
    static ArrayList<String> passwordList = new ArrayList<>(Arrays.asList("user01","user02","user03","user04"));



}
