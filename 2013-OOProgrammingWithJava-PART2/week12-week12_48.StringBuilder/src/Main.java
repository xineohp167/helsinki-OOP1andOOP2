
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{\n");
        stringBuilder.append(" ");
//        stringBuilder.append(t[0]).append(", ").append(t[1]).append(", ").append(t[2]).append(", ").append(t[3]).append("\n");
//        stringBuilder.append(t[4]).append(", ").append(t[5]).append(", ").append(t[6]).append(", ").append(t[7]).append("\n");
//        stringBuilder.append(t[8]).append(", ").append(t[9]).append("\n");
        for (int i = 0; i < t.length; i++) {
            if(i%4 == 0 && i != 0){
                stringBuilder.append("\n");
                stringBuilder.append(" ");
            }
            stringBuilder.append(t[i]);
            if (i != t.length - 1) {
                stringBuilder.append(", ");
            }
            
        }
        stringBuilder.append("\n");
        stringBuilder.append("}\n");
        return stringBuilder.toString();
        // return "{\n}\n";
    }
}
