package Builder;

public abstract class HouseBuild {
    House house=new House();
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void buildroofed();
    public House buildHouse(){
        return house;
    }
}
