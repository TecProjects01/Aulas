package aula1609;

public class Lampada {

/*Cada lâmpada terá um ciclo de vida, em que poderá ser ligada apenas 5x. 
Após isso, estará queimada e sem possibilidade de ser acendida*/

 /*Toda nova lâmpada deverá ser. por padrão, desligada(default)*/
    
    //atributos
    public String marca;
    public String potencia;
    private int contador;
    private boolean status;//true para acesa e false para apagada

    //construtor
    public Lampada() 
    {
        status = false;
        contador = 0;
    }

    //métodos
    public void exibirStatus() 
    {
        System.out.println("A lâmpada " + marca + " está com o status " + status);
    }
    
    public void acender()
    {
        if(status)
        {
            System.out.println("A lâmpada está acesa");
        }
        else
        {
            if(contador < 5)
            {
                status = true;
                contador++;
            }
            else
            {
                System.out.println("A lâmpada está queimada");
            }
        }
    }
    
    public void apagar()
    {
        if(!status)
        {
            System.out.println("A lâmpada está apagada");
        }
        else
        {
            status = false;
        }
    }
}
