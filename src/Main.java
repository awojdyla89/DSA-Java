
public class Main {

    public int getRemain(int amount){

        int timeframe = 3;
        int amt = amount;

        for (int i = 0; i < timeframe ; i++) {
            System.out.println(amt * .1);
            System.out.println((int)(amt * .1));
            amt = amt - (int)(amt * .1);
        }
        return amt;
    }

    public static void main(String[] args) {
        Main sol = new Main();
        int amount1 = 20000;
        int amount2 = 100000;
        int amount3 = 500000;
        int amount4 = 0;
        int amount5 = 27;

        System.out.println(sol.getRemain(amount1));
        System.out.println(sol.getRemain(amount2));
        System.out.println(sol.getRemain(amount3));
        System.out.println(sol.getRemain(amount4));
        System.out.println(sol.getRemain(amount5));
    }
}