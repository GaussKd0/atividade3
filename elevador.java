import java.util.Scanner;

public class elevador {
    private int andar;
    private int totaldeandares;
    private int quantidadepessoas;
    private int capacidadedepessoas;
    private int terreo;


    public void inicializar(int capacidadedepessoas, int totaldeandares ){
         
        setCapacidadedepessoas(0);
        entrar();
        SobeEDesce();
        Scanner scan = new Scanner(System.in);
        System.out.print("Deseja Sair Do Elevador 1 Para Sim E 2 Para Não");
        String pegar = scan.nextLine();
        if (pegar == "1"){
            Sair();
        }
        else if(pegar == "2"){
            System.out.print("Ok");
        }
        else{
            System.out.println("Opção invalida");
        }
    }

    public void SobeEDesce(){
        setAndar(0);
        System.out.println("Qual Andar Voce Deseja ir");
        System.out.println("Andar Atual " + getAndar());
        System.out.println("Qual Andar Deseja Ir (1) (2) (3) (4) (5) Térreo (0)");
        Scanner scan = new Scanner(System.in);
        String pegar = scan.nextLine();
        switch(pegar){
            case "1":
                System.out.println("Indo Para O Andar (1)");
                setAndar(1);
                System.out.println("Seu Andar Atual " + getAndar());
                break;

            case "2":
                System.out.println("Indo Para O Andar (2)");
                setAndar(2);
                System.out.println("Seu Andar Atual " + getAndar());
                break;

            case "3":
                System.out.println("Indo Para O Andar (3)");
                setAndar(3);
                System.out.println("Seu Andar Atual " + getAndar());
                break;

            case "4":
                System.out.println("Indo Para O Andar (4)");
                setAndar(3);
                System.out.println("Seu Andar Atual " + getAndar());
                break;

            case "5":
                System.out.println("Indo Para O Andar (5)");
                setAndar(3);
                System.out.println("Seu Andar Atual " + getAndar());
                break;

           case "0":
                System.out.println("Indo Para O Térreo (0)");
                setAndar(3);
                System.out.println("Seu Andar Atual " + getAndar());
                break; 

            default:
                System.out.println("Opção Invalida");
            break;         
                
            
        }

    }
    public void entrar(){
        if(getcapacidadedepessoas() > 5){

            System.out.println("Capacidade Maxima De Pessoas Alcançada: " + getcapacidadedepessoas() );
        }
        else{
            setCapacidadedepessoas(+1);
            System.out.println("Acabou De Entrar Uma Pessoa, Quantidade De Pessoas : " + getcapacidadedepessoas());
        }
    }
    public void Sair(){
        if(getcapacidadedepessoas() > 0){

            System.out.println("Não existem pessoas para que possam ser removidas");
        }
        else{
            setCapacidadedepessoas(-1);
            System.out.println("Acabou De Remover Uma Pessoa: " + getcapacidadedepessoas());
        }
    }

    public int getAndar(){

        return andar;
    }

    public int gettotaldeandares(){

        return totaldeandares;
    }

    public int getquantidadepessoas(){

        return quantidadepessoas;
    }

    public int getcapacidadedepessoas(){

        return capacidadedepessoas;
    }

    public int getterreo(){

        return terreo;
    }

    public void setAndar(int andar){

        this.andar = andar;
    }

    public void settotaldeandares(int totaldeandares){
        
        this.totaldeandares = totaldeandares;
    }
    public void setquantidadepessoas(int quantidadepessoas){
        
        this.quantidadepessoas = quantidadepessoas;
    }

    public void setterreo(int terreo){
        
        this.terreo = terreo;
    }

    public void setCapacidadedepessoas(int capacidadedepessoas){
        
        this.capacidadedepessoas = capacidadedepessoas;
    }
    
}
