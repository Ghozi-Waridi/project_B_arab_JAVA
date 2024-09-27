
package project_b.arab_netbeand.Operation_Arab;

public class ArabOperation {
    private String kalimatArab;
    private char[] charArab;

    public ArabOperation() {
//        this.kalimatArab = kalimatArab;
//        this.charArab = new char[kalimatArab.length()];
    }
    
    
    public char[] toArrayChar(String sentense){
        char[] arrChar = new char[sentense.length()];
         for(int i = 0; i < arrChar.length; i++){
             arrChar[i] = sentense.charAt(i);
         }
        return  arrChar;
    }

    public String tanpaHarokat(char[] arrArab){
        String output = "";

        for(int j = 0; j < arrArab.length; j++){
            if(!isHarokat(arrArab[j])){
                output += arrArab[j];
            }
        }
        return output;
    }

    public String[] split(String kalimat){
        String output = "";

        String[] hasil = new String[kalimat.length()];
        int index = 0;
        char[] outputchar = toArrayChar(kalimat);
        
        for(int i = 0; i < outputchar.length; i++){
            if(!isSpace(outputchar[i])){
                output += outputchar[i];
            } else if(isSpace(outputchar[i]) && !output.isEmpty()){
                hasil[index] = output;
                output = "";
                index++;
            }
            
            // pada kode ini digunakan pada string atau pada kata terakgir
            if(!output.isEmpty()){
                hasil[index] = output;
            }
        }
        return hasil;
    }

    public boolean isHarokat(char arab){
        return (arab >= '\u064B' && arab <= '\u0655');
    }
    public boolean isSpace(char arab){
        return (arab == '\u0020');
    }
    
    
}
