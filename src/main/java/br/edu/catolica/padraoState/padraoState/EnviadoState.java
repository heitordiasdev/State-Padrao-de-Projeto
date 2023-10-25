package br.edu.catolica.padraoState.padraoState;

import br.edu.catolica.padraoState.interfaces.State;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class EnviadoState implements State {

    private final Pedido pedido;
    @Override
    public void pago() {
        throw new IllegalStateException("Operação não realizada. Pedido enviado!");
    }

    @Override
    public void enviarPedido() {
        throw new IllegalStateException("Operação não realizada. Pedido enviado!");
    }

    @Override
    public void cancelarPedido() {
        this.pedido.setEstadoAtual(this.pedido.getCancelado());
    }
}
