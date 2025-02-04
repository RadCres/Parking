package objectMother;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import model.Estacionamiento;
import model.EstacionamientoFinalizado;

public class EstacionamientoOM {

public static ArrayList<Estacionamiento> getEstacionamiento(){
	LocalDateTime horaEntrada []= {LocalDateTime.of(2022, 06, 8, 10, 05),LocalDateTime.of(2022, 06, 8, 11, 05),LocalDateTime.of(2022, 06, 8, 12, 05),
		LocalDateTime.of(2022, 06, 8, 13, 05),LocalDateTime.of(2022, 06, 8, 14, 05),LocalDateTime.of(2022, 06, 8, 15, 05),
		LocalDateTime.of(2022, 06, 8, 16, 05),LocalDateTime.of(2022, 06, 8, 17, 05),LocalDateTime.of(2022, 06, 8, 18, 05)};

	String[] plate= {"124HYT", "842YRO", "942UER", "154OPS", "353JSF", "812JQA", "123FAE", "OIO125", 
	 "031OOD"};
	
	
	
	ArrayList<Estacionamiento> estacionamientos = new ArrayList<>();
	
	for (int i = 0; i < plate.length; i++) {
		estacionamientos.add(new Estacionamiento(horaEntrada[i],plate[i]));
	}
	
return estacionamientos;	
}
public static ArrayList<EstacionamientoFinalizado> getEstacionamientosFinalizados(){
	LocalTime horaSalida []= {LocalTime.of(11, 05),LocalTime.of(12, 05),LocalTime.of(13, 05),
		LocalTime.of(14, 05),LocalTime.of(15, 05),LocalTime.of(16, 05),
		LocalTime.of(17, 05),LocalTime.of(18, 05),LocalTime.of(19, 05)};

	
	
	ArrayList<Estacionamiento> listaEstacionamientos= getEstacionamiento();
	ArrayList<EstacionamientoFinalizado> estacionamientos = new ArrayList<>();
	
	for (int i = 0; i < listaEstacionamientos.size(); i++) {
		Estacionamiento estacionamiento1 = listaEstacionamientos.get(i);
		estacionamiento1.setStatusEstacionamiento(false);
		estacionamientos.add(new EstacionamientoFinalizado(estacionamiento1,horaSalida[i])); //(horaSalida[i],plate[i]));
	}
	
return estacionamientos;	
}

}