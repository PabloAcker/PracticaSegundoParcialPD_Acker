package ej7;

public interface IAgentePago {
    void setNext(IAgentePago agentePago);
    IAgentePago next();
    void pagarDeuda(int cantidad);
}
