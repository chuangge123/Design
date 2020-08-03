package Builder;

public class HighHouse extends HouseBuild{

    @Override
    public void buildBasic() {
        System.out.println("高楼建造地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼刷墙");
    }

    @Override
    public void buildroofed() {
        System.out.println("高楼建造屋顶");
    }

}
