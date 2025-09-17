package aula1609;

import java.util.Scanner;

public class Carro
{
    private String modelo;
    private int qtdeCombustivel;
    private int capacidadeTanque;
    
    Scanner entrada = new Scanner(System.in);
    
    /*Todo carro, ao ser instancionado, deverá receber o modelo e
    a sua respectiva capacidade do tanque do combustivel*/
    public Carro(String modelo, int capacidadeTanque)
    {
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
        this.qtdeCombustivel = 0;
    }
    public void exibirCombustivelAtual()
    {
        System.out.println(modelo + ": " + qtdeCombustivel + " litros");
    }
    /*Criar o método "abastecer", que recebe o valor(em litros) a ser abastecido
    e acrescenta essa quantidade no "qtdeCombustivel". Verifique se a capacidade
    do tanque não será excedida*/
    
    public void abastecer()
    {
        System.out.println("Informe quantos litros de gasolina serão colocados: ");
        int qtde = Integer.parseInt(entrada.nextLine());
        if(qtdeCombustivel + qtde > capacidadeTanque)
        {
            System.out.println("Capacidade excedida!");
        }
        else
        {
            System.out.println("O carro foi abastecido!");
            qtdeCombustivel += qtde;
        }
    }
    
    /*
    public void abastecer(int qtde)
    {
        if(this.qtdeCombustivel + qtde > this.capacidadeTanque)
        {
            System.out.println("Capacidade excedida!");
        }
        else
        {
            this.qtdeCombustivel += qtde;
            System.out.println("O carro foi abastecido!");
        }
    }
    */
}