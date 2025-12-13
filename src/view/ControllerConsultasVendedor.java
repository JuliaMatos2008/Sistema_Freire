/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;



import bean.JmfVendedores;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Marcos
 */
public class ControllerConsultasVendedor extends AbstractTableModel {

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
        JmfVendedores jmfVendedores = (JmfVendedores) lista.get(rowIndex);
        if (columnIndex == 0){
            return jmfVendedores.getJmfIdVendedor();
        }
        if (columnIndex == 1){
            return jmfVendedores.getJmfNome();
        }
        if (columnIndex == 2){
<<<<<<< HEAD
            return jmfVendedores.getJmfAtivo();
=======
            return jmfVendedores.getJmfCpf();
>>>>>>> bc98436599fe32ace96578ca2cec3dd16487d95f
        
        }
        return "";
        
    }
        
    @Override
    public String getColumnName (int column) {
        if (column == 0) return "Código";
        if (column == 1) return "Nome";
<<<<<<< HEAD
        if (column == 2) return "Ativo";
=======
        if (column == 2) return "Cpf";
>>>>>>> bc98436599fe32ace96578ca2cec3dd16487d95f
        return "";
    }
    
}