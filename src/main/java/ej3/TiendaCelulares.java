package ej3;

import java.util.ArrayList;
import java.util.List;

public class TiendaCelulares {
    private List<Celulares> celularesList;
    private String nombreTienda;
    private IstrategyVenta strategyVenta;
    private static final int value1 = 5;

    public TiendaCelulares(List<Celulares> celularesList, String nombreTienda) {
        this.celularesList = celularesList;
        this.nombreTienda = nombreTienda;

        if (celularesList.size() > value1) {
            strategyVenta = new MuchosDatos();
        } else {
            strategyVenta = new PocosDatos();
        }
    }

    public List<Celulares> getCelularesList() {
        return celularesList;
    }

    public TiendaCelulares addCelulares(Celulares celulares) {
        this.celularesList.add(celulares);
        return this;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public IstrategyVenta getStrategyVenta() {
        return strategyVenta;
    }

    public void setStrategyVenta(IstrategyVenta strategyVenta) {
        this.strategyVenta = strategyVenta;
    }
    public List<Celulares> vender(String modelo){
        return this.strategyVenta.estrategia(this.celularesList, modelo);
    }
}
