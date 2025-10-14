/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.JmfUsuarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u86117213573
 */
public class ControllerUsuario  extends AbstractTableModel {
     private List listUsuarios;

    public void setList(List listUsuarios) {
        this.listUsuarios = listUsuarios;
    }
    
    public JmfUsuarios getBean(int rowIndex) {
        return (JmfUsuarios) listUsuarios.get(rowIndex);
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
        JmfUsuarios jmfUsuarios = (JmfUsuarios) listUsuarios.get( rowIndex);
        if ( columnIndex == 0 ){
            return jmfUsuarios.getJmfIdusuarios();
        } else if (columnIndex ==1) {
            return jmfUsuarios.getJmfNome();        
        } else if (columnIndex ==2) {
            return jmfUsuarios.getJmfApelido();
        } else if (columnIndex ==3) {
            return jmfUsuarios.getJmfCpf();
        } else if (columnIndex ==3) {
            return jmfUsuarios.getJmfDatanascimento();
        } else if (columnIndex ==3) {
            return jmfUsuarios.getJmfSenha();
        } else if (columnIndex ==3) {
            return jmfUsuarios.getJmfNivel();
        }  else if (columnIndex ==3) {
            return jmfUsuarios.getJmfAtivo();
        } 
        return "";
    
    }
}
