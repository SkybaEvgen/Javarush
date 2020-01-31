import java.util.HashMap;
import java.util.Map;

/* 
ApplicationContext
*/

public abstract class Given<GenericsBean extends Bean> {
    private Map<String, GenericsBean> container = new HashMap<String, GenericsBean>();
    // Map<Name, some class that implements the Bean interface>


    protected Given() {
        parseAllClassesAndInterfaces();
    }

    public GenericsBean getByName(String name) {
          return container.get(name);
    }

    public GenericsBean removeByName(String name) {
        return container.remove(name);
    }

    protected abstract void parseAllClassesAndInterfaces();

    public static void main(String[] args) {

    }
}
