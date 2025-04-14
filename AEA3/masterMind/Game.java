import java.util.ArrayList;

public class Game {

    public char[] code;
    private int lvl;
    CodeGenerator codigo = new CodeGenerator();
    public static int LONG_SECRET;

    public Game(int lvl){
        if(lvl == 1) //adulto
            LONG_SECRET = 6;
        else        //niño
            LONG_SECRET = 3;
        this.code = codigo.generateCode();
        this.lvl = lvl;
    }
    
    public char[] getCode(){return this.code;}
    public void setCode(char[] code){ this.code = code;}
    public int getLvl(){return this.lvl;}
    public void setLvl(int lvl){this.lvl = lvl;}

    public void jugar(){
        boolean fin = false;
        boolean turno = true;
        Feedback feed = new Feedback();
        char[] resposta;
        RobotPlayer robot = new RobotPlayer(this.code);
        HumanPlayer player;
        if (this.lvl == 1)
            player = new AdultHumanPlayer();
        else
            player = new ChildHumanPlayer();
        while(!fin){
            if (turno){ //humano
                resposta = player.makeGuess();
                fin = feed.getFeedback(this.code, resposta);
            }else{
                System.out.print("Intento de GEPETO: ");
                resposta = robot.makeGuess();
                fin = feed.getFeedback(this.code, resposta);
            }
            turno = !turno;
        }
    }
}