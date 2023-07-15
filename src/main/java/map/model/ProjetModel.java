package map.model;

import java.util.Date;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="projet")
@Builder
public class ProjetModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Long id ;
	@Column(name="name")
	private String name;
	@Column(name="language")
	private String language;
	@Column(name="description")
	private String desc;
	@Column(name="conception")
	private String conception;
	@Column(name="start")
	private Date start;
	@Column(name="end")
	private Date end;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idencadrant", nullable = false)
	private EncadrantModel encadrant;
}
