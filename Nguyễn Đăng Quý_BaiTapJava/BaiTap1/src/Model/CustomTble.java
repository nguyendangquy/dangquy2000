/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Admin
 */
import Class.SanPham;
import Class.LoaiSanPham;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.AbstractTableModel;

public class CustomTble extends AbstractTableModel
{
    private String name[]={"Mã Sản Phẩm","Tên Sản Phẩm","Nhà Sản Xuất","Mã Loại Sản Phẩm"};
    private Class classes[]={String.class,String.class,String.class,String.class};
    ArrayList<SanPham> dsThiSinh=new ArrayList<SanPham>();

    public CustomTble(ArrayList<SanPham> list)
   {
       this.dsThiSinh=list;
   }
    
    @Override
    public int getRowCount()
    {
        return dsThiSinh.size();
    }
    
    @Override
    public int getColumnCount()
    {
        return name.length;
    }
    public Object getValueAt(int rowIndex,int columnIndex)
    {
        switch(columnIndex)
        {
            
            case 0: return dsThiSinh.get(rowIndex).getMaSp();
            
            case 1: return dsThiSinh.get(rowIndex).getTenSP();
            
            case 2: return dsThiSinh.get(rowIndex).getNhaSX();
            
            case 3: return dsThiSinh.get(rowIndex).getMaLoaiSP();
            default :return null;
        }
    }
    @Override
    public Class getColumnClass(int columnIndex)
    {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column)
    {
        return name[column];
    }
}
