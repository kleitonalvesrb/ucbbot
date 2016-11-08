package br.ucb.chatbot.conversation;

import com.ibm.watson.developer_cloud.conversation.v1.ConversationService;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageRequest;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageResponse;

import br.ucb.chatbot.constantes.ConstantesWatson;

/**
 * 
 * @author kleitonbatista
 * @since 08/11/2016
 * @version 1.0
 * classe que realizara a comunicacao externa com o watson
 */
public class RealizaPerguntBot {
	/**
	 * metodo responsavel por criar conexao com o watson e devolver uma resposta adequada para a pergunta realizada
	 * 
	 * @param pergunta
	 * @return resposta
	 */
	public String realizaPergunta(String pergunta){
		ConversationService service = new ConversationService(ConstantesWatson.DATE_VERSION_CONVERSATION);
		service.setUsernameAndPassword(ConstantesWatson.USER_NAME_CONVERSATION, ConstantesWatson.PASSWORD_CONVERSATION);
		MessageRequest newMessage = new MessageRequest.Builder().inputText(pergunta).build();
		String workspaceId = ConstantesWatson.WORKSPACE_ID_CONVERSATION;
		MessageResponse response = service.message(workspaceId, newMessage).execute();
		return new TrataRespostaJson().trataResponstaJson(response.toString());
	}
}
