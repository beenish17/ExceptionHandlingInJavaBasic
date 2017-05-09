
package exceptions;

public class Exceptions extends Exception {

    public static void explore(){
        try{
            watchingAnimal();
            
            fall();                     //If fall will not throw an exception ,next statement will be executed.
            System.out.println("Never get here");   
            
        }
        catch(RuntimeException e){  //if thrs no exception in try.. catch will never run.
            getHuggFromDad();
            getUp();
       //System.exit(0);        //after this the program will not run finally.
        }
        finally{
            seeAnimalsAgain();
        }
        getHome();
    }
    public static void main(String[] args) {
        explore();
    }
    static void fall(){
        throw new RuntimeException();
    }
    static void getUp(){
        System.out.println("Get-Up ");
    }
    static void watchingAnimal(){
        System.out.println("Daddy Animals are sooo Beautifull...Awwwww!!!!");
    }
    static void getHuggFromDad(){
        System.out.println("Fallen: Awwww- My lil Princes..Its Ok my Love.");
    }
    static void seeAnimalsAgain(){
        System.out.println("Dad Look Rabbits..");
    }
    static void getHome(){
        System.out.println("Ok -its time to Go Back Princes. ");
    }
    
}
