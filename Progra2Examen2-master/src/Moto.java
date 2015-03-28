public class Moto extends MedioDeTransporte{
	
	//creo el constructor para Moto
Moto(int cantidad_pasajeros, double velocidad_maxima)
		{
			super(cantidad_pasajeros, velocidad_maxima);//aqui llamo pasajero y maximas desde la herencia de medio de transporte
		}

	@Override
	int getCantidadDeLLantas() //aqui envio la cantidad de llantas
	{
		cantidad_de_llantas=2;
		return cantidad_de_llantas;
	}

}