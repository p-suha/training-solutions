package week08d01;

public class Robot {

    private int x;
    private int y;

    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(String route) {

        for (int i = 0; i < route.length(); i++) {

            if (route.charAt(i) == 'B') {
                x--;
            } else if (route.charAt(i) == 'J') {
                x++;
            } else if (route.charAt(i) == 'F') {
                y++;
            } else if (route.charAt(i) == 'L') {

                y--;
            }
        }


    }

    public String printPosition() {

        return "Az új pozíció: (x)" + getX() + " (y)" + getY();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static void main(String[] args) {
        Robot r = new Robot(0, 0);
        r.move("BBJLLF");
        System.out.println(r.printPosition());
    }
}
