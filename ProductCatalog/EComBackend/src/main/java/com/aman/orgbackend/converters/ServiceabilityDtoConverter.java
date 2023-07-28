package com.aman.orgbackend.converters;

import com.aman.orgbackend.dto.ServiceabilityDto;
import com.aman.orgbackend.models.Serviceability;


public class ServiceabilityDtoConverter {
	public ServiceabilityDto convertEntityToDto(Serviceability serviceability) {

		ServiceabilityDto serviceabilityDto = new ServiceabilityDto();

		serviceabilityDto.setPincode(serviceability.getPincode());

		serviceabilityDto.setExpectedDelivery(DateConverter.covertDaysIntoDate(serviceability.getExpectedDelivery()));

		return serviceabilityDto;
	}

	public Serviceability convertDtoToEntity(ServiceabilityDto serviceabilityDto) {
		Serviceability serviceability = new Serviceability();

		serviceability.setPincode(serviceabilityDto.getPincode());
		serviceability.setExpectedDelivery(Integer.parseInt(serviceabilityDto.getExpectedDelivery()));

		return serviceability;
	}
}
