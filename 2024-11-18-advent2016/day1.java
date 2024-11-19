import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day1{
    public static int countDistance(String filename){
        int x = 0;
        int y = 0;
        int position = 1;
        try{
        File file = new File(filename);
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            String direction = input.next(); // "L" or "R"
            if (!input.hasNextInt()) {
                    throw new NumberFormatException("Expected a number after " + direction);
                }
            int distance = Integer.parseInt(input.next());; // Distance value

            if (position > 4){
                position = 1;
            }

            if (direction.equals("L")){
                position --;
            }
            else if(direction.equals("R")){
                position ++;
            }
            else {
                    throw new IllegalArgumentException("Unexpected direction: " + direction);
                }

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
        }
        input.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
            return 0;
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format in file");
            return 0;
        }
        return Math.abs(x) + Math.abs(y);
    }
    public static void main(String[] args) {
        System.out.println(countDistance("day1.txt"));
    }
}