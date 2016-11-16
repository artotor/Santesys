package com.arsoft.santesys.bean;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.arsoft.santesys.repositorios.BarrioRepositoryInterface;
import com.arsoft.santesys.repositorios.CentrosAtencionRepositoryInterface;
import com.arsoft.santesys.repositorios.CentrosCostoRepositoryInterface;
import com.arsoft.santesys.repositorios.CiudadeRepositoryInterface;
import com.arsoft.santesys.repositorios.ConsultoriosRepositoryInterface;
import com.arsoft.santesys.repositorios.DepartamentoRepositoryInterface;
import com.arsoft.santesys.repositorios.DiasSemanaRespositoryInterface;
import com.arsoft.santesys.repositorios.EspecialidadesRepositoryInterface;
import com.arsoft.santesys.repositorios.EstadosCivilesRespositoryInterface;
import com.arsoft.santesys.repositorios.ExcepcionesAgendaRepositoryInterface;
import com.arsoft.santesys.repositorios.FuncionalidadesRepositoryInterface;
import com.arsoft.santesys.repositorios.GruposServicioRepositoryInterface;
import com.arsoft.santesys.repositorios.InstitucioneRepositoryInterface;
import com.arsoft.santesys.repositorios.IntegridadDominioRespositoryInterface;
import com.arsoft.santesys.repositorios.MotivoCierreAperturaIngresoRepositoryInterface;
import com.arsoft.santesys.repositorios.NaturalezaServicioRepositoryInterface;
import com.arsoft.santesys.repositorios.OcupacionesMedicasRepositoryInterface;
import com.arsoft.santesys.repositorios.OcupacionesProfesionalRespositoryInterface;
import com.arsoft.santesys.repositorios.PaisRepositoryInterface;
import com.arsoft.santesys.repositorios.SexoRespositoryInterface;
import com.arsoft.santesys.repositorios.TarifariosOficialesRepositoryInterface;
import com.arsoft.santesys.repositorios.TiposAreaRespositoryInterface;
import com.arsoft.santesys.repositorios.TiposCieRespositoryInterface;
import com.arsoft.santesys.repositorios.TiposConsultorioRespositoryInterface;
import com.arsoft.santesys.repositorios.TiposIdentificacionRepositoryInterface;
import com.arsoft.santesys.repositorios.TiposServicioRespositoryInterface;
import com.arsoft.santesys.repositorios.TiposVinculacionRespositoryInterface;
import com.arsoft.santesys.repositorios.UnidadesFuncionaleRepositoryInterface;
import com.arsoft.santesys.repositorios.ViasIngresoRepositoryInterface;

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

	@Autowired
	private InstitucioneRepositoryInterface institucioneRespository;
	
	@Autowired
	private UnidadesFuncionaleRepositoryInterface UnidadesFuncionaleRepository;
	
	@Autowired
	private EspecialidadesRepositoryInterface especialidadesRepository;
	
	@Autowired
	private CentrosAtencionRepositoryInterface centrosAtencionRepository;
	
	@Autowired
	private CentrosCostoRepositoryInterface centrosCostoRepository;
	
	
	@Autowired
	private ExcepcionesAgendaRepositoryInterface excepcionesAgendaRepository;
	
	@Autowired
	private ConsultoriosRepositoryInterface consultoriosRepository;

	@Autowired
	private TarifariosOficialesRepositoryInterface tarifariosOficialesRepository;

	@Autowired
	private OcupacionesMedicasRepositoryInterface ocupacionesMedicasRepository;

	@Autowired
	private GruposServicioRepositoryInterface gruposServicioRepository;

	@Autowired
	private MotivoCierreAperturaIngresoRepositoryInterface motivoCierreAperturaIngresoRepository;

	@Autowired
	private ViasIngresoRepositoryInterface viasIngresoRepository;

	@Autowired
	private NaturalezaServicioRepositoryInterface naturalezaServicioRepository;
	
	@Autowired
	private FuncionalidadesRepositoryInterface funcionalidadesRepository;
		


	public FuncionalidadesRepositoryInterface getFuncionalidadesRepository() {
		return funcionalidadesRepository;
	}



	public void setFuncionalidadesRepository(FuncionalidadesRepositoryInterface funcionalidadesRepository) {
		this.funcionalidadesRepository = funcionalidadesRepository;
	}



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



	public InstitucioneRepositoryInterface getInstitucioneRespository() {
		return institucioneRespository;
	}



	public void setInstitucioneRespository(InstitucioneRepositoryInterface institucioneRespository) {
		this.institucioneRespository = institucioneRespository;
	}



	public UnidadesFuncionaleRepositoryInterface getUnidadesFuncionaleRepository() {
		return UnidadesFuncionaleRepository;
	}



	public void setUnidadesFuncionaleRepository(UnidadesFuncionaleRepositoryInterface unidadesFuncionaleRepository) {
		this.UnidadesFuncionaleRepository = unidadesFuncionaleRepository;
	}


	

	public EspecialidadesRepositoryInterface getEspecialidadesRepository() {
		return especialidadesRepository;
	}



	public void setEspecialidadesRepository(EspecialidadesRepositoryInterface especialidadesRepository) {
		this.especialidadesRepository = especialidadesRepository;
	}



	public CentrosAtencionRepositoryInterface getCentrosAtencionRepository() {
		return centrosAtencionRepository;
	}



	public void setCentrosAtencionRepository(CentrosAtencionRepositoryInterface centrosAtencionRepository) {
		this.centrosAtencionRepository = centrosAtencionRepository;
	}



	public CentrosCostoRepositoryInterface getCentrosCostoRepository() {
		return centrosCostoRepository;
	}



	public void setCentrosCostoRepository(CentrosCostoRepositoryInterface centrosCostoRepository) {
		this.centrosCostoRepository = centrosCostoRepository;
	}



	public ExcepcionesAgendaRepositoryInterface getExcepcionesAgendaRepository() {
		return excepcionesAgendaRepository;
	}



	public void setExcepcionesAgendaRepository(ExcepcionesAgendaRepositoryInterface excepcionesAgendaRepository) {
		this.excepcionesAgendaRepository = excepcionesAgendaRepository;
	}



	public ConsultoriosRepositoryInterface getConsultoriosRepository() {
		return consultoriosRepository;
	}



	public void setConsultoriosRepository(ConsultoriosRepositoryInterface consultoriosRepository) {
		this.consultoriosRepository = consultoriosRepository;
	}



	public TarifariosOficialesRepositoryInterface getTarifariosOficialesRepository() {
		return tarifariosOficialesRepository;
	}



	public void setTarifariosOficialesRepository(TarifariosOficialesRepositoryInterface tarifariosOficialesRepository) {
		this.tarifariosOficialesRepository = tarifariosOficialesRepository;
	}



	public OcupacionesMedicasRepositoryInterface getOcupacionesMedicasRepository() {
		return ocupacionesMedicasRepository;
	}



	public void setOcupacionesMedicasRepository(OcupacionesMedicasRepositoryInterface ocupacionesMedicasRepository) {
		this.ocupacionesMedicasRepository = ocupacionesMedicasRepository;
	}



	public GruposServicioRepositoryInterface getGruposServicioRepository() {
		return gruposServicioRepository;
	}



	public void setGruposServicioRepository(GruposServicioRepositoryInterface gruposServicioRepository) {
		this.gruposServicioRepository = gruposServicioRepository;
	}



	public MotivoCierreAperturaIngresoRepositoryInterface getMotivoCierreAperturaIngresoRepository() {
		return motivoCierreAperturaIngresoRepository;
	}



	public void setMotivoCierreAperturaIngresoRepository(
			MotivoCierreAperturaIngresoRepositoryInterface motivoCierreAperturaIngresoRepository) {
		this.motivoCierreAperturaIngresoRepository = motivoCierreAperturaIngresoRepository;
	}



	public ViasIngresoRepositoryInterface getViasIngresoRepository() {
		return viasIngresoRepository;
	}



	public void setViasIngresoRepository(ViasIngresoRepositoryInterface viasIngresoRepository) {
		this.viasIngresoRepository = viasIngresoRepository;
	}



	public NaturalezaServicioRepositoryInterface getNaturalezaServicioRepository() {
		return naturalezaServicioRepository;
	}



	public void setNaturalezaServicioRepository(NaturalezaServicioRepositoryInterface naturalezaServicioRepository) {
		this.naturalezaServicioRepository = naturalezaServicioRepository;
	}



	
	
	
}
