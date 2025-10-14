/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.JmfVendedores;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u86117213573
 */
public class ControllerVendedores  extends AbstractTableModel {
     private List listVendedores;

    public void setList(List listVendedores) {
        this.listVendedores = listVendedores;
    }
    
    public JmfVendedores getBean(int rowIndex) {
        return (JmfVendedores) listVendedores.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return listVendedores.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JmfVendedores jmfVendedores = (JmfVendedores) listVendedores.get( rowIndex);
        if ( columnIndex == 0 ){
            return jmfVendedores.getJmfIdVendedor();
        } else if (columnIndex ==1) {
            return jmfVendedores.getJmfNome();        
        } else if (columnIndex ==2) {
            return jmfVendedores.getJmfApelido();
        } else if (columnIndex ==3) {
            return jmfVendedores.getJmfCpf();
        } else if (columnIndex ==3) {
            return jmfVendedores.getJmfRg();
        } else if (columnIndex ==3) {
            return jmfVendedores.getJmfEndereco();
        } else if (columnIndex ==3) {
            return jmfVendedores.getJmfCidade();
        } else if (columnIndex ==3) {
            return jmfVendedores.getJmfEstado();
        } else if (columnIndex ==3) {
            return jmfVendedores.getJmfEmail();
        }else if (columnIndex ==3) {
            return jmfVendedores.getJmfCelular();
        }else if (columnIndex ==3) {
            return jmfVendedores.getJmfDataNascimento();
        }else if (columnIndex ==3) {
            return jmfVendedores.getJmfAtivo();
        }
        return "";
    
    }
}
