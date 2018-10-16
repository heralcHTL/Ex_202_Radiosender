/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Alex
 */
public class RadioModel extends AbstractTableModel {

    private LinkedList<Sender> list = new LinkedList<>();
    private String[] colNames = {"Sender", "Frequenz", "Band"};

    public RadioModel() {
        list.add(new Sender("Erster", 20., "AM"));
    }

    public void addSender(Sender s) {
        list.add(s);
        fireTableCellUpdated(0, list.size());
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Sender s = list.get(i);

        switch (i1)
        {
            case 1:
                return s.getSenderName();
            case 2:
                return s.getFrequenz() + " Hz";
            case 3:
                return s.getBand();
            default:
                return "Error";
        }
    }

}
