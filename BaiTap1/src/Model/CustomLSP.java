
package Model;

import Class.SanPham;
import Class.LoaiSanPham;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.AbstractTableModel;

public class CustomLSP extends AbstractTableModel
{
    private String name[]={"Mã Loại Sản Phẩm","Tên Loại Sản Phẩm"};
    private Class classes[]={String.class,String.class};
    ArrayList<LoaiSanPham> dsThiSinh=new ArrayList<LoaiSanPham>();

    public CustomLSP(ArrayList<LoaiSanPham> list)
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
            case 0: return dsThiSinh.get(rowIndex).getMaLoaiSP();
            
            case 1: return dsThiSinh.get(rowIndex).getTenLoaiSP();
            
     
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