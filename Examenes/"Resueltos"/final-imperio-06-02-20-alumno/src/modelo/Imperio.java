package modelo;

import java.util.ArrayList;
import java.util.Collection;

public class Imperio implements Cobrador {

    private Collection<Planeta> planetas = new ArrayList<>();
    private int fondoAcumulado = 0;

    public void solicitarRemesaDeProduccion() {
        for (Planeta planetaAgricola : planetas) {
            planetaAgricola.calcularImpuesto(this);
        }
    }        

    public void agregarPlaneta(Planeta planeta) {
        this.planetas.add(planeta);
    }

    public int getFondoAcumulado() {
        return this.fondoAcumulado;
    }

	@Override
	public void calcularImpuesto(PlanetaAgricola planeta, int produccionPlaneta) {
		this.fondoAcumulado += (0.5*produccionPlaneta);		
	}
}
