import java.util.List;

/* 
Таблица
*/

public class Given {
    public class TableInterfaceWrapper {

    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}