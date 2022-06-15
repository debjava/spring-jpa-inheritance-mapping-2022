package com.ddlab.rnd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.ddlab.rnd.entity.hierarchy.ContractEmployee;
import com.ddlab.rnd.entity.hierarchy.Employee;
import com.ddlab.rnd.entity.hierarchy.PermanetEmployee;
import com.ddlab.rnd.entity.tableperclass.FourWheelerVehicle;
import com.ddlab.rnd.entity.tableperclass.TwoWheelerVehicle;
import com.ddlab.rnd.entity.tableperclass.Vehicle;
import com.ddlab.rnd.entity.tablepersubclass.Car;
import com.ddlab.rnd.entity.tablepersubclass.HatchBackCar;
import com.ddlab.rnd.entity.tablepersubclass.SedanCar;
import com.ddlab.rnd.service.SingleTableService;
import com.ddlab.rnd.service.TablePerClassService;
import com.ddlab.rnd.service.TablePerSubClassService;

@Component
public class AppAutoStart {

	@Autowired
	private SingleTableService service;
	
	@Autowired
	private TablePerClassService tpcService;
	
	@Autowired
	private TablePerSubClassService tpsService;

	@EventListener(ApplicationReadyEvent.class)
	public void afterStartup() {
		
		saveCar();
		
//		saveVehicles();

//		saveEmployee();
	}
	
	public void saveCar() {
		Car car = new Car();
		car.setName("Main Car");
		tpsService.save(car);
		
		SedanCar sedan = new SedanCar();
		sedan.setName("Sedan Car");
		tpsService.save(sedan);
		
		HatchBackCar hatchBack = new HatchBackCar();
		hatchBack.setName("HatchBack");
		tpsService.save(hatchBack);
		
	}
	
	public void saveVehicles() {
		Vehicle vehicle = new Vehicle();
		vehicle.setName("Main Vehicle");
		tpcService.save(vehicle);
		
		TwoWheelerVehicle two = new TwoWheelerVehicle();
		two.setName("Two Wheeler");
		tpcService.save(two);
		
		FourWheelerVehicle four = new FourWheelerVehicle();
		four.setName("Four Wheeler");
		tpcService.save(four);
		
	}

	public void saveEmployee() {
		Employee emp = new Employee();
		emp.setName("Main Emp");
		service.saveEmployee(emp);

		PermanetEmployee pe = new PermanetEmployee();
		pe.setName("P Employee");
		service.saveEmployee(pe);

		ContractEmployee ce = new ContractEmployee();
		ce.setName("C Employee");
		service.saveEmployee(ce);
	}
}
