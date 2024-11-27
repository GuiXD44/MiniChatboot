import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class MiniChatboot {

    public String inicio(){
        return "MiniChatbot: Olá! Eu sou o MiniChatbot. Como posso te ajudar hoje?";
    }

    public void retornarErro(){
        System.out.println("MiniChatbot: Desculpe, não entendi sua pergunta. Pode reformular?");
    }


    public boolean criarMiniChatbot(String texto){

        if(nome(texto)){
            return true;
        }

        if(saudacao(texto)){
            return true;
        }

        if(estado(texto)){
            return true;
        }

        retornarErro();
        return false;
    }



    public boolean nome(String respostaUsuario) {
        List<String> perguntasNome = Arrays.asList("seu nome", "quem é você", "nome");

        if (perguntasNome.contains(respostaUsuario.toLowerCase())){
            System.out.println("MiniChatbot: Eu sou o MiniChatbot, seu assistente virtual!");
            return true;
        }

        return false;
    }

    public boolean saudacao(String respostaUsuario) {
        List<String> saudacoesReconhecidas = Arrays.asList( "ola", "oi", "bom dia", "boa tarde", "boa noite");

        if(saudacoesReconhecidas.contains(respostaUsuario.toLowerCase())){
            System.out.println("MiniChatbot: Olá! Como posso ajudar?");
            return true;
        }


        return false;
    }

    public boolean estado(String respostaUsuario) {
        List<String> estadoReconhecido = Arrays.asList("você está");

        if(estadoReconhecido.contains(respostaUsuario.toLowerCase())){
            System.out.println("MiniChatbot: Estou funcionando perfeitamente, obrigado!");
            return true;
        }
        return false;
    }


}