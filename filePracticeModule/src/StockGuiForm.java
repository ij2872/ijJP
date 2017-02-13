import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

/**
 * Created by Ivan on 2/12/17.
 *  TODO FIX INTELLIJ FORM -- GLITCHED AND CORRUPTED
 */
public class StockGuiForm extends JFrame{
    private JTextField STOCK_TITLE;
    private JPanel StockPanel;
    private JTable tblOwnedStocks;
    private JPanel panelStats;
    private JPanel panelDo;
    private JButton button1;
    private JButton button2;
    private JPanel panel1;

    public StockGuiForm(){
        super("My Stocks");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        TableModel dataModel = new
                AbstractTableModel() {
                    public int getColumnCount() {
                        return 4;
                    }

                    public int getRowCount() {
                        return 10;
                    }

                    public Object getValueAt(int row, int col) {
                        return row * col;
                    }

                    public void setValueAt(Object value, int row, int col) {
//                        value[row][col] = "test";
                        fireTableCellUpdated(row, col);
                    }
                };

        tblOwnedStocks.setModel(dataModel);
        add(StockPanel);

        pack();
        setVisible(true);
    }


// Main Test
    public static void main(String[] args){
        StockGuiForm sgui = new StockGuiForm();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}





