
package project_b.arab_netbeand.Presentation;

import javax.swing.JTextArea;

public class PresentationLayer {
    private JTextArea Input;
//    private JTextArea Output;

    public PresentationLayer(JTextArea Input /*JTextArea Output*/) {
        this.Input = Input;
//        this.Output = Output;
    }
    
    public void Harokat_layer(String arabTanpaHarokat){
        
//        Output.append(" ========== Arab Tanpa Harokat ========== \n");
//        Output.append(arabTanpaHarokat + "\n\n");
        Input.append(" ========== Arab Tanpa Harokat ========== \n");
        Input.append(arabTanpaHarokat + "\n\n");
        System.out.println(arabTanpaHarokat);
//        Input.setText("");
    }
    
    public void Split_layer(String[] perkataArab){
        
//        Output.append(" ========== Kata per kata Arab ========== \n");
        Input.append(" ========== Kata per kata Arab ========== \n");
        for(int i = 0; i < perkataArab.length; i++){
            if(perkataArab[i] != null){
//                Output.append(" --> Kata " + (i + 1) + " "+ perkataArab[i] + "\n");
                Input.append(" --> Kata " + (i + 1) + " "+ perkataArab[i] + "\n");
            }
        }
    }
    
    
}
