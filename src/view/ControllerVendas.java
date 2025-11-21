/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.JmfVendas;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u86117213573
 */
public class ControllerVendas  extends AbstractTableModel {
     private List listUsuarios;

    public void setList(List listUsuarios) {
        this.listUsuarios = listUsuarios;
    }
    
    public JmfVendas getBean(int rowIndex) {
        return (JmfVendas) listUsuarios.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return listUsuarios.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JmfVendas jmfVendas = (JmfVendas) listUsuarios.get( rowIndex);
        if ( columnIndex == 0 ){
            return jmfVendas.getJmfIdVendas();
        } else if (columnIndex ==1) {
            return jmfVendas.getJmfDataVendas();        
        } else if (columnIndex ==2) {
            return jmfVendas.getJmfClientes();
        } else if (columnIndex ==3) {
            return jmfVendas.getJmfUsuarios();
        } else if (columnIndex ==3) {
            return jmfVendas.getJmfTotal();
        } 
        return "";
    
    }
}
