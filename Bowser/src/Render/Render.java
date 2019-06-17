/*
 * Project by Firebird. All rigths reserved to Felpi and Luis.
 */
package Render;

import Interpreter.HTMLnode;
import Interpreter.Interpreter;
import Interpreter.Node;
import Interpreter.Text;
import javax.swing.JEditorPane;

/**
 *
 * @author Felpi
 */
public class Render {
    
    public void startRender(Interpreter interpreter, JEditorPane sitePanel)
    {
        for(Node node: interpreter.nodes){
            
            String output = "\n";
            
            if(node instanceof Text)
            {
                output += "\nIs a text";
                output += "\nContent: " + ((Text)node).text;
            }
            
            if(node instanceof HTMLnode)
            {                
                output += "\nTag: " + ((HTMLnode)node).tag;
                output += "\nContent: " + ((HTMLnode)node).content;                
            }       
            sitePanel.setText(sitePanel.getText() + output);
        }
        
    }
    
    
    
}