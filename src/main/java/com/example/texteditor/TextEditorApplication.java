package com.example.texteditor;

import java.io.*;
import java.util.*;


public class TextEditorApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner fileIn; //input file connection
        PrintWriter fileout; //HTML file connection
        String filenameIn; // original file's name
        String filenameOut;// new HTML file's name
        int dotIndex; //postion of . in filename
        String line = null; // a line from the imput file

        System.out.println("Enter file name or path");
        filenameIn = scanner.nextLine();
        try {
            fileIn = new Scanner(new FileReader(filenameIn));
            dotIndex = filenameIn.lastIndexOf(".");
            if (dotIndex == -1) {
                filenameOut = filenameIn + ".html";
            }
            else {
                filenameOut = filenameIn.substring(0,dotIndex) + ".html";
            }
            fileout = new PrintWriter(filenameOut);

            try {
                line = fileIn.nextLine();
            }
            catch(NoSuchElementException e) {
                System.out.println("Error: "+e.getMessage());
            }
            if(line==null) {
                System.out.println("This file is empty : (");
            }
            else {

            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
