package br.edu.catolica.padraoState.padraoState;

import br.edu.catolica.padraoState.interfaces.State;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PagoState implements State {

    private final Pedido pedido;
    @Override
    public void pago() {
        throw new IllegalStateException("Operação não realizada. Pedido pago!");
    }

    @Override
    public void enviarPedido() {
        this.pedido.setEstadoAtual(this.pedido.getEnviado());
    }

    @Override
    public void cancelarPedido() {
        this.pedido.setEstadoAtual(this.pedido.getCancelado());
    }
}
