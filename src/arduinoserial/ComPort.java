
package arduinoserial;

import gnu.io.CommPortIdentifier;
import gnu.io.NoSuchPortException;
import gnu.io.PortInUseException;
import gnu.io.SerialPort;
import gnu.io.UnsupportedCommOperationException;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.Timer;

/**
 * Comport communication
 * @author Judge
 */
public class ComPort {
    
    public String portName;
    private InputStream in;
    private Timer timer;
        
    public ComPort(String portName){
        this.portName = portName;
    }
    
    public void connect() throws NoSuchPortException, PortInUseException, UnsupportedCommOperationException, IOException{
                
        CommPortIdentifier portIdentifier = CommPortIdentifier.getPortIdentifier(this.portName);  
        
        if (portIdentifier.isCurrentlyOwned()) { 
            
            throw new PortInUseException();
        } else {    
            SerialPort serialPort = (SerialPort) portIdentifier.open("ArduinoSerialUI", 500000);  
            serialPort.setSerialPortParams(115200, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
            CommPortSender.setWriterStream(serialPort.getOutputStream());  
        }
    }
    
    public void write(byte [] data){
        CommPortSender.send(data);  
    }

    


}
