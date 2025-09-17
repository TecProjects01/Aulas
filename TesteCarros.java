package aula1609;
public class TesteCarros
{
    public static void main(String[]args)
    {
        
        Carro c1 = new Carro("Fusca", 40);
        c1.exibirCombustivelAtual();
        /*
        c1.abastecer(25);
        c1.exibirCombustivelAtual();
        
        c1.abastecer(10);
        c1.exibirCombustivelAtual();
        
        c1.abastecer(5);
        c1.exibirCombustivelAtual();*/
        c1.abastecer();
        c1.exibirCombustivelAtual();
        c1.abastecer();
        c1.exibirCombustivelAtual();
    }
}
        