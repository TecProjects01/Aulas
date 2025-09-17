package aula1609;

public class Aula1609 
{

    public static void main(String[] args) 
    {
        Lampada lamp1 = new Lampada();
        lamp1.marca = "Phillips";
        lamp1.potencia = "19w";
        //lamp1.status = false;
        //lamp1.status = true;

        lamp1.exibirStatus();
        for(int i=0;i<=5;i++)
        {
            lamp1.acender();
            lamp1.exibirStatus();
            lamp1.apagar();
            lamp1.exibirStatus();
                
        }
    }
}
