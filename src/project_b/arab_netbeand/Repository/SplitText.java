
package project_b.arab_netbeand.Repository;

import project_b.arab_netbeand.Operation_Arab.ArabOperation;

public class SplitText {
    private ArabOperation operasiArab;

    public SplitText() {
        this.operasiArab = new ArabOperation();
    }
    
    public String[] operation(String kalimat){
        
        String[] output  = operasiArab.split(kalimat);
              
        return output;
    }
    
}
