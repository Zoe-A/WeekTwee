package week3.beehive;

public class Soldier {
        int hitpoint = 10;
    int strenght = 5;
    int armour = 2;


    public void attack(Soldier enemy){

        enemy.hitpoint -= (this.strenght * 1.5) - enemy.armour;
        this.hitpoint -= (enemy.strenght * 0.5) - this.armour;
    }


    public boolean isDead(){
        return (hitpoint <= 0);
    }


    public static String printResults(Soldier A, Soldier B){ // Waarom moet ik hier static toevoegen om resultMain te kunnen printen?
        String result;

        if (A.isDead() || B.isDead()){
            result = "WE HAVE A WINNER";
        } else {
            result ="DRAW";
        }

        return result;
    }


    public static void main(String[] args) {

        Soldier sylvester = new Soldier();
        Soldier arnold = new Soldier();

        sylvester.attack(arnold);


        System.out.println( "Arnold hitpoints: " + arnold.hitpoint);
        System.out.println("Sylvester hitpoints: " + sylvester.hitpoint);

        arnold.attack(sylvester);

        System.out.println("Arnold hitpoints: " + arnold.hitpoint);
        System.out.println("Sylvester hitpoints: " + sylvester.hitpoint);

        String resultMain = printResults(arnold, sylvester);
        System.out.println(resultMain);








    }


}
