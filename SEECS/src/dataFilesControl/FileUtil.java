/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataFilesControl;

import java.io.*;
import java.util.HashMap;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import protections.Protector;

/**
 *
 * @author Amila
 */
public class FileUtil {

    private static RandomAccessFile file = null;
    private static int developerUserName_length = 20;
    private static int developerPassword_length = 200;
    private static int connectionClass_length = 40;
    private static int connectionDriver_length = 40;
    private static int connectionHost_length = 40;
    private static int databaseUserName_length = 10;
    private static int databasePassword_length = 10;
    private static int databaseURL_length = 80;
    private static int ThemeNo_length = 5;
    private static int DatabaseConnection_position = 220;
    private static int Database_position = 340;
    private static int ThemeNo_position = 440;
    private static int record_lenth = 445;

    public FileUtil() throws FileNotFoundException, IOException {
        file = new RandomAccessFile("ConfigurationData.ccd", "rw");
    }

    public boolean writeDeveloperAccount(String userName, String password) throws IOException, Exception {
        Long position = 0L;
        String encreptPassword=Protector.encrypt(password, userName, 5);
        writeData(userName, position, developerUserName_length);
        position = (long) developerUserName_length;
        writeData(encreptPassword, position, developerPassword_length);
        return true;
    }
    
    public String[] readDeveloperAccount() throws IOException, Exception {
        String [] toReturn=new String[2];
        Long position = 0L;
        toReturn[0]=readData(position, developerUserName_length).trim();
        position = (long) developerUserName_length;
        toReturn[1]=Protector.decrypt(readData(position, developerPassword_length).trim(), toReturn[0], 5);
        return  toReturn;
    }

    public boolean setDatabaseConnection(String... data) throws IOException {
        Long position = (long) DatabaseConnection_position;
        writeData(data[0], position, connectionClass_length);
        position += connectionClass_length;
        writeData(data[1], position, connectionDriver_length);
        position += connectionDriver_length;
        writeData(data[2], position, connectionHost_length);
        return true;
    }
    
    public String[] getDatabaseConnection() throws IOException {
        String [] toReturn=new String[3];
        Long position = (long) DatabaseConnection_position;
        toReturn[0]=readData(position, connectionClass_length);
        position += connectionClass_length;
        toReturn[1]=readData(position, connectionDriver_length);
        position += connectionDriver_length;
        toReturn[2]=readData(position, connectionHost_length);
        return  toReturn;
    }

    public boolean setDatabase(String... data) throws IOException {
        Long position = (long) Database_position;
        writeData(data[0], position,databaseUserName_length);
        position += databaseUserName_length;
        writeData(data[1], position, databasePassword_length);
        position += databasePassword_length;
        writeData(data[2], position, databaseURL_length);
        return true;
    }
    
    public String[] getDatabase() throws IOException {
        String [] toReturn=new String[3];
        Long position = (long) Database_position;
        toReturn[0]=readData(position, databaseUserName_length);
        position += databaseUserName_length;
        toReturn[1]=readData(position, databasePassword_length);
        position += databasePassword_length;
        toReturn[2]=readData(position, databaseURL_length);
        return  toReturn;
    }
    
    public boolean setTheme(int no) throws IOException {
        Long position = (long)ThemeNo_position;
        writeData(no+"", position, ThemeNo_length);
        return true;
    }
    
    public int getTheme() throws IOException {
        Long position = (long)ThemeNo_position;
        return Integer.parseInt(readData(position, ThemeNo_length));
    }
    
    public void defaultFileWriter() throws FileNotFoundException, IOException, Exception{
        writeDeveloperAccount("amila", "amila");   
        setTheme(0);
        String[] data={"com.mysql.jdbc.Driver","jdbc:mysql:","localhost"};
        setDatabaseConnection(data);
    }
    
    

    private void writeData(String data, long position, int length) throws IOException {
        String emptyString = new String(new byte[length]);
        final StringBuilder builder = new StringBuilder(emptyString);
        System.out.println(builder.length());
        class Write {

            int position = 0;

            void replace(String str, int full_length) {
                System.out.println(str);
                builder.replace(position, position + str.length(), str);
                position += full_length;
            }
        }
        Write write = new Write();
        write.replace(data, length);


        synchronized (file) {
            file.seek(position);
            file.write(builder.toString().getBytes());
        }

    }

    private String readData(long position, int legnth) throws IOException {
        file.seek(position);
        final byte[] toRead = new byte[legnth];
        file.readFully(toRead);

        class Reader {

            int position1 = 0;

            String read(int full_length) {
                String s = new String(toRead, position1, full_length);
                position1 += full_length;
                return s.trim();
            }
        }
        Reader reader = new Reader();
        return reader.read(legnth);
    }
}
