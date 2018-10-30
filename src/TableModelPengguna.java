
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableModelPengguna extends AbstractTableModel {
    private List<Pengguna> listPengguna;
    private String[] columns = {"Nama Pengguna", "Username"};

    public TableModelPengguna(List<Pengguna> listPengguna) {
        this.listPengguna = listPengguna;
    }
    
    
    @Override
    public int getRowCount() {
        return listPengguna.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0: return listPengguna.get(rowIndex).getNama();
            case 1: return listPengguna.get(rowIndex).getUsername();
            default: return null;
        }
    }
    
    public String getColumnName(int column) {
        return columns[column];
    }
    
}
