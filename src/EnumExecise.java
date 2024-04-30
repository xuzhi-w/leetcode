package src;
public class EnumExecise{


    public static void main(String[] args) {
        for (Direction value : Direction.values()) {
            System.out.println(value);
            System.out.println(value.ordinal());
        }

    }

}

