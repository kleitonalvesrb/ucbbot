package br.ucb.chatbot.beam;

/**
 * 
 * @author kleitonbatista
 * @since 08/11/2016
 * @version 1.0
 */
public class InteracaoChat {

	private boolean usuarioInteracao;
	private String interacaoFala;
	
	public InteracaoChat(boolean usuarioInteracao, String interacaoFala){
		setUsuarioInteracao(usuarioInteracao);
		setInteracaoFala(interacaoFala);
	}
	
	public boolean isUsuarioInteracao() {
		return usuarioInteracao;
	}
	/**
	 * usuarioInteracao, assumirar o valor true caso a interação tenha sido feita por um humano, caso contrario
	 * será pelo chat
	 * @param usuarioInteracao
	 */
	public void setUsuarioInteracao(boolean usuarioInteracao) {
		this.usuarioInteracao = usuarioInteracao;
	}
	public String getInteracaoFala() {
		return interacaoFala;
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
		String quemFala = isUsuarioInteracao() ? " Usuario " : " Bot";
		return quemFala+" "+getInteracaoFala();
	}
	
	
	
}
