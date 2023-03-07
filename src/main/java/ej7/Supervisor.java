package ej7;

public class Supervisor implements IAgentePago{
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
        if(SingletonPrestamo.getInstance().getMontoPagado() < SingletonPrestamo.getInstance().getMontoOriginal()) {
            SingletonPrestamo.getInstance().setMontoPagado(SingletonPrestamo.getInstance().getMontoPagado() + monto);
            System.out.println("Pago realizado exitosamente gracias al Supervisor,\n Si quiere un nuevo prestamo contactese con nosotros!");
            if(SingletonPrestamo.getInstance().getMontoPagado() >= SingletonPrestamo.getInstance().getMontoOriginal()) {
                System.out.println("Gracias por pagar la totalidad de su deuda, el Encargado de Prestamos le devolvera sus documentos");
                next.pagarDeuda(monto);
            }
        } else {
            next.pagarDeuda(monto);
        }
    }

}
