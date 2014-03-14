/**
 * ListMan.java
 * Gregory Fox
 *
 */
 
public class listMan {

    //
    // Public
    //

    // Constructor
    public listMan() {
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public globeWandererItems getHead() {
        return head;
    }
    public void setHead(globeWandererItems head) {
        this.head = head;
    }

    // Other methods
    @Override
    public String toString() {
        String retVal = new String();
        retVal = super.toString() + " name=" + this.name + " desc=" + this.desc + "\n";
        globeWandererItems currentItem = this.head;
        while (currentItem != null) {
            retVal = retVal + "   " + currentItem.toString() + "\n";
            currentItem = currentItem.getNext();
        }
        return retVal;
    }


    //
    // Private
    //
    private String name;
    private String desc;
    private globeWandererItems head;

}