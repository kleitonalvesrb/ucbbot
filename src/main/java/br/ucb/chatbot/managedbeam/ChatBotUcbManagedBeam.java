package br.ucb.chatbot.managedbeam;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.ucb.chatbot.beam.InteracaoChat;

/**
 * 
 * @author kleitonbatista
 * @since 08/11/2016
 * @version 1.0
 * Classe que sera responsavel por controlar os dados que estao na pagina de apresentacao
 * e o modelo 
 */
@ManagedBean(name = "chat")
@ViewScoped
public class ChatBotUcbManagedBeam {
	private String userInput;
	private String botOutput;
	private List<InteracaoChat> interacoes = new ArrayList<>();
	
	public ChatBotUcbManagedBeam(){
		getInteracoes().add(new InteracaoChat(false, "Olá, eu sou uma Assistente virtual da UCB, em que posso lhe ajudar?"));
	}

	public String submint(){
		getInteracoes().add(new InteracaoChat(true, userInput));
		
		return "";
	}
	public String getUserInput() {
		return userInput;
	}

	public void setUserInput(String userInput) {
		this.userInput = userInput;
	}

	public String getBotOutput() {
		return botOutput;
	}

	public void setBotOutput(String botOutput) {
		this.botOutput = botOutput;
	}

	public List<InteracaoChat> getInteracoes() {
		return interacoes;
	}

	public void setInteracoes(List<InteracaoChat> interacoes) {
		this.interacoes = interacoes;
	}
	
	
}
