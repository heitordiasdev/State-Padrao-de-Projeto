package br.edu.catolica.padraoState.padraoState;

import br.edu.catolica.padraoState.interfaces.State;
import lombok.Data;

@Data
public class Pedido {

    private State aguardandoPagamento;
    private State pago;
    private State cancelado;
    private State enviado;
    private State estadoAtual;

    public Pedido() {
        this.aguardandoPagamento = new AguardandoPagamentoState(this);
        this.pago = new PagoState(this);
        this.cancelado = new CanceladoState(this);
        this.enviado = new EnviadoState(this);
        this.estadoAtual = this.aguardandoPagamento;
    }
}
