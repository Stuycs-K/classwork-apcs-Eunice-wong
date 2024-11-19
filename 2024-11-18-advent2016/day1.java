import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day1{
    public static int countDistance(String filename){
        int x = 0;
        int y = 0;
        int position = 1;
        File file = new File(filename);
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            if(position > 4){
                position = 1;
            }
            if (input.next().equals("L")){
                position --;
                if (position == 1){
                    y += Integer.parseInt(input.next());
                }
                if (position == 2){
                    x += Integer.parseInt(input.next());
                }
                if (position == 3){
                    y -= Integer.parseInt(input.next());
                }
                if (position == 4){
                    x -= Integer.parseInt(input.next());
                }
            }
            else{
                position ++;
                if (position == 1){
                    y += Integer.parseInt(input.next());
                }
                if (position == 2){
                    x += Integer.parseInt(input.next());
                }
                if (position == 3){
                    y -= Integer.parseInt(input.next());
                }
                if (position == 4){
                    x -= Integer.parseInt(input.next());
                }
            }

        }
        input.close();
        return Math.abs(x) + Math.abs(y);
    }
}
