package Interface;

import Browser.Historic;
import Database.Database;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author felpi
 */


public class HistoricWindow extends javax.swing.JPanel {

    /**
     * Creates new form Historico
     */
    public HistoricWindow() {
        initComponents();

        Historic historic = new Historic();
        historic.add("TituloTeste", "01-06-2019", "www.teste.com.br" , 1);
        //histTest = historic.getHistoric();
        
        //for(String a : histTest)
        //{
        //    HistoricTestPanel.setText(HistoricTestPanel.getText() + "\n" + a);
        //}  

        Database database = new Database();
        ResultSet rs = database.GetHistoricTable();
        
        try {
            while (rs.next()) {
                HistoricTestPanel.setText(HistoricTestPanel.getText() + 
                "\n" + rs.getString("DATAHIST") + "   " + rs.getString("TITLE")+ 
                "    " + rs.getString("LINKHIST"));
            }
        } 
        catch(SQLException ex)
        {
            System.out.println("Error: " + ex.getMessage());
        }          
    }
    
    ArrayList<String> histTest; 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        HistoricTestPanel = new javax.swing.JEditorPane();

        jScrollPane1.setViewportView(HistoricTestPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane HistoricTestPanel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
