
package project_b.arab_netbeand.Repository;

import javax.swing.JTextArea;
import project_b.arab_netbeand.Operation_Arab.ArabOperation;

public class Harokat {
    private ArabOperation operasiArab;
    private JTextArea input;
    private String textArab;
    private String arabTanpaHarokat;

    public Harokat(JTextArea kalimat) {
        this.operasiArab = new ArabOperation();
        input = kalimat;
    }
    
    public String operation(){
        this.textArab = input.getText();
        char[] charArab = this.operasiArab.toArrayChar(textArab);
        this.arabTanpaHarokat = this.operasiArab.tanpaHarokat(charArab);
        
        return arabTanpaHarokat;
    }
    
            
    
}
