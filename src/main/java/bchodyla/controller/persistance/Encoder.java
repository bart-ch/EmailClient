package bchodyla.controller.persistance;

import java.util.Base64;

/**
 * Created by "Bartosz Chodyla" on 2020-08-21.
 */
public class Encoder {
    
    private static Base64.Encoder enc = Base64.getEncoder();
    private static Base64.Decoder dec = Base64.getDecoder();

    public String encode(String text) {
        try {
            return enc.encodeToString(text.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }    
    
    public String decode(String text) {
        try {
            return new String(dec.decode(text.getBytes()));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
