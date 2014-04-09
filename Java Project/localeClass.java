/**
 * locationClass.java
 * Gregory Fox
 *
 */

public class localeClass {

    private int    id;
    private String name;
    private String desc;
    private String item;
    private boolean hasVisited;



    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public localeClass(int theId) {
        this.id = theId;
        hasVisited = false;
    }

    public int getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String value) {
        desc = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        name = value;
    }

    public boolean getHasVisited() {
        return hasVisited;
    }

    public void setHasVisited(boolean hasVisited) {
        this.hasVisited = hasVisited;
    }

    public String toString() {
        return "[Locale class: id= " + this.id + " Name= "+ this.name + " Desc= " + this.desc + "]";

    }

}
