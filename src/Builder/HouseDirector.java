package Builder;

public class HouseDirector {
    HouseBuild houseBuild = null;
    //传入到构造器
    public HouseDirector(HouseBuild houseBuild){
        this.houseBuild = houseBuild;
    }
    public House ConstructHouse(){
        houseBuild.buildBasic();
        houseBuild.buildWalls();
        houseBuild.buildroofed();
        return houseBuild.buildHouse();

    }
}
