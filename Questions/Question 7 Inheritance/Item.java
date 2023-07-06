public class Item {
    private int location;
    private String description;

    public Item(int loc,String des ){
        this.location=loc;
        this.description=des;
    }

    //getter and setter methods for location
    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    //getter and setter methods for description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
