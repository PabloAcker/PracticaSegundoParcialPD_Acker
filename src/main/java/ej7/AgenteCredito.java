package ej7;

public class AgenteCredito implements IAgentePago{
    private IAgentePago next;
    @Override
    public void setNext(IAgentePago agentePago) {
        next = agentePago;
    }

    @Override
    public IAgentePago next() {
        return next;
    }

    @Override
    public void pagarDeuda(int monto) {
        if(SingletonPrestamo.getInstance().getMontoPagado() < (SingletonPrestamo.getInstance().getMontoOriginal()*50)/100) {
            SingletonPrestamo.getInstance().setMontoPagado(SingletonPrestamo.getInstance().getMontoPagado() + monto);
            System.out.println("Pago realizado exitosamente gracias al Agente de credito.\n Si quiere refinanciar su prestamo contactese con nosotros!");
        } else {
            next.pagarDeuda(monto);
        }
    }
}
