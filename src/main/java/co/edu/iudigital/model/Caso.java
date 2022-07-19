package co.edu.iudigital.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "casos")

public class Caso implements Serializable {
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8044368840075392548L;

	//id INT NOT NULL AUTO_INCREMENT,
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    //fecha_hora DATETIME NULL DEFAULT now(),
	@Column(name = "fecha_hora")
	private LocalDateTime fechaHora;
	
	
    //latitud FLOAT NULL,
	@Column( name = "latitud")
	private Float latitud;
	
    //longitud FLOAT NULL,
	@Column(name = "longitud")
	private Float longitud;
	
	
    //altitud FLOAT NULL,
	@Column(name = "altitud")
	private Float altitud;
	
	
    //visible TINYINT NULL DEFAULT 1,
	@Column(name = "visiuble", columnDefinition = "NULL DEFAULT 1")
	private Boolean visible;
	
	
    //descripcion VARCHAR(200) NULL,
	@Column(name = "descripcion", length = 200)
	private String descripcion;
	
    //url_map TEXT NULL,
	private String urlMap;
	
    //rmi_url TEXT NULL,
	private String rmiUrl;
	
    //usuarios_id INT NOT NULL,
	private Long usuariosId;
	
    //delitos_id INT NOT NULL,8
	private Long delitosId;
	
	
	
	//PRIMARY KEY(id),
    //FOREIGN KEY (usuarios_id) REFERENCES usuarios(id),
    //FOREIGN KEY (delitos_id) REFERENCES delitos(id)
	
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	public Float getLatitud() {
		return latitud;
	}

	public void setLatitud(Float latitud) {
		this.latitud = latitud;
	}

	public Float getLongitud() {
		return longitud;
	}

	public void setLongitud(Float longitud) {
		this.longitud = longitud;
	}

	public Float getAltitud() {
		return altitud;
	}

	public void setAltitud(Float altitud) {
		this.altitud = altitud;
	}

	public Boolean getVisible() {
		return visible;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUrlMap() {
		return urlMap;
	}

	public void setUrlMap(String urlMap) {
		this.urlMap = urlMap;
	}

	public String getRmiUrl() {
		return rmiUrl;
	}

	public void setRmiUrl(String rmiUrl) {
		this.rmiUrl = rmiUrl;
	}

	public Long getUsuariosId() {
		return usuariosId;
	}

	public void setUsuariosId(Long usuariosId) {
		this.usuariosId = usuariosId;
	}

	public Long getDelitosId() {
		return delitosId;
	}

	public void setDelitosId(Long delitosId) {
		this.delitosId = delitosId;
	}
	
    
	
	

}
