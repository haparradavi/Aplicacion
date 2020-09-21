package com.leerArchivo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.Properties.PropertiesDao;

public class LeerArchivo {
	

	private String rutaProperties = "src/com/Properties/DatosConexion.properties";


	public PropertiesDao getProperties() {
		Properties propiedades = new Properties();
		PropertiesDao propertiesDAO = new PropertiesDao();

		try {
			propiedades.load(new FileInputStream(rutaProperties));

			propertiesDAO.setUserDES(propiedades.getProperty("userDES"));
			propertiesDAO.setUserLAB(propiedades.getProperty("userLAB"));
			propertiesDAO.setUserPROD(propiedades.getProperty("userPROD"));
			propertiesDAO.setPassDES(propiedades.getProperty("passDES"));
			propertiesDAO.setPassLab(propiedades.getProperty("passLab"));
			propertiesDAO.setPassPROD(propiedades.getProperty("passPROD"));
			propertiesDAO.setPortDES(propiedades.getProperty("portDES"));
			propertiesDAO.setPortLAB(propiedades.getProperty("portLAB"));
			propertiesDAO.setPortPROD(propiedades.getProperty("portPROD"));
			propertiesDAO.setIpDES(propiedades.getProperty("ipDES"));
			propertiesDAO.setIpLAB(propiedades.getProperty("ipLAB"));
			propertiesDAO.setIpPROD(propiedades.getProperty("ipPROD"));
			propertiesDAO.setRutaTrazaLogIBMDES(propiedades.getProperty("rutaTrazaLogIBMDES"));
			propertiesDAO.setRutaTrazaLogTCSDES(propiedades.getProperty("rutaTrazaLogTCSDES"));
			propertiesDAO.setRutaTrazaErrorIBMDES(propiedades.getProperty("rutaTrazaErrorIBMDES"));
			propertiesDAO.setRutaTrazaErrorTCSDES(propiedades.getProperty("rutaTrazaErrorTCSDES"));
			propertiesDAO.setRutaTrazaLogLAB(propiedades.getProperty("rutaTrazaLogLAB"));
			propertiesDAO.setRutaTrazaLogPROD(propiedades.getProperty("rutaTrazaLogPROD"));
			propertiesDAO.setRutaTrazaErrorLAB(propiedades.getProperty("rutaTrazaErrorLAB"));
			propertiesDAO.setRutaTrazaErrorPROD(propiedades.getProperty("rutaTrazaErrorPROD"));

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return propertiesDAO;

	}

	public void setProperties(PropertiesDao propertiesDAO) {

		Properties propiedades = new Properties();
		try {
			propiedades.load(new FileInputStream(rutaProperties));
			propiedades.setProperty("userDES", propertiesDAO.getUserDES());
			propiedades.setProperty("userLAB", propertiesDAO.getUserLAB());
			propiedades.setProperty("userPROD", propertiesDAO.getUserPROD());
			propiedades.setProperty("passDES", propertiesDAO.getPassDES());
			propiedades.setProperty("passLab", propertiesDAO.getPassLab());
			propiedades.setProperty("passPROD", propertiesDAO.getPassPROD());
			propiedades.setProperty("portDES", propertiesDAO.getPortDES());
			propiedades.setProperty("portLAB", propertiesDAO.getPortLAB());
			propiedades.setProperty("portPROD", propertiesDAO.getPortPROD());
			propiedades.setProperty("ipDES", propertiesDAO.getIpDES());
			propiedades.setProperty("ipLAB", propertiesDAO.getIpLAB());
			propiedades.setProperty("ipPROD", propertiesDAO.getIpPROD());
			propiedades.setProperty("rutaTrazaLogIBMDES", propertiesDAO.getRutaTrazaLogIBMDES());
			propiedades.setProperty("rutaTrazaLogTCSDES", propertiesDAO.getRutaTrazaLogTCSDES());
			propiedades.setProperty("rutaTrazaErrorIBMDES", propertiesDAO.getRutaTrazaErrorIBMDES());
			propiedades.setProperty("rutaTrazaErrorTCSDES", propertiesDAO.getRutaTrazaErrorTCSDES());
			propiedades.setProperty("rutaTrazaLogLAB", propertiesDAO.getRutaTrazaLogLAB());
			propiedades.setProperty("rutaTrazaLogPROD", propertiesDAO.getRutaTrazaLogPROD());
			propiedades.setProperty("rutaTrazaErrorLAB", propertiesDAO.getRutaTrazaErrorLAB());
			propiedades.setProperty("rutaTrazaErrorPROD", propertiesDAO.getRutaTrazaErrorPROD());

			FileOutputStream fileout = new FileOutputStream(rutaProperties.replace("\\", "/"));
			propiedades.store(fileout, null);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
