public class Main{
    public static void main(String[] args){
        int user = 0;
        int comp = 0;
        String y;
        for(int i = 0; i<5; i++) {
            y = new Rockpaper().compare();
            System.out.println("computerChoice: " + new Rockpaper().compChoice());
            System.out.println(y);
            if (y.equals("you won"))
                user += 1;
            else if (y.equals("tie"))
                continue;
            else
                comp+=1;
        }
        System.out.println("user: " + user);
        System.out.println("computer: " + comp);
    }
}