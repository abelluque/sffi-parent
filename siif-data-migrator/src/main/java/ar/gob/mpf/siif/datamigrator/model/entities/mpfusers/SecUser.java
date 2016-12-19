package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sec_users database table.
 * 
 */
// @Entity
// @Table(name="sec_users")
@NamedQuery(name="SecUser.findAll", query="SELECT s FROM SecUser s")
public class SecUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="use_code")
	private String useCode;

	@Column(name="codcli_bej")
	private String codcliBej;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_expiracion_certificado")
	private Date fechaExpiracionCertificado;

	@Column(name="gca_code")
	private int gcaCode;

	@Column(name="gcc_code")
	private int gccCode;

	@Column(name="ged_code")
	private int gedCode;

	@Column(name="gfu_code")
	private int gfuCode;

	@Column(name="glu_code")
	private int gluCode;

	@Column(name="gun_code")
	private int gunCode;

	@Column(name="use_apellido")
	private String useApellido;

	@Column(name="use_avatar")
	private String useAvatar;

	@Column(name="use_claveap")
	private String useClaveap;

	@Column(name="use_clavepm")
	private String useClavepm;

	@Column(name="use_cuil")
	private String useCuil;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="use_data_act")
	private Date useDataAct;

	@Column(name="use_direccion")
	private String useDireccion;

	@Column(name="use_email")
	private String useEmail;

	@Column(name="use_email_alt")
	private String useEmailAlt;

	@Column(name="use_estudios")
	private String useEstudios;

	@Column(name="use_extension")
	private String useExtension;

	@Temporal(TemporalType.DATE)
	@Column(name="use_fecing")
	private Date useFecing;

	@Temporal(TemporalType.DATE)
	@Column(name="use_fecnac")
	private Date useFecnac;

	@Column(name="use_jefe")
	private String useJefe;

	@Column(name="use_language")
	private String useLanguage;

	@Column(name="use_layout")
	private String useLayout;

	@Column(name="use_legajo")
	private int useLegajo;

	@Column(name="use_location")
	private String useLocation;

	@Column(name="use_login")
	private String useLogin;

	@Column(name="use_login_juscaba")
	private String useLoginJuscaba;

	@Column(name="use_mobile")
	private String useMobile;

	@Column(name="use_mobile_lab")
	private String useMobileLab;

	@Column(name="use_modalidad_contratacion")
	private String useModalidadContratacion;

	@Column(name="use_nacionalidad")
	private String useNacionalidad;

	@Column(name="use_name")
	private String useName;

	@Column(name="use_nombre")
	private String useNombre;

	@Column(name="use_nrodoc")
	private String useNrodoc;

	@Column(name="use_opignouid")
	private String useOpignouid;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="use_passact")
	private Date usePassact;

	@Column(name="use_password")
	private String usePassword;

	@Column(name="use_password_juscaba")
	private String usePasswordJuscaba;

	@Column(name="use_phone")
	private String usePhone;

	@Column(name="use_phone_lab")
	private String usePhoneLab;

	@Column(name="use_pmuid")
	private String usePmuid;

	@Column(name="use_resolucion")
	private String useResolucion;

	@Column(name="use_rss")
	private String useRss;

	@Column(name="use_sexo")
	private String useSexo;

	@Column(name="use_skin")
	private String useSkin;

	@Column(name="use_status")
	private String useStatus;

	@Column(name="use_tipo")
	private String useTipo;

	@Column(name="use_tipodoc")
	private String useTipodoc;

	@Column(name="use_titulo")
	private String useTitulo;

	@Column(name="use_token")
	private String useToken;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="use_tstamp")
	private Date useTstamp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="use_ultima_operacion")
	private Date useUltimaOperacion;

	public SecUser() {
	}

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

	public String getCodcliBej() {
		return this.codcliBej;
	}

	public void setCodcliBej(String codcliBej) {
		this.codcliBej = codcliBej;
	}

	public Date getFechaExpiracionCertificado() {
		return this.fechaExpiracionCertificado;
	}

	public void setFechaExpiracionCertificado(Date fechaExpiracionCertificado) {
		this.fechaExpiracionCertificado = fechaExpiracionCertificado;
	}

	public int getGcaCode() {
		return this.gcaCode;
	}

	public void setGcaCode(int gcaCode) {
		this.gcaCode = gcaCode;
	}

	public int getGccCode() {
		return this.gccCode;
	}

	public void setGccCode(int gccCode) {
		this.gccCode = gccCode;
	}

	public int getGedCode() {
		return this.gedCode;
	}

	public void setGedCode(int gedCode) {
		this.gedCode = gedCode;
	}

	public int getGfuCode() {
		return this.gfuCode;
	}

	public void setGfuCode(int gfuCode) {
		this.gfuCode = gfuCode;
	}

	public int getGluCode() {
		return this.gluCode;
	}

	public void setGluCode(int gluCode) {
		this.gluCode = gluCode;
	}

	public int getGunCode() {
		return this.gunCode;
	}

	public void setGunCode(int gunCode) {
		this.gunCode = gunCode;
	}

	public String getUseApellido() {
		return this.useApellido;
	}

	public void setUseApellido(String useApellido) {
		this.useApellido = useApellido;
	}

	public String getUseAvatar() {
		return this.useAvatar;
	}

	public void setUseAvatar(String useAvatar) {
		this.useAvatar = useAvatar;
	}

	public String getUseClaveap() {
		return this.useClaveap;
	}

	public void setUseClaveap(String useClaveap) {
		this.useClaveap = useClaveap;
	}

	public String getUseClavepm() {
		return this.useClavepm;
	}

	public void setUseClavepm(String useClavepm) {
		this.useClavepm = useClavepm;
	}

	public String getUseCuil() {
		return this.useCuil;
	}

	public void setUseCuil(String useCuil) {
		this.useCuil = useCuil;
	}

	public Date getUseDataAct() {
		return this.useDataAct;
	}

	public void setUseDataAct(Date useDataAct) {
		this.useDataAct = useDataAct;
	}

	public String getUseDireccion() {
		return this.useDireccion;
	}

	public void setUseDireccion(String useDireccion) {
		this.useDireccion = useDireccion;
	}

	public String getUseEmail() {
		return this.useEmail;
	}

	public void setUseEmail(String useEmail) {
		this.useEmail = useEmail;
	}

	public String getUseEmailAlt() {
		return this.useEmailAlt;
	}

	public void setUseEmailAlt(String useEmailAlt) {
		this.useEmailAlt = useEmailAlt;
	}

	public String getUseEstudios() {
		return this.useEstudios;
	}

	public void setUseEstudios(String useEstudios) {
		this.useEstudios = useEstudios;
	}

	public String getUseExtension() {
		return this.useExtension;
	}

	public void setUseExtension(String useExtension) {
		this.useExtension = useExtension;
	}

	public Date getUseFecing() {
		return this.useFecing;
	}

	public void setUseFecing(Date useFecing) {
		this.useFecing = useFecing;
	}

	public Date getUseFecnac() {
		return this.useFecnac;
	}

	public void setUseFecnac(Date useFecnac) {
		this.useFecnac = useFecnac;
	}

	public String getUseJefe() {
		return this.useJefe;
	}

	public void setUseJefe(String useJefe) {
		this.useJefe = useJefe;
	}

	public String getUseLanguage() {
		return this.useLanguage;
	}

	public void setUseLanguage(String useLanguage) {
		this.useLanguage = useLanguage;
	}

	public String getUseLayout() {
		return this.useLayout;
	}

	public void setUseLayout(String useLayout) {
		this.useLayout = useLayout;
	}

	public int getUseLegajo() {
		return this.useLegajo;
	}

	public void setUseLegajo(int useLegajo) {
		this.useLegajo = useLegajo;
	}

	public String getUseLocation() {
		return this.useLocation;
	}

	public void setUseLocation(String useLocation) {
		this.useLocation = useLocation;
	}

	public String getUseLogin() {
		return this.useLogin;
	}

	public void setUseLogin(String useLogin) {
		this.useLogin = useLogin;
	}

	public String getUseLoginJuscaba() {
		return this.useLoginJuscaba;
	}

	public void setUseLoginJuscaba(String useLoginJuscaba) {
		this.useLoginJuscaba = useLoginJuscaba;
	}

	public String getUseMobile() {
		return this.useMobile;
	}

	public void setUseMobile(String useMobile) {
		this.useMobile = useMobile;
	}

	public String getUseMobileLab() {
		return this.useMobileLab;
	}

	public void setUseMobileLab(String useMobileLab) {
		this.useMobileLab = useMobileLab;
	}

	public String getUseModalidadContratacion() {
		return this.useModalidadContratacion;
	}

	public void setUseModalidadContratacion(String useModalidadContratacion) {
		this.useModalidadContratacion = useModalidadContratacion;
	}

	public String getUseNacionalidad() {
		return this.useNacionalidad;
	}

	public void setUseNacionalidad(String useNacionalidad) {
		this.useNacionalidad = useNacionalidad;
	}

	public String getUseName() {
		return this.useName;
	}

	public void setUseName(String useName) {
		this.useName = useName;
	}

	public String getUseNombre() {
		return this.useNombre;
	}

	public void setUseNombre(String useNombre) {
		this.useNombre = useNombre;
	}

	public String getUseNrodoc() {
		return this.useNrodoc;
	}

	public void setUseNrodoc(String useNrodoc) {
		this.useNrodoc = useNrodoc;
	}

	public String getUseOpignouid() {
		return this.useOpignouid;
	}

	public void setUseOpignouid(String useOpignouid) {
		this.useOpignouid = useOpignouid;
	}

	public Date getUsePassact() {
		return this.usePassact;
	}

	public void setUsePassact(Date usePassact) {
		this.usePassact = usePassact;
	}

	public String getUsePassword() {
		return this.usePassword;
	}

	public void setUsePassword(String usePassword) {
		this.usePassword = usePassword;
	}

	public String getUsePasswordJuscaba() {
		return this.usePasswordJuscaba;
	}

	public void setUsePasswordJuscaba(String usePasswordJuscaba) {
		this.usePasswordJuscaba = usePasswordJuscaba;
	}

	public String getUsePhone() {
		return this.usePhone;
	}

	public void setUsePhone(String usePhone) {
		this.usePhone = usePhone;
	}

	public String getUsePhoneLab() {
		return this.usePhoneLab;
	}

	public void setUsePhoneLab(String usePhoneLab) {
		this.usePhoneLab = usePhoneLab;
	}

	public String getUsePmuid() {
		return this.usePmuid;
	}

	public void setUsePmuid(String usePmuid) {
		this.usePmuid = usePmuid;
	}

	public String getUseResolucion() {
		return this.useResolucion;
	}

	public void setUseResolucion(String useResolucion) {
		this.useResolucion = useResolucion;
	}

	public String getUseRss() {
		return this.useRss;
	}

	public void setUseRss(String useRss) {
		this.useRss = useRss;
	}

	public String getUseSexo() {
		return this.useSexo;
	}

	public void setUseSexo(String useSexo) {
		this.useSexo = useSexo;
	}

	public String getUseSkin() {
		return this.useSkin;
	}

	public void setUseSkin(String useSkin) {
		this.useSkin = useSkin;
	}

	public String getUseStatus() {
		return this.useStatus;
	}

	public void setUseStatus(String useStatus) {
		this.useStatus = useStatus;
	}

	public String getUseTipo() {
		return this.useTipo;
	}

	public void setUseTipo(String useTipo) {
		this.useTipo = useTipo;
	}

	public String getUseTipodoc() {
		return this.useTipodoc;
	}

	public void setUseTipodoc(String useTipodoc) {
		this.useTipodoc = useTipodoc;
	}

	public String getUseTitulo() {
		return this.useTitulo;
	}

	public void setUseTitulo(String useTitulo) {
		this.useTitulo = useTitulo;
	}

	public String getUseToken() {
		return this.useToken;
	}

	public void setUseToken(String useToken) {
		this.useToken = useToken;
	}

	public Date getUseTstamp() {
		return this.useTstamp;
	}

	public void setUseTstamp(Date useTstamp) {
		this.useTstamp = useTstamp;
	}

	public Date getUseUltimaOperacion() {
		return this.useUltimaOperacion;
	}

	public void setUseUltimaOperacion(Date useUltimaOperacion) {
		this.useUltimaOperacion = useUltimaOperacion;
	}

}