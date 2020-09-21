package com.leerArchivo;


import com.Properties.PropertiesDao;

public class ProbarPoperties {

	private static String rutaProperties = "src/com/Properties/DatosConexion.properties";
	
	public static void main(String[] args) {
		LeerArchivo leer =new LeerArchivo();
		PropertiesDao propertiesDao = new PropertiesDao();
		propertiesDao =leer.getProperties();

			propertiesDao.setIpDES("uuuuu....");
		    propertiesDao.setPassPROD("ouuuooo....");
		    
		    leer.setProperties(propertiesDao);
		
		
			
	}

}
	

