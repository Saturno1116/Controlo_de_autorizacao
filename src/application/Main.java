package application;
import java.util.Scanner;

import controller.GereAutorizados;
import controller.GereCrianca;
import controller.GereEncarregado;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.Crianca;

public class Main 
{
	
	
	public static void main(String[] args) {
		new GereCrianca();
		new GereEncarregado();
		new GereAutorizados();
		
		
	   
	}	
}
