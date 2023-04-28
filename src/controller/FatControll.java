package controller;

public class FatControll 
{
	public FatControll()
	{
		super();
	}
	
	public int fat(int valor) //funcao do fat
	{
		return valor == 0 ? 1 : valor * fat(valor - 1);		
		//retorna 1 para caso o valor seja = 0, isso fara com que a proxima recursiva seja multiplicado por 1
		//multiplicando com os valores das recusivas anteriores.
	}
}
