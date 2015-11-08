import netscape.javascript.JSException;
import netscape.javascript.JSObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Sergey on 11/8/2015.
 */
public class EncryptApplet extends JApplet {

    public String encrypt(String text) throws JSException {
        String newString = new StringBuilder(text).reverse().toString();
        return newString;
    }

}