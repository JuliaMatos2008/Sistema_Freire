/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;


import bean.JmfClientes;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Marcos
 */
public class ControllerConsultasClientes extends AbstractTableModel {

    List lista;
    
    public void setList(List lista){
     this. lista = lista; 
     this.fireTableDataChanged();
    }
    
    public Object getBean(int rowIndex){
        return lista.get(rowIndex);
    }
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JmfClientes jmfClientes = (JmfClientes) lista.get(rowIndex);
        if (columnIndex == 0){
            return jmfClientes.getJmfIdCliente();
        }
        if (columnIndex == 1){
            return jmfClientes.getJmfNome();
        }
        if (columnIndex == 2){
<<<<<<< HEAD
            return jmfClientes.getJmfCpf();
=======
            return jmfClientes.getJmfAtivo();
>>>>>>> 210de04fcefc1d3f2b1722bfae5cea51a31e4592
        
        }

        return "";
        
    }
        
    @Override
    public String getColumnName (int column) {
        if (column == 0) return "Código";
        if (column == 1) return "Nome";
<<<<<<< HEAD
        if (column == 2) return "Cpf";
=======
        if (column == 2) return "Ativo";
>>>>>>> 210de04fcefc1d3f2b1722bfae5cea51a31e4592
        
        return "";
    }
    
}