package br.edu.catolica.padraoState.padraoState;

import br.edu.catolica.padraoState.interfaces.State;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CanceladoState implements State {

    private final Pedido pedido;
    @Override
    public void pago() {
        this.pedido.setEstadoAtual(this.pedido.getPago());
    }

    @Override
    public void enviarPedido() {
        throw new IllegalStateException("Operação não realizada. Pedido cancelado!");
    }

    @Override
    public void cancelarPedido() {
        throw new IllegalStateException("Operação não realizada. Pedido cancelado!");
    }
}
