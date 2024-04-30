package src;

public enum Direction {
    UP("up"),
    DOWN("down");

    private final String direction;
    Direction(String desc){
        this.direction = desc;
    }

    @Override
    public String toString() {
        return "Direction{" +
                "direction='" + direction + '\'' +
                '}';
    }
}
