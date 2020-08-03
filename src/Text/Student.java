package Text;

public class Student {
    private int number;
    private String name;
    private int score;

    public Student(int number, String name, int score){
        this.name=name;
        this.number=number;
        this.score=score;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
    public void display(){
        System.out.println("我带着红领巾");
    }
}
