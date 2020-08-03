package Builder;

public class CommonHouse extends HouseBuild{

    @Override
    public void buildBasic() {
        System.out.println("普通房子下地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void buildroofed() {
        System.out.println("普通房子造屋顶");
    }
}
