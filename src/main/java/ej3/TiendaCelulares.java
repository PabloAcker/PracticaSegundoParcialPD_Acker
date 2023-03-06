package ej3;

import java.util.ArrayList;
import java.util.List;

public class TiendaCelulares {
    List<Celulares> celularesList = new ArrayList<>();
    private String nombreTienda;
    private IstrategyVenta strategyVenta;

    public TiendaCelulares(String nombreTienda) {
        this.nombreTienda = nombreTienda;
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
    public void vender(){
        this.strategyVenta.estrategia(this.celularesList);
    }
}
