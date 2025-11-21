/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.JmfVendasProdutos;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u1845853
 */
public class ControllerVendasProdutos extends AbstractTableModel {

    private List lstPedProd;

    public void setList(List lstVendasProdutos) {
        this.lstPedProd = lstVendasProdutos;
    }
    
    public JmfVendasProdutos getBean(int rowIndex) {
        return (JmfVendasProdutos) lstPedProd.get(rowIndex);
    }
    
    public void addBean(JmfVendasProdutos jmfVendasProdutos){
     this.lstPedProd.add(jmfVendasProdutos);
     this.fireTableDataChanged();
    }
    
    public void removeBean(int rowIndex){
    this.lstPedProd.remove(rowIndex);
    this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lstPedProd.size();
                
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JmfVendasProdutos pedProd = (JmfVendasProdutos) lstPedProd.get( rowIndex);
        if ( columnIndex == 0 ){
            return pedProd.getJmfProdutos().getJmfProduto();
        } else if (columnIndex ==1) {
            return pedProd.getJmfProdutos().getJmfNome();        
        } else if (columnIndex ==2) {
            return pedProd.getJmfQuantidade();
        } else if (columnIndex ==3) {
            return pedProd.getJmfValorUnitario();
        }  else if (columnIndex ==4) {
            return  pedProd.getJmfQuantidade() * pedProd.getJmfValorUnitario();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Nome";         
        } else if ( columnIndex == 2) {
            return "Quantidade";
        } else if ( columnIndex == 3) {
            return "Valor Unitario";
        } else if ( columnIndex == 4) {
            return "Total";
        } 
        return "";
    }
    
}
