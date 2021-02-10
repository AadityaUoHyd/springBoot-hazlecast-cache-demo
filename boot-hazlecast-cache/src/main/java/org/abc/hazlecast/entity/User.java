package org.abc.hazlecast.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User implements Serializable {

	private static final long serialVersionUID = -6912201477750422475L;
	
	@Id
	private int id;
	private String name;
	private String address;
}