import java.util.ArrayList;
public class day1{
    public static int countDistance(){
        int x = 0;
        int y = 0;
        int position = 1;
        String input = "R3, R1, R4, L4, R3, R1, R1, L3, L5, L5, L3, R1, R4, L2, L1, R3, L3, R2, R1, R1, L5, L2, L1, R2, L4, R1, L2, L4, R2, R2, L2, L4, L3, R1, R4, R3, L1, R1, L5, R4, L2, R185, L2, R4, R49, L3, L4, R5, R1, R1, L1, L1, R2, L1, L4, R4, R5, R4, L3, L5, R1, R71, L1, R1, R186, L5, L2, R5, R4, R1, L5, L2, R3, R2, R5, R5, R4, R1, R4, R2, L1, R4, L1, L4, L5, L4, R4, R5, R1, L2, L4, L1, L5, L3, L5, R2, L5, R4, L4, R3, R3, R1, R4, L1, L2, R2, L1, R4, R2, R2, R5, R2, R5, L1, R1, L4, R5, R4, R2, R4, L5, R3, R2, R5, R3, L3, L5, L4, L3, L2, L2, R3, R2, L1, L1, L5, R1, L3, R3, R4, R5, L3, L5, R1, L3, L5, L5, L2, R1, L3, L1, L3, R4, L1, R3, L2, L2, R3, R3, R4, R4, R1, L4, R1, L5";
        String[] arr = input.split(", ");
        ArrayList<String> visited = new ArrayList<>();
        visited.add(x + "," + y);
        for (int i = 0; i < arr.length; i++){
            String move = arr[i];
            char direction = move.charAt(0);
            int distance = Integer.parseInt(move.substring(1));
            if (position == 0){
                position = 4;
            }
            if (direction == 'L') {
                position = (position + 3) % 4; 
            } else if (direction == 'R') {
                position = (position + 1) % 4;
            }
        for (int i = 0; i < distance, i++){
            if (position == 1){
                y += distance;
            }
            else if (position == 2){
                x += distance;
            }
            else if (position == 3){
                y -= distance;
            }
            else {
                x -= distance;
            }
            String currentLocation = x + "," + y;
            if (visitied.contains(currentLocation)){
                return Math.abs(x) + Math.abs(y);
            }
        visited.add(currentLocation);
        }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Manhattan Distance: " + countDistance());
    }
}
