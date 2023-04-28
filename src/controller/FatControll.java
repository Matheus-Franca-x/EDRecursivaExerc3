package controller;

public class FatControll 
{
	public FatControll()
	{
		super();
	}
	
	public int fat(int valor) //funcao do fat
	{
		
		if(valor == 0) //retorna 1 para caso o valor seja = 0, isso fara com que a 
		{              //proxima recursiva seja multiplicado por 1
			return 1;
		}
		
		return valor * fat(valor - 1);
		
		
		
	}
	
	
}
