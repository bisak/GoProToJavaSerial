package arduinoserial;

import java.io.IOException;  
import java.io.OutputStream;  
   
public class CommPortSender {  
   
    static OutputStream out;  
      
    public static void setWriterStream(OutputStream out) {  
        CommPortSender.out = out;  
    }  
    
    
    public static void send(byte[] bytes) {  
        try {  
            System.out.println("SENDING: ");   
            out.write(bytes);  
            out.flush();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
}  