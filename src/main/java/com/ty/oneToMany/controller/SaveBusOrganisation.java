package com.ty.oneToMany.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.oneToMany.dao.BusDao;
import com.ty.oneToMany.dao.OrganisationDao;
import com.ty.oneToMany.dto.Bus;
import com.ty.oneToMany.dto.Organisation;

public class SaveBusOrganisation {

	public static void main(String[] args) {
		Organisation organisation = new Organisation();
		organisation.setName("KSRTC");
		organisation.setAddress("Bengaluru");

		Bus bus1 = new Bus();
		bus1.setCapacity(59);
		bus1.setType("BMTC");

		Bus bus2 = new Bus();
		bus2.setType("Airavata");
		bus2.setCapacity(75);

		List<Bus> buses = new ArrayList<Bus>();
		buses.add(bus1);
		buses.add(bus2);

		organisation.setBus(buses);

		BusDao busDao = new BusDao();
		busDao.saveBus(bus2);
		busDao.saveBus(bus1);

		OrganisationDao dao1 = new OrganisationDao();
		dao1.saveCompany(organisation);

	}

}
