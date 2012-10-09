package net.avantic.course.vacation.dao.memory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.hibernate.cfg.NotYetImplementedException;

import net.avantic.course.vacation.dao.VacationRequestDAO;
import net.avantic.course.vacation.model.VacationRequest;

public class VacationRequestInMemoryDAO implements VacationRequestDAO {

	private Map<String, VacationRequest> map = new HashMap<String, VacationRequest>();
	
	public void save(VacationRequest request) {
		String uuid = UUID.randomUUID().toString();
		request.setId(uuid);
		map.put(uuid, request);
	}

	public List<VacationRequest> findByEmployee(String name) {
		List<VacationRequest> result = new ArrayList<VacationRequest>();
		
		for (VacationRequest vacationRequest : map.values()) {
			if (name.equals(vacationRequest.getEmployee().getName()))
				result.add(vacationRequest);
		}
		
		return result;
	}

	public VacationRequest get(String id) {
		if (map.containsKey(id))
			return map.get(id);
		
		return new VacationRequest();
	}

	public void resetStore() {
		map.clear();
	}

	public List<VacationRequest> findAll() {
		throw new NotYetImplementedException("Falta implementar, esté método es improbable que se llegue a usar");
	}

}
