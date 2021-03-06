package com.tsi2.streamrain.bussines.content.implementations;

import java.util.Iterator;

import com.tsi2.streamrain.bussines.content.interfaces.IDAOContentBussines;
import com.tsi2.streamrain.context.StremRainDataContextLoader;
import com.tsi2.streamrain.dao.implementations.StreamRainMySQLDAO;
import com.tsi2.streamrain.dao.interfaces.IDAOService;
import com.tsi2.streamrain.model.generator.ContentCasts;
import com.tsi2.streamrain.model.generator.Contents;

public class DAOContentBussinesImpl implements IDAOContentBussines {

	public boolean saveContent(final Contents contents, final String tenantID) {
		IDAOService daoService = (StreamRainMySQLDAO) StremRainDataContextLoader.contextLoader().getBean("daoService");
		daoService.save(contents, tenantID);
		/*for(Iterator it = contents.getContentCastses().iterator(); it.hasNext();) {
		    ContentCasts x = (ContentCasts)it.next();
		    daoService.save(x, tenantID);
		}*/
		return true; 
	}
	

}
