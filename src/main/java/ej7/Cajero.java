package ej7;

public class Cajero implements IAgentePago{
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
        if(SingletonPrestamo.getInstance().getMontoPagado() < (SingletonPrestamo.getInstance().getMontoOriginal()*25)/100) {
            SingletonPrestamo.getInstance().setMontoPagado(SingletonPrestamo.getInstance().getMontoPagado() + monto);
            System.out.println("Pago realizado exitosamente en el Cajero");
        } else {
            next.pagarDeuda(monto);
        }
    }
}
