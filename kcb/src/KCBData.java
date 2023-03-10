// package kcb.src;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class KCBData implements TableModel{

    private String[] title = {
        "周一","周二","周三","周四","周五","周六","周日"
    };
    private String[][] data = new String[8][7];

    public KCBData(){
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data[i].length;j++){
                data[i][j]="";
            }
        }
    }
    @Override
    public void addTableModelListener(TableModelListener l) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }
    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return title[columnIndex];
    }

    @Override
    public int getRowCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        data[rowIndex][columnIndex] = (String)aValue;        
    }
    
}
