package ar.gob.mpf.siif.datamigrator.model.entities.kiwi;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sec_users database table.
 * 
 */
// @Entity
// @Table(name="sec_users")
@NamedQuery(name="SecUser.findAll", query="SELECT s FROM SecUser s")
public class SecUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="codcli_bej")
	private int codcliBej;

	@Column(name="fecha_expiracion_certificado")
	private int fechaExpiracionCertificado;

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
	private int useApellido;

	@Column(name="use_avatar")
	private int useAvatar;

	@Column(name="use_claveap")
	private int useClaveap;

	@Column(name="use_clavepm")
	private int useClavepm;

	@Column(name="use_code")
	private int useCode;

	@Column(name="use_cuil")
	private int useCuil;

	@Column(name="use_data_act")
	private int useDataAct;

	@Column(name="use_direccion")
	private int useDireccion;

	@Column(name="use_email")
	private int useEmail;

	@Column(name="use_email_alt")
	private int useEmailAlt;

	@Column(name="use_estudios")
	private int useEstudios;

	@Column(name="use_extension")
	private int useExtension;

	@Column(name="use_fecing")
	private int useFecing;

	@Column(name="use_fecnac")
	private int useFecnac;

	@Column(name="use_jefe")
	private int useJefe;

	@Column(name="use_language")
	private int useLanguage;

	@Column(name="use_layout")
	private int useLayout;

	@Column(name="use_legajo")
	private int useLegajo;

	@Column(name="use_location")
	private int useLocation;

	@Column(name="use_login")
	private int useLogin;

	@Column(name="use_login_juscaba")
	private int useLoginJuscaba;

	@Column(name="use_mobile")
	private int useMobile;

	@Column(name="use_mobile_lab")
	private int useMobileLab;

	@Column(name="use_modalidad_contratacion")
	private int useModalidadContratacion;

	@Column(name="use_nacionalidad")
	private int useNacionalidad;

	@Column(name="use_name")
	private int useName;

	@Column(name="use_nombre")
	private int useNombre;

	@Column(name="use_nrodoc")
	private int useNrodoc;

	@Column(name="use_opignouid")
	private int useOpignouid;

	@Column(name="use_passact")
	private int usePassact;

	@Column(name="use_password")
	private int usePassword;

	@Column(name="use_password_juscaba")
	private int usePasswordJuscaba;

	@Column(name="use_phone")
	private int usePhone;

	@Column(name="use_phone_lab")
	private int usePhoneLab;

	@Column(name="use_pmuid")
	private int usePmuid;

	@Column(name="use_resolucion")
	private int useResolucion;

	@Column(name="use_rss")
	private int useRss;

	@Column(name="use_sexo")
	private int useSexo;

	@Column(name="use_skin")
	private int useSkin;

	@Column(name="use_status")
	private int useStatus;

	@Column(name="use_tipo")
	private int useTipo;

	@Column(name="use_tipodoc")
	private int useTipodoc;

	@Column(name="use_titulo")
	private int useTitulo;

	@Column(name="use_token")
	private int useToken;

	@Column(name="use_tstamp")
	private int useTstamp;

	@Column(name="use_ultima_operacion")
	private int useUltimaOperacion;

	public SecUser() {
	}

	public int getCodcliBej() {
		return this.codcliBej;
	}

	public void setCodcliBej(int codcliBej) {
		this.codcliBej = codcliBej;
	}

	public int getFechaExpiracionCertificado() {
		return this.fechaExpiracionCertificado;
	}

	public void setFechaExpiracionCertificado(int fechaExpiracionCertificado) {
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

	public int getUseApellido() {
		return this.useApellido;
	}

	public void setUseApellido(int useApellido) {
		this.useApellido = useApellido;
	}

	public int getUseAvatar() {
		return this.useAvatar;
	}

	public void setUseAvatar(int useAvatar) {
		this.useAvatar = useAvatar;
	}

	public int getUseClaveap() {
		return this.useClaveap;
	}

	public void setUseClaveap(int useClaveap) {
		this.useClaveap = useClaveap;
	}

	public int getUseClavepm() {
		return this.useClavepm;
	}

	public void setUseClavepm(int useClavepm) {
		this.useClavepm = useClavepm;
	}

	public int getUseCode() {
		return this.useCode;
	}

	public void setUseCode(int useCode) {
		this.useCode = useCode;
	}

	public int getUseCuil() {
		return this.useCuil;
	}

	public void setUseCuil(int useCuil) {
		this.useCuil = useCuil;
	}

	public int getUseDataAct() {
		return this.useDataAct;
	}

	public void setUseDataAct(int useDataAct) {
		this.useDataAct = useDataAct;
	}

	public int getUseDireccion() {
		return this.useDireccion;
	}

	public void setUseDireccion(int useDireccion) {
		this.useDireccion = useDireccion;
	}

	public int getUseEmail() {
		return this.useEmail;
	}

	public void setUseEmail(int useEmail) {
		this.useEmail = useEmail;
	}

	public int getUseEmailAlt() {
		return this.useEmailAlt;
	}

	public void setUseEmailAlt(int useEmailAlt) {
		this.useEmailAlt = useEmailAlt;
	}

	public int getUseEstudios() {
		return this.useEstudios;
	}

	public void setUseEstudios(int useEstudios) {
		this.useEstudios = useEstudios;
	}

	public int getUseExtension() {
		return this.useExtension;
	}

	public void setUseExtension(int useExtension) {
		this.useExtension = useExtension;
	}

	public int getUseFecing() {
		return this.useFecing;
	}

	public void setUseFecing(int useFecing) {
		this.useFecing = useFecing;
	}

	public int getUseFecnac() {
		return this.useFecnac;
	}

	public void setUseFecnac(int useFecnac) {
		this.useFecnac = useFecnac;
	}

	public int getUseJefe() {
		return this.useJefe;
	}

	public void setUseJefe(int useJefe) {
		this.useJefe = useJefe;
	}

	public int getUseLanguage() {
		return this.useLanguage;
	}

	public void setUseLanguage(int useLanguage) {
		this.useLanguage = useLanguage;
	}

	public int getUseLayout() {
		return this.useLayout;
	}

	public void setUseLayout(int useLayout) {
		this.useLayout = useLayout;
	}

	public int getUseLegajo() {
		return this.useLegajo;
	}

	public void setUseLegajo(int useLegajo) {
		this.useLegajo = useLegajo;
	}

	public int getUseLocation() {
		return this.useLocation;
	}

	public void setUseLocation(int useLocation) {
		this.useLocation = useLocation;
	}

	public int getUseLogin() {
		return this.useLogin;
	}

	public void setUseLogin(int useLogin) {
		this.useLogin = useLogin;
	}

	public int getUseLoginJuscaba() {
		return this.useLoginJuscaba;
	}

	public void setUseLoginJuscaba(int useLoginJuscaba) {
		this.useLoginJuscaba = useLoginJuscaba;
	}

	public int getUseMobile() {
		return this.useMobile;
	}

	public void setUseMobile(int useMobile) {
		this.useMobile = useMobile;
	}

	public int getUseMobileLab() {
		return this.useMobileLab;
	}

	public void setUseMobileLab(int useMobileLab) {
		this.useMobileLab = useMobileLab;
	}

	public int getUseModalidadContratacion() {
		return this.useModalidadContratacion;
	}

	public void setUseModalidadContratacion(int useModalidadContratacion) {
		this.useModalidadContratacion = useModalidadContratacion;
	}

	public int getUseNacionalidad() {
		return this.useNacionalidad;
	}

	public void setUseNacionalidad(int useNacionalidad) {
		this.useNacionalidad = useNacionalidad;
	}

	public int getUseName() {
		return this.useName;
	}

	public void setUseName(int useName) {
		this.useName = useName;
	}

	public int getUseNombre() {
		return this.useNombre;
	}

	public void setUseNombre(int useNombre) {
		this.useNombre = useNombre;
	}

	public int getUseNrodoc() {
		return this.useNrodoc;
	}

	public void setUseNrodoc(int useNrodoc) {
		this.useNrodoc = useNrodoc;
	}

	public int getUseOpignouid() {
		return this.useOpignouid;
	}

	public void setUseOpignouid(int useOpignouid) {
		this.useOpignouid = useOpignouid;
	}

	public int getUsePassact() {
		return this.usePassact;
	}

	public void setUsePassact(int usePassact) {
		this.usePassact = usePassact;
	}

	public int getUsePassword() {
		return this.usePassword;
	}

	public void setUsePassword(int usePassword) {
		this.usePassword = usePassword;
	}

	public int getUsePasswordJuscaba() {
		return this.usePasswordJuscaba;
	}

	public void setUsePasswordJuscaba(int usePasswordJuscaba) {
		this.usePasswordJuscaba = usePasswordJuscaba;
	}

	public int getUsePhone() {
		return this.usePhone;
	}

	public void setUsePhone(int usePhone) {
		this.usePhone = usePhone;
	}

	public int getUsePhoneLab() {
		return this.usePhoneLab;
	}

	public void setUsePhoneLab(int usePhoneLab) {
		this.usePhoneLab = usePhoneLab;
	}

	public int getUsePmuid() {
		return this.usePmuid;
	}

	public void setUsePmuid(int usePmuid) {
		this.usePmuid = usePmuid;
	}

	public int getUseResolucion() {
		return this.useResolucion;
	}

	public void setUseResolucion(int useResolucion) {
		this.useResolucion = useResolucion;
	}

	public int getUseRss() {
		return this.useRss;
	}

	public void setUseRss(int useRss) {
		this.useRss = useRss;
	}

	public int getUseSexo() {
		return this.useSexo;
	}

	public void setUseSexo(int useSexo) {
		this.useSexo = useSexo;
	}

	public int getUseSkin() {
		return this.useSkin;
	}

	public void setUseSkin(int useSkin) {
		this.useSkin = useSkin;
	}

	public int getUseStatus() {
		return this.useStatus;
	}

	public void setUseStatus(int useStatus) {
		this.useStatus = useStatus;
	}

	public int getUseTipo() {
		return this.useTipo;
	}

	public void setUseTipo(int useTipo) {
		this.useTipo = useTipo;
	}

	public int getUseTipodoc() {
		return this.useTipodoc;
	}

	public void setUseTipodoc(int useTipodoc) {
		this.useTipodoc = useTipodoc;
	}

	public int getUseTitulo() {
		return this.useTitulo;
	}

	public void setUseTitulo(int useTitulo) {
		this.useTitulo = useTitulo;
	}

	public int getUseToken() {
		return this.useToken;
	}

	public void setUseToken(int useToken) {
		this.useToken = useToken;
	}

	public int getUseTstamp() {
		return this.useTstamp;
	}

	public void setUseTstamp(int useTstamp) {
		this.useTstamp = useTstamp;
	}

	public int getUseUltimaOperacion() {
		return this.useUltimaOperacion;
	}

	public void setUseUltimaOperacion(int useUltimaOperacion) {
		this.useUltimaOperacion = useUltimaOperacion;
	}

}