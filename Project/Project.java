public class Project{
    private String name;
    private String description;
    private double cost;

    public Project(){
    }

    public Project(String name){
        this.name = name;
    }

    public Project(String name,String description){
        this.name = name;
        this.description = description;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

    public void setCost(double cost){
        this.cost = cost;
    }

    public double getCost(){
        return this.cost;
    }

    public String elevatorPitch(){
        System.out.println(name+" ("+cost+"): "+description);
        return name+" ("+cost+"): "+description;
    }
}