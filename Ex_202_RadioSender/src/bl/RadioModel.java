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
    private boolean show = true;

    public RadioModel() {
        list.add(new Sender("Erster", 20., "AM"));
    }

    public void addSender(Sender s) {
        list.add(s);
        fireTableDataChanged();
    }

    public void showBand(boolean show) {
        this.show = show;
        fireTableStructureChanged();
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return show ? colNames.length : colNames.length - 1;
    }

    @Override
    public Object getValueAt(int i, int i1) {

//        switch (i1)
//        {
//            case 1:
//                return s.getSenderName();
//            case 2:
//                return s.getFrequenz() + " Hz";
//            case 3:
//                return s.getBand();
//            default:
//                return "Error";
//        }
        return list.get(i);
    }

}
