package com.arsoft.santesys.bean;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


import com.arsoft.santesys.repositorios.BarrioRepositoryInterface;
import com.arsoft.santesys.repositorios.CiudadeRepositoryInterface;
import com.arsoft.santesys.repositorios.DepartamentoRepositoryInterface;
import com.arsoft.santesys.repositorios.DiasSemanaRespositoryInterface;
import com.arsoft.santesys.repositorios.EstadosCivilesRespositoryInterface;
import com.arsoft.santesys.repositorios.IntegridadDominioRespositoryInterface;
import com.arsoft.santesys.repositorios.OcupacionesProfesionalRespositoryInterface;
import com.arsoft.santesys.repositorios.PaisRepositoryInterface;
import com.arsoft.santesys.repositorios.SexoRespositoryInterface;
import com.arsoft.santesys.repositorios.TiposAreaRespositoryInterface;
import com.arsoft.santesys.repositorios.TiposCieRespositoryInterface;
import com.arsoft.santesys.repositorios.TiposConsultorioRespositoryInterface;
import com.arsoft.santesys.repositorios.TiposIdentificacionRepositoryInterface;
import com.arsoft.santesys.repositorios.TiposServicioRespositoryInterface;
import com.arsoft.santesys.repositorios.TiposVinculacionRespositoryInterface;

@Component
@Configuration
@EnableAutoConfiguration
public class RegistrationBean {
	
	@Autowired
	private PaisRepositoryInterface paisRepository;
	
	@Autowired
	private DepartamentoRepositoryInterface departamentoRepository;
	
	@Autowired
	private CiudadeRepositoryInterface ciudadRepository;
	
	@Autowired
	private BarrioRepositoryInterface barrioRepository;
	
	@Autowired
	private TiposIdentificacionRepositoryInterface tiposIDRepository;
	
	@Autowired
	private TiposAreaRespositoryInterface tiposAreaRespository;
	
	@Autowired
	private EstadosCivilesRespositoryInterface estadosCivilesRespository;
	
	@Autowired
	private TiposVinculacionRespositoryInterface tiposVinculacionRespository;
	
	@Autowired
	private TiposConsultorioRespositoryInterface tiposConsultorioRespository;
	
	@Autowired
	private DiasSemanaRespositoryInterface diasSemanaRespository;
	
	@Autowired
	private TiposServicioRespositoryInterface tiposServicioRespository;
	
	@Autowired
	private SexoRespositoryInterface sexoRespository;
	
	@Autowired
	private IntegridadDominioRespositoryInterface integridadDominioRespository;
	
	@Autowired
	private TiposCieRespositoryInterface tiposCieRespository;
	
	@Autowired
	private OcupacionesProfesionalRespositoryInterface ocupacionesProfesionalRespository;



	public PaisRepositoryInterface getPaisRepository() {
		return paisRepository;
	}



	public void setPaisRepository(PaisRepositoryInterface paisRepository) {
		this.paisRepository = paisRepository;
	}



	public DepartamentoRepositoryInterface getDepartamentoRepository() {
		return departamentoRepository;
	}



	public void setDepartamentoRepository(DepartamentoRepositoryInterface departamentoRepository) {
		this.departamentoRepository = departamentoRepository;
	}



	public CiudadeRepositoryInterface getCiudadRepository() {
		return ciudadRepository;
	}



	public void setCiudadRepository(CiudadeRepositoryInterface ciudadRepository) {
		this.ciudadRepository = ciudadRepository;
	}



	public BarrioRepositoryInterface getBarrioRepository() {
		return barrioRepository;
	}



	public void setBarrioRepository(BarrioRepositoryInterface barrioRepository) {
		this.barrioRepository = barrioRepository;
	}

	public TiposIdentificacionRepositoryInterface getTiposIDRepository() {
		return tiposIDRepository;
	}



	public void setTiposIDRepository(TiposIdentificacionRepositoryInterface tiposIDRepository) {
		this.tiposIDRepository = tiposIDRepository;
	}



	public TiposAreaRespositoryInterface getTiposAreaRespository() {
		return tiposAreaRespository;
	}



	public void setTiposAreaRespository(TiposAreaRespositoryInterface tiposAreaRespository) {
		this.tiposAreaRespository = tiposAreaRespository;
	}



	public EstadosCivilesRespositoryInterface getEstadosCivilesRespository() {
		return estadosCivilesRespository;
	}



	public void setEstadosCivilesRespository(EstadosCivilesRespositoryInterface estadosCivilesRespository) {
		this.estadosCivilesRespository = estadosCivilesRespository;
	}



	public TiposVinculacionRespositoryInterface getTiposVinculacionRespository() {
		return tiposVinculacionRespository;
	}



	public void setTiposVinculacionRespository(TiposVinculacionRespositoryInterface tiposVinculacionRespository) {
		this.tiposVinculacionRespository = tiposVinculacionRespository;
	}



	public TiposConsultorioRespositoryInterface getTiposConsultorioRespository() {
		return tiposConsultorioRespository;
	}



	public void setTiposConsultorioRespository(TiposConsultorioRespositoryInterface tiposConsultorioRespository) {
		this.tiposConsultorioRespository = tiposConsultorioRespository;
	}



	public DiasSemanaRespositoryInterface getDiasSemanaRespository() {
		return diasSemanaRespository;
	}



	public void setDiasSemanaRespository(DiasSemanaRespositoryInterface diasSemanaRespository) {
		this.diasSemanaRespository = diasSemanaRespository;
	}



	public TiposServicioRespositoryInterface getTiposServicioRespository() {
		return tiposServicioRespository;
	}



	public void setTiposServicioRespository(TiposServicioRespositoryInterface tiposServicioRespository) {
		this.tiposServicioRespository = tiposServicioRespository;
	}



	public SexoRespositoryInterface getSexoRespository() {
		return sexoRespository;
	}



	public void setSexoRespository(SexoRespositoryInterface sexoRespository) {
		this.sexoRespository = sexoRespository;
	}



	public IntegridadDominioRespositoryInterface getIntegridadDominioRespository() {
		return integridadDominioRespository;
	}



	public void setIntegridadDominioRespository(IntegridadDominioRespositoryInterface integridadDominioRespository) {
		this.integridadDominioRespository = integridadDominioRespository;
	}



	public TiposCieRespositoryInterface getTiposCieRespository() {
		return tiposCieRespository;
	}



	public void setTiposCieRespository(TiposCieRespositoryInterface tiposCieRespository) {
		this.tiposCieRespository = tiposCieRespository;
	}



	public OcupacionesProfesionalRespositoryInterface getOcupacionesProfesionalRespository() {
		return ocupacionesProfesionalRespository;
	}



	public void setOcupacionesProfesionalRespository(
			OcupacionesProfesionalRespositoryInterface ocupacionesProfesionalRespository) {
		this.ocupacionesProfesionalRespository = ocupacionesProfesionalRespository;
	}

	
	
}
