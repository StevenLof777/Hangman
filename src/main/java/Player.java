import java.io.Serializable;

public class Player implements Serializable {

    public int score = 0;

    private static final long serialVersionUID = 1L;
    public int getScore() {
        return score;
    }
    public void incrementScore() {
        score++;
    }

    private String name ="";
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
