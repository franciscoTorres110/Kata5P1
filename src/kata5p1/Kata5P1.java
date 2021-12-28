package kata5p1;

import java.util.List;

public class Kata5P1 {
    
    public static void main(String[] args) {
        SelectApp app = new SelectApp();
        app.selectAll();
        
        CrearTabla.createNewTable();
        
        MailListReader m = new MailListReader();
        List<String> mailList = m.read("email.txt");
        
        InsertarDatosTabla idt = new InsertarDatosTabla();
        // Inserto toda la lista del archivo emails
        for (int i = 0; i <= mailList.size() - 1; i++) {
            idt.insert(mailList.get(i));
        }
    }

}
