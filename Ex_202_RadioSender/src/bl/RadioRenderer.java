/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Alex
 */
public class RadioRenderer implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
        Sender s = (Sender) o;
        JLabel lb = new JLabel();
        lb.setOpaque(true);
        lb.setForeground(Color.gray.brighter());
        
        switch(i1)
        {
            case 0: lb.setText(s.getSenderName());break;
            case 1: lb.setText(s.getFrequenz().toString());break;
            case 2: lb.setText(s.getBand());break;
        }
        
        if(s.getBand().equals("FM"))
        {
            lb.setBackground(Color.red);
        }
        else
        {
            lb.setBackground(Color.blue);
        }
        
        return lb;
    }

}
