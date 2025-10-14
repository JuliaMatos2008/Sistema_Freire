/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.JmfClientes;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u86117213573
 */
public class ControllerClientes  extends AbstractTableModel {
     private List listClientes;

    public void setList(List listClientes) {
        this.listClientes = listClientes;
    }
    
    public JmfClientes getBean(int rowIndex) {
        return (JmfClientes) listClientes.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return listClientes.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JmfClientes jmfClientes = (JmfClientes) listClientes.get( rowIndex);
        if ( columnIndex == 0 ){
            return jmfClientes.getJmfIdCliente();
        } else if (columnIndex ==1) {
            return jmfClientes.getJmfNome();        
        } else if (columnIndex ==2) {
            return jmfClientes.getJmfCpf();
        } else if (columnIndex ==3) {
            return jmfClientes.getJmfRg();
        } else if (columnIndex ==3) {
            return jmfClientes.getJmfSexo();
        } else if (columnIndex ==3) {
            return jmfClientes.getJmfDataNascimento();
        } else if (columnIndex ==3) {
            return jmfClientes.getJmfEmail();
        } else if (columnIndex ==3) {
            return jmfClientes.getJmfEndereco();
        } else if (columnIndex ==3) {
            return jmfClientes.getJmfTelefone();
        }  else if (columnIndex ==3) {
            return jmfClientes.getJmfCelular();
        } else if (columnIndex ==3) {
            return jmfClientes.getJmfDataCadastro();
        } else if (columnIndex ==3) {
            return jmfClientes.getJmfDataUltimaCompra();
        }  else if (columnIndex ==3) {
            return jmfClientes.getJmfLimiteCredito();
        } else if (columnIndex ==3) {
            return jmfClientes.getJmfAtivo();
        }
        return "";
    
    }
}
