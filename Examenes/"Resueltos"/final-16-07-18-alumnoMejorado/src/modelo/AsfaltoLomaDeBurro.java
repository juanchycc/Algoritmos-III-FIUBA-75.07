package modelo;

public class AsfaltoLomaDeBurro implements Superficie {

	@Override
	public int serCirculadaPor(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		return vehiculo.circularEn(this);
	}

}
