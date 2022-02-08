package ATM_Simulator;

import java.io.*;
import java.util.*;
import java.util.logging.*;

/**
 *
 * @author Cristopher Herrera
 */
public class FilesManager {
    private static char defaultSeparator = '\t';
    
    public static ArrayList<String> readFile(String FileRoute){
        ArrayList<String> Lines = new ArrayList<>();
        FileReader file = null;
        try {
            file = new FileReader(FileRoute);
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                Lines.add(scan.nextLine());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FilesManager.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        } finally {
            try {
                file.close();
            } catch (IOException ex) {
                Logger.getLogger(FilesManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return Lines;
    }
    
    public static void showFile(ArrayList<String> file){
        for(String line : file){
            System.out.println(line);
        }
    }
    
    public static ArrayList<String> readshowFile(String FileRoute){
        ArrayList<String> Lines = new ArrayList<>();
        FileReader file = null;
        try {
            file = new FileReader(FileRoute);
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FilesManager.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        } finally {
            try {
                file.close();
            } catch (IOException ex) {
                Logger.getLogger(FilesManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return Lines;
    }
    
    public static int countFile(String FileRoute){
        int counter = 0;
        FileReader file = null;
        try {
            file = new FileReader(FileRoute);
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                counter++;
                scan.nextLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FilesManager.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        } finally {
            try {
                file.close();
            } catch (IOException ex) {
                Logger.getLogger(FilesManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return counter;
    }
    
    public static boolean addLine(String data, String pathFile){
        boolean validator = false;
        FileWriter writeLine = null;
        try {
            writeLine = new FileWriter(pathFile, true);
            PrintWriter newWrite = new PrintWriter(writeLine);
            newWrite.println(data);
            validator = true;
        } catch (IOException ex) {
            Logger.getLogger(FilesManager.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        } finally {
            try {
                writeLine.close();
            } catch (IOException ex) {
                Logger.getLogger(FilesManager.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.getMessage());
            }
        }
        return validator;
    }
    
    public static boolean removeContent(String pathFile){
        boolean validator = false;
        FileWriter writeLine = null;
        try {
            writeLine = new FileWriter(pathFile, false); // false -> overwrite the file
            PrintWriter newWrite = new PrintWriter(writeLine);
            newWrite.print("");
            validator = true;
        } catch (IOException ex) {
            Logger.getLogger(FilesManager.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        } finally {
            try {
                writeLine.close();
            } catch (IOException ex) {
                Logger.getLogger(FilesManager.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.getMessage());
            }
        }
        return validator;
    }
    
    public static ArrayList<String> findinFile(String search, String FileRoute){
        ArrayList<String> Coincidences = new ArrayList<>();
        FileReader file = null;
        try {
            file = new FileReader(FileRoute);
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                if((line.toLowerCase()).contains(search.toLowerCase()))
                    Coincidences.add(line);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FilesManager.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        } finally {
            try {
                file.close();
            } catch (IOException ex) {
                Logger.getLogger(FilesManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return Coincidences;
    }
    
    public static boolean updateFile(int index, String newLine, String FileRoute){
        boolean validator = false;
        ArrayList<String> file = readFile(FileRoute);
        if (file == null)
            return validator;
        file.set(index, newLine);
        if (!removeContent(FileRoute))
            return validator;
        for(String register : file){
            if (!addLine(register, FileRoute))
                return validator;
        }
        validator = true;
        return validator;
    }
    
    public static String[] splitFields(String search){
        return search.split(Character.toString(defaultSeparator));
    }
}
