package ATM_Simulator;

import java.io.*;
import java.util.ArrayList;
import java.util.Base64;

/**
 *
 * @author Cristopher Herrera
 */
public class FilesManager_bin {
    private static char defaultSeparator = '\t';
    
    public static boolean addRegister(Object object, String FileRoute){
        boolean validator = false;
        try{
            AppendableObjectOutputStream fileOut = new AppendableObjectOutputStream(
                    new FileOutputStream(FileRoute, true));
            fileOut.writeObject(object);
            fileOut.flush();
            fileOut.close();
            validator = true;
        }catch (IOException ex){
            System.out.println("Error." + ex.getMessage());
        }
        return validator;
    }
    
    public static boolean addRegisters(Object[] objects, String FileRoute){
        boolean validator = false;
        FileOutputStream fos;
        ObjectOutputStream fileOut;
        try{
            fos = new FileOutputStream(FileRoute, false);
            fileOut = new ObjectOutputStream(fos);
            for(Object objeto : objects){
                fileOut.writeObject(objeto);
            }
            fileOut.close();
            validator = true;
        }catch (IOException ex){
            System.out.println("Error." + ex.getMessage());
        }
        return validator;
    }
    
    public static void showFile(String FileRoute){
        FileInputStream fis;
        ObjectInputStream fileIn = null;
        try{
            fis = new FileInputStream(FileRoute);
            fileIn = new ObjectInputStream(fis);
            Object object;
            do{
                object = fileIn.readObject();
                if (object!=null){
                    System.out.println(object);
                }
            }while(object!=null);
            fileIn.close();
        }catch (IOException ex){
            System.out.println("Error." + ex.getMessage());
        }catch(ClassNotFoundException ex){
            System.out.println("Class Not Found " + ex.getMessage());
        }
    }
    
    public static ArrayList<Clients> showListedFile(String FileRoute){
        ArrayList<Clients> clients = new ArrayList<>();
        FileInputStream fis;
        ObjectInputStream fileIn;
        try{
            fis = new FileInputStream(FileRoute);
            fileIn = new ObjectInputStream(fis);
            Clients object;
            do{
                object = (Clients)fileIn.readObject();
                if (object!=null){
                    clients.add((Clients)object);
                }
            }while(object!=null);
            System.out.println();
            fileIn.close();
        }catch (IOException ex){
            System.out.println("Error." + ex.getMessage());
        }catch(ClassNotFoundException ex){
            System.out.println("Class Not Found " + ex.getMessage());
        }
        return clients;
    }
    
    public static void findinFile(String search, String FileRoute){
        FileInputStream fis;
        ObjectInputStream fileIn;
        int counter = 0;
        try{
            fis= new FileInputStream(FileRoute);
            fileIn = new ObjectInputStream(fis);
            Object object;
            System.out.printf("%-6s%-12s%-40s%-20s%-30s%-20s",
                    "Nro.","CardCode","Fullname", "Password", "Balance", "Birthday");
            do{
                object = fileIn.readObject();
                if (object != null){
                    Clients client =(Clients)object;
                    if (client.find(search)){
                        System.out.println(client.formatRegister(counter+1));
                        counter++;
                    }
                }
            }while(object != null);
        }catch(EOFException e){
            System.out.println("Found coincidences: " + counter);
        }catch(IOException e){
            System.out.println("IOException: " + e.getMessage() + e.toString());
        }catch(ClassNotFoundException e){
            System.out.println("ClassNotFound: " + e.getMessage());
        }
    }
    
    public static int getIndex(String search, String FileRoute){
        ArrayList<Clients> clients = new ArrayList<>();
        clients = showListedFile(FileRoute);
        int index = 0;
        for(int i = 0; i < clients.size(); i++){
            if((clients.get(i)).getCardCode().equals(search)){
                return i;
            }
        }
        return index;
    }
    
    public static String encoderString(String originalString){
        String encodedString = Base64.getEncoder().encodeToString(originalString.getBytes());
        return encodedString;
    }
    
    public static String decoderString(String encodedString){
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        return decodedString;
    }
    
    public static String[] splitFields(String search){
        return search.split(Character.toString(defaultSeparator));
    }
    
    public static class AppendableObjectOutputStream extends ObjectOutputStream{
        public AppendableObjectOutputStream(OutputStream out) throws IOException{
            super(out);
        }
        @Override
        protected void writeStreamHeader() throws IOException {
            reset();
        }        
    }
}
