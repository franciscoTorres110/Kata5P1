package kata5p1;

import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MailListReader {

    public List<String> read(String fileName){
        List<String> mails = new ArrayList<>();
        File f = new File(fileName);
        Scanner s;
        String emailRegexp = "[^@]+@[^@]+\\.[a-zA-Z]{2,}";
        try {
                s = new Scanner(f);
                while (s.hasNextLine()) {
                        String linea = s.nextLine();
                        if (Pattern.matches(emailRegexp, linea)) {
                            //Mail m = new Mail(linea);
                            mails.add(linea);
                        }
                        
                }
                s.close();
        } catch (FileNotFoundException e) {
                e.printStackTrace();
        }
        return mails;
    }
    
}
