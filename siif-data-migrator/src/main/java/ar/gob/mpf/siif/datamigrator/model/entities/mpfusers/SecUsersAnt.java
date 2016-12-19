package ar.gob.mpf.siif.datamigrator.model.entities.mpfusers;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sec_users_ant database table.
 * 
 */
// @Entity
// @Table(name="sec_users_ant")
@NamedQuery(name="SecUsersAnt.findAll", query="SELECT s FROM SecUsersAnt s")
public class SecUsersAnt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="codcli_bej")
	private String codcliBej;

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

	@Column(name="use_code")
	private String useCode;

	@Column(name="use_cuil")
	private String useCuil;

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

	@Column(name="use_legajo")
	private int useLegajo;

	@Column(name="use_location")
	private String useLocation;

	@Column(name="use_login")
	private String useLogin;

	@Column(name="use_mobile")
	private String useMobile;

	@Column(name="use_mobile_lab")
	private String useMobileLab;

	@Column(name="use_nacionalidad")
	private String useNacionalidad;

	@Column(name="use_name")
	private String useName;

	@Column(name="use_nombre")
	private String useNombre;

	@Column(name="use_nrodoc")
	private String useNrodoc;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="use_passact")
	private Date usePassact;

	@Column(name="use_password")
	private String usePassword;

	@Column(name="use_phone")
	private String usePhone;

	@Column(name="use_phone_lab")
	private String usePhoneLab;

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

	@Column(name="use_tipodoc")
	private String useTipodoc;

	@Column(name="use_titulo")
	private String useTitulo;

	@Column(name="use_token")
	private String useToken;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="use_tstamp")
	private Date useTstamp;

	public SecUsersAnt() {
	}

	public String getCodcliBej() {
		return this.codcliBej;
	}

	public void setCodcliBej(String codcliBej) {
		this.codcliBej = codcliBej;
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

	public String getUseCode() {
		return this.useCode;
	}

	public void setUseCode(String useCode) {
		this.useCode = useCode;
	}

	public String getUseCuil() {
		return this.useCuil;
	}

	public void setUseCuil(String useCuil) {
		this.useCuil = useCuil;
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

}