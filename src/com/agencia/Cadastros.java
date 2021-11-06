package src.com.agencia;

import java.util.Scanner;

//Programa de cadastro e consulta de dados para uma agência de viagens, criado para a Avaliação Prática do Módulo II do Recode Pro 2021.
//Autor: Bárbara Maria de Araújo Brito
//Turma: Manhã 3

public class Cadastros {
	
  private String nome1,nome2,nome3,destino1,destino2,destino3,resposta,nomepesquisa,resposta2; 
  private boolean novamente;
  
	Cliente nomecliente1 = new Cliente();
	Cliente nomecliente2 = new Cliente();
	Cliente nomecliente3 = new Cliente();
	
	Destino  destinocliente1 = new Destino();
	Destino  destinocliente2 = new Destino();
	Destino  destinocliente3 = new Destino();
	
	Scanner input = new Scanner(System.in);

	
  public void cadastrarDestino() {
	
	//Cadastro dos destinos
	System.out.print("Nome do cliente: ");
	nome1 = input.nextLine();
	System.out.print("Destino do cliente: ");
	destino1 = input.nextLine();
	System.out.println("");
	
	System.out.print("Nome do cliente: ");
	nome2 = input.nextLine();
	System.out.print("Destino do cliente: ");
	destino2 = input.nextLine();
	System.out.println("");
	
	System.out.print("Nome do cliente: ");
	nome3 = input.nextLine();
	System.out.print("Destino do cliente: ");
	destino3 = input.nextLine();
	
	nomecliente1.setNome(nome1);
	nomecliente2.setNome(nome2);
	nomecliente3.setNome(nome3);
	destinocliente1.setDestino(destino1);
	destinocliente2.setDestino(destino2);
	destinocliente3.setDestino(destino3);
	
	//Mostra os dados cadastrados
	System.out.println("");
	System.out.println("----------------------------");
	System.out.println("");
	System.out.println("Dados cadastrados:");
	System.out.println("");
	System.out.println("Cliente: "+ nomecliente1.getNome()+" | Destino: "+destinocliente1.getDestino());
	System.out.println("");
	System.out.println("Cliente: "+nomecliente2.getNome()+" | Destino: "+destinocliente2.getDestino());
	System.out.println("");
	System.out.println("Cliente: "+nomecliente3.getNome()+" | Destino: "+destinocliente3.getDestino());
	System.out.println("");
	System.out.println("----------------------------");
	System.out.println("");
	System.out.println("");
  }
  
  public void consultarDestino() {
	//Menu de consultas
	System.out.print("Deseja iniciar o menu de consultas? s/n (Digite s para sim, n para nao): ");
	resposta = input.nextLine();
	
	
	if(resposta.equals("s")) {
		
	  do{
		  
		 novamente = false; 
		  
		System.out.println("Digite o nome do cliente que deseja consultar: ");
		nomepesquisa = input.nextLine();
		
		  if(nomepesquisa.equals(nome1)) {
			  
			  System.out.println("Resultado da pesquisa: Cliente "+ nomecliente1.getNome()+ " encontrado. Destino: "+ destinocliente1.getDestino());
		  }else if (nomepesquisa.equals(nome2)) {
			  System.out.println("Resultado da pesquisa: Cliente "+ nomecliente2.getNome()+ " encontrado. Destino: "+ destinocliente2.getDestino());
		  }else if (nomepesquisa.equals(nome3)) {
			  System.out.println("Resultado da pesquisa: Cliente "+ nomecliente3.getNome()+ " econtrado. Destino: "+ destinocliente3.getDestino());
		  }else {	
			  System.out.print("Resultado da pesquisa: Cliente não encontrado. Deseja consultar novamente? s/n (Digite s para sim, n para não): ");
			  resposta2 = input.nextLine();
			
			  if(resposta2.equals("s")) {
				 novamente = true;
				 
			  }else if (resposta2.equals("n")) {
				  novamente = false;
				  System.out.println("Programa finalizado. ");
				  
			  }else {
				  System.out.println("Opção não encontrada. Programa finalizado. ");
			  }
		  }
		  
	  }while(novamente == true);
		
	}else if (resposta.equals("n")) {
		System.out.println("Programa finalizado.");
	}else {
		System.out.println("Opcao nao encontrada. Programa finalizado.");
		}
	}

 
	public static void main(String[] args) {
		
		Cadastros cadastro = new Cadastros();
		
        cadastro.cadastrarDestino();
        cadastro.consultarDestino();
	}

  
}