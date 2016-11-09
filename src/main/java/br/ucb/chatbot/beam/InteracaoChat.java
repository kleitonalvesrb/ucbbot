package br.ucb.chatbot.beam;

/**
 * 
 * @author kleitonbatista
 * @since 08/11/2016
 * @version 1.0
 */
public class InteracaoChat {

	private Integer usuarioInteracao;
	private String interacaoFala;
	
	public InteracaoChat(Integer usuarioInteracao, String interacaoFala){
		setUsuarioInteracao(usuarioInteracao);
		setInteracaoFala(interacaoFala);
	}
	
	
	
	public String getInteracaoFala() {
		return interacaoFala;
	}
	public Integer getUsuarioInteracao() {
		return usuarioInteracao;
	}

	/**
	 * usuarioInteracao, assumirar o valor 1 caso a interação tenha sido feita por um humano, caso contrario
	 * será pelo chat
	 * @param usuarioInteracao
	 */
	public void setUsuarioInteracao(Integer usuarioInteracao) {
		this.usuarioInteracao = usuarioInteracao;
	}


	/**
	 * intercao fala, será a mensagem de entrada do usuario ou de saída pelo bot
	 * @param interacaoFala
	 */
	public void setInteracaoFala(String interacaoFala) {
		this.interacaoFala = interacaoFala;
	}
	
	@Override
	public String toString() {
		String quemFala = getUsuarioInteracao() == 1 ? " Usuario " : " Bot";
		return quemFala+" "+getInteracaoFala();
	}
	
	
	
}
