package br.com.alura.forum.config.validacao;

/**
 *
 * @author Luis Lima
 */
public class ErroDeFomularioDto {
    private final String campo;
    private final String mensagem;

    public ErroDeFomularioDto(String campo, String mensagem) {
        this.campo = campo;
        this.mensagem = mensagem;
    }

    public String getCampo() {
        return campo;
    }

    public String getMensagem() {
        return mensagem;
    }
}
