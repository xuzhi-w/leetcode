package src;

public class Contest0413 {
    public static String findLatestTime(String s) {
       int[] limits = {1,9,0,5,9};
       StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < 5; i++){
            char t = s.charAt(i);
            if(Character.compare(t,'?') == 0){
               t = (char)limits[i];
            }
            if(i == 1 && Integer.parseInt(stringBuilder.toString()) > 11){
                t = 1;
            }
            stringBuilder.append(t);
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = "0?:5?";
        System.out.println(findLatestTime(s));
    }
}
