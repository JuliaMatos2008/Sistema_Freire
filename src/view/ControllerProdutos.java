/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.JmfProdutos;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u86117213573
 */
public class ControllerProdutos  extends AbstractTableModel {
     private List listProdutos;

    public void setList(List listProdutos) {
        this.listProdutos = listProdutos;
    }
    
    public JmfProdutos getBean(int rowIndex) {
        return (JmfProdutos) listProdutos.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return listProdutos.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JmfProdutos jmfProdutos = (JmfProdutos) listProdutos.get( rowIndex);
        if ( columnIndex == 0 ){
            return jmfProdutos.getJmfId();
        } else if (columnIndex ==1) {
            return jmfProdutos.getJmfNome();        
        } else if (columnIndex ==2) {
            return jmfProdutos.getJmfDescricao();
        } else if (columnIndex ==3) {
            return jmfProdutos.getJmfPreco();
        }  else if (columnIndex ==3) {
            return jmfProdutos.getJmfCategoria();
        }  else if (columnIndex ==3) {
            return jmfProdutos.getJmfFornecedor();
        }  else if (columnIndex ==3) {
            return jmfProdutos.getJmfAtivo();
        } 
        return "";
    
    }
}
