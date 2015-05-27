package modulos;

import java.util.ArrayList;
import view.JogoDaVelha;

public class GerarMatriz {
	
	public ArrayList <String> matriz = new ArrayList<>();
	public String string;
	public String cp1;
	public String cp2;
	public String cp3;
	public String cp4;
	public String cp5;
	public String cp6;
	public String cp7;
	public String cp8;
	public String cp9;
	
	public void GeraMatriz(){
		matriz.clear();
		//campo1
		cp1="";
		if (JogoDaVelha.campo1.getText() == "") 
			cp1 = "O";			
		else if (JogoDaVelha.campo1.getText() == "X")
			cp1 = "1";
		else if (JogoDaVelha.campo1.getText() == "O")
			cp1 = "2";
			
		//campo2
		cp2="";
		if (JogoDaVelha.campo2.getText() == "") 
			cp2 = "O";			
		else if (JogoDaVelha.campo2.getText() == "X")
			cp2 = "1";
		else if (JogoDaVelha.campo2.getText() == "O")
			cp2 = "2";

		//campo3
		cp3="";
		if (JogoDaVelha.campo3.getText() == "") 
			cp3 = "O";			
		else if (JogoDaVelha.campo3.getText() == "X")
			cp3 = "1";
		else if (JogoDaVelha.campo3.getText() == "O")
			cp3 = "2"; 
		
		//campo4
		cp4="";
		if (JogoDaVelha.campo4.getText() == "") 
			cp4 = "O";			
		else if (JogoDaVelha.campo4.getText() == "X")
			cp4 = "1";
		else if (JogoDaVelha.campo4.getText() == "O")
			cp4 = "2"; 

		//campo5
		cp5="";
		if (JogoDaVelha.campo5.getText() == "") 
			cp5 = "O";			
		else if (JogoDaVelha.campo5.getText() == "X")
			cp5 = "1";
		else if (JogoDaVelha.campo5.getText() == "O")
			cp5 = "2"; 
		
		//campo6
		cp6="";
		if (JogoDaVelha.campo6.getText() == "") 
			cp6 = "O";			
		else if (JogoDaVelha.campo6.getText() == "X")
			cp6 = "1";
		else if (JogoDaVelha.campo6.getText() == "O")
			cp6 = "2";
		
		//campo7
		cp7="";
		if (JogoDaVelha.campo7.getText() == "") 
			cp7 = "O";			
		else if (JogoDaVelha.campo7.getText() == "X")
			cp7 = "1";
		else if (JogoDaVelha.campo7.getText() == "O")
			cp7 = "2"; 
		
		//campo8
		cp8="";
		if (JogoDaVelha.campo8.getText() == "") 
			cp8 = "O";			
		else if (JogoDaVelha.campo8.getText() == "X")
			cp8 = "1";
		else if (JogoDaVelha.campo8.getText() == "O")
			cp8 = "2"; 
		
		//campo9
		cp9="";
		if (JogoDaVelha.campo9.getText() == "") 
			cp9 = "O";			
		else if (JogoDaVelha.campo9.getText() == "X")
			cp9 = "1";
		else if (JogoDaVelha.campo9.getText() == "O")
			cp9 = "2";
		
		string = cp1 + cp2 + cp3 + cp4 + cp5 + cp6 + cp7 + cp8 + cp9;
		
		matriz.add(string);	
	}
}

