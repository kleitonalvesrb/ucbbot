package br.ucb.chatbot.conversation;

import com.google.gson.Gson;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageResponse;
/**
 * 
 * @author kleitonbatista
 * @since 08/11/2016
 * @version 1.0
 */
public class TrataRespostaJson {
	/**
	 *  Trata a resposta que chega no formato JSON para forma compreensivel
	 * @param respostaJson
	 * @return
	 */
	public String trataResponstaJson(String respostaJson){
		Gson gson = new Gson();
		MessageResponse mr = gson.fromJson(respostaJson, MessageResponse.class);
		return trataString(mr.getOutput().get("text").toString());
	}
	private String trataString(String resposta){
		StringBuilder sb = new StringBuilder();
		sb.append(resposta);
		sb.delete(0, 1);
		sb.reverse().delete(0, 1);
		return sb.reverse().toString();
	}
}
