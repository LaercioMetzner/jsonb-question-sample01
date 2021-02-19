package org.acme.getting.started.entities;

import java.util.UUID;

import javax.json.bind.annotation.JsonbTypeAdapter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.acme.getting.started.adapters.AreaIdAdapter;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Employee {

	@Id
	@GeneratedValue
	private UUID id;

	private String name;

	@JsonbTypeAdapter(AreaIdAdapter.class)
	@ManyToOne
	@JoinColumn(name = "area")
	private Area area;

}
