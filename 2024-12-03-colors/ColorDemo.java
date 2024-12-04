public class ColorDemo{
    public static final String CLEAR_SCREEN =  "\u001b[2J";
    public static final String HIDE_CURSOR =  "\u001b[?25l";
    public static final String SHOW_CURSOR =  "\u001b[?25h";
    public static int BLACK = 30;
    public static int RED = 31;

    public static void color(int foreground,int background){
        System.out.print( "\u001b[" + foreground + ";" + (10+background) + "m");
    }

    public static Void color(int foreground, int background, int modifier){
        System.out.print( "\u001b[" + foreground + ";" + (10+background) + + ";" + modifier + "m");
    }
    public static void go(int r,int c){
        System.out.print("\u001b[" + r + ";" + c + "f");
    }
    public static void main(String[] args){
        /*
        for(int r = 0; r < 256; r+=32){
            for(int g = 0; g <= 256; g+=32){
                 for(int b = 0; b <= 256; b+=32){
                    System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");
                    }
            }
            System.out.println();
        }
        */
        System.out.print(CLEAR_SCREEN + HIDE_CURSOR);
        int rows = 25;
        int col = 25;
        int drops = 75;
        for(int i = 0; i < drops; i++){
            int randomCol = (int) (Math.random() * col) + 1;
            for (int r = 0; r <= rows; r++){
                go(r, randomCol);
                System.out.println(",");
                go(r, randomCol);
                System.out.priny(" ");
            }
        }
        System.out.print(SHOW_CURSOR);
    }
}