package org.acme.getting.started.adapters;

import java.util.Objects;
import java.util.UUID;

import javax.json.bind.adapter.JsonbAdapter;

import org.acme.getting.started.entities.Area;

public class AreaIdAdapter implements JsonbAdapter<Area, UUID> {

	@Override
	public UUID adaptToJson(Area area) throws Exception {
		if (Objects.nonNull(area)) {
			return area.getId();
		} else {
			return null;
		}
	}

	@Override
	public Area adaptFromJson(UUID id) throws Exception {
		if (Objects.nonNull(id)) {
			Area area = new Area();
			area.setId(id);
			return area;
		} else {
			return null;
		}
	}

}
